package WeatherReport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 甲府のお天気お姉さん
 * @author c16313
 */
public class kofuObserver implements Observer{
    public void update(Amedas amedaskofu){
        System.out.println("甲府のお天気お姉さん「今日の甲府の天気は'" + amedaskofu.getWether() + "'で,"
                + "気温は'" + amedaskofu.getTemper() + "度'です」");
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
        }
    }
}
