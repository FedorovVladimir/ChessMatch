package controllers;

import org.springframework.core.ReactiveAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import real_data_base.adapter_data_base.*;
import real_data_base.entity_from_data_base.TournamentEntity;
import start.DataBase;
import start.EmptyDataBase;

import java.util.List;
import java.util.Map;

@Controller
public class ControllerIndex {
    private DataBase db = new EmptyDataBase();
    private DataBase dbTournaments = new EmptyDataBase();

    @GetMapping("/result")
    public String result(Model p) {
        p.addAttribute("players", db.getMatches());
        return "result";
    }

    @GetMapping("/tournaments")
    public String tournaments(Model m) {
        m.addAttribute("tournaments", TournamentAdapter.getAll());
        return "tournaments";
    }

    @GetMapping("/tournaments/add")
    public String tournamentsAdd(Model m) {
        m.addAttribute("regions", RegionAdapter.getAll());
        m.addAttribute("typeCompetitions", TypeCompetitionAdapter.getAll());
        m.addAttribute("systemMatchs", SystemMatchAdapter.getAll());
        m.addAttribute("indicators", IndicatorAdapter.getAll());
        m.addAttribute("arbiters", ArbiterAdapter.getAll());
        return "tournamentsForm";
    }

    @PostMapping("/tournaments/add")
    public String tournamentsAddJson(Map<String, Object> list) {
        System.out.println("OK");
        return "redirect:/ tournaments";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
