public abstract class Furniture {
    private String name;
    private int cost;
    public String getName() { return name; }
    public int getCost() { return cost; }
    public Furniture(String name, int cost){
        this.name=name;
        this.cost = cost;
    }
    public abstract void displayInfo();
}
