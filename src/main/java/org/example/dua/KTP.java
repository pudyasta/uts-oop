package org.example.dua;

public class KTP {
    private String nama;
    private String nomorTelpon = "088888888888";
    private String[] tgl_lahir =  {"31", "12","2012"};

    public KTP(String nama, String nomorTelpon, String[] tgl_lahir) {
        this.nama = nama;
        setNomorTelpon(nomorTelpon);
        setTgl_lahir(tgl_lahir);
    }

    public KTP(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorTelpon() {
        return nomorTelpon;
    }

    public void setNomorTelpon(String nomorTelpon) {
        if (nomorTelpon.substring(0,1).equals("0") && ( nomorTelpon.length() > 11 &&nomorTelpon.length() < 14 )){
            this.nomorTelpon = nomorTelpon;
            System.out.println("Pergantian nomor telepon berhasil");
        }else {
            System.out.println("Nomor Telepon tidak valid");

        }
    }

    public String getTgl_lahir() {
        return tgl_lahir[0]+"-"+tgl_lahir[1]+"-"+tgl_lahir[2];
    }

    public void setTgl_lahir(String[] tgl_lahir) {
         if (Integer.parseInt(tgl_lahir[2])> 1899) {
             if (tgl_lahir[1].equals("1") || tgl_lahir[2].equals("3") || tgl_lahir[2].equals("5") || tgl_lahir[2].equals("7") || tgl_lahir[2].equals("8") || tgl_lahir[2].equals("10") || tgl_lahir[2].equals("12")) {
                 if (Integer.parseInt(tgl_lahir[0]) < 32 && Integer.parseInt(tgl_lahir[0]) > 0) {
                     System.out.println("Pergantian Tanggal lahir berhasil");
                     this.tgl_lahir = tgl_lahir;
                 } else {
                     System.out.println("Pergantian Tanggal lahir  Invalid");
                 }
             } else if (tgl_lahir[1].equals("4") || tgl_lahir[1].equals("6") || tgl_lahir[1].equals("9") || tgl_lahir[1].equals("11")) {
                 if (Integer.parseInt(tgl_lahir[0]) < 31 && Integer.parseInt(tgl_lahir[0]) > 0) {
                     System.out.println("Pergantian Tanggal lahir berhasil");
                     this.tgl_lahir = tgl_lahir;
                 } else {
                     System.out.println("Pergantian Tanggal lahir  Invalid");
                 }
             } else if (tgl_lahir[1].equals("2")) {
                 if (Integer.parseInt(tgl_lahir[0]) < 29 && Integer.parseInt(tgl_lahir[0]) > 0) {
                     System.out.println("Pergantian Tanggal lahir berhasil");
                     this.tgl_lahir = tgl_lahir;
                 } else {
                     System.out.println("Pergantian Tanggal lahir  Invalid");
                 }
             } else {
                 System.out.println("Pergantian Tanggal lahir  Invalid");
             }
         }else {
             System.out.println("Pergantian Tanggal lahir  Invalid");
         }
    }

    @Override
    public String toString() {
        return "KTP{" +
                "nama='" + nama + '\'' +
                ", nomorTelpon='" + nomorTelpon + '\'' +
                ", tgl_lahir='" + getTgl_lahir() + '\'' +
                '}';
    }
}
