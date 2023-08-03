package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + String.format( " Моя страна - %s. Я несу %d яиц в месяц.",Country.MOLDOVA , getCountOfEggsPerMonth() );
    }
}
