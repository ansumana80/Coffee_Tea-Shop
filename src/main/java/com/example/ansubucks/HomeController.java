package com.example.ansubucks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/Home")
    public String HomePage(){
        return "Home";
    }

    @RequestMapping("/Location")
    public String Location(){
        return "Locations";
    }

    @RequestMapping("/CoffeePricing")
    public String Pricing(){
        return "CoffeePricing";
    }

    @RequestMapping("/TeaPricing")
    public String TeaPricing(){
        return "TeaPricing";
    }

    @RequestMapping("/ColdDrinksPricing")
    public String ColdPricing(){
        return "ColdDrinksPricing";
    }

}
