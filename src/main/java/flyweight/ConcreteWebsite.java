package flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ConcreteWebsite extends Website {
    private String type = "";
    @Override
    public void use(User user) {
        System.out.println(" 网站类型为 " + this.type + " 在使用中... " + " 使用者为 " + user.getName());
    }
}
