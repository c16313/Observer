package WeatherReport;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 数を生成する（抽象クラス）
 * @author c16313
 */
public abstract class Amedas {
    private ArrayList<Observer> observers = new ArrayList<>(); //集約（has-a関係）
    
    //観察者の追加
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    
    //観察者の削除 
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }   
    
    //登録されている観察者にupdateするようメッセージを送る
    public void notifyObservers(){
        //for(Observer ob : observers){
        //    ob.update(this);
        //}
        observers.forEach((ob) -> {
            ob.update(this);
        });
    }
    
    public abstract String getWether();
    public abstract int getTemper();
    public abstract void execute();
    
}
