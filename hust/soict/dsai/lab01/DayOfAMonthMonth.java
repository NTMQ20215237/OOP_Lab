package hust.soict.dsai.lab01;
import java.util.Scanner;

public class DayOfAMonthMonth {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int year;
while (true) {
    System.out.print("Enter the year: ");
    year = input.nextInt();
    if (year >= 0) {
        break;
    }
    System.out.println("Invalid year. Please enter again.");
}
input.nextLine();
System.out.println("Enter the month:");
String month = input.nextLine();
if (year%4!=0 || year %100==0 && year%400!=0 ) {
	
	if(month.equals("January")||month.equals("Jan")
			||month.equals("1")||month.equals("Jan.")) {
		System.out.printf("The January of year %d has 31 days\n",year);
	}
	else if(month.equals("Februay")||month.equals("Feb")
			||month.equals("2")||month.equals("Feb.")) {
		System.out.printf("The February of year %d has 28 days\n",year);
	}
	else if(month.equals("March")||month.equals("Mar")
			||month.equals("3")||month.equals("Mar.")) {
		System.out.printf("The March of year %d has 31 days\n",year);
	}
	else if(month.equals("April")||month.equals("Apr")
			||month.equals("4")||month.equals("Apr.")) {
		System.out.printf("The April of year %d has 30 days\n",year);
	}
	else if(month.equals("May")||month.equals("May")
			||month.equals("5")) {
		System.out.printf("The May of year %d has 31 days\n",year);
	}
	else if(month.equals("June")||month.equals("Jun")
			||month.equals("6")) {
		System.out.printf("The June of year %d has 30 days\n",year);
	}
	else if(month.equals("July")||month.equals("Jul")
			||month.equals("7")) {
		System.out.printf("The July of year %d has 31 days\n",year);
	}
	else if(month.equals("August")||month.equals("Aug")
			||month.equals("8")||month.equals("Aug.")) {
		System.out.printf("The August of year %d has 31 days\n",year);
	}
	else if(month.equals("September")||month.equals("Sep")
			||month.equals("9")||month.equals("Sep.")) {
		System.out.printf("The September of year %d has 30 days\n",year);
	}
	else if(month.equals("November")||month.equals("Nov")
			||month.equals("11")||month.equals("Nov.")) {
		System.out.printf("The November of year %d has 30 days\n",year);
	}
	else if(month.equals("October")||month.equals("Oct")
			||month.equals("10")||month.equals("Oct.")) {
		System.out.printf("The October of year %d has 31 days\n",year);
	}
	else if(month.equals("December")||month.equals("Dec")
			||month.equals("12")||month.equals("Dec.")) {
		System.out.printf("The Decmeber of year %d has 31 days\n",year);
	}
	else {System.out.println("Invalid month.");
	}
}
else {
	if(month.equals("January")||month.equals("Jan")
		||month.equals("1")||month.equals("Jan.")) {
	System.out.printf("The January of year %d has 31 days\n",year);
}
else if(month.equals("Februay")||month.equals("Feb")
		||month.equals("2")||month.equals("Feb.")) {
	System.out.printf("The February of year %d has 29 days\n",year);
}
else if(month.equals("March")||month.equals("Mar")
		||month.equals("3")||month.equals("Mar.")) {
	System.out.printf("The March of year %d has 31 days\n",year);
}
else if(month.equals("April")||month.equals("Apr")
		||month.equals("4")||month.equals("Apr.")) {
	System.out.printf("The April of year %d has 30 days\n",year);
}
else if(month.equals("May")||month.equals("May")
		||month.equals("5")) {
	System.out.printf("The May of year %d has 31 days\n",year);
}
else if(month.equals("June")||month.equals("Jun")
		||month.equals("6")) {
	System.out.printf("The June of year %d has 30 days\n",year);
}
else if(month.equals("July")||month.equals("Jul")
		||month.equals("7")) {
	System.out.printf("The July of year %d has 31 days\n",year);
}
else if(month.equals("August")||month.equals("Aug")
		||month.equals("8")||month.equals("Aug.")) {
	System.out.printf("The August of year %d has 31 days\n",year);
}
else if(month.equals("September")||month.equals("Sep")
		||month.equals("9")||month.equals("Sep.")) {
	System.out.printf("The September of year %d has 30 days\n",year);
}
else if(month.equals("November")||month.equals("Nov")
		||month.equals("11")||month.equals("Nov.")) {
	System.out.printf("The November of year %d has 30 days\n",year);
}
else if(month.equals("October")||month.equals("Oct")
		||month.equals("10")||month.equals("Oct.")) {
	System.out.printf("The October of year %d has 31 days\n",year);
}
else if(month.equals("December")||month.equals("Dec")
		||month.equals("12")||month.equals("Dec.")) {
	System.out.printf("The December of year %d has 31 days\n",year);
}
else {
	System.out.println("Invalid month");
}
}
input.close();

	}

}
