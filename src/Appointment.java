public class Appointment {
    private String doctorName;
    private String timeSlot;

    public Appointment(String doctorName, String timeSlot) {
        this.doctorName = doctorName;
        this.timeSlot = timeSlot;
    }

    public String getDetails() {
        return doctorName + " at " + timeSlot;
    }
}
