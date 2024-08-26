package guru.springfreamework.sfg_di.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "constructor - hello world!";
  }
}
