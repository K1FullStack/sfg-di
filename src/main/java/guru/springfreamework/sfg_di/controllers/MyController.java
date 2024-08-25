package guru.springfreamework.sfg_di.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class MyController {
  public String sayHello() {
    log.info("hello world!!");

    return "hey";
  }
}
