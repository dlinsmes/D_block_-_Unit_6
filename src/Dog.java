public class Dog extends Animal {

    private int woofs;

    public Dog(String name) {
        super(name);
        woofs = 2;
    }

    public void woof() {
        setEnergy(getEnergy() + 3);
        for (int i = 0; i < woofs; i++)
            System.out.print("woof ");
        System.out.println();
        woofs++;
    }

    public String toString() {
        return super.toString() + " and is a dog with " + woofs + " woofs";
    }


    public boolean equals(Object o) {
        if (o instanceof Dog) {
            Dog other = (Dog) o;

            //since name and energy are already checked in the
            //parent class equals() method, that can be used
            //by calling super.equals()

            if(super.equals(other) && other.woofs == this.woofs) {
                return true;
            }
        }
        return false;
    }

}
