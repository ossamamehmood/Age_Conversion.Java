package com.company;

import java.util.*;

public class Main

{

    public static void main(String[] args)

    {

	// write your code here

        // AGE CONVERSION

        // - Project Using JAVA

        // - Based on Decision Structure & InputOutput

        // - Compiler : JetBrains - IntelliJ IDEA

        // - Developed by Ossama Mehmood

        // - Open Source (Github.com/ossamamehmood)

        System.out.println( "-------------------------------------------------------------\n" +

                "\t\t\t      Age Conversion\n" +

                "-------------------------------------------------------------\n\n" +

                "-------------------------------------------------------------\n" +

                "\t         Select Yours Operation\n" +

                "-------------------------------------------------------------\n");

        System.out.println("\t   Press & Enter (M) - AGE in Months \n\n" +

                "\t   Press & Enter (D) - AGE in Days\n\n" +

                "\t   Press & Enter (H) - AGE in Hours\n\n" +

                "\t   Press & Enter (I) - AGE in Mints\n\n" +

                "\t   Press & Enter (S) - AGE in Seconds\n\n" +

                "-------------------------------------------------------------");

        // Take input from the user

        String Conversion;

        Scanner in = new Scanner(System.in);

        System.out.print("From Above Statements - Provide a Number to Perform Operation \n" +

                "-------------------------------------------------------------\n" +

                "\n\n\t\tPress - ( M - D - H - I - S ) : ");

        Conversion = in.nextLine();

        // Transform to uppercase - Already User Friendly

        // Decision Structure - ELSE IF Statements

        if

        (Conversion.equalsIgnoreCase("M"))

        {

            int ageInYears, ageInMonths;

            System.out.print("\n\t\t Provide your age in years : ");

            ageInYears = in.nextInt();

            ageInMonths = ageInYears*12;

            System.out.println("\n\t\t Your age in months : "

                    + ageInMonths

                    + "\n");



        }


        else

            if

            (Conversion.equalsIgnoreCase("D"))

            {

                int ageInYears, ageInDays;

                System.out.print("\n\t\tProvide your age in years : ");

                ageInYears = in.nextInt();

                ageInDays = ageInYears*365;

                System.out.println("\n\t\tYour age in days : "

                        + ageInDays

                        + "\n");

            }


            else

                if

            (Conversion.equalsIgnoreCase("H"))

            {

                int ageInYears, ageInHours;

                System.out.print("\n\t\tProvide your age in years : ");

                ageInYears = in.nextInt();

                ageInHours = ageInYears*365*24;

                System.out.println("\n\t\tYour age in hours : "

                        + ageInHours

                        + "\n");

            }


            else

                if

                (Conversion.equalsIgnoreCase("I"))

                {

                    int ageInYears, ageInMints;

                    System.out.print("\n\t\tProvide your age in years : ");

                    ageInYears = in.nextInt();

                    ageInMints = ageInYears*365*24*60;

                    System.out.println("\n\t\tYour age in Mints : "

                            + ageInMints

                            + "\n");

                }


            else

                if

                (Conversion.equalsIgnoreCase("S"))

                {

                    int ageInYears, ageInSec;

                    System.out.print("\n\t\tProvide your age in years : ");

                    ageInYears = in.nextInt();

                    ageInSec = ageInYears*365*24*60*60;

                    System.out.println("\n\t\tYour age in Second : "

                            + ageInSec

                            + "\n");

                }

                // ELSE Block - If enter unexpected Character begin enter by user


            else

                {

                    // block of code if condition is false

                    System.out.println("\n\t\t----------------------------\n" +

                            "\t\t\t\tInvalid Input\n" +

                            "\t\t----------------------------");

                }


    }

}