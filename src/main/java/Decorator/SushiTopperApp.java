package Decorator;

public class SushiTopperApp {
    public static void main(String[] args) {
        SushiBowlInterface bowl = new Tofu(new Carrot(new Edamame(new SushiBowl())));
        SushiBowlInterface bowl2 = new Nori(new Ginger(new Edamame(new Carrot(new SushiBowl()))));

        System.out.println(bowl.sumParts() +"\n ~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(bowl2.sumParts()+"\n ~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
