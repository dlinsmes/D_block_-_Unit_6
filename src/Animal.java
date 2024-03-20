public class Animal {

    private String name;
    private int energy;

    public Animal(String name) {
        this.name = name;
        energy = 10;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int newEnergy) {
        energy = newEnergy;
    }

    public void eat() {
        energy += 2;
        System.out.println(name + " ate a snack and has " + energy + " energy");
    }

    public void sleep() {
        energy += 5;
        System.out.println(name + " took a nap and has " + energy + " energy");
    }

    public void run() {
        energy -= 1;
        System.out.println(name + " went for a run and has " + energy + " energy");
    }

    //The java Object class is predefined and is a superclass
    //of every class that you define
    //toString() is defined in Object to return the type and memory location
    public String toString() {
        return name + " has " + energy + " energy";
    }

    //if you want to preserve a parent
    //class method:
    public String getMemLoc() {
        return super.toString();
    }

    public boolean equals(Object o) {
        //two animal objects are equal if their
        //names and energies are the same

        //o is of type Object and doesn't have getName()
        //if (o.getName().equals(this.name));

        if (o instanceof Animal) {
            Animal other = (Animal) o;
            if (other.name.equals(this.name) && other.energy == this.energy) {
                return true;
            }
        }
        //if o's actual type isn't animal OR the names or energies don't match
        //then the objects are not equal
        return false;
    }

}
