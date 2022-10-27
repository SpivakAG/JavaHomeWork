public class Jaeger {
    private String name;
    private String mark;
    private String origin;
    private double height;
    private double weight;
    private int speed;
    private int streight;
    private int armor;

    public Jaeger() {
        //для создания экземпляра класса без заданных значений
    }
    public Jaeger(String name, String mark, String origin, double height, double weight, int speed, int streight, int armor) {
        this.name = name;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.streight = streight;
        this.armor = armor;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getStreight() {
        return streight;
    }
    public void setStreight(int streight) {
        this.streight = streight;
    }
    public int getArmor() {
        return armor;
    }
    public void setArmor(int streight) {
        this.streight = streight;
    }
    public void move() {
        System.out.println(name + ": начато движение");
    }
    public void attack(String otherJaeger) {
        System.out.println(name + ": атакует " + otherJaeger);
    }
    public void defence() {
        System.out.println(name + ": защищается");
        int defenceSuccess = (int) (Math.random() * 2);
        if (defenceSuccess >= 1) {
            System.out.println("Защита произведена успешно, " + name + " цел");
        } else {
            System.out.println("Защита пробита, " + name + " уничтожен");
        };
    }
}