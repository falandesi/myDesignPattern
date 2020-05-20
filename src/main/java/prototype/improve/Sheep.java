package prototype.improve;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sheep implements Cloneable {
    public String name;
    public int age;
    public String color;
    public String address = "武汉";       //添加一个属性，如果采用之前的方法，每个克隆均需要再设置这个值，非常麻烦
    public Sheep friend;                 //拷贝为浅拷贝，此值的hashcode相等

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    protected Object clone() {
        Sheep sheep = null;

        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
