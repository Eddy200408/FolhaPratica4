
// Main.java (Programa de teste)
public class Main {
    public static void main(String[] args) {
        // Testando as classes e métodos
        DrawableShape square = new Square(0, 0, "Azul", 5);
        square.Move(10, 10);
        square.draw();

        PayCalculator regularPay = new RegularPay(15.0);
        System.out.println("A receber por 40 horas: $" + regularPay.computePay(40));

        PayCalculator hazardPay = new HazardPay(15.0);
        System.out.println("Hazard Pay por 40 horas: $" + hazardPay.computePay(40));

        DiscountPolicy bulkDiscount = new BulkDiscount(5, 20);
        System.out.println("Bulk Discount de 6 items que custam $10: $" + bulkDiscount.computeDiscount(6, 10));

        DiscountPolicy buyNItemsGetOneFree = new BuyNItemsGEtOneFree(3);
        System.out.println("Compre 3 itens e ganhe 1 grátis por 10 itens custando $ 10 cada $" + buyNItemsGetOneFree.computeDiscount(10, 10));

        DiscountPolicy combinedDiscount = new CombinedDiscount(bulkDiscount, buyNItemsGetOneFree);
        System.out.println("Desconto combinado para 6 itens custando $ 10 cada: $" + combinedDiscount.computeDiscount(6, 10));

        Person person = new Person("Helder Santos", 2004);
        System.out.println(person);

        Student student = new Student("Eddy", 2000, "Universidade Tecnica do Atlantico");
        System.out.println(student);

        Instructor instructor = new Instructor("Tomas", 1994, 90000);
        System.out.println(instructor);
    }
}
