package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!!"); // 키가 data인 모델에 hello!!!를 넘김
        return "hello"; //  resources > templates 아래에 있는 화면 이름
    }
}
