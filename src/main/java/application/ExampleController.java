package application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {

    @ResponseBody
    @GetMapping("/api/test")
    public String getTest(){

        return "String";
    }
}
