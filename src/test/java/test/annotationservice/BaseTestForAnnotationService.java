package test.annotationservice;

import utils.Name;

import static tokens.Tokens.*;

public class BaseTestForAnnotationService {
    /**Реализация с аннотацией в классе сервисе**/

    protected String authToken;
    private final String tokenType;

    public BaseTestForAnnotationService(Class<?> clazz) {
        tokenType = clazz.getAnnotation(Name.class).value();
        System.out.println(tokenType);
        authToken = getToken();
    }

    private String getToken (){
        switch (tokenType){
            case "Token first":
               return generateTokenFirst();
            case "Token second":
               return generateTokenSecond();
            case "Token third":
               return generateTokenThird();
            default:
                throw new IllegalArgumentException("Not set annotation for service");
        }
    }
}
