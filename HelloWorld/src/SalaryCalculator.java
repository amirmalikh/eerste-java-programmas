import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double hours;
        double pay;
        double overtime;

        System.out.println("Enter the number of regular hours worked by employee 1");
        hours = input.nextDouble();
        System.out.println("Enter the number of overtime hours worked by employee 1");
        overtime = input.nextDouble();
        System.out.println("Enter the payrate of employee 1");
        pay = input.nextDouble();

        if (overtime == 0) {
            System.out.println("Gross pay for employee 1 is " + (hours * pay));
        } else {
            System.out.println("Gross pay for employee 1 is " + (hours * pay) + (overtime * (pay * 1.5)));
        }

        System.out.println("Enter the number of regular hours worked by employee 2");
        hours = input.nextDouble();
        System.out.println("Enter the number of overtime hours worked by employee 2");
        overtime = input.nextDouble();
        System.out.println("Enter the payrate of employee 2");
        pay = input.nextDouble();

        if (overtime == 0) {
            System.out.println("Gross pay for employee 2 is " + (hours * pay));
        } else {
            System.out.println("Gross pay for employee 2 is " + (hours * pay) + (overtime * (pay * 1.5)));
        }

        System.out.println("Enter the number of regular hours worked by employee 3");
        hours = input.nextDouble();
        System.out.println("Enter the number of overtime hours worked by employee 3");
        overtime = input.nextDouble();
        System.out.println("Enter the payrate of employee 3");
        pay = input.nextDouble();

        if (overtime == 0) {
            System.out.println("Gross pay for employee 3 is " + (hours * pay));
        } else {
            System.out.println("Gross pay for employee 3 is " + (hours * pay) + (overtime * (pay * 1.5)));
        }


    }
}
