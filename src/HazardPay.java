public class HazardPay extends PayCalculator{
    public HazardPay(double payRate) {
        super(payRate);
    }
@Override
    public int computePay(int hours) {
    return (int) Math.round(super.computePay(hours) * 1.5);
    }
}
