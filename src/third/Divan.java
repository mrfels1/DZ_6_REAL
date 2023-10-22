public class Divan extends Furniture {
    int length;
    int width;
    public Divan(String name, int cost, int width, int length)
    {
        super(name, cost);
        this.width=width;
        this.length=length;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + super.getName() +
                "price: " + super.getCost() + " size: " + this.width + "x" + this.length);
    }
}
