public class BankTest {
    public static void main(String[] args) {
        try {
            Bank bank = new Bank();

            bank.createAccount("John Doe", 1000);
            bank.createAccount("Jane Doe", 500);

            bank.transferMoney(1, 2, 200);

            System.out.println(bank.findAccount(1).getAccountSummary());
            System.out.println(bank.findAccount(2).getAccountSummary());
        } catch (AccountNotFoundException | NegativeAmountException | InsufficientFundsException e) {
            e.printStackTrace();
        }
    }
}
