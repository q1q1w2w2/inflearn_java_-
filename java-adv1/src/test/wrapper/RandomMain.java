package test.wrapper;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(10);
        System.out.println("randomInt = " + randomInt);
    }
}
