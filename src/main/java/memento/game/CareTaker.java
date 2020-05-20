package memento.game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CareTaker {
    // 保存一次记录
    private Memento memento;
    // 保存多次记录
//    private List<Memento> mementoList = new ArrayList<>();
    // 保存多个角色多个记录
//    private HashMap<String, List<Memento>> stringListHashMap = new HashMap<>();
}
