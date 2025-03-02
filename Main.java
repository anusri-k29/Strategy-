// Name: Anusri Kadam
// PRN: 23070126016
// Batch: SY AIML A1

public class Main {
    public static void main(String[] args) {
        MallarDuck md = new MallarDuck();
        RedHeadDuck rd = new RedHeadDuck();
        RubberDuck rubber = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();

        System.out.println("____");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();

        System.out.println("____");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();

        System.out.println("____");
        rubber.display();
        rubber.performQuack();
        rubber.performSwim();
        rubber.performFly();

        System.out.println("____");
        decoy.display();
        decoy.performQuack();
        decoy.performSwim();
        decoy.performFly();
    }
}
