//Inherticance - Java classes can have a parent-child
//(superclass-subclass) relationship
//-the child/subclass extends the parent/superclass
//-the child class inherits (has access to) all public
//functionalities of the parent class (methods and variables)

//classes with an inheritance structure have an IS-A relationship
//ex - a Cat is an Animal

public class Cat extends Animal{

    private int lives;

    public Cat(String name, int lives) {
        //to make a Cat object, you also make an Animal
        //object bc a Cat is an Animal

        //within a child class constructor, you MUST
        //first call the parent/superclass constructor using super()
        //use arguments that match the params defined for the Animal
        // constructor
        super(name);

        this.lives = lives;
    }

    public void jump() {
        System.out.println("cat jumped on the christmas tree");
    }

    //sleep() was originally defined in the parent class
    //to redefine a method in the child class is called
    //overriding the method

    public void sleep() {

        //when a cat sleeps, its energy doubles
        //energy *= 2;

        //since energy is a private variable, you need to
        //use the public get and set methods

        int oldEnergy = getEnergy();
        setEnergy(oldEnergy * 2);

        System.out.println(getName() +  " is a cat and " +
                "took a nap and has " + getEnergy() + " energy");
    }

    public String toString() {
        //NEED to use the super keyword when the method
        //has been overridden and you're intending to call
        //the parent class version
        return super.toString() + " and is a cat" +
                " with " + lives + " lives";
    }

    public boolean equals(Object o) {
        if (o instanceof Cat) {
            Cat other = (Cat) o;
            if (other.getName().equals(this.getName())
                    && other.getEnergy() == this.getEnergy()
                    && other.lives == this.lives) {
                return true;
            }
        }
        return false;
    }

}
