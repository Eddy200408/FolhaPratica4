public class Student extends Person{
    private String Diploma;
    public Student(String name, int birthYear, String diploma) {
        super(name, birthYear);
        Diploma = diploma;
    }
    public String toString() {
        return "Student{" +
                "Diploma='" + Diploma + '\'' +
                '}';
    }
}
