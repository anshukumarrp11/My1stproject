package JavaProject;
import java.io.IOException;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;



public class Atm extends Account{

    Scanner menuInput = new Scanner(System.in);
    DecimalFormat MoneyFormat = new DecimalFormat("'$',###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException
    {
        int x = 1;
        do {
            try {
                data.put(123456, 5555);
                data.put(234567, 6666);
                System.out.println("Welcome to our ATM project.");
                System.out.println("Enter your customer no.:");
                setCustomerNumber(menuInput.nextInt());
                System.out.println("Enter Atm pin:");
                setPinNumber(menuInput.nextInt());
            } catch (Exception e)
            {
                System.out.println("Invalid entry" + "\n" + "Numbers only");
                x = 2;
            }
            for (Map.Entry<Integer,Integer> entry : data.entrySet())
            {
                if (entry.getKey() == getCustomerNumber() && entry.getValue()== getPinNumber())
                {
                    getAccountType();
                }
            }
            System.out.println("Wrong account no or Atm pin");
        }
        while (x == 1);
    }



    public void getAccountType() {
        System.out.println("Select The account type.:");
        System.out.println("Type 1:Checking account");
        System.out.println("Type 2:Saving account");
        System.out.println("Exit");
        System.out.println("Choice:");
        selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using this atm:");
                break;
            default:
                System.out.println("Invalid account type");
                getAccountType();
        }

    }

    public void getChecking() {
        System.out.println("Checking account:");
        System.out.println("Type 1:Veiw balance");
        System.out.println("Type 2:Withdraw balance");
        System.out.println("Type 3:Deposite balance");
        System.out.println("Type 4:Exit");
        System.out.println("Choice:");
        selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Checking account type:" + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositeInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using this atm:");
                break;
            default:

                System.out.println("Invalid account type");
                getChecking();
        }
    }
    public void getSaving()
    {
        System.out.println("Saving account:");
        System.out.println("Type 1:Veiw balance");
        System.out.println("Type 2:Deposite balance");
        System.out.println("Type 3:Withdraw balance");
        System.out.println("Type 4:Exit");
        System.out.println("Choice:");
        selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Saving account type:" + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingDepositeInput();

                getAccountType();
                break;
            case 3:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using this atm:");
                break;
            default:
                System.out.println("Invalid account type");
                getChecking();
        }
    }

    int selection;
}
