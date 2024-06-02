package review.enum4;

public class EnumRefMain2 {
    public static void main(String[] args) {
        int price = 10000;

//        DiscountService discountService = new DiscountService();
//        int basic = discountService.discount(Grade.BASIC, price);
//        System.out.println("basic = " + basic);

//        System.out.println(Grade.BASIC.discount(price));
//        System.out.println(Grade.GOLD.discount(price));
//        System.out.println(Grade.DIAMOND.discount(price));

        printDiscount(Grade.BASIC, price);
        printDiscount(Grade.GOLD, price);
        printDiscount(Grade.DIAMOND, price);
    }

    private static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + " " + grade.discount(price));
    }
}
