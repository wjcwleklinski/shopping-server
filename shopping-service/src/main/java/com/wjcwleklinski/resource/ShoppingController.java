package com.wjcwleklinski.resource;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller
public class ShoppingController {

    @Get("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "hello";
    }
}
