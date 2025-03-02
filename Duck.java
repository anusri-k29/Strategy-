public abstract class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;
    FlyBehaviour flyBehaviour;

    public abstract void display();

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setSwimBehaviour(SwimBehaviour sb) {
        swimBehaviour = sb;
    }

    public void performSwim() {
        swimBehaviour.swim();
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void performFly() {
        flyBehaviour.fly();
    }
}
