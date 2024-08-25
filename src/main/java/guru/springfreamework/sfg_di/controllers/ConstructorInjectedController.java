package guru.springfreamework.sfg_di.controllers;

import guru.springfreamework.sfg_di.services.GreetingService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConstructorInjectedController {
  private final GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
