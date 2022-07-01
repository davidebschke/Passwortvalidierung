import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainTest {

    @Test
    void numberControlPwTest() {
        String pw = "Ha1hhs";
        String actual=Main.passwordControl(pw);
        String expected="Das Passwort enthält die Zahl 1";
        Assertions.assertEquals(expected,actual);


    }

    @Test
    void passwordLengthTest() {

        //given

        String pw = "Ha1llo3";

        //when

        int actual = Main.passwordCount(pw);

        //then

        int expected = 7;
        Assertions.assertEquals(expected, actual);


    }

    @Test

    void letterControlTest()
    {
        //given
        String passwordLetter="871628H62862";

        //when

        boolean actual=Main.letterControl(passwordLetter);

        //then

        boolean expected= true;
        Assertions.assertEquals(expected,actual);

    }


}
