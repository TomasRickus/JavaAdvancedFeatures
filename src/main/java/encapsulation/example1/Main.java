package encapsulation.example1;

public class Main {

    /**
     * Patestuoti su Unit testais ND
     */
    public static void main(String[] args) {
        Person person = new Person("Brown");
        person.setName("Bob");
        person.setPersonalNumber(123456789);
        System.out.println(person);

        person.setName("L");
        person.setPersonalNumber(-15);
        System.out.println(person);
    }
}
