package Decorator;

public class Nori extends SushiTopping{
    public Nori(SushiBowlInterface bowl){
        super(bowl);
    }

    @Override
    public float addPrice() {
        return super.addPrice() + 0.4f;
    }

    @Override
    public String addName() {
        return super.addName() + "\n\t + Nori";
    }
}
