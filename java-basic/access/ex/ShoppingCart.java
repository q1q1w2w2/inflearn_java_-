package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int count;

    public void addItem(Item item){
        if(items.length<=count){
            System.out.println("장바구니 꽉참여");
            return;
        }
        items[count++] = item;
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        int price = 0;
        for (int i=0; i<count ; i++) {
            String name = items[i].getName();
            int sum = items[i].getSum();
            price += sum;
            System.out.println("상품명: " + name + " 합계: " + sum);
        }
        System.out.println("전체 가격 합: " + price);
    }
}
