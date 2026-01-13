package section1_basics;//このファイルは section1_basics というグループに所属していますよ」 と宣言しなければならないというルールがある
// ファイル名とクラス名は一致させる
public class BasicSyntax {
    public static void main(String[] args) {
        
        // 1. 文字列と数値の基本
        System.out.println("Hello Java"); // 文字列はダブルクォート
        System.out.println(17);           // 数値

        // 2. 計算
        // Rubyと同じ感覚でOK
        System.out.println(12 + 34); // 加算 -> 46
        System.out.println(20 / 6);  // 割り算 -> 3 (整数同士だと切り捨てられるのがJavaの特徴！)
        System.out.println(20 % 6);  // 余り -> 2

        // 3. 文字列の連結
        // Rubyのような "#{}" は使えない。 "+" でつなぐ。
        System.out.println("私は" + "Javaを勉強中");
        System.out.println("年齢は" + 25 + "歳です"); // 数値も自動で文字として繋がる
    }
}