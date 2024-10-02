public class Fire extends Pokemon {

    String attack;
    String defense;

    public Fire(String name, int level, String species, String attack, String defense) {
        super(name, level, species);
        this.attack = attack;
        this.defense = defense;
    }

    String type = "Fire";


    public void getType() {
        System.out.println(getName() +" is a" + type + "type pokemon.");
    }

    public void attacks() {
        System.out.println(getName() +" uses a whopping "+ attack+ "-attack! Warning: hot!");
    }
}
