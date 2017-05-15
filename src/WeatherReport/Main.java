/*
 * 課題３
 * アメダスで観測される気温などの情報を取得して
 * その結果を表示するプログラムをObserverパターンを
 * 使って実現しなさい。
 * 複数の観測地点に対応すること
 */
package WeatherReport;

/**
 * 気象観測
 * @author c16313
 */
public class Main {
    public static void main(String[] args) {
        Amedas amedas1 = new amedasKofu();
        Amedas amedas2 = new amedasFujiyoshida();
        Observer observer1 = new kofuObserver();
        Observer observer2 = new fujiyoshidaObserver();
        amedas1.addObserver(observer1);
        amedas2.addObserver(observer2);
        amedas1.execute();
        amedas2.execute();
    }
}
