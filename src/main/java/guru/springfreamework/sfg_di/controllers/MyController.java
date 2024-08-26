package guru.springfreamework.sfg_di.controllers;

import guru.springfreamework.sfg_di.services.GreetingService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@AllArgsConstructor
@Controller
@Slf4j
public class MyController {
  private final GreetingService greetingService;

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
