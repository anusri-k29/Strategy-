public class MallarDuck extends Duck {
    public MallarDuck() {
        quackBehaviour = new Quack();
        swimBehaviour = new SwimWithLegs();
        flyBehaviour = new Fly();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallar Duck!");
    }
}
