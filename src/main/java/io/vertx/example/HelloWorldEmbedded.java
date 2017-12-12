package io.vertx.example;

import io.vertx.core.Vertx;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class HelloWorldEmbedded {

  public static void main(String[] args) {
    Vertx.vertx()
      .createHttpServer()
      .requestHandler(req -> req.response().end("Hello world"))
      .listen(8080, handler -> {
        if (handler.succeeded()) {
          System.out.println("You can now visit http://localhost:8080 in your browser");
        } else {
          System.err.println("failed to start");
        }
      });
  }

}
