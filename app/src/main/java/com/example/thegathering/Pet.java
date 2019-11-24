package com.example.thegathering;

import java.sql.Timestamp;
import java.util.Date;

public class Pet {
    public String name;
    private float age;
    Timestamp born;

    private int max_stat_value = 100;
    private int min_stat_value = 0;

    private int statHealth;
    private int statHappy;
    private int statFed;
    private int statLove;

    Pet(){
        this.name = "Pet";
        this.age = 0;
        this.statHappy = 100;
        this.statFed = 100;
        this.statHealth = 100;
        this.statLove = 50;
        this.born = new Timestamp(System.currentTimeMillis());
    }

    public void decreaseStats(){
            this.cheer(-1);
            this.feed(-1);
        this.cure(-1);
        this.love(-1);
    }

    public void feed(int value) {
        int stat = this.statFed;
        if(stat+value <= max_stat_value && stat+value > min_stat_value)
            stat+=value;
        else
            stat = value>0?max_stat_value:min_stat_value;
        this.statFed = stat;
    }

    public void cure(int value) {
        int stat = this.statHealth;
        if(stat+value <= max_stat_value && stat+value > min_stat_value)
            stat+=value;
        else
            stat = value>0?max_stat_value:min_stat_value;
        this.statHealth = stat;
    }

    public void cheer(int value) {
        int stat = this.statHappy;
        if(stat+value <= max_stat_value && stat+value > min_stat_value)
            stat+=value;
        else
            stat = value>0?max_stat_value:min_stat_value;
        this.statHappy = stat;
    }

    public void love(int value) {
        int stat = this.statLove;
        if(stat+value <= max_stat_value && stat+value > min_stat_value)
            stat+=value;
        else
            stat = value>0?max_stat_value:min_stat_value;
        this.statLove = stat;
    }

    public int fed(){
        return this.statFed;
    }

    public int happy(){
        return this.statHappy;
    }

    public int health(){
        return this.statHealth;
    }

    public int love(){
        return this.statLove;
    }



}