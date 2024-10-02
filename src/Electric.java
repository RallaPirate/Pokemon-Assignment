public class Electric extends Pokemon {


    String attack;
    String defense;

    public Electric(String name, int level, String species, String attack, String defense) {
        super(name, level, species);
        this.attack = attack;
        this.defense = defense;
    }

    String type = "Electric";

    public void getType() {
        System.out.println(getName() +" is a " + type +" type pokemon.");
    }

    public void attacks() {
        System.out.println(getName() +" uses a sizzling "+ attack+ "-attack! High voltage, so don't touch!");
    }
}
