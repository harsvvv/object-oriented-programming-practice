


class Customer{
    String name;
    int balance;
    Customer(String name,int balance){
        this.name=name;
        this.balance=balance;
    }
    void deposit(int amount){
        balance+=amount;
        System.out.println("Deposited " + amount + " to " + name);
        System.out.println("Balance is " + balance);
    }
    void withdraw(int amount){
        balance-=amount;
        System.out.println("Withdrawn " + amount + " from " + name);
        System.out.println("Balance is " + balance);
    }
}
public class Bank {
    public static void main(String[] args) {
        Customer c1=new Customer("John Smith",100);
        c1.deposit(200);
        c1.withdraw(200);
        Customer c2=new Customer("Jane Doe",400);
        c2.deposit(200);
        c2.withdraw(200);
    }
}
