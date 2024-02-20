public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountBalance(2342.20);
        bankAccount.setEmail("adam.d.@gmail.com");
        bankAccount.setCustomerName("Adam");

//        System.out.println(bankAccount.getAccountBalance() + bankAccount.getCustomerName() + bankAccount.getEmail());

        bankAccount.withdrawFunds(342.20);

        bankAccount.depositFunds(1000);
    }
}