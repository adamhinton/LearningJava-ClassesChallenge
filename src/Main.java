public class Main {
    public static void main(String[] args) {

        Account bankAccount = new Account();

        System.out.println(bankAccount.getAccountBalance() + bankAccount.getAccountNumber());

        bankAccount.withdrawFunds(342.20);

        bankAccount.depositFunds(1000);
    }
}