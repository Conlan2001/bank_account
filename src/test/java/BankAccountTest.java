import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("Conlan", "Roberts", LocalDate.parse("2001-03-03"), 222, 0);
    }

    @Test
    public void canDeposit() {
        bankAccount.deposit(100);
        assertThat(bankAccount.getBalance()).isEqualTo(100);

    }

    @Test
    public void canWithdraw() {
        bankAccount.withdraw(100);
        assertThat(bankAccount.getBalance()).isEqualTo(-100);

    }

    @Test
    public void canPayInterest() {
        bankAccount.deposit(100);
        bankAccount.payInterest(0.1);
        assertThat(bankAccount.getBalance()).isEqualTo(110);

    }

    @Test
    public void hasFristName() {
        assertThat(bankAccount.getFirstName()).isEqualTo("Conlan");
    }

    @Test
    public void canSetFirstName() {
        bankAccount.setFirstName("Hannah");
        assertThat(bankAccount.getFirstName()).isEqualTo("Hannah");
    }

    @Test
    public void hasLastName() {
        assertThat(bankAccount.getLastName()).isEqualTo("Roberts");
    }

    @Test
    public void canSetLastName() {
        bankAccount.setLastName("Adams");
        assertThat(bankAccount.getLastName()).isEqualTo("Adams");
    }

    @Test
    public void hasDateOfBirth() {
        assertThat(bankAccount.getDateOfBirth()).isEqualTo(LocalDate.parse("2001-03-03"));
    }

    @Test
    public void canSetDateOfBirth() {
        bankAccount.setDateOfBirth(LocalDate.parse("2001-04-02"));
        assertThat(bankAccount.getDateOfBirth()).isEqualTo(LocalDate.parse("2001-04-02"));
    }

    @Test
   public void hasAccountNumber() {
        assertThat(bankAccount.getAccountNumber()).isEqualTo(222);
    }

    @Test
    public void canSetAccountNumber() {
        bankAccount.setAccountNumber(333);
        assertThat(bankAccount.getAccountNumber()).isEqualTo(333);
    }

    @Test
    public void hasBalance() {
        assertThat(bankAccount.getBalance()).isEqualTo(0);
    }

    @Test
    public void canSetBalance() {
        bankAccount.setBalance(1000);
        assertThat(bankAccount.getBalance()).isEqualTo(1000);
    }
}
