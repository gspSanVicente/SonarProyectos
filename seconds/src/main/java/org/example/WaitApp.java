package org.example;

import java.util.Scanner;

public class WaitApp
{
    public static void waitSeconds(int seconds)  throws InterruptedException
    {
        Thread.sleep(seconds * 1000);
    }

    public static void main(String[] args)
    {
        int seconds;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds:");
        seconds = sc.nextInt();
 //  try
   //     {
            waitSeconds(seconds);
     //   } catch (InterruptedException e) {
         //   System.err.println("Error: " + e.getMessage());
       // }
        System.out.println("Finish");
    //}
}
