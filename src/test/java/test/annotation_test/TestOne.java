package test.annotation_test;

import org.junit.jupiter.api.Test;
import utils.Name;

@Name("TokenFirst")
public class TestOne extends BaseTestForAnnotationTest{
    /**���������� � ���������� � �������� ������**/

    @Test
    public void aVoid (){
        System.out.println(authToken);
    }
}
