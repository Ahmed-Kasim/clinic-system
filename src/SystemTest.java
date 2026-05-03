import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SystemTest {

    @Test
    void testLoginSuccess() {
        Patient p = new Patient("test@mail.com", "1234", "Ahmed");
        assertTrue(p.login("test@mail.com", "1234"));
    }

    @Test
    void testLoginFailure() {
        Patient p = new Patient("test@mail.com", "1234", "Ahmed");
        assertFalse(p.login("wrong@mail.com", "9999"));
    }

    @Test
    void testBookingFlow() {
        Patient p = new Patient("test@mail.com", "1234", "Ahmed");
        assertTrue(p.login("test@mail.com", "1234"));

        Appointment a = new Appointment("Dr. Zeyad", "10:00 AM");
        assertEquals("Dr. Zeyad at 10:00 AM", a.getDetails());
    }
    @Test
    void testReceptionistConfirmation() {
        Appointment a = new Appointment("Dr. Zeyad", "10:00 AM");
        Receptionist r = new Receptionist();
        assertTrue(r.confirmAppointment(a));
    }

}
