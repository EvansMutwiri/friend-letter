import java.util.HashMap;
import java.util.Map;

//import java.util.Map.*;

import spark.ModelAndView;

import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.staticFileLocation;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public"); //link spark to photo directory
        Spark.get("/form", (request, response) -> {
            Map<String, Object> model =new HashMap<>();
            return new ModelAndView(model, "form.hbs");
        }, new HandlebarsTemplateEngine());

        Spark.get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "hello.hbs");
        }, new HandlebarsTemplateEngine());
        Spark.get("/favorite_photos", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "favorite_photos.hbs");
        }, new HandlebarsTemplateEngine());
    }
}