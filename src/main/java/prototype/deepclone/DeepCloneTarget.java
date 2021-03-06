package prototype.deepclone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeepCloneTarget implements Cloneable, Serializable {
    public String name;
    public String nickName;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
