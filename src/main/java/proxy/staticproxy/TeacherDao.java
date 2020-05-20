package proxy.staticproxy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println(" 老师授课中....... ");
    }
}
