package guru.springfreamework.sfg_di.controllers;

import guru.springfreamework.sfg_di.services.GreetingService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Setter
@Controller
public class SetterInjectedController {
  @Autowired
  @Qualifier("setterGreetingService")
  private GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
