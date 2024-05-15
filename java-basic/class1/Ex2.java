package class1;

public class Ex2 {
    public static void main(String[] args) {

        ProductOrder[] pArr = {
                productOrder("두부", 2000, 2),
                productOrder("두부", 2000, 2),
                productOrder("두부", 2000, 2)
        };
        int sum = 0;
        for (ProductOrder p : pArr) {
            sum+=p.price;
        }
        System.out.println("총 결제 금액: " + sum);
    }
    public static ProductOrder productOrder(String productName, int price, int quantity){
        ProductOrder p = new ProductOrder();
        p.productName=productName;
        p.price=price;
        p.quantity=quantity;
        return p;
    }
}
