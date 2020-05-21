package hanumoka.example.springbootthymeleaflayout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
