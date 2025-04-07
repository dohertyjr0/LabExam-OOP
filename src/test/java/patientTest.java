
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
            new Patient("Jo", "Doherty", "234567890", 26);
        });
        assertEquals("Invalid", ex.getMessage());
    }

    @Test
    void validfamName(){
       Patient = new Patient("John", "Doe", "0123456789", 25);
        assertEquals("Doe", Patient.getFamName());
    }

    @Test
    void invalidfamName(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new Patient("Joh", "Doherty", "234567890", 26);
        });
        assertEquals("Invalid", ex.getMessage());
        System.out.println("Invalid family name");
    }

    @Test
    void validNumHSE(){
        Patient = new Patient("John", "Doe", "0123456789", 25);
        assertEquals("0123456789", Patient.getNumHSE());
    }

    @Test
    void invalidNumHSE(){
        Exception ex = assertThrows(IllegalArgumentException.class, () ->{
            new Patient("Joh", "Doherty", "234", 26);
        });
        assertEquals("Invalid", ex.getMessage());
    }

    @Test
    void validAge(){
        Patient = new Patient("John", "Doe", "0123456789", 25);
        assertEquals(25, Patient.getAge());
    }

    @Test
    void invalidAge(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
           new Patient("Joh", "Doherty", "234567890", 121);
        });
        assertEquals("Invalid", ex.getMessage());
    }

}
