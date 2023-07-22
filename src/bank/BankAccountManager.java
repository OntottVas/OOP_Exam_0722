package bank;

public class BankAccountManager{
    public static void main(String[] args) throws Exception{
        BankAccount accountOne = new BankAccount("Ger",
                1500, "16161600-80000088-16574837");

        BankAccount accountTwo = new BankAccount("Andris",
                1000, "16000000-00000000-0000000");

        accountOne.deposit(1500);

        System.out.println(accountOne);
        System.out.println(accountTwo);

        accountOne.transfer(2500, accountTwo);

        System.out.println(accountOne);
        System.out.println(accountTwo);

        System.out.println(BankAccount.isValidAccountNumber(accountTwo.getAccountNumber()));
    }
}
