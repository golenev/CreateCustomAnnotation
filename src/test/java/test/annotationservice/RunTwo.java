package test.annotationservice;

import org.junit.jupiter.api.Test;
import services.ServiceA;

public class RunTwo extends BaseTestForAnnotationService {
    /**���������� � ���������� � ������ �������**/
    /**
     * ��������
     */

    public RunTwo() {
        super(ServiceA.class);
    }

    @Test
    public void test (){
        System.out.println(authToken);
    }
}
