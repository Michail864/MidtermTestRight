package design;

import src.design.AbstactEmployeeClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeInfo extends AbstactEmployeeClass {

    /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
     * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
     * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
     * go to FortuneEmployee class to apply all the fields and attributes.
     *
     * Important: YOU MUST USE the
     * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
     * Use all kind of keywords(super,this,static,final........)
     * Implement Nested class.
     * Use Exception Handling.
     *
     */

    /*
     * declare few static and final fields and some non-static fields
     */
    static String companyName;
    private int employeeId;


    /*
     * You must implement the logic for below 2 methods and
     * following 2 methods are prototype as well for other methods need to be design,
     * as you will come up with the new ideas.
     */

    /*
     * you must have multiple constructor.
     * Must implement below constructor.
     */
    public EmployeeInfo(int employeeId) {

    }

    public EmployeeInfo(String name, int employeeId) {

    }
    public int employeeId(){
      /*  List<String> id = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your 3 digits id number");
        String idin = sc.nextLine();

        if (idin.length()>3){
            System.out.println("Please enter only 3 digits id number");
        }
        else {
            for (int i=0; i<id.size(); i++){
                if(id.get(i).equals(idin)){
                    System.out.println("This id already exists, please enter the other 3 digits");
                    idin = sc.nextLine();
                }
                else{
                    id.add(idin);
                }
            }
            int employeeId = Integer.valueOf(idin);
            }
        return employeeId;

      */
    return employeeId;
    }



   public String employeeName(){
        Scanner sc = new Scanner (System.in);
       System.out.println("Enter your first name :");
        String firstName = sc.nextLine();
       System.out.println("Enter your last name");
       String lastName = sc.nextLine();

       String employeename = firstName + " " + lastName;
       return employeename;
   }


    public  int calculateEmployeeBonus(int numberOfYearsWithCompany, int performance, int salary) {

        int annualsalary = salary;
        annualsalary = calculateSalary();
        int total = 0;
        return total;
    }

    @Override
    public int calculateSalary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many hours you work per week?");
        int hoursWorked = sc.nextInt();
        System.out.println("How much you get paid per hour?");
        int perHour = sc.nextInt();
        System.out.println("How many hours overtime?");
        int overtimeHours = sc.nextInt();

        double perhourOvertime = 1.5 * perHour;
        int salary = (hoursWorked * perHour) + (overtimeHours * (int)perhourOvertime) * 52; // calculating annual salary;
        return salary;
    }

    /*
     * This methods should calculate Employee bonus based on salary and performance.
     * Then it will return the total yearly bonus. So you need to implement the logic.
     * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
     * You can set arbitrary number for performance.
     * So you probably need to send 2 arguments.
     *
     */


    /*
     * This methods should calculate Employee Pension based on salary and numbers of years with the company.
     * Then it will return the total pension. So you need to implement the logic.
     * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
     *
     */
    public static int calculateEmployeePension( ) {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);
        String[] yearJoined = convertedJoiningDate.split("/");
        String[] yearToday = convertedTodaysDate.split("/");
        Integer yearsWorked = Integer.valueOf(yearToday[1]) - Integer.valueOf(yearJoined[1]);

        EmployeeInfo employeeInfo = new EmployeeInfo(327);
        int annualSalary = employeeInfo.calculateSalary();
        int percentage =0;
        for(int i=0; i<yearsWorked; i++){
            percentage +=5;

        }
        total = (annualSalary * percentage) / 100;

        //implement numbers of year from above two dates
        //Calculate pension


        return total;
    }

    private static class DateConversion {

        public DateConversion(design.Months months) {
        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            design.Months months = design.Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 7;
                    break;
                case August:
                    date = 8;
                    break;
                case September:
                    date = 9;
                    break;
                case October:
                    date = 10;
                    break;
                case November:
                    date = 11;
                    break;
                case December:
                    date = 12;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}
