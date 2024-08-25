package guru.springfreamework.sfg_di.controllers;

import static org.junit.jupiter.api.Assertions.*;

import guru.springfreamework.sfg_di.services.GreetingServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Slf4j
class SetterInjectedControllerTest {
  SetterInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new SetterInjectedController();
    controller.setGreetingService(new GreetingServiceImpl());
  }

  @Test
  void getGreeting() {
    log.info(controller.getGreeting());
  }
}
