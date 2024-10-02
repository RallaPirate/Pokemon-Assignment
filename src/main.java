public class main {
    public static void main(String[] args) {

        /* having fun with the fire type... */
        Fire sparky = new Fire("Sparky", 5, "Charmander", "Fireball", "Hide");

        sparky.speaks();
        sparky.getType();

        sparky.setName("Zippo");

        sparky.speaks();

        sparky.setName("Firelord");

        sparky.speaks();

        sparky.attacks();

        /* instance of Water pokemon */

        Water teenageMutantNinjaTurtle = new Water("Michelangelo", 3, "Squirtle", "Watersquirt", "Tailwhip");

        teenageMutantNinjaTurtle.speaks();
        teenageMutantNinjaTurtle.attacks();
        teenageMutantNinjaTurtle.setName("Donatello");
        teenageMutantNinjaTurtle.speaks();

        /* instance of Electric pokemon */

        Electric volt = new Electric("Volt", 0, "Magnemite","Zap Cannon", "Protect");

        volt.setName("Wannabe-Pikachu");
        volt.speaks();
        volt.attacks();
        volt.getLevel();

        Grass herbie = new Grass("Herbie", 10, "Bulbasaur", "Vine Whip", "Spore");

        herbie.attacks();
        herbie.getType();
        herbie.setLevel(11);
        herbie.speaks();

    }
}
