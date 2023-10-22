package first;

public class DishMaterial extends Dish{

    @Override
    public void material() {
        System.out.println("metal!");
    }

    @Override
    public void color() {
        System.out.println("silver color!");
    }

}