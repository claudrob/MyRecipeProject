package my.edu.myrecipeproject.services;

import my.edu.myrecipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

}
