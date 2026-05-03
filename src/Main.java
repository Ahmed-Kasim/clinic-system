public class Main {
    public static void main(String[] args) {
        Patient p = new Patient("test@mail.com", "1234", "Ahmed");
        if (p.login("test@mail.com", "1234")) {
            System.out.println("Login successful for " + p.getName());
            Appointment a = new Appointment("Dr. Zeyad", "10:00 AM");
            System.out.println("Appointment booked: " + a.getDetails());
        } else {
            System.out.println("Login failed.");
        }
        }
    }
