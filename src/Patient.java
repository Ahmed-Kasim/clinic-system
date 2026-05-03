public class Patient {
    private String email;
    private String password;
    private String name;

    public Patient(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public String getName() {
        return name;
    }
}
