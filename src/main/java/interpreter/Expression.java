package interpreter;

import lombok.NoArgsConstructor;

import java.util.HashMap;

@NoArgsConstructor
public abstract class Expression {
    public abstract int interpreter(HashMap<String, Integer> var);
}
