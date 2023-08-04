import java.util.Scanner;

class BankAccount{
    private String ID, customerID, accNumber, pinCode; 
    private int balance;

    BankAccount(){}

    BankAccount(String ID, String customerID, String accNumber, String pinCode, int balance){
        this.ID = ID;
        this.customerID = customerID;
        this.accNumber = accNumber;
        this.pinCode = pinCode;
        this.balance = balance;
    }

    public String getAccNumber(){
        return this.accNumber;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void deposit(int money){
        this.balance += money;
    }

    public void withdraw(int money){
        this.balance -= money;
    }

    public void transfer(BankAccount other, int money){
        this.balance -= money;
        other.balance += money;
    }

    @Override
    public String toString(){
        return "ID : " + this.ID
        + "\nCusID : " + this.customerID
        + "\nNumber : " + this.accNumber
        + "\nPIN : " + this.pinCode
        + "\nBalance : " + this.balance + "VND\n-------------------" ;
    }
}

public class Bank_Account {
    public static BankAccount findBankAccount(BankAccount[] arr,String s){
        BankAccount tmp = new BankAccount();
        for(BankAccount x : arr){
            if(x.getAccNumber().equals(s)){
                return x;
            }
        }
        return tmp;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        BankAccount[] arr = new BankAccount[n];

        for(int i=0; i<n; ++i){
            String ID = scn.nextLine();
            String customerID = scn.nextLine();
            String accNumber = scn.nextLine();
            String pinCode = scn.nextLine();
            int balance = scn.nextInt();
            scn.nextLine();
            arr[i] = new BankAccount(ID, customerID, accNumber, pinCode, balance);
        }

        int q = Integer.parseInt(scn.nextLine());
        while(q-- > 0){
            String s = scn.nextLine();
            if(s.equals("deposit")){
                String accNumber = scn.next();
                int money = scn.nextInt();
                scn.nextLine();
                BankAccount ans = findBankAccount(arr, accNumber);
                ans.deposit(money); 
            }
            else if(s.equals("withdraw")){
                String accNumber =scn.next();
                int money = scn.nextInt();
                scn.nextLine();
                BankAccount ans = findBankAccount(arr, accNumber);
                if(ans.getBalance() - money >= 50000){
                    ans.withdraw(money);
                }
            }
            else{
                String accNumber1 = scn.next();
                String accNumber2 = scn.next();
                int money = scn.nextInt(); scn.nextLine();

                BankAccount p1 = findBankAccount(arr, accNumber1);
                BankAccount p2 = findBankAccount(arr, accNumber2);

                if(p1.getBalance() - money >= 50000){
                    p1.transfer(p2, money);
                }
            }
        }

        for(BankAccount x : arr){
            System.out.println(x);
        }
        scn.close();
    }
}
