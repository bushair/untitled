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
        String collegeName="Lambton college in Toronto";
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

        System.out.println("Length is:"+collegeName.length());
        System.out.println("Contains:"+collegeName.contains("college"));
        System.out.println("Index of Toronto is:"+collegeName.indexOf("Toronto"));
        System.out.println("Upper case is:"+collegeName.toUpperCase());
        System.out.println("Index of Toronto is:"+collegeName.toLowerCase());
        System.out.println("Replaced:"+collegeName.replace("Toronto","New York"));

        boolean b=collegeName.contains("college");
        System.out.println(b);


        char c[] =collegeName.toCharArray();

        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]);
        }

        char rev[]=new char[c.length];
        int cnt=0;
        collegeName.length();
        for(int i=c.length-1;i>=0;i--)
        {
           rev[cnt++]=c[i];
           String reversestring=new String(rev);
           System.out.println("REVERSE IS"+reversestring);
        }

    }
}
