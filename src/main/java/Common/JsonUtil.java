package Common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtil
{
    public static String convertObject2String(Object ob)
    {
        if (null == ob)
        {
            return null;
        }

        String result = null;

        ObjectMapper mp = new ObjectMapper();
        try
        {
            result = mp.writeValueAsString(ob);
        }
        catch(JsonProcessingException e)
        {
            e.printStackTrace();
        }
        return result;
    }

    public static <T> T convertString2Object(String str, Class<T>  clazz)
    {
        if (null == str || str.length() == 0)
        {
            return null;
        }
        T bean = null;
        ObjectMapper mp = new ObjectMapper();

        try
        {
            bean = mp.readValue(str, clazz);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return bean;
    }

}
