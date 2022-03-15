package Decorator;

public class SushiTopping implements SushiBowlInterface{
    private SushiBowlInterface bowl;

    public SushiTopping(SushiBowlInterface bowl) {
        this.bowl =bowl;
    }

    @Override
    public String addName() {
        return bowl.addName();
    }

    @Override
    public float addPrice() {
        return bowl.addPrice();
    }

    public String sumParts() {
        return (addName() + String.format("\n\nPrice: %.2f", addPrice()));
    }
}
