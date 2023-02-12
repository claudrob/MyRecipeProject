package my.edu.myrecipeproject.controller;

import lombok.extern.slf4j.Slf4j;
import my.edu.myrecipeproject.domain.Category;
import my.edu.myrecipeproject.domain.UnitOfMeasure;
import my.edu.myrecipeproject.repositories.CategoryRepository;
import my.edu.myrecipeproject.repositories.UnitOfMeasureRepository;
import my.edu.myrecipeproject.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {


    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/","/index"})
    public String getIndexPage(Model model){

            model.addAttribute("recipes", recipeService.getRecipes());
            log.debug("Getting Index page");


        return "index";
    }

}
