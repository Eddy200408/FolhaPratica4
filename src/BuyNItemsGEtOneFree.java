public class BuyNItemsGEtOneFree extends DiscountPolicy{
    private int n;

    public BuyNItemsGEtOneFree(int n) {
        this.n = n;
    }
    @Override
    public double computeDiscount(int count, double itemCost){
        return (count/n)*itemCost;
    }
}
