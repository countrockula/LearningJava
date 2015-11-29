import java.util.*;
import java.text.*;

public class timeAndDate2	{
	public static void main (String args[])	{
		//Instatiate a Date object
		Date current_date = new Date();
		SimpleDateFormat ft = 
		new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		// display time and date using toString()
		System.out.println("Current date: " + ft.format(current_date));
	}
}