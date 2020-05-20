package builder.improve;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 指挥部
@Setter
@Getter
@AllArgsConstructor
public class HouseDirector {
    public HouseBuilder houseBuilder;

    public House constructHouse() {
        houseBuilder.layFoundation();
        houseBuilder.masonryWall();
        houseBuilder.coping();

        return this.houseBuilder.buildHouse();
    }
}
