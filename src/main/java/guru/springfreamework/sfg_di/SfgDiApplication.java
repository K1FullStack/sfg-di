package guru.springfreamework.sfg_di;

import guru.springfreamework.sfg_di.controllers.MyController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class SfgDiApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

    MyController myController = (MyController) context.getBean("myController");

    String greeting = myController.sayHello();

    log.info(greeting);
  }
}
