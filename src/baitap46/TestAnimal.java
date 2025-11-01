package baitap46;

public class TestAnimal {
    public static void main(String[] args) {
        Cat c1 = new Cat("Kitty");
        c1.greets();
        System.out.println(c1);

        Dog d1 = new Dog("Rex");
        Dog d2 = new Dog("Buddy");
        d1.greets();
        d1.greets(d2);
        System.out.println(d1);
    }
}
