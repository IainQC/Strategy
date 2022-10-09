public class Robot {
    private String nom;
    private IBehavior behaviour;
    //private Postion position;

    public Robot(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public IBehavior getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(IBehavior behaviour) {
        this.behaviour = behaviour;
    }

    public void move(){
        System.out.println(this.nom+ " est situee a la position : X" + "le prochain comportement est :" + this.behaviour.move());
    }
}
