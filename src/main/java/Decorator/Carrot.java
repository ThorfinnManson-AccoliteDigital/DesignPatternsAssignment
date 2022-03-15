package Decorator;

public class Carrot extends SushiTopping{
    public Carrot(SushiBowlInterface bowl){
        super(bowl);
    }

    @Override
    public float addPrice() {
        return super.addPrice() + 0.3f;
    }

    @Override
    public String addName() {
        return super.addName() + "\n\t + Carrot";
    }
}
