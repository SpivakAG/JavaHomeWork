public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setSex("male");
        wolfOne.setName("Борис");
        wolfOne.setWeight(30);
        wolfOne.setAge(9);
        wolfOne.setColor("серый");

        System.out.println("Пол = " + wolfOne.getSex());
        System.out.println("Кличка = " + wolfOne.getName());
        System.out.println("Вес = " + wolfOne.getWeight());
        System.out.println("Возраст = " + wolfOne.getAge());
        System.out.println("Окрас = " + wolfOne.getColor());
        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        System.out.println(wolfOne.howl());
        wolfOne.hunt();
    }
}