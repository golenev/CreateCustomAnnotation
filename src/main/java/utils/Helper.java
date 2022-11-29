package utils;

import org.reflections.Reflections;

import java.util.*;

public class Helper extends Reflections {

    Reflections reflections = new Reflections("services");

    public Map<String,String> getToken (){
        Map<String,String> nameAndValue = new HashMap<>();
        reflections.getTypesAnnotatedWith(Name.class)
                .forEach(x-> nameAndValue.put(x.getName(),
                        x.getAnnotation(Name.class).value())
                );
        return nameAndValue;
    }
}
