package my.edu.myrecipeproject.controller;

import my.edu.myrecipeproject.repositories.RecipeRepository;
import my.edu.myrecipeproject.services.RecipeService;
import my.edu.myrecipeproject.services.RecipeServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class IndexControllerTest {

    @Mock
    Model model;

    @Mock
    RecipeRepository recipeRepository;

    @Mock
    RecipeService recipeService;

    @Mock
    IndexController indexController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
//        recipeService = new RecipeServiceImpl(recipeRepository);
        indexController = new IndexController(recipeService);

    }

    @Test
    public void getIndexPage() {
        assertEquals(indexController.getIndexPage(model), "index");
        verify(recipeService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute(eq("recipes"), anySet());
    }
}