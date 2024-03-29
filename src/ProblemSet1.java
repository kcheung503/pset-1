/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */
import java.text.NumberFormat;

public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */

        final double LENGTH = 8.5;
        final double WIDTH = 11;
        final double IN_TO_MILLIMETERS = 25.4;
        double lengthMillimeters = LENGTH * IN_TO_MILLIMETERS;
        double widthMillimeter = WIDTH * IN_TO_MILLIMETERS;
        double area = lengthMillimeters * widthMillimeter;
        double areaRound = Math.round(area * 100.0)/100.0;
        System.out.printf("\n%,.2f %s\n", areaRound, "square millimeters.");


        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

         final double IN_TO_CM = 2.54;
         double lengthInCM = IN_TO_CM * 8.5;
         double widthInCM = IN_TO_CM * 11;
         double perimeter = (widthInCM * 2) + (lengthInCM * 2);
         double perimeterRound = Math.round(perimeter * 100.0)/100.0;
         System.out.println("\n" + perimeterRound + " centimeters.");

        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

         double lengthSquared = 8.5 * 8.5;
         double widthSquared = 11 * 11;
         double hypotenuse = Math.round(java.lang.Math.sqrt(lengthSquared + widthSquared)*100.0)/100.0;
         System.out.println("\n" + hypotenuse + " inches.");

        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

         final int HOMEWORK1 = 88;
         final int HOMEWORK2 = 91;
         final int HOMEWORK3 = 0;
         final int QUIZ1 = 84;
         final int QUIZ2 = 89;
         final int QUIZ3 = 93;
         final int TEST1 = 74;
         final int TEST2 = 87;
         final int TEST3 = 82;

         final double HOMEWORK_WEIGHT = 0.15;
         final double QUIZ_WEIGHT = 0.35;
         final double TEST_WEIGHT = 0.5;
         double homeworkAvg = (HOMEWORK1 + HOMEWORK2 + HOMEWORK3);
         double homeworkAvg2 = (homeworkAvg/3);
         double homeworkAvg3 = (homeworkAvg2 * HOMEWORK_WEIGHT);
         double quizAvg = (QUIZ1 + QUIZ2 + QUIZ3);
         double quizAvg2 = (quizAvg/3);
         double quizAvg3 = (quizAvg2 * QUIZ_WEIGHT);
         double testAvg = (TEST1 + TEST2 + TEST3);
         double testAvg2 = (testAvg/3);
         double testAvg3 = (testAvg2 * TEST_WEIGHT);
         double mpGrade = Math.round((homeworkAvg3 + quizAvg3 + testAvg3)*100.0)/100.0;
         System.out.println("\n" + mpGrade + "%.");

        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

         final double WAGE = 12.50;
         double m = WAGE * 7.5;
         double tu = WAGE * 8;
         double w = WAGE * 10.5;
         double th = WAGE * 9.5;
         double f = WAGE * 6;
         double sa = WAGE * 11.5;
         double su = 0;
         double check = Math.round((m + tu + w + th + f + sa + su)*100.0)/100.0;
         NumberFormat currencyformat = NumberFormat.getCurrencyInstance();
         System.out.printf("\n" + currencyformat.format(check) + ".\n");

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

         final double SALARY = 117000;
         double biweekly = 117000/24;
         final double FED_TAX = 0.24;
         final double INCOME_TAX = 0.0637;
         final double CONTRIBUTION = 0.07;
         double salaryContribution = (1-CONTRIBUTION) * biweekly;
         double finalSalary = (1-INCOME_TAX) * (1-FED_TAX) * salaryContribution;
         System.out.printf("\n" + currencyformat.format(finalSalary) + ".\n");


        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */

         final int STUDENTS = 273;
         final int TEACHERS = 28;
         final int BUS_CAPACITY = 54;
         int totalCount = STUDENTS + TEACHERS;
         int totalBuses = (totalCount / BUS_CAPACITY) + 1;
         int lastBusCount = totalCount % BUS_CAPACITY;
         System.out.println("\n" + totalBuses + " buses are needed, with " + lastBusCount + " passengers on the last bus. ");


        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */

         final double CORNHOLE_LENGTH = 24;
         final double CORNHOLE_WIDTH = 48;
         final double CORNHOLE_DIAMETER = 6;
         double surfaceArea = (CORNHOLE_LENGTH * CORNHOLE_WIDTH) - (Math.PI * Math.pow((CORNHOLE_DIAMETER / 2), 2));
         System.out.printf("\n%.2f %s\n", surfaceArea, "square inches.");

        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */

         int currentYear = 2020;
         boolean leapYear = (currentYear%4)<(currentYear%100) || (currentYear%400==0);
         System.out.println("\n" + currentYear + " is a leap year..." + leapYear + ".");

         currentYear = 2100;
         leapYear = (currentYear%4)<(currentYear%100) || (currentYear%400==0);
         System.out.println(currentYear + " is a leap year..." + leapYear + ".");

         currentYear = 2400;
         leapYear = (currentYear%4)<(currentYear%100) || (currentYear%400==0);
         System.out.println(currentYear + " is a leap year..." + leapYear + ".");

        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */

         final double TEMPERATURE = 38;
         final double WIND_SPEED = 14;
         double windChill = 35.74 + (.6215 * TEMPERATURE) + (((.4275 * TEMPERATURE) - 35.75) * Math.pow(WIND_SPEED, .16));
         System.out.printf("\n%.1f %s\n", windChill, "degrees.");

    }
}
