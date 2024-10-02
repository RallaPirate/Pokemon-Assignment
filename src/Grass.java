public class Grass extends Pokemon {


    String attack;
    String defense;

    public Grass(String name, int level, String species, String attack, String defense) {
        super(name, level, species);
        this.attack = attack;
        this.defense = defense;
    }

    String type = "Grass";

    public void getType() {
        System.out.println(getName() +" is a " + type +" type pokemon");
    }

    public void attacks() {
        System.out.println(getName() +" uses an impressive "+ attack+ "-attack! And who thought plants were harmless?");
    }
}

