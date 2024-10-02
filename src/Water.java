public class Water extends Pokemon {

    String attack;
    String defense;

    public Water(String name, int level, String species, String attack, String defense) {
        super(name, level, species);
        this.attack = attack;
        this.defense = defense;
    }

    String type = "Water";

    public void getType() {
        System.out.println(getName() +" is a " + type +" type pokemon.");
    }

    public void attacks() {
        System.out.println(getName() +" uses a wild "+ attack+ "-attack! They're sure making a splash!");
    }

    /*Een belangrijke override! */

    @Override public void speaks(){
        System.out.println(getName() + " says 'Cowabunga!'");
    }


}
