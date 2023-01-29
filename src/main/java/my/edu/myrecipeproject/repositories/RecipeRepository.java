package my.edu.myrecipeproject.repositories;

import my.edu.myrecipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
