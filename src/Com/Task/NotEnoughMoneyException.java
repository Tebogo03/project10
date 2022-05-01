package Com.Task;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String message){
        super(message);
    }
} class Account {
    private String owner;
    private int balance ;
    private String accountNumber;

    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void withdrawal(int amount) throws NotEnoughMoneyException {
        if (balance >= amount){
            balance = balance-amount;
        }
        else {
            System.out.println("Not enough funds in the account");
        }

    }
}
class Main{
    public static void main(String[] args) throws NotEnoughMoneyException {
        Account ac =new Account("David",3000,"2000 2873 4477 6666");
        try {
            ac.withdrawal(470);
        }
        catch (NotEnoughMoneyException e){

        }
        finally {
            System.out.println(ac.getBalance());
        }

    }
}
