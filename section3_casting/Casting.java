package section3_casting;

public class Casting {
    public static void main(String[] args) {
        
        // 1. 自動変換 (小さい型 -> 大きい型)
        // int(整数) を double(小数) に入れるのは安全なので勝手にやってくれる
        int number = 10;
        double doubleNumber = number;
        
        System.out.println("元の数字: " + number);
        System.out.println("double変換後: " + doubleNumber); // 10.0 になる

        // 2. 強制変換 (大きい型 -> 小さい型)
        // double(小数) を int(整数) に入れると、小数点以下が消える（情報が減る）
        // だから「(int)」と書いて無理やり変換する。これを「キャスト」と呼ぶ。
        double pi = 3.14;
        int intPi = (int) pi; 

        System.out.println("元の小数: " + pi);
        System.out.println("intキャスト後: " + intPi); // 3 になる（切り捨て）

        // 3. 数値 -> 文字列
        // Ruby: number.to_s
        // Java: String.valueOf(number) または + "" で繋ぐ
        String text = "年齢は" + String.valueOf(25) + "歳";
        System.out.println(text);
    }
}