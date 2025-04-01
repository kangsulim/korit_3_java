package ch18_generic.wildcard;

public class Main {

    // AnimalData의 필드가 Animal 클래스의 서브 클래스에 해당하는지
    // 확인하는 메서드 작성
    public AnimalData<? extends Animal> getAnimal(int flag) {

        if (flag == 1) {
            AnimalData<Human> animalData = new AnimalData<>(new Human());
            return animalData;
        } else if (flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<>(new Tiger());
            return animalData;
        }
        return null;
    }


    public static void main(String[] args) {
        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
        AnimalData<Human> animalData2 = new AnimalData<>(new Human());
        AnimalData<Car> animalData3 = new AnimalData<>(new Car());
        // 현재 AnimalData에 Car 객체가 들어갔다

        animalData1.printData();
        animalData2.printData();
//        animalData3.printData();

        // animalData3.printData(); 에서 오류 발생
        // Car 객체를 강제로 Animal 형태로 형변환 시키려고 했기 때문에
        // 문제 : 필드에 대입은 되는데 메서드 실행 단계에서 오류가 발생함.
        // 그냥 제네릭을 적용했을 때는 그러한데

        // 아래는 와일드카드를 적용해 볼 것이다.

        Main main = new Main();
        AnimalData<? extends Animal> animalData4 = main.getAnimal(1);
        AnimalData<? extends Animal> animalData5 = main.getAnimal(2);
        AnimalData<? extends Animal> animalData6 = main.getAnimal(3);

        if (animalData4 != null) {
            animalData4.printData();
        }

        if (animalData5 != null) {
            animalData5.printData();
        }

        if (animalData6 != null) {
            animalData6.printData();
        } else {
            System.out.println("내부 필드 값이 null 입니다.");
        }
    }
}
