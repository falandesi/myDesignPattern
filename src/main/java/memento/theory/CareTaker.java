package memento.theory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CareTaker {
   private List<Memento> mementoList  = new ArrayList<>();

   public void add(Memento memento) {
       mementoList.add(memento);
   }

   public Memento get(int index) {
       return mementoList.get(index);
   }
}
