package interpreter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@AllArgsConstructor
@Getter
@Setter
public class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
