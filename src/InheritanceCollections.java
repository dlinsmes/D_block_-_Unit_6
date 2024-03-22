public class InheritanceCollections {

    public static void main(String [] args) {
        //write and test an equals() method for Cat
        Cat c1 = new Cat("Jackson", 1);
        Cat c2 = new Cat("Jackson", 1);
        Cat c3 = new Cat("Zoe", 2);

        System.out.println("c1 and c2 are the same: " + c1.equals(c2));
        System.out.println("c1 and c3 are the same: " + c1.equals(c3));

        c2.setEnergy(1000);
        System.out.println("c1 and c2 are the same: " + c1.equals(c2));

        System.out.println();

        Dog d1 = new Dog("teemu");
        Dog d2 = new Dog("teemu");
        Dog d3 = new Dog("duke");

        System.out.println("d1 and d2 are the same:" + d1.equals(d2));
        System.out.println("d1 and d3 are the same:" + d1.equals(d3));

        System.out.println();

        Animal a = new Cat("steve", 5);

        a.eat();

        //this can be called bc sleep() was defined in the declared type
        //(Animal) but the overridden version of sleep() in Cat will run
        a.sleep();

        //jump() was not a method defined in Animal
        //a.jump();

        //to call a Cat method from a, cast it first
        if (a instanceof Cat) {
            Cat other = (Cat) a;
            other.jump();

            ((Cat)a).jump();
        }

        //since the param for equals() is an Object,
        //any kind of object can be passed as an argument

        System.out.println(c2.equals(d2));
        System.out.println(c2.equals(a));
        String s = "fdasfdsagfa";
        System.out.println(c2.equals(s));
        int [] nums = {1,2, 3};
        System.out.println(c2.equals(nums));

        System.out.println();
        System.out.println(c2);

        Animal a2 = new Animal("Jackson");
        a2.setEnergy(1000);

        //the version of equals that runs
        //depends on the type of object it
        //gets called from

        //Animal equals() gets called
        //-checks if param is an Animal, name, energy
        System.out.println(a2.equals(c2));

        //Cat equals() gets called
        //-checks if param is a Cat, name, energy, lives
        System.out.println(c2.equals(a2));

        Animal [] zoo = new Animal[5];
        //zoo can hold actual types of Animal, Cat, Dog
        zoo[0] = new Animal("steve");
        zoo[1] = new Cat("dog", 123);
        zoo[2] = new Dog("cat");
        if(Math.random() > .5) {
            zoo[3] = c2;
        }
        else {
            zoo[3] = d3;
        }
        zoo[4] = new Cat("definitely a real cat", 0);

        System.out.println();

        for (int i = 0; i < zoo.length; i++) {
            zoo[i].eat();
            zoo[i].sleep();

            //call jump() from the Cat objects in the array
            if (zoo[i] instanceof Cat) {
                ((Cat)zoo[i]).jump();
            }

            if (zoo[i] instanceof Dog) {
                Dog other = (Dog)zoo[i];
                other.woof();
            }

            System.out.println();
        }
    }
}
