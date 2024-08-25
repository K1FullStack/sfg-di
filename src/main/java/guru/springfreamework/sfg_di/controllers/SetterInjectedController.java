package guru.springfreamework.sfg_di.controllers;

import guru.springfreamework.sfg_di.services.GreetingService;
import lombok.Setter;

@Setter
public class SetterInjectedController {
  private GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
