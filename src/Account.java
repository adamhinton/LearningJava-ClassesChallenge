public class Account {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public Account (){
        System.out.println("Empty constructor called");
    }

    public Account (int accountNumber, double accountBalance, String customerName, String email, int phone){
        System.out.println("called with paramters");
        this.accountBalance = accountBalance;
        this.phoneNumber = phone;
        this.email = email;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds (double dollarAmount){
        this.accountBalance += dollarAmount;
        System.out.println("new balance: " + this.accountBalance);
    }

    public void withdrawFunds (double dollarAmount){
        if(dollarAmount <= this.accountBalance){
            this.accountBalance -= dollarAmount;
            System.out.println("new balance: " + this.accountBalance);
        }
    }

}
