package lierabbit.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//这是一个控制器
public class ThymeleafCtrl
{
    @RequestMapping("/")
    public String hello(Model model)
    {
        model.addAttribute("hello","hello thymeleaf");//添加一个值为"hello thymeleaf"的hello变量到视图
        return "hello";//在templates下寻找hello.html
    }
}
