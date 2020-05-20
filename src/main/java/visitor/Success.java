package visitor;

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println(" 男性观众给予成功评分 ");
    }

    @Override
    public void getFemaleResult(Female female) {
        System.out.println(" 女性观众给予成功评分 ");
    }
}
