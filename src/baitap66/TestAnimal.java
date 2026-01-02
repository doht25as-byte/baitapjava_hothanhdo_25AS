package baitap66;

public class TestAnimal {
    public static void main(String[] args) {

        Animal a1 = new Cat("Kitty");
        Animal a2 = new Dog("Buddy");
        Animal a3 = new BigDog("Max");

        a1.greets(); // Meow
        a2.greets(); // Woof
        a3.greets(); // Wooow

        Dog d1 = new Dog("Rex");
        Dog d2 = new BigDog("Rocky");
        BigDog bd1 = new BigDog("Titan");

        d1.greets(d1);   // Woooof
        d2.greets(d1);   // Wooooooow
        bd1.greets(bd1); // Wooooooooow
    }
}

