package prototype.deepclone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DeepPrototype implements Cloneable, Serializable {
    public String prototypeName;
    public DeepCloneTarget deepCloneTarget;

    //第一中方式实现深拷贝 如果引用类型增多，实现会非常麻烦
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = super.clone();
        DeepPrototype deepPrototype = (DeepPrototype) deep;
        deepPrototype.deepCloneTarget = (DeepCloneTarget) deepPrototype.deepCloneTarget.clone();
        return deepPrototype;
    }

    //第二种方式实现深拷贝 序列化
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            // 反序列化
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
