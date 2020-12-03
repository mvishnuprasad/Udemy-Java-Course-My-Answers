
import java.net.Socket;
import java.util.*;
import java.math.*;
class Opa1{
    public static void main(String[] args) {
        Sub obj=new Sub();

//Sub fh=new Sub(11,"ff",44,"rr","vb");
        obj.setBalance(999);
        obj.Deposit(5000);
        obj.WithDraw(1000);
        obj.WithDraw(1000);
        obj.WithDraw(4000);


    }
}



public class Sub {
    private int accountnumber;
    private String name;
    private int balance;
    private String email;
    private String phonenum;
   /*  public Sub(int accountnumber,String name,int balance,String email,String phonenum){
         this.accountnumber=accountnumber;
         this.name=name;
         this.balance=balance;
         this.email=email;
         this.phonenum=phonenum;
         System.out.println("full");
     }*/
    public Sub(){
        System.out.println("empty");
    }
    public  void setAccountnumber(int a){
        this.accountnumber=a;
    }
    public void setName(String b){
        this.name=b;
    }
    public void setBalance(int c){
        this.balance=c;
    }
    public void setEmail(String d){
        this.email=d;
    }
    public void  setPhonenum(String s){
        this.phonenum=phonenum;
    }


    public int getAccountnumber(){
        return accountnumber;
    }
    public int getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhonenum(){
        return  phonenum;
    }

    public void Deposit(int a){

        balance=balance+a;
        System.out.println("Deposit of amount "+a+" successful available balance is "+balance);
    }

    public void WithDraw(int b){
        if(balance>500 && balance-b>0){
            balance=balance-b;
            System.out.println("Withdrawal of amount "+b+" successful available balance is "+balance);
        }
        else System.out.println("Amount exceeds the available balnce of "+balance+" Your account requires a minimum balance of 500");
    }

}
