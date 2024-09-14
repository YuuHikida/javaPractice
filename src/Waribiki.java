import java.util.*;

public class Waribiki {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();  // コーヒーの初回価格
        int P = sc.nextInt();  // 割引率（%）

        int totalCost = 0;  // 支払った合計金額を記録する変数

        // 割引が適用され、X が 0 になるまでループ
        while (X > 0) {
            totalCost += X;  // 現在の価格を合計に加える
            int discount = X * P / 100;  // 割引額を計算（小数点以下切り捨て）

            if (discount == 0) {
                // 割引額が0になった場合、そのまま残っているXを支払って終了
                break;
            }

            X -= discount;  // 割引を適用して新しい価格に更新
        }

        // 残っているXがある場合、そのまま支払いに加える
        totalCost += X;

        // 結果を出力
        System.out.println(totalCost);  // 合計金額を出力
    }
}
