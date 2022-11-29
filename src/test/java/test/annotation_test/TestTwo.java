package test.annotation_test;

import org.junit.jupiter.api.Test;
import utils.Name;

@Name("TokenSecond")
public class TestTwo extends BaseTestForAnnotationTest {
    /**Реализация с аннотацией в тестовом классе**/

    @Test
    public void aVoid (){
        System.out.println(authToken);
    }
}
