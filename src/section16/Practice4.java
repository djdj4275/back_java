package section16;

import java.util.ArrayList;
import java.util.List;

// 와일드카드 (제네릭 타입보다 더 유함)

class Animal {
  void sound() {
    System.out.println("animal sound");
  }
}

class Dog extends Animal {
  @Override
  void sound() {
    System.out.println("멍멍");
  }
}

class Cat extends Animal {
  @Override
  void sound() {
    System.out.println("야옹");
  }
}

public class Practice4 {
  // extends 사용시 Animal과 그 자식클래스만 가능
  public static void makeAnimalsSound(List<? extends Animal> animals) {
    for (Animal animal: animals) {
      animal.sound();
    }
  }
  
  // super 사용시 Animal과 그 부모클래스만 가능
  public static void addDog(List<? super Animal> animals) {
    animals.add(new Dog());
  }
  public static void main(String[] args) {
    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog());

    List<Cat> cats = new ArrayList<>();
    cats.add(new Cat());

    List<Animal> animals = new ArrayList<>();
    animals.add(new Dog());
    animals.add(new Cat());

    addDog(animals);

    System.out.println(dogs); // 객체 1개 존재
    System.out.println(cats); // 객체 1개 존재
    System.out.println(animals); // 객체 3개 존재

    makeAnimalsSound(dogs); // 멍멍
    makeAnimalsSound(cats); // 야옹
    makeAnimalsSound(animals); // 멍멍, 야옹, 멍멍
  }
}
