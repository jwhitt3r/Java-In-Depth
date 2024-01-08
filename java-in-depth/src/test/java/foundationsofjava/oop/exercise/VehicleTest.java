package foundationsofjava.oop.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Vehicle vehicle;
    @BeforeEach
    void setUp() {
        vehicle = new Vehicle(4, "Steel", 10);
    }

    @Test
    @DisplayName("Check the number of wheels is expected")
    void getWheels() {
        assertEquals(4, vehicle.getWheels());
    }
}