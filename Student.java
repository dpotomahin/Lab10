public class Student {
    private String firstName;
    private String lastName;
    private String recordBookNumber;
    private double averageGrade;

    public Student(String firstName, String lastName, String recordBookNumber, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.recordBookNumber = recordBookNumber;
        this.averageGrade = averageGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRecordBookNumber() {
        return recordBookNumber;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", recordBookNumber='" + recordBookNumber + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
