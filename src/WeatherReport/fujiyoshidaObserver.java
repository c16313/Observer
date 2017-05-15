package WeatherReport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 富士吉田のお天気お姉さん
 * @author c16313
 */
public class fujiyoshidaObserver implements Observer{
    public void update(Amedas amedasFujiyoshida){
        System.out.println("富士吉田のお天気お姉さん「今日の富士吉田の天気は'" + amedasFujiyoshida.getWether() + "'で,"
                + "気温は'" + amedasFujiyoshida.getTemper() + "度'です」");
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
        }
    }
}