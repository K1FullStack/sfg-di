package guru.springfreamework.sfg_di;

import guru.springfreamework.sfg_di.controllers.ConstructorInjectedController;
import guru.springfreamework.sfg_di.controllers.MyController;
import guru.springfreamework.sfg_di.controllers.PropertyInjectedController;
import guru.springfreamework.sfg_di.controllers.SetterInjectedController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class SfgDiApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

    log.info("---------- primary");
    MyController myController = (MyController) context.getBean("myController");
    log.info(myController.sayHello());

    log.info("---------- property");
    PropertyInjectedController propertyInjectedController =
        (PropertyInjectedController) context.getBean("propertyInjectedController");
    log.info("property injected: {}", propertyInjectedController.getGreeting());

    log.info("---------- setter");
    SetterInjectedController setterInjectedController =
        (SetterInjectedController) context.getBean("setterInjectedController");
    log.info("setter injected: {}", setterInjectedController.getGreeting());

    log.info("---------- constructor");
    ConstructorInjectedController constructorInjectedController =
        (ConstructorInjectedController) context.getBean("constructorInjectedController");
    log.info("constructor injected: {}", constructorInjectedController.getGreeting());
  }
}
