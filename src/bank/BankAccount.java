package bank;

public class BankAccount {
    private String accountName;
    private int balance;
    private final String accountNumber;

    public BankAccount(String accountName, int balance, String accountNumber) {
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
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

    public void deposit(int deposit) {
        this.balance += deposit;
    }

    public void withdraw(int withdrawal) throws InsufficientFundsException{
        if(this.balance < withdrawal) {
            throw new InsufficientFundsException();
        } else {
            this.balance -= withdrawal;
        }
    }

    public void transfer(int fund, BankAccount beneficiary) throws InsufficientFundsException{
        if(this.balance < fund) {
            throw new InsufficientFundsException();
        } else {
            this.balance -= fund;
            beneficiary.balance += fund;
        }
    }

    public static boolean isValidAccountNumber(String accountNumber) throws InvalidAccountNumberException{
        int sumOfDigits = 0;
        String[] tmpArray = accountNumber.split("-");
        for (String actual : tmpArray) {
            for (int j = 0; j < actual.length(); j++) {
                sumOfDigits += Integer.parseInt(String.valueOf(actual.charAt(j)));
            }
        }
        int firstDigit = Integer.parseInt(String.valueOf(tmpArray[0].charAt(0)));
        int lastDigit = Integer.parseInt(String.valueOf(tmpArray[tmpArray.length-1].charAt(tmpArray.length)-1));
        if (sumOfDigits > 20) {
            return firstDigit % 2 == 0 && lastDigit % 2 == 0 ||
                    firstDigit % 2 != 0 && lastDigit % 2 != 0;
        } else {
            throw new InvalidAccountNumberException();
        }
    }
}
