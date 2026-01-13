package section2_variables;

public class Variables {
    public static void main(String[] args) {
        
        // 1. 変数の定義 (型 変数名 = 値;)
        // Ruby: name = "John"
        String name = "John";
        
        // Ruby: number = 100
        int number = 100;

        System.out.println(name + "の点数は" + number + "点です");

        // 2. 変数の更新
        // 型を書くのは最初だけ。2回目以降は変数名だけでOK
        number = 200;
        System.out.println("更新後の点数: " + number);

        // 3. 自己代入 (Rubyと同じ)
        number = number + 10;
        number += 10; // 省略形
        System.out.println("加算後: " + number); // 220

        // 4. 小数 (double型)
        // Rubyのfloatに近い。
        // int (整数) に小数は入れられないので、doubleを使う
        double pi = 3.14;
        System.out.println("円周率: " + pi);

        // 注意点：整数の割り算と小数の割り算
        System.out.println(5 / 2);     // -> 2 (整数扱い)
        System.out.println(5.0 / 2.0); // -> 2.5 (小数扱い)
    }
}
