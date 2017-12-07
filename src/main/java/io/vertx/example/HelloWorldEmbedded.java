package io.vertx.example;

import io.vertx.core.Vertx;

import java.util.Locale;
import java.util.ResourceBundle;


/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class HelloWorldEmbedded {

  public static void main(String[] args) {
      ResourceBundle res = ResourceBundle.getBundle("io.vertex.example.helloworld");
    // Create an HTTP server which simply returns "Hello World!" to each request.
    Vertx.vertx()
      .createHttpServer()
      .requestHandler(req -> req.response().end(res.getString("hello")))
      .listen(8080, handler -> {
        if (handler.succeeded()) {
          System.out.println(res.getString("localhost"));
        } else {
          System.err.println(res.getString("failed"));
        }
      });
  }

}
