package interpreter;

import lombok.AllArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor
public class VarExpression extends Expression {
    private String key;
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
