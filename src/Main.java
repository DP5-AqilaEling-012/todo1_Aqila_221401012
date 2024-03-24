public class Main {

    public static void main(String[] args){


        //instantiation Kintamani
        dog Kintamani = new dog("Kintamani", 30.2, "brown", "short", 95.5);

        System.out.println(Kintamani.hairColor);
        System.out.println(Kintamani.weight);
        System.out.println(Kintamani.tail);
        System.out.println(Kintamani.energy);

        Kintamani.bark();
        Kintamani.run();
        Kintamani.eat();
        Kintamani.sleep();
        Kintamani.eat();
        System.out.println(Kintamani.getWeight());
        System.out.println(Kintamani.getEnergy());

        //instantiation Pittbull
        dog Pittbull = new dog("Pittbull", 60.0, "black", "very short", 65.3);
        System.out.println(Pittbull.hairColor);
        System.out.println(Pittbull.weight);
        System.out.println(Pittbull.tail);
        System.out.println (Pittbull.energy);

        Pittbull.bark();
        Pittbull.eat();
        Pittbull.eat();
        Pittbull.sleep();
        Pittbull.run();
        Pittbull.sleep();
        System.out.println(Pittbull.getWeight());
        System.out.println(Pittbull.getEnergy());

        //instantiation Husky
        dog Husky = new dog("Husky", 60.7,"white", "long", 45.0);
        System.out.println(Husky.hairColor);
        System.out.println(Pittbull.weight);
        System.out.println(Pittbull.tail);
        System.out.println (Pittbull.energy);

        Husky.bark();
        Husky.sleep();
        Husky.eat();
        Husky.run();
        Husky.eat();
        Husky.eat();
        System.out.println(Husky.getWeight());
        System.out.println(Husky.getEnergy());

    }
}
