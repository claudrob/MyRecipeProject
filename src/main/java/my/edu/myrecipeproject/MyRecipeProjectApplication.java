package my.edu.myrecipeproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyRecipeProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyRecipeProjectApplication.class, args);
        System.out.println("Startup Test!");
    }

}
