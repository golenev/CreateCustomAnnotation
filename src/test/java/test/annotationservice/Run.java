package test.annotationservice;

import org.junit.jupiter.api.Test;
import services.ServiceA;

public class Run extends BaseTestForAnnotationService {
    /**Реализация с аннотацией в классе сервисе**/

    public Run() {
        super(ServiceA.class);
    }

    @Test
    public void asd (){
        System.out.println(authToken);
    }
}
