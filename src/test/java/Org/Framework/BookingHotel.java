package Org.Framework;

public class BookingHotel {

	public static void main(String[] args) throws InterruptedException {

		AdactinHotel a = new AdactinHotel();
		a.Browserlaunch("https://adactinhotelapp.com/");
		
	
		a.Searchhotel("//*[@id=\"location\"]/option[2]", "//*[@id=\"hotels\"]/option[2]", "//*[@id=\"Submit\"]");
		a.Bookinghotel("//*[@id=\"radiobutton_1\"]", "//*[@id=\"continue\"]");

		a.Bookingconfirmation("//*[@id=\"first_name\"]", "//*[@id=\"last_name\"]", "//*[@id=\"address\"]",
				"//*[@id=\"cc_num\"]", "//*[@id=\"cc_type\"]/option[2]", "//*[@id=\"cc_exp_month\"]/option[2]",
				"//*[@id=\"cc_exp_year\"]/option[10]", "//*[@id=\"cc_cvv\"]", "book_now");
		a.Orderid("//*[@id=\"order_no\"]");
		
		
		
	}

}

