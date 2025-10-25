package com.inheritance;

public class App {
    public static void main(String[] args) throws Exception {
        Karyawan Rin = new Karyawan("4524090", "Rin");
        Karyawan Jiku = new Karyawan("4524029", "Jiku");
        Rin.getInfo();
        Jiku.getInfo();
        Rin.absenPulang();
        Jiku.absenPagi();
        Jiku.kerja();
        Rin.absenPagi();
        Rin.kerja();
        Jiku.absenPulang();

        System.out.println("\n");

        Dosen Amir = new Dosen("325678", "334455", "Amir");
        Dosen Ady = new Dosen("098765", "088990", "Ady");
        Amir.getInfo();
        Ady.getInfo();
        Amir.absenPulang();
        Ady.absenPagi();
        Ady.kerja();
        Amir.absenPagi();
        Amir.kerja();
        Ady.absenPulang();
    }
}
