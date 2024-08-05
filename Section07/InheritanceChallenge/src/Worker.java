// adding localDate class and time.format.DateTimeFormatter package
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Worker {
    private String name;
    // birthDate format will be MM/DD/YYYY
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        String formattedDate = this.getDate();
        int currentYear = Integer.parseInt(formattedDate.substring(6));
        int birthYear = Integer.parseInt(this.birthDate.substring(6));
        return currentYear - birthYear;
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    public String getDate() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return currentDate.format(formatter);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
