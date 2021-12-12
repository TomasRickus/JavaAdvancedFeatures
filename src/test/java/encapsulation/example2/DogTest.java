package encapsulation.example2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DogTest {

    @Test
    void testDogParameters(){
        Dog dog = new Dog("Rexas", 2, "Male","German shepherd",22.2);


        assertThat(dog.getAge()).isEqualTo(0);


    }

}