package test.annotation_test;

import org.junit.jupiter.api.Test;
import utils.Name;

@Name("TokenFirst")
public class TestOne extends BaseTestForAnnotationTest{
    /**Реализация с аннотацией в тестовом классе**/

    @Test
    public void aVoid (){
        System.out.println(authToken);
    }
}
