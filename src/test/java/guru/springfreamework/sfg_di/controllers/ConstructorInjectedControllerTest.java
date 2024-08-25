package guru.springfreamework.sfg_di.controllers;

import guru.springfreamework.sfg_di.services.GreetingServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Slf4j
class ConstructorInjectedControllerTest {
  ConstructorInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new ConstructorInjectedController(new GreetingServiceImpl());
  }

  @Test
  void getGreeting() {
    log.info(controller.getGreeting());
  }
}
