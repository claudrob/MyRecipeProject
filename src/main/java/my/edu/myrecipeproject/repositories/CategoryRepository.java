package my.edu.myrecipeproject.repositories;

import my.edu.myrecipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
