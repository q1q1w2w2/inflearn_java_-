package collection.list.test.ex2;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        int sum = 0;
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            sum += item.getTotalPrice();
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + sum);
    }
}
