public class RegularPay extends PayCalculator{
    public RegularPay(double payRate) {
        super(payRate);
    }
    @Override
        public int computePay(int hours) {
        return (int) Math.round(super.computePay(hours));
        }
    }

