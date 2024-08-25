package guru.springfreamework.sfg_di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "english - hello world!";
  }
}
