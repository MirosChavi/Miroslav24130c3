package rpg;

public class Dwarf extends Hero{
    private static String[] imiona = {"Ogr", "Minion", "Gerald", "Milena"}; // Nadajemy imiona
    public Dwarf(String name, int health, int strength) {
        super(name, health, strength); // w konstruktorze odwołujemy się do zmiennych naszej głównej klasy
    }
    public static Dwarf getInstance(){ // używamy metod getInstance
        String imie = imiona[rand.nextInt(imiona.length)];
        int zdrowie = rand.nextInt(50,100);
        int sila = rand.nextInt(20,40);
        return new Dwarf(imie, zdrowie, sila);
    }

    @Override
    public void attack(Hero another) {
        int damage = (int)(this.strength * rand.nextDouble(0.5,1));
        //int damage = (int)(this.strength * (rand.nextDouble()*0.5 +0.5));
        another.health -= damage;
        System.out.println(this.name + " attacks " + another.name +
                " and makes " +damage+ " points of damage.");
    }
}
