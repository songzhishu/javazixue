package com.day14.jiekou1;

public class test {
    public static void main(String[] args) {
        //创建对象
        BasketballPlayer basketballPlayer = new BasketballPlayer("张三", 20);
        basketballPlayer.learn();
        System.out.println("--------------------------------------------");
        BasketballCoach basketballCoach = new BasketballCoach();
        basketballCoach.teach();
        System.out.println("--------------------------------------------");
        tableTennisPlayers tableTennisPlayers = new tableTennisPlayers();
        tableTennisPlayers.learn();
        tableTennisPlayers.speak();
        System.out.println("--------------------------------------------");
        TableTennisCoach tableTennisCoach = new TableTennisCoach();
        tableTennisCoach.teach();
        tableTennisCoach.speak();
    }
}
