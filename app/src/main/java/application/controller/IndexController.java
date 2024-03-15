package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @RequestMapping("/")
    // RequestParam parametro
    public String index(Model ui, @RequestParam("nome") String nome) {
        // model modelo da interface, controlador da interface
        String msg = "Olá " + nome + "!!";
        ui.addAttribute("menssage", msg);
        return "index";
    }
}
