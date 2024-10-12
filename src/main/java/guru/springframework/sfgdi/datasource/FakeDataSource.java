package guru.springframework.sfgdi.datasource;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class FakeDataSource {
  private String username;
  private String password;
  private String jdbcurl;
}
