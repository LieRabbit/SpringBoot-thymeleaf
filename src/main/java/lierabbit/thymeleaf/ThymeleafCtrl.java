package lierabbit.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafCtrl
{
    @RequestMapping("/")
    public String hello(Model model)
    {
        model.addAttribute("hello","hello thymeleaf");
        return "hello";
    }
}
