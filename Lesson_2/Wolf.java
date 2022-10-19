public class Wolf {
    private String sex;
    private String name;
    private int weight;
    private int age;
    private String colour;

    public String getSex() {
        return sex;
    }

    void setSex(String sex) {
        if(sex == "male" || sex == "female") {
            this.sex = sex;
        } else {
            System.out.println("Некорректный пол");
        }
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        if(weight <= 0) {
            System.out.println("Некорректный вес");
        } else {
            this.weight = weight;
        }
    }

    public int getAge(){;
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColour() {
        return colour;
    }

    void setColour(String colour) {
        this.colour = colour;
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