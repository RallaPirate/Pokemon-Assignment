abstract public class Pokemon {

    private String name;
    private int level;
    private final String species;
    private String prevname;

    public Pokemon(String name, int level, String species) {

        this.name = name;
        this.level = level;
        this.species = species;
        this.prevname = name;
    }
    public String getName() {
        System.out.println("This Pokemon's name is " + name);
        return name;
    }

    public int getLevel() {
        System.out.println("This Pokemon's level is " + level);
        return level;
    }
    public void setName(String name) {
        this.name = name;
        System.out.println(prevname+"'s name is changed to " + name);
        this.prevname = name;
    }
    public void setLevel(int level) {
        this.level = level;
        System.out.println("This pokemon's level is changed to " + level);
    }

public void speaks() {
    System.out.println(name + " says " + species); }
}
