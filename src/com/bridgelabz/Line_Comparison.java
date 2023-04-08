package com.bridgelabz;

public class Line_Comparison
{
    static int x1 = 5;
    static int y1 = 7;
    static int x2 = 3;
    static int y2 = 4;


    public static void main(String[] args)
    {



        System.out.println(" Welcome To Line Comparison ");
        double legthofLine=0;
        double temp;

        temp = Math.sqrt((x2 - x1 ) * (x2 - x1 )) + ((y2-y1) * (y2-y1));

        legthofLine = Math.sqrt(temp);
        System.out.println("Length og the line is : " + legthofLine);




    }
}
