package JavaProject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner Input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$',###,##0.00");
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double savingBalance=0;


    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public  int getCustomerNumber() {
        return customerNumber;
    }
    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public  int getPinNumber() {
        return pinNumber;
    }
    public double getCheckingBalance()
    {
        return checkingBalance;
    }
    public double getSavingBalance()
    {
        return savingBalance;
    }
    public double checkChekingBalance()
    {
        return checkingBalance;
    }
    public double checkSavingBalance()
    {
        return savingBalance;
    }
    public double calcCheckingWithdraw(double amount)
    {
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount)
    {
         savingBalance = (savingBalance - amount);
        return savingBalance;
    }
    public double calcCheckingDeposite(double amount)
    {
        checkingBalance=(checkingBalance+amount);
        return checkingBalance;
    }
    public double calcSavingDeposite(double amount)
    {
         savingBalance = (savingBalance + amount);
        return savingBalance;
    }
    public void getCheckingWithdrawInput()
    {

        System.out.println("Checking Acccount balance:"+ moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw");
        double amount=Input.nextDouble();
        if ((checkingBalance-amount)>=0)
        {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Acccount balance:"+ moneyFormat.format(checkingBalance));
        }
        else
        {
            System.out.println("Balance can't be negative.");

        }

    }
    public void getSavingWithdrawInput()
    {
        System.out.println("Saving Acccount balance:"+ moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw");
        double amount=Input.nextDouble();
        if ((savingBalance - amount)>=0)
        {
            calcSavingWithdraw(amount);
            System.out.println("New Saving Acccount balance:"+ moneyFormat.format(savingBalance));
        }
        else
        {
            System.out.println("Balance can't be negative.");

        }

    }
    public void getCheckingDepositeInput()
    {
        System.out.println("Checking Acccount balance:"+ moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to Deposite");
        double amount=Input.nextDouble();
        if ((checkingBalance+amount)>=0)
        {
            calcCheckingDeposite(amount);
            System.out.println("New Checking Acccount balance:"+ moneyFormat.format(checkingBalance));
        }
        else
        {
            System.out.println("Balance can't be negative.");

        }

    }
    public void getSavingDepositeInput()
    {
        System.out.println("Saving Acccount balance:"+ moneyFormat.format(savingBalance));
        System.out.println("Amount you want to Deposite");
        double amount= Input.nextDouble();
        if ((savingBalance+ amount)>=0)
        {
            calcSavingDeposite(amount);
            System.out.println("New Saving Acccount balance:"+ moneyFormat.format(savingBalance));
        }
        else
        {
            System.out.println("Balance can't be negative.");

        }

    }
}
