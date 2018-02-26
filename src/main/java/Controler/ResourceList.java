package Controler;

import Common.ResourceResp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceList
{
    @RequestMapping("/list")
    public Object ListResource()
    {
        ResourceResp resp = new ResourceResp();
        resp.setID("123");
        resp.setName("name");
        return resp;
    }
}
