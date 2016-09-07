package com.algorithm;

import java.util.Comparator;

public class Checker implements Comparator<Player>{
    @Override
    public int compare(Player p1,Player p2){
        int score= p1.score-p2.score;
        if(score!=0){
            return score;
        }else{
            return p1.name.compareTo(p2.name);
        }
    }
    
    
}
