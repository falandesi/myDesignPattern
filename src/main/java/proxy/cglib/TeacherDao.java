package proxy.cglib;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import proxy.dynamic.ITeacherDao;

// 采用cglib的代理，不需要实现接口
@Getter
@Setter
@NoArgsConstructor
public class TeacherDao {
    public void teach() {
        System.out.println(" 老师授课中....... Cglib代理 ");
    }

    public void sayHello(String name) {
        System.out.println(" Hello " + name);
    }
}
