package test.annotation_test;

import utils.Name;

import static tokens.Tokens.generateTokenFirst;
import static tokens.Tokens.generateTokenSecond;

public class BaseTestForAnnotationTest {
/**Реализация с аннотацией в тестовом классе**/
    protected String authToken;
    {
        authToken = getAuthToken();
    }

    private String getAuthToken (){
        switch (getValueAnnotation()){
            case "TokenFirst":
                return generateTokenFirst();
            case "TokenSecond":
                return generateTokenSecond();
            default:
               throw new IllegalArgumentException("text");
        }
    }

    private String getValueAnnotation (){
        return this.getClass().getAnnotation(Name.class).value();
    }
}
