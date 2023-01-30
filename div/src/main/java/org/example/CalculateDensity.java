package org.example;

import java.util.Scanner;

public class CalculateDensity
{
    public static void main(String[] args)
    {
        int weight, volume, density;

        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter weight:");
            weight = Integer.parseInt(sc.nextLine());

            System.out.println("Enter volume:");
            volume = Integer.parseInt(sc.nextLine());

            density = weight / volume;
           System.out.println("Density = " + density);

        } catch (NumberFormatException e) {
            System.err.println("Wrong number:"  + e.getMessage());
        } catch (ArithmeticException e) {
          System.err.println("Error dividing by zero");
        }
    }
}
