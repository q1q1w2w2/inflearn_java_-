package nested.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;
    private int abrasion;
    private Tire tire;

    public Car(String model, int chargeLevel, int abrasion) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.abrasion = abrasion;
        this.engine = new Engine();
        this.tire = new Tire();
    }

    public void start(){
        engine.start();
        tire.confirmAbrasion();
        System.out.println(model + " 시작 완료");
    }

    private class Engine {
        public void start(){
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }

    private class Tire {
        public void confirmAbrasion(){
            System.out.println("타이어 마모도: " + abrasion + "%");
        }
    }

}
