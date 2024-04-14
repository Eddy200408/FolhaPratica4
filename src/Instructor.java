public class Instructor extends Person{
    private double Salario;
    public Instructor(String name, int birthYear, double salario) {
        super(name, birthYear);
        Salario = salario;
    }
    public String toString() {
        return "Instructor{" +
                "Salario=" + Salario +
                '}';
    }
}
