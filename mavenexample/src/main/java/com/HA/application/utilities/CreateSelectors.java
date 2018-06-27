package com.HA.application.utilities;

public class CreateSelectors {

    public static String CreateBasicSelector(String tagName, String attributeName, String value){
        String elementCreated;
        if(value.equalsIgnoreCase("text")){
            elementCreated = "//" + tagName + "[" + attributeName + "()='" + value + "']";
            return elementCreated;

        }else
        elementCreated = "//" + tagName + "[@" + attributeName + "='" + value + "']";
        return elementCreated;
    }
}
