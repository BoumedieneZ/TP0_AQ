import org.example.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {
    Person p;

    @BeforeEach
    public void setup() {
       p = new Person("Boumediene","Kadaben",17);
    }


    @Test
    public void getFullNameTest(){

        String FullNameResult = p.getFullName();

        Assertions.assertEquals("Boumediene Kadaben", FullNameResult);
    }

    @Test
    public void isAdult(){
        boolean AgeResult = p.isAdult();
        Assertions.assertEquals(true, AgeResult);
    }

    @Test
    public void isNotAdult(){
        boolean AgeResult = p.isAdult();
        Assertions.assertEquals(false, AgeResult);
    }
}
