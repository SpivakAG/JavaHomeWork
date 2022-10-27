public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34, 2.312, 5, 7, 4);
        jaeger1.setName("Cherno Alpha");
        jaeger1.setMark("Mark-1");
        jaeger1.setOrigin("Russia");
        jaeger1.setHeight(85.34);
        jaeger1.setWeight(2.412);
        jaeger1.setSpeed(3);
        jaeger1.setStreight(10);
        jaeger1.setArmor(10);
        System.out.println("Робот 1: " + jaeger1.getName() + "\nРобот 2: " + jaeger2.getName());
        jaeger1.move();
        jaeger2.attack(jaeger1.getName());
        jaeger1.defence();
    }
}