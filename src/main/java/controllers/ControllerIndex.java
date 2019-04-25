package controllers;

import org.springframework.core.ReactiveAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import real_data_base.adapter_data_base.*;
import start.DataBase;
import start.EmptyDataBase;

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
    public String tournaments(Model tour) {
        tour.addAttribute("tournaments", dbTournaments.getMatches());
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

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
