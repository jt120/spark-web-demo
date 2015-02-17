package com.jt.demo.web;

import static spark.Spark.get;
import static spark.SparkBase.port;

public class TransformerExample {


    public static void main(String args[]) {
        port(8080);
        get("/hello", "application/json", (request, response) -> {
            return new MyMessage("Hello World");
        }, new JsonTransformer());
    }

}