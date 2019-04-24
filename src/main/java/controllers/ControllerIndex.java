package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import start.DataBase;
import start.EmptyDataBase;

@Controller
public class ControllerIndex {
    private DataBase db = new EmptyDataBase();

    @GetMapping("/result")
    public String result(Model p) {
        p.addAttribute("players", db.getMatches());
        return "result";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
