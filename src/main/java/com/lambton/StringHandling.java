package com.lambton;

//import com.sun.org.apache.xpath.internal.operations.String;

public class StringHandling
{
    public static void main(String[]args)
    {
        String s1="HELLO";
        String s2="HELLO";
        String s3=s1;

         String s4= new String("HELLO");
         if(s1==s2)
         {
             System.out.println("s1==s2");
         }else
         {
             System.out.println("s1!=s2");
         }
         if(s3==s2)
         {
             System.out.println("s3=s2");
         }else
         {
             System.out.println("s3!=s2");
         }
        if(s1==s4)
        {
            System.out.println("s1=s4");
        }else
        {
            System.out.println("s1!=s4");
        }
        if (s1.equals(s4))
        {
            System.out.println("s1==s4");
        }
        String collegeName="Lambton college in  Toronto";
        collegeName.length();
        collegeName.contains("college");
        collegeName.indexOf("Toronto");
        collegeName.toUpperCase();
        collegeName.toLowerCase();
        collegeName.charAt(10);
        collegeName.replace("Toronto","New York");
        //collegeName.substring();
        collegeName.toCharArray();
        collegeName.concat("265 Yorkland Blvd.,Northyork");


    }
}