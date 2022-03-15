package Decorator;

public class SushiBowl implements SushiBowlInterface {


    public String addName(){
        return "SushiBowl with rice";
    }

    @Override
    public float addPrice() {
        return 2.5f;
    }

    @Override
    public String sumParts() {
        return null;
    }


}
