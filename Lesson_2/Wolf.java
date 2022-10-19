public class Wolf {
    private String sex;
    private String name;
    private int weight;
    private int age;
    private String color;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        String sex1 = "male";
        String sex2 = "female";
        if(sex.equals(sex1) || sex.equals(sex2)) {
            this.sex = sex;
        } else {
            System.out.println("Некорректный пол");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight <= 0) {
            System.out.println("Некорректный вес");
        } else {
            this.weight = weight;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public String howl() {
        return "Воет";
    }

    public void hunt() {
        System.out.println("Охотится");
    }
}