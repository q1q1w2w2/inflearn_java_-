package review.enum0.enum3;

public class EnumEx3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        System.out.println("basic = " + basic);
    }
}
