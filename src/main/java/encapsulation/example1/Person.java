package encapsulation.example1;

public class Person {

    private String name;
    private int personalNumber;
    private String eyeColor;

    public Person(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 2) {
            this.name = name;

        } else {
            System.out.println("Name is too short");

        }

    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        if (personalNumber < 0) {
            this.personalNumber = personalNumber;
        } else {
            System.out.println("Wrong input");
        }
        this.personalNumber = personalNumber;
    }

    public String getEyeColor() {
        return eyeColor;
    }
    // seteris istrintas

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personalNumber=" + personalNumber +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
