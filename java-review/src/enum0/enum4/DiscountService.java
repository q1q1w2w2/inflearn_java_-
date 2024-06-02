package review.enum0.enum4;

public class DiscountService {
    public int discount(Grade grade, int price){
        return price * grade.getDiscountPercent() / 100;
    }
}
