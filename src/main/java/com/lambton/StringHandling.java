package com.lambton;


public class StringHandling
{
    public static void main(String args[])
    {
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
    }
}