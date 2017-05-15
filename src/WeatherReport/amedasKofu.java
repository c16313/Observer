package WeatherReport;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * ランダムに数を生成する
 * @author c16313
 */
public class amedasKofu extends Amedas{
    Random random = new Random();
    String wether;
    int temper;
    int rand;
    
    public String getWether(){ return wether; }
    public int getTemper(){ return temper; }
    
    //乱数を発生させて、観察者に通知
    public void execute(){
        
        rand = random.nextInt(30);
        if(rand < 10){
            wether = "晴れ";
        }else if(rand < 20){
            wether = "曇り";
        }else if(rand < 30){
            wether = "雨";
        }
        temper = random.nextInt(10) + 15;
        notifyObservers();
    }
}
