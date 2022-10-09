public class NormalBehaviour implements IBehavior{
    @Override
    public int move() {
        System.out.println("Si trouver un autre robot, ignore le");
        return 0;
    }
}
