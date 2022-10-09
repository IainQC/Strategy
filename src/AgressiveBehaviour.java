public class AgressiveBehaviour implements IBehavior{
    @Override
    public int move() {
        System.out.println("Trouver un autre robot et l'attaquer");
        return 1;
    }
}
