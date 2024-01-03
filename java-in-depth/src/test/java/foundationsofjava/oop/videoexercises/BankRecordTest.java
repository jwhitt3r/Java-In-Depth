package foundationsofjava.oop.videoexercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankRecordTest {
    @Test
    public void testPersonRecord() {
        // Arrange
        BankRecord bankRecord = new BankRecord("123", 123.0, "test", "test@test.com", "123456789");

        // Act
        String accountNumber = bankRecord.accountNumber();
        double accountBalance = bankRecord.accountBalance();
        String customerName = bankRecord.customerName();
        String email = bankRecord.email();
        String phoneNumer = bankRecord.phoneNumber();

        // Assert
        assertEquals("123", accountNumber);
        assertEquals(123.0, accountBalance);
        assertEquals("test", customerName);
        assertEquals("test@test.com", email);
        assertEquals("123456789", phoneNumer);
    }
}