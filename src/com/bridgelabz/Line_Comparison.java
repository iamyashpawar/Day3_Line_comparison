package com.bridgelabz;

import java.util.Scanner;

public class Line_Comparison
{


    public static void main(String[] args)
    {

        System.out.println(" Welcome To Line Comparison ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1 : " );
        int x1 = sc.nextInt();
        System.out.println("Enter y1 : ");
        int y1= sc.nextInt();

        System.out.println("Enter x2 : " );
        int x2 = sc.nextInt();
        System.out.println("Enter y2 : ");
        int y2= sc.nextInt();

        double legthofLine1=0;
        double legthofLine2=0;
        double temp;

        temp = (x2 - x1 ) * (x2 - x1 )+ (y2-y1) * (y2-y1);

        legthofLine1 = Math.sqrt(temp);
        System.out.println("Length of the line one is : " + legthofLine1);

        System.out.println("Enter a1 : " );
        int a1 = sc.nextInt();
        System.out.println("Enter b1 : ");
        int b1= sc.nextInt();

        System.out.println("Enter a2 : " );
        int a2 = sc.nextInt();
        System.out.println("Enter b2 : ");
        int b2= sc.nextInt();

        temp = (a2 - a1 ) * (a2 - a1 ) + (b2-b1) * (b2-b1);
        legthofLine2 = Math.sqrt(temp);
        System.out.println("Length of second line two is : " + legthofLine2);

          String l1 =Double.toString(legthofLine1);
          String l2 = Double.toString(legthofLine2);

          if(l1.equals(l2))
          {
              System.out.println("Line 1 & Line 2 are Equal ");
          }
          else {
              System.out.println("Line 1 & Line 2 are not Equal");
          }

        int temp2=l1.compareTo(l2);
        System.out.println(temp2);
        {
            if (temp2 ==0)
            {
                System.out.println("Both Line 1 & Line 2 are equal");
            } else if (temp2==1)
            {
                System.out.println("Line 1 is greater than line 2");
            }
            else
            {
                System.out.println("Line 2 is greater than line 1");
            }
        }
    }

}
