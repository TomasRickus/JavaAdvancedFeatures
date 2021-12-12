package encapsulation.example2;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    Dog dog = new Dog();


    public Dog(String name, int age, String gender, String race, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog(String gender, String race) {
        this("Rex", 2, gender, race, 22.5);

    }

    public Dog() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Wrong age");
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            System.out.println("Wrong weight");
        } else {
            this.weight = weight;
        }


    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                ", dog=" + dog +
                '}';
    }
}