import java.util.ArrayList;
import java.util.Scanner;

class Account{
    private String ID, customerID, username, password;

    Account(String ID, String customerID, String username, String password){
        this.ID = ID;
        this.customerID = customerID;
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}

public class Account_Class {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        ArrayList <Account> arr = new ArrayList<>();
        while(n-- > 0){
            Account obj = new Account(scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine());
            arr.add(obj);
        }

        int q = scn.nextInt();
        scn.nextLine();
        while(q-- > 0){
            int ok = 0;
            String username = scn.nextLine();
            String password = scn.nextLine();
            for(Account x : arr){
                if(x.getUsername().equals(username) && x.getPassword().equals(password)){
                    System.out.println("Login Successful");
                    ok = 1;
                    break;
                }
            }
            if(ok == 0) System.out.println("Login Failed");
        }
        
    }
}
