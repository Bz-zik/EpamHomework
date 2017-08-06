package homework170724;

public class Cat implements Pet {

     private Brain brain = new Hungry();

    @Override
    public void feed() {
        brain.feed();
        brain = new Fed();
    }

    @Override
    public void play() {
        brain.play();
        brain = new Hungry();
    }
}

class Fed implements Brain {

    @Override
    public void feed() {
        yawn();
        sleep();
    }

    private void sleep() {
        System.out.println("Cat sleeping. Zzzz....");
    }

    private void yawn() {
        System.out.println("Cat yawns");
    }

    @Override
    public void play() {
        mrr();
        jump();
        huntHand();
    }

    private void huntHand() {
        System.out.println("Cat hunts hand");
    }

    private void jump() {
        System.out.println("Cat jumps");
    }

    private void mrr() {
        System.out.println("mrr-mrr");
    }


}

class Hungry implements Brain {

    @Override
    public void feed() {
        eat();
        mrr();
        rub();
    }

        @Override
    public void play() {
        sizzle();
        scratch();
    }

    private void scratch() {
        System.out.println("Cat scratches");
    }

    private void mrr() {
        System.out.println("mrr-mrr");
    }
    private void sizzle() {
        System.out.println("Cat sizzles");
    }
    private void rub() {
        System.out.println("Cat rubs against legs");
    }
    private void eat() {
        System.out.println("Cat eats");
    }


}