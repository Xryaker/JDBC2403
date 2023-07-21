import config.StateMent;
import objects.Person;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static work.SQuery.*;
import java.sql.SQLException;
import java.util.Map;

public class TestMYSQL {
    static StateMent stateMent;
    @BeforeClass
    public static void bb(){
        stateMent=new StateMent();
    }
    @Test
    public void test1() throws SQLException {
        for (Map<String, String> row : stateMent.getRows()) {
            System.out.println(row);
        }
    }
    @Test
    public void test2() throws SQLException {
        Person person=getPersoForName("Vasiliy");
        System.out.println(person.adrees);
    }
    @Test
    public void test3() throws SQLException {
//        Person person=getPersoForName("Vasiliy");
//        System.out.println(person.adrees);
        Assert.assertNull(getPersoForName("Vasiliy").name);
    }
}
