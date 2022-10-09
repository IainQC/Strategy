public class Main {
    public static void main(String[] args) {
    Robot r1 = new Robot("BoBot");
    Robot r2 = new Robot("Chabot");
    Robot r3 = new Robot("Totot");

    r1.setBehaviour(new AgressiveBehaviour());
    r2.setBehaviour(new NormalBehaviour());

    r1.move();
    r2.move();

    r1.setBehaviour(new NormalBehaviour());
    r2.setBehaviour(new AgressiveBehaviour());

    r1.move();
    r2.move();


    }
}