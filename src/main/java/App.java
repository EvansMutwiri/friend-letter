import java.util.HashMap;

import java.util.Map;

import spark.ModelAndView;

import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.staticFileLocation;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public"); //link spark to photo directory
        Spark.get("/hello", (request, response) -> {
            return new ModelAndView(new HashMap(), "hello.hbs");
        }, new HandlebarsTemplateEngine());
        Spark.get("/favorite_photos", (request, response) -> {
            return new ModelAndView(new HashMap(), "favorite_photos.hbs");
        }, new HandlebarsTemplateEngine());
    }
}