
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class patientTest {
    Patient Patient;
    @BeforeEach
    void setup(){
        Patient = new Patient("John", "Doe", "0123456789", 25);
    }

    @Test
    void validName(){
        Patient = new Patient("John", "Doe", "0123456789", 25);
        assertEquals("John", Patient.getName());
    }

    @Test
    void invalidName(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new Patient("Joh", "Doherty", "234567890", 26);
        });
        assertEquals("Invalid name", ex.getMessage());
    }
}
