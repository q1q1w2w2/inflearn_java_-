package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractAnimal[] animalArr = {new Dog(), new Cat(), new Caw()};
        for (AbstractAnimal animal : animalArr) {
            SoundAnimal(animal);
        }
    }

    private static void SoundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
