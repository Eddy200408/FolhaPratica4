public class BulkDiscount extends DiscountPolicy{
    private double minimo;
    private double percentual;

    public BulkDiscount(double minimo, double percentual) {
        this.minimo = minimo;
        this.percentual = percentual;
    }

@Override
    public double computeDiscount(int count, double itemCost){
        if(count<minimo){
            return (itemCost*percentual)/100;
        }
        else{
            return 0;
        }
    }
}
