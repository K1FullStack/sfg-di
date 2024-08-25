package guru.springfreamework.sfg_di.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "property - hello world!";
  }
}
