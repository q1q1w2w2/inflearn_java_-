package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 여러 주문 정보를 저장
        ProductOrder p1 = creatOreder("두부", 2000, 3);
        ProductOrder p2 = creatOreder("김치", 7000, 2);
        ProductOrder p3 = creatOreder("고기", 10000, 3);

        ProductOrder[] productArr = {p1, p2, p3};
        printOrders(productArr);
        int sum = getTotalAmount(productArr);
        System.out.println("총 금액: " + sum);
    }

    static ProductOrder creatOreder(String productName, int price, int quantity){
        ProductOrder p = new ProductOrder();
        p.productName=productName;
        p.price=price;
        p.quantity=quantity;
        return p;
    }
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int sum=0;
        for (ProductOrder order : orders) {
            sum+=order.price * order.quantity;
        }
        return sum;
    }
}
