public abstract class PayCalculator {
    protected double payRate;

    public PayCalculator(double payRate) {
        this.payRate = payRate;
    }

    public int computePay(int hours){
        return 0;
    }
}
