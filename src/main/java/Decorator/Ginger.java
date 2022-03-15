package Decorator;

public class Ginger extends SushiTopping {
    public Ginger(SushiBowlInterface bowl){
        super(bowl);
    }

    @Override
    public float addPrice() {
        return super.addPrice() + 0.75f;
    }

    @Override
    public String addName() {
        return super.addName() + "\n\t + Ginger";
    }
}
