import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Putra", "3C", "Struktur Data", 2021105));
        mhs.put("2", new Mahasiswa("Ivan", "3C", "Struktur Data", 2021109));
        mhs.put("3", new Mahasiswa("Arro", "3D", "Pemrograman Lanjut", 2021101));

        System.out.println("Masukkan ID  : ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.println("Data Mahasiswa : " + data.nama + ", kelas : " + data.kelas + ", mata kuliah praktikum : " + data.matkulPraktikum +  ", NIM : " + data.nim);
        }
    }

}
