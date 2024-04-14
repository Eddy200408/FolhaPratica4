public class Person {
    private String nome;
    private int anoNasc;

    public Person(String nome, int anoNasc) {
        this.nome = nome;
        this.anoNasc = anoNasc;
    }

    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                ", anoNasc=" + anoNasc +
                '}';
    }
}
