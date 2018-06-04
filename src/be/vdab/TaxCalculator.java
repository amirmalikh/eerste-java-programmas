package be.vdab;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {


        System.out.print("Please enter gross monthly income (in euro): ");
      //  Scanner inputLoon = new Scanner(System.in);
      //  double loonInput = inputLoon.nextDouble();
        double grossIncome = 10000;
        System.out.println(grossIncome);
        double rszWaarde = .1307;
        double rsz  = grossIncome* rszWaarde;
        System.out.println("Social security (13.07%): " + rsz);

        double taxableIncome = grossIncome- rsz;
        System.out.println("Taxable income: " + taxableIncome);

        double[] incomeList = {0, 8680, 12360, 20600, 37750};
        double[] taxationAmount = {25, 30, 40, 45, 50};




        double totalTaxValue = 0;





    }




}
