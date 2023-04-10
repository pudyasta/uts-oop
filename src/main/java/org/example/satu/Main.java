package org.example.satu;

public class Main {
    public static void main(String[] args) {
        Chart pieChart = new Chart();
        pieChart.addChart(new Subject("IPA",5));
        pieChart.addChart(new Subject("B. IND",15));
        System.out.println(pieChart);
        System.out.println();
        pieChart.addChart(new Subject("B. ING", 30));
        System.out.println(pieChart);
    }
}
