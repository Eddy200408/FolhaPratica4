public class CombinedDiscount extends DiscountPolicy{
    private  DiscountPolicy policia1;
    private  DiscountPolicy policia2;

    public CombinedDiscount(DiscountPolicy policia1, DiscountPolicy policia2) {
        this.policia1 = policia1;
        this.policia2 = policia2;
    }

@Override
    public double computeDiscount(int count, double itemCost){
        return Math.max(policia1.computeDiscount(count, itemCost), policia2.computeDiscount(count, itemCost));
    }
}

