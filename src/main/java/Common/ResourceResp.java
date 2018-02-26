package Common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

//反序列化时，如果遇到多余的属性，自动忽略，否则会失败
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceResp implements Serializable
{
    private String ID;

    @JsonProperty("resource_name")
    private String name;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
