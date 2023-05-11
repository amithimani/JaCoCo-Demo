package dev.knowledgecafe;

import java.util.Locale;

public class Metadata {

    public String getMetadata(String key)
    {
        StringBuffer returnValue = new StringBuffer();
        if(key == null || key.trim().length() == 0)
        {
            returnValue = new StringBuffer("Invalid key!");
        }
        else
        {
            returnValue.append(key.toUpperCase(Locale.ROOT));
        }
        return returnValue.toString();
    }
}
