package mediator;

import lombok.NoArgsConstructor;

import java.util.HashMap;

// 中介者 具体实现部分 减少 同事之间的耦合
@NoArgsConstructor
public class ConcreteMediator extends Mediator {
    private HashMap<String, Colleague> colleagueMap = new HashMap();
    private HashMap<String, String> interMap = new HashMap();

    public void Register(String colleagueName, Colleague colleague) {
        this.colleagueMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            this.interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            this.interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            this.interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            this.interMap.put("Curtains", colleagueName);
        }

    }

    public void GetMessage(int stateChange, String colleagueName) {
        if (this.colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine)this.colleagueMap.get(this.interMap.get("CoffeeMachine"))).StartCoffee();
                ((TV)this.colleagueMap.get(this.interMap.get("TV"))).StartTv();
            } else if (stateChange == 1) {
                ((TV)this.colleagueMap.get(this.interMap.get("TV"))).StopTv();
            }
        } else if (this.colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains)this.colleagueMap.get(this.interMap.get("Curtains"))).UpCurtains();
        } else if (!(this.colleagueMap.get(colleagueName) instanceof TV)) {
            boolean var10000 = this.colleagueMap.get(colleagueName) instanceof Curtains;
        }

    }

    public void SendMessage() {
    }
}
