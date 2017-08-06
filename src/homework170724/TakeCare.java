package homework170724;

public class TakeCare {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.play();
        System.out.println("-----");
        rabbit.feed();
        System.out.println("-----");
        rabbit.feed();
        System.out.println("-----");
        rabbit.play();

        System.out.println("\n======\n");

        Cat cat = new Cat();
        cat.feed();
        System.out.println("-----");
        cat.feed();
        System.out.println("-----");
        cat.play();
        System.out.println("-----");
        cat.play();
        System.out.println("-----");
        cat.feed();

    }

}
