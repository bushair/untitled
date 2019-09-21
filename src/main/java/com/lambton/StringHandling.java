package com.lambton;


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class StringHandling
{
    public static void main(String args[])
    {

        // date of birth
        LocalDate pdate = LocalDate.of(1989, 04, 11);
        // current date
        LocalDate now = LocalDate.now();
        // difference between current date and date of birth
        Period diff = Period.between(pdate, now);

        System.out.printf("\nI am  %d years, %d months and %d days old.\n\n",
                diff.getYears(), diff.getMonths(), diff.getDays());

        
        
        //date and time

        SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("dd-MM-yy hh:mm:ss aa");
        //Setting the time zone
        dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(dateTimeInGMT.format(new Date()));

       // System.out.println(localDateTime.now());


      /*  String pattern="###,###,##";
        DecimalFormat decimalFormat=new DecimalFormat();
       decimalFormat.applyPattern(pattern);
       int value=12345678;
       String output=decimalFormat.format(value);
       System.out.println(value+""+output);



       String s=String.format("%d %s %s,",10,"Hello World");
        System.out.print(s);

       String s1="Hello";
        String s2="Hello";
        String s3=s1;
        String s4= new String("Hello");
        if(s1==s2)
        {
            System.out.println("s1=s2");
        }
        else
        {
            System.out.println("s1!=s2");
        }
        if(s3==s2)
        {
            System.out.println("s3=s2");
        }
        else
        {
            System.out.println("s3!=s2");
        }
        if(s1==s4)
        {
            System.out.println("s1=s4");
        }
        else
        {
            System.out.println("s1!=s4");
        }
        String collegeName="Lambton college in Toronto";
        System.out.println("length :"+collegeName.length());
        System.out.println("Uppercase :"+collegeName.toUpperCase());
        System.out.println("Lowercase :"+collegeName.toLowerCase());
        System.out.println("Character at index 10 :"+collegeName.charAt(10));
        System.out.println("Replace :"+collegeName.replace("Toronto","Newyork"));
        System.out.println("to character array :"+collegeName.toCharArray());
        System.out.println("substring :"+collegeName.substring(11,20));
        Boolean b=collegeName.contains("college");
        System.out.println(b);

        //reversing
        char c[]=collegeName.toCharArray();
        char rev[]=new char[c.length];
        int cnt=0;
        collegeName.length();
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
        for(int i=c.length-1;i>=0;i--)
        {
            rev[cnt++] = c[i];
        }
        String reverseString=new String(rev);
        System.out.println("Reverse String = " + reverseString);
        integer to string
        */


    }
}