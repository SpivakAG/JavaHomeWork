public class Wolf{
    String sex;
    String name;
    int weight;
    int age;
    String colour;
    
    void move() {
        System.out.println("Идет");
    }
    void sit() {
        System.out.println("Сидит");
    }
    void run() {
        System.out.println("Бежит");
    }
    String howl() {
        return "Воет";
    }
    void hunt() {
        System.out.println("Охотится");
    }

}