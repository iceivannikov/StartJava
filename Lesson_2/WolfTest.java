public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "male";
        wolf.name = "Baron";
        wolf.weight = 4.5;
        wolf.age = 10;
        wolf.color = "grey";

        System.out.println("Gender = " + wolf.gender);
        System.out.println("Name = " + wolf.name);
        System.out.println("Weight = " + wolf.weight);
        System.out.println("Age = " + wolf.age);
        System.out.println("Color = " + wolf.color);

        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}