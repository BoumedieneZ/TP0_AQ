import org.example.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    public void setup() {
        account = new BankAccount(1000.0, 0.05); // Initial balance of 1000.0 and 5% interest rate
    }

    @Test
    public void testDeposit() {
        account.deposit(500.0);
        Assertions.assertEquals(1500.0, account.getBalance());
    }

    @Test
    public void testDepositNegativeAmount() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> account.deposit(-100.0));
    }

    @Test
    public void testWithdraw() {
        account.withdraw(200.0);
        Assertions.assertEquals(800.0, account.getBalance());
    }

    @Test
    public void testWithdrawNegativeAmount() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100.0));
    }

    @Test
    public void testWithdrawInsufficientBalance() {
        Assertions.assertThrows(IllegalStateException.class, () -> account.withdraw(2000.0));
    }

    @Test
    public void testTransfer() {
        BankAccount otherAccount = new BankAccount(500.0, 0.05);
        account.transfer(200.0, otherAccount);
        Assertions.assertEquals(800.0, account.getBalance());
        Assertions.assertEquals(700.0, otherAccount.getBalance());
    }

    @Test
    public void testTransferToNullAccount() {
        Assertions.assertThrows(NullPointerException.class, () -> account.transfer(200.0, null));
    }

    @Test
    public void testAddInterest() {
        account.addInterest();
        Assertions.assertEquals(1050.0, account.getBalance());
    }

    @Test
    public void testGetBalance() {
        Assertions.assertEquals(1000.0, account.getBalance());
    }
}
