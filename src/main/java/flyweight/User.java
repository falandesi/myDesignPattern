package flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 外部状态 不被共享的部分
@Setter
@Getter
@AllArgsConstructor
public class User {
    private String name;
}
