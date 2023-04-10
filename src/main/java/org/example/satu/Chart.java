package org.example.satu;

import java.util.Arrays;

public class Chart {

    private Subject[] subjects = new Subject[10];

    public void addChart(Subject s){
        for (int i = 0 ; i < subjects.length;i++){
            if(subjects[i]==null){
                subjects[i] = s;
                break;
            }
        }
    }

    public String convert(){
        int sum = 0;
        String all = "";
        for (int i = 0 ; i < subjects.length;i++){
            if(subjects[i]==null){
                break;
            }else{
                sum += subjects[i].getBeban();
            }
        }
        for (int i = 0 ; i < subjects.length;i++){
            if(subjects[i]==null){
                break;
            }else{
                all += subjects[i].getBeban() / sum * 100 + "% "+ subjects[i].getNama()+"\n";
            }
        }
        return all;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Pie Chart saat ini :\n"+convert();
    }
}
