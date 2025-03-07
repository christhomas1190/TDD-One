package rocks.zipcode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;


// Student should write this test class
public class PasswordValidatorTest {

    private PasswordValidator passwordTests;

    public void setUp(){
       this.passwordTests = new PasswordValidator();

    }
    @Test
        public void isPasswaordValid(){
        setUp();
        boolean expected=true;
        boolean actual = passwordTests.isValid("Hereisthepassword1!");

        assertEquals(expected,actual);
    }@Test
        public void isPasswaordValid2(){
        setUp();
        boolean expected=true;
        boolean actual = passwordTests.isValid("Hereisthepassword1!");

        assertEquals(expected,actual);
    }
}
