package demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class ScannerDemo {
    public static void main(String []args)
    {
      long start=System.currentTimeMillis();
      System.out.println(new Date()+"\n");
      long end=System.currentTimeMillis();
      long diff=end-start;
      System.out.println("Difference is "+diff);

      Calendar c1=Calendar.getInstance();
      int year=c1.get(Calendar.YEAR);
      System.out.println(year);
    }
}
