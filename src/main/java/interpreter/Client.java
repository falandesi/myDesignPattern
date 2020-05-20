package interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果：" + expStr + "=" + calculator.run(var));
    }

    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap();
        char[] var5;
        int var4 = (var5 = expStr.toCharArray()).length;

        for(int var3 = 0; var3 < var4; ++var3) {
            char ch = var5[var3];
            if (ch != '+' && ch != '-' && !map.containsKey(String.valueOf(ch))) {
                System.out.print("请输入" + String.valueOf(ch) + "的值：");
                String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                map.put(String.valueOf(ch), Integer.valueOf(in));
            }
        }

        return map;
    }
}
