public class WolfTest{
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.sex = "male";
        wolfOne.name = "Борис";
        wolfOne.weight = 30;
        wolfOne.age = 4;
        wolfOne.colour = "серый";

        System.out.println("Пол = " + wolfOne.sex);
        System.out.println("Кличка = " + wolfOne.name);
        System.out.println("Вес = " + wolfOne.weight);
        System.out.println("Возраст = " + wolfOne.age);
        System.out.println("Окрас = " + wolfOne.colour);
        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        System.out.println(wolfOne.howl());
        wolfOne.hunt();

    }
}