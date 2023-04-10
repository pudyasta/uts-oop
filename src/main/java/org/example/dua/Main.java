package org.example.dua;

public class Main {
    public static void main(String[] args) {
        KTP a = new KTP("Pudy");
        System.out.println(a);
        a.setNomorTelpon("1812333333333");
        System.out.println(a);
        a.setNomorTelpon("081229106488");
        System.out.println(a);
        a.setTgl_lahir(new String[]{"31","1","1900"});
        System.out.println(a);
    }
}
