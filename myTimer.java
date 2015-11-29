import java.util.*;
import java.text.*;

public class myTimer	{
	public static void main (String args[])	{
		//Instatiate a Date object
		Date current_date = new Date();
		SimpleDateFormat ft = 
		new SimpleDateFormat ("kk:mm:ss");

		// display time and date using toString()
		System.out.println(ft.format(current_date));
	}
}