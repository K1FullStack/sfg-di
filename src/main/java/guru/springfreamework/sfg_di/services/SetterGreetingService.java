package guru.springfreamework.sfg_di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "setter - hello world!";
  }
}
