package GB.SpringSem4.controller;

import GB.SpringSem4.model.City;
import GB.SpringSem4.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/city")
public class CityController {

    private CityService cityService;


    @GetMapping("/city")
    public String cityForm (Model model){
        model.addAttribute("city",cityService.getCityList());
        return "cityform";
    }

    @PostMapping("/city")
    public String addCity (City city,Model model){
        cityService.addCity(city);
        model.addAttribute("city",cityService.getCityList());
        return "cityform";
    }

}
