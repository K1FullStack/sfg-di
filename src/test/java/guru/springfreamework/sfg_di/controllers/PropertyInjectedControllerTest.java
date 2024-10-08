package guru.springfreamework.sfg_di.controllers;

import guru.springfreamework.sfg_di.services.ConstructorGreetingService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Slf4j
class PropertyInjectedControllerTest {

  PropertyInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new PropertyInjectedController();

    controller.greetingService = new ConstructorGreetingService();
  }

  @Test
  void getGreeting() {
    log.info(controller.getGreeting());
  }
}
