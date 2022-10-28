import java.util.Scanner;

class LessBalanceException extends Exception {
    LessBalanceException(double amt) {
        System.out.println("E : Cannot withdraw Rs " + amt + ", insufficient funds!");
    }
}

class Account {
    int accountNumber;
    String name;
    double balance;

    Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    void desposit(double amount) {
        this.balance += amount;
        getBalance();
    }

    void withdraw(double amount) throws LessBalanceException {
        if(amount > this.balance) {
            throw new LessBalanceException(amount);
        } else {
            this.balance -= amount;
            getBalance();
        }
    }

    void getBalance() {
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Name : " + this.name);
        System.out.println("Balance : " + this.balance);
    }

}

public class AccountDemo {
    static int i = 0;
    public static void main(String[] args) {
        Account ob[] = new Account[10];
        Scanner input = new Scanner(System.in);
        double amount;
        String name;
        int AccountNumber;
        int ch, k;
        boolean t = false;

        while(true) {
            System.out.println("******Bank Transaction******");
            System.out.println("1. Open new account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Balance");
            System.out.println("5. Exit");
            System.out.println("Enter your choice : ");
            ch = input.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter your name : ");
                    name = input.next();
                    System.out.println("Enter account number : ");
                    AccountNumber = input.nextInt();
                    System.out.println("Enter initial Amount : ");
                    amount = input.nextDouble();
                    if(amount < 1000) {
                        System.out.println("Initial amount must be at least 1000");
                        System.out.println("Try Again!");
                        break;
                    }
                    ob[i] = new Account(AccountNumber, name, amount);
                    i++;
                    break;
                case 2:
                    System.out.println("Enter Account Number : ");
                    AccountNumber = input.nextInt();
                    for(k = 0; k < i; k++) {
                        if(AccountNumber == ob[k].accountNumber) {
                            t = true;
                            break;
                        }
                    }

                    if(t) {
                        System.out.println("Enter Amount for Deposit : ");
                        amount = input.nextDouble();
                        ob[k].desposit(amount);
                    } else {
                        System.out.println("Invalid Account Number!");
                    }
                    t = false;
                    break;
                case 3:
                    System.out.println("Enter Account Number : ");
                    AccountNumber = input.nextInt();
                    for(k = 0; k < i; k++) {
                        if(AccountNumber == ob[k].accountNumber) {
                            t = true;
                            break;
                        }
                    }
                    if(t) {
                        System.out.println("Enter Amount to withdraw : ");
                        amount = input.nextDouble();
                        try {
                            ob[k].withdraw(amount);
                        } catch (LessBalanceException e) {

                        }
                    } else {
                        System.out.println("Invalid Account Number!");
                    }
                    t = false;
                    break;
                case 4:
                    System.out.println("Enter Account Number : ");
                    AccountNumber = input.nextInt();
                    for(k = 0; k < i; k++) {
                        if(AccountNumber == ob[k].accountNumber) {
                            t = true;
                            break;
                        }
                    }
                    if(t) {
                        ob[k].getBalance();
                    } else {
                        System.out.println("Invalid Choice!");
                    }
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
