package homework170724;

public class Rabbit implements Pet {

    private Brain brain = new Hungry();

    private class Hungry implements Brain {
        @Override
        public void feed() {
            purr();
            eat();
            purr();
        }

        @Override
        public void play() {
            sizzle();
            knockPaws();
        }
    }

    private class Fed implements Brain {
        @Override
        public void feed() {
            knockPaws();
        }

        @Override
        public void play() {
            purr();
            jump();
            purr();
        }
    }

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



    private void eat() {
        System.out.println("Rabbit eats");
    }

    private void purr() {
        System.out.println("Rabbit purrs");
    }

    private void sizzle() {
        System.out.println("Rabbit sizzles");
    }

    private void knockPaws() {
        System.out.println("Rabbit knocks of paws");
    }

    private void jump() {
        System.out.println("Rabbit jumps");
    }

}
