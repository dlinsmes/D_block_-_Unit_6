public class AnimalClient {

    public static void main(String [] main) {
        Animal a = new Animal("sheila");

        System.out.println(a.getName());
        System.out.println(a.getEnergy());
        a.sleep();
        a.eat();
        a.run();
        System.out.println(a);
        a.setEnergy(100);
        System.out.println(a);
        System.out.println();

        Cat c1 = new Cat("bob", 9);
        c1.jump();

        //since Cat is a child class of Animal,
        //you can call public methods of the parent class
        //from the child class
        //eat() and run() were inherited from Animal
        c1.eat();
        c1.run();

        //call the overridden version of sleep() that was
        //defined in Cat
        c1.sleep();

        //once a method is overridden, the parent class version
        //cannot be called from a client class
    }
}
