package lab1;

import java.util.Scanner;

public class PensionContributionCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;

        System.out.print("Enter the monthly salary: $");
        int salary = input.nextInt();
        System.out.print("Enter the age: ");
        int age = input.nextInt();

        int contributableSalary;
        double employeeContribution;
        double employerContribution;
        double totalContribution;

        contributableSalary = Math.min(salary, SALARY_CEILING);

        if (age > 65) {
            employeeContribution = EMPLOYEE_RATE_65_ABOVE * contributableSalary;
            employerContribution = EMPLOYER_RATE_65_ABOVE * contributableSalary;
            totalContribution = employeeContribution + employerContribution;
        } else if (age > 60) {
            employeeContribution = EMPLOYEE_RATE_60_TO_65 * contributableSalary;
            employerContribution = EMPLOYER_RATE_60_TO_65 * contributableSalary;
            totalContribution = employeeContribution + employerContribution;
        } else if (age > 55) {
            employeeContribution = EMPLOYEE_RATE_55_TO_60 * contributableSalary;
            employerContribution = EMPLOYER_RATE_55_TO_60 * contributableSalary;
            totalContribution = employeeContribution + employerContribution;
        } else {
            employeeContribution = EMPLOYEE_RATE_55_AND_BELOW * contributableSalary;
            employerContribution = EMPLOYER_RATE_55_AND_BELOW * contributableSalary;
            totalContribution = employeeContribution + employerContribution;
        }

        System.out.printf("\nThe employee's contribution: $%.1f\n", employeeContribution);
        System.out.printf("The employer's contribution: $%.1f\n", employerContribution);
        System.out.printf("The total contribution: $%.1f\n", totalContribution);

    }
}
