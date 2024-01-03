package foundationsofjava.oop.videoexercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankConstructorExampleTest {
    BankConstructorExample bank;
    @BeforeEach
    void setUp() {
        bank = new BankConstructorExample("123", 123.0, "Test", "Test@test.com", "123456789");
    }

    @Test
    void testToString() {
        assertEquals("BankConstructorExample{" +
                "accountNumber='123"+ '\'' +
                ", accountBalance=123.0" +
                ", customerName='Test" + '\'' +
                ", email='Test@test.com" + '\'' +
                ", phoneNumber='123456789" + '\'' +
                '}', bank.toString());
    }
}