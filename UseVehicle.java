// インポート
import mypack.*;

public class UseVehicle {
    public static void main(String[] args) {
        Vehicle[] v = new Vehicle[3];
        v[0] = new Taxi(4);
        v[1] = new Train(160);
        v[2] = new Bus(80);
        // v[0] Vehicle型（スーパークラス）= Taxi型（サブクラス）の方向で型変換されているため自動で変換される（インスタンス生成）
        
        // 繰り返し処理
        for(int i = 0; i < v.length; i++) {
            v[i].showCrewNum();
            // instanceof演算子: v[i]がStopableのインスタンスか調べる
            // v[i]はTaxi型に変換されたため、Stopableを持っているのでtrue
            if(v[i] instanceof Stopable) {
                // v[i](Taxiのインスタンス)をStopable型に変換して、ｓに代入
                // わざわざStopable型に変換する理由は、v[i]はもともとVehicle型であり、stopメソッドを持っていないため実行することができないので変換が必要
                // v[0]の指す先にTaxiのインスタンスはあるのだが、メソッドを使えるわけではない。あくまでもVehicle型のため、Vehicleクラスにstopメソッドの記載がない限り使えない
                Stopable s = (Stopable)v[i];
                // Taxiクラスのstopメソッドを呼び出す
                s.stop();
            }
        }
    }
}