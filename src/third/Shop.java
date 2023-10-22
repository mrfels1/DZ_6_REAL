import java.util.Objects;
import java.util.Vector;

public class Shop {
    public Vector<Furniture> shoplist;
    public Shop(){
        this.shoplist = new Vector<Furniture>();
    };
    public void addDivan(String Divanname,int cost, int width, int length){
        Furniture div = new Divan(Divanname,cost,width,length);
        shoplist.add(div);
        System.out.println("Divan with name " + Divanname + " added!");

    }
    public void addStol(String Stolname,int cost, int width, int length){
        Furniture sto = new Stol(Stolname,cost,width,length);
        shoplist.add(sto);
        System.out.println("Divan with name " + Stolname + " added!");

    }
    public boolean findFurniture(String furniturename){
        for (Furniture a:shoplist) {
            if(Objects.equals(a.getName(), furniturename)){
                System.out.println("Furniture with name " + furniturename + " found!");
                return true;
            }
        }
        System.out.println("Furniture with name " + furniturename + " not found!");
        return false;
    }
    public void removeFurniture(String furniturename){
        shoplist.removeIf(a -> Objects.equals(a.getName(), furniturename));
        System.out.println("Furniture with name " + furniturename + " removed!");
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        if(!shoplist.isEmpty()){
            result.append(shoplist.get(0).getName());
            for (int i = 1; i < shoplist.size();i++) {
                result.append(" ").append(shoplist.get(i).getName());
            }
        }
        return result.toString();
    }
}