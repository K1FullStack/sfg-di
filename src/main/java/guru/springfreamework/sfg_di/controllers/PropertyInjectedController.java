package guru.springfreamework.sfg_di.controllers;

import guru.springfreamework.sfg_di.services.GreetingService;

public class PropertyInjectedController {
  public GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
