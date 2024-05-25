package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Animal dog = new Animal("멍멍이1", 100);
        Animal cat = new Animal("야옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        dogHospital.set(cat); // 매개변수 체크 실패: 컴파일 오류 발생을 안해버림

        dogHospital.set(dog);
        Dog biggerDog =(Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
