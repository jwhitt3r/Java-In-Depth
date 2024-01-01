package foundationsofjava.oop.videoexercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank;
    @BeforeEach
    void setUp(){
        bank = new Bank();
        bank.setAccountNumber("1010101");
        bank.setEmail("test@test.com");
        bank.setCustomerName("Jack Whitter-Jones");
        bank.setPhoneNumber("10101010");
        bank.setAccountBalance(1000.0);
    }

    @Test
    @DisplayName("Check account number")
    void getAccountNumber() {
        assertAll(()-> assertEquals("1010101", bank.getAccountNumber()),
                () -> assertNotEquals("123123123123", bank.getAccountNumber()));
    }

    @Test
    @DisplayName("Set the account balance to 100")
    void setAccountNumber() {
        bank.setAccountBalance(100);
        assertEquals(100, bank.getAccountBalance());
    }

    @Test
    @DisplayName("Get the customers account balance")
    void getAccountBalance() {
        assertEquals(1000.0, bank.getAccountBalance());
    }

    @Test
    @DisplayName("Check that we can set account balance and it isn't negative")
    void setAccountBalance() {
        bank.setAccountBalance(1000.0);
        assertAll(()-> assertEquals(1000.0, bank.getAccountBalance()),
                () -> assertNotEquals(123123123123.0, bank.getAccountBalance()));
    }

    @Test
    @DisplayName("Set a negative account balance")
    void setNegativeAccountBalance() {
        bank.setAccountBalance(-1000.0);
        assertEquals(1000.0, bank.getAccountBalance());
    }

    @Test
    @DisplayName("Get customers name")
    void getCustomerName() {
        assertEquals("Jack Whitter-Jones", bank.getCustomerName());
    }

    @Test
    @DisplayName("Sets the name of the customer")
    void setCustomerName() {
        bank.setCustomerName("Test");
        assertEquals("Test", bank.getCustomerName());
    }

    @Test
    @DisplayName("Gets the email of the customer")
    void getEmail() {
        assertEquals("test@test.com", bank.getEmail());
    }

    @Test
    @DisplayName("Sets the email of the customer")
    void setEmail() {
        bank.setEmail("NewEmail@test.com");
        assertEquals("NewEmail@test.com", bank.getEmail());
    }

    @Test
    @DisplayName("Gets the phone number of the customer")
    void getPhoneNumber() {
        assertEquals("10101010", bank.getPhoneNumber());
    }

    @Test
    @DisplayName("Sets the phone number of the customer")
    void setPhoneNumber() {
        bank.setPhoneNumber("120398");
        assertEquals("120398", bank.getPhoneNumber());
    }

    @Test
    @DisplayName("Adds 100 to the account balance")
    void deposit() {
        bank.deposit(100);
        assertEquals(1100.0, bank.getAccountBalance());
    }

    @Test
    @DisplayName("Withdraws 100")
    void withdraw() {
        bank.withdraw(100);
        assertEquals(900, bank.getAccountBalance());
    }
    @Test
    @DisplayName("Withdraws more than the balance")
    void withdrawMoreThanBalance() {
        double total = bank.withdraw(bank.getAccountBalance() + 100.0);
        assertEquals(0.0, total);
    }
}