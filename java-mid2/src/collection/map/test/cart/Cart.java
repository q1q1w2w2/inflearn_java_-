package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cart = new HashMap<>();

    public void add(Product product, int count){
        int quantity = cart.getOrDefault(product, 0);
        cart.put(product, quantity + count);
    }

    public void minus(Product product, int count){
        // 수량이 0 이하면 삭제
        int quantity = cart.getOrDefault(product, 0);

        if(quantity - count <= 0){
            cart.remove(product);
        }else{
            cart.put(product, quantity-count);
        }

    }
    
    public void printAll(){
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }
}
