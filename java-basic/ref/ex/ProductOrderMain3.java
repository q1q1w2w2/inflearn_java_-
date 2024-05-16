package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력할 주문 개수 입력해: ");
        int n = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[n];

        for(int i=0;i<n;i++){
            scanner.nextLine();
            System.out.println((i+1) + "번째 주문 정보..");
            System.out.print("상품명: ");
            String name = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();

            orders[i] = creatOreder(name, price, quantity);
        }

        printOrders(orders);
        int sum = getTotalAmount(orders);
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
