package guru.springfreamework.sfg_di.services;

public class GreetingServiceImpl implements GreetingService {
  @Override
  public String sayGreeting() {
    return "hello world!";
  }
}
