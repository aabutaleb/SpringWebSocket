package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by amin on 09/10/2015.
 */

@RestController
public class RestSampleController {
    @RequestMapping(value = "/rest", method = RequestMethod.GET)
    public String restService(){
        return "DONE!";
    }
}
