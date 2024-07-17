package section14.Practice2;

class Animal{};
class Dog extends Animal {};

public class Practice5 {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Dog dog = (Dog)animal; // ClassCastException
  }
}
