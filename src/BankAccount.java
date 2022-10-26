import java.util.Arrays;

public class BankAccount {
    long accountId;
    Person[] accountOwners;
    double balance;
    int accountOwnerCounting = 0;

    public BankAccount(Person firstPersonForAccountOwner, int numberOfAccountOwners, double balance) {
        accountOwners = new Person[numberOfAccountOwners];
        accountOwners[0] = firstPersonForAccountOwner;
        this.balance = balance;
        accountOwnerCounting++;
    }

    public void addAccountOwner(long idCard, String newFirstName, String newLastName) {
        if (accountOwnerCounting <= accountOwners.length) {
            accountOwners[accountOwnerCounting] = new Person(idCard, newFirstName, newLastName);
            accountOwnerCounting++;
        } else {
            System.out.println("Error: too many account owners");
        }
    }

    public Person[] getAccountOwners() {
        return accountOwners;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountId() {
        return accountId;
    }

    public boolean withdraw(double amount) {
        if (balance <= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean deposit(double amount) {
        if (amount >= 0) {
        balance += amount;
            return true;
        }
        return false;
    }

    public boolean transfer(BankAccount targetAccount, double amount) {
        if(amount <= balance){
            targetAccount.balance += amount;
            balance -= amount;
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccount{");
        sb.append("accountId=").append(accountId);
        sb.append(", accountOwners=").append(Arrays.toString(accountOwners));
        sb.append(", balance=").append(balance);
        sb.append(", accountOwnerCounting=").append(accountOwnerCounting);
        sb.append('}');
        return sb.toString();
    }
}
