package proxy.staticproxy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeacherProxy implements ITeacherDao {
    private ITeacherDao iTeacherDao;
    @Override
    public void teach() {
        System.out.println(" 开始代理模式...... ");
        this.iTeacherDao.teach();
        System.out.println(" 代理结束...... ");
    }
}
