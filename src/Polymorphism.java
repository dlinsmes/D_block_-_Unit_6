public class Polymorphism {
    public static void main(String [] args) {
        Animal a = new Animal("jackson");
        Cat c = new Cat("Jackson the cat", 9);

        System.out.println(a);
        System.out.println(c);

        //once a method is overridden, the parent class version
        //cannot be called from a client class
        //System.out.println(a.super.toString());

        System.out.println(a.getMemLoc());

        //polymorphism - an object can have different types
        //and different behaviors

        //an object can have a declared type and an actual type

        //ex: declared type is Animal
        //actual type is Cat
        Animal a2 = new Cat("jackson the cat too", -3);

        a2.eat();
        a2.run();

        //sleep() was defined in the declared type (Animal)
        //but was overridden in Cat
        //-the overridden version is what executes
        a2.sleep();

        //jump() was NOT defined in the declared type
        //a2.jump();


        //to call a Cat method from a2, cast as a Cat object first
        Cat c2 = (Cat) a2;
        c2.jump();

        //same but without a saved Cat object
        ((Cat)a2).jump();

        //doesn't work bc a's actual type was not Cat
        //Cat c3 = (Cat) a;

        //use an if statement to check the actual type
        //of an object before casting
        if (a instanceof Cat) {
            Cat c3 = (Cat) a;
            System.out.println("a is a cat");
        }
        else {
            System.out.println("a is not a cat");
        }

        if (a2 instanceof Cat) {
            Cat c3 = (Cat) a2;
            System.out.println("a2 is a cat");
        }

        System.out.println(c);

        Cat c4 = new Cat("Jackson the cat", 9);
        System.out.println(c4);

        System.out.println(c4.equals(c));

        //c4 and c5 are the same object
        Cat c5 = c4;

        //equals() as defined by Java Object
        //returns true if the two objects are the same
        //and have the same memory location
        System.out.println(c4.equals(c5));

        System.out.println();

        //== checks if the objects are the same
        //(same mem loc) but == can't be overridden
        System.out.println(c == c4);
        System.out.println(c4 == c5);

    }
}
