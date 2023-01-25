package homework01182023;

public class dogTester {
    public static void main(String[] args) {

        Dog dog1=new Dog();
        dog1.name="dog1";
        dog1.breed="golden";
        dog1.age=3;
        dog1.color="black";

        dog1.bark();
        dog1.eat();

        Dog dog2=new Dog();

        dog2.name="dog2";
        dog2.breed="retriever";
        dog2.age=2;
        dog2.weight=5.5;

        dog2.bark();
        dog2.eat();

        Dog dog3=new Dog();

        dog3.name="dog3";
        dog3.breed="poodle";
        dog3.age=8;
        dog3.color="golden";
        dog3.weight=10.5;

        dog3.bark();
        dog3.eat();

    }
}
