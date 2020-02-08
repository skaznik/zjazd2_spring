package pl.studia.zjazd2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller  //jeśli damy Controller a nie RestController musimy dodać @ResponseBody
public class TestController {
    //@ResponseBody
    @GetMapping("/test")
    public  String test() {
        return "test-app";
    }

@ResponseBody
    @GetMapping("/test-app")
        public String testApp() {
        return  "TEST APP";
}
}
