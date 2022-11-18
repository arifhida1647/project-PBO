import java.io.Console;
import java.util.Scanner;
import  java.util.*;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
class Nasabah {
    protected String name;
    protected  int umur;
    private long no_tlp;
    private int no_rekening;
    private int pin;
    private int saldo;
    protected  String alamat;


    Nasabah(String name, int umur,long no_tlp,int no_rekening,int pin,int saldo,String alamat){
        this.name = name;
        this.alamat = alamat;
        this.pin = pin;
        this.no_rekening = no_rekening;
        this.no_tlp = no_tlp;
        this.saldo = saldo;
        this.umur = umur;
    }

    public Nasabah() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public long getNo_tlp() {
        return no_tlp;
    }

    public void setNo_tlp(int no_tlp) {
        this.no_tlp = no_tlp;
    }

    public int getNo_rekening() {
        return no_rekening;
    }

    public void setNo_rekening(int no_rekening) {
        this.no_rekening = no_rekening;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

class Pegawai extends Nasabah{

    Pegawai(String nama, int umur, String alamat){
        this.name = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    void ubahpin(Nasabah n1,int pin){
        n1.setPin(pin);
    }

    void ubahTlp(Nasabah n1,int no_tlp){
        n1.setNo_tlp(no_tlp);
    }

    void ubahAlamat(Nasabah n1,String alamat){
        n1.setAlamat(alamat);
    }
}

public class Main {
    public static void main(String[] args) {

        Nasabah n1 = new Nasabah("Arif",12,999,9999,628181,20000,"rempoa");
        Nasabah n2 = new Nasabah("Zakkiya",12,999,9999,628181,20000,"depok");
        Nasabah n3 = new Nasabah("Nicholas",12,999,9999,628181,20000,"jakarta");
        Nasabah n4 = new Nasabah("Lintang",12,999,9999,628181,20000,"bandung");
        Scanner input = new Scanner(System.in);
        Scanner input_string = new Scanner(System.in);

        int N;
        boolean a = true;
        home:
            while (a){
                System.out.println("BANK UPNVJ");
                System.out.println("1. AKSES BANK");
                System.out.println("2. HALLO UPNVJ");
                System.out.println("0. exit");
                System.out.print("masukan pilihan :");
                N = input.nextInt();
                for (int i = 0; i < 7; i++) {
                    System.out.println();
                }
                switch (N){
                    case 0:
                        a=false;
                        break;
                    case 1:
                        System.out.println("===================== AKSES BANK UPNVJ =================");
                        System.out.println("Masukan nama anda :");
                        String nama;
                        nama = input_string.nextLine();
                        switch (nama)
                        {
                            case "Arif":
                                while (true)
                                {
                                    System.out.println("masukan pin :");
                                    int pin = input.nextInt();
                                    if (pin==n1.getPin()){
                                        break;
                                    }
                                    else{
                                        System.out.println("Pin salah");
                                        System.out.println("exit?Y/T");
                                        String pilihan;
                                        pilihan = input_string.nextLine();
                                        if (pilihan.equals("Y")){
                                            continue home;
                                        }
                                    }
                                    while (true){
                                        System.out.println("===================== AKSES BANK UPNVJ =================");
                                        System.out.println("1. Cek Saldo");
                                        System.out.println("2. Transfer");
                                        System.out.println("0. exit");
                                        System.out.print("masukan pilihan :");
                                        int pilihan;
                                        pilihan = input.nextInt();
                                        switch (pilihan)
                                        {
                                            case 1:
                                                System.out.println("Saldo Anda : "+n1.getSaldo());
                                                break ;
                                            case 2:
                                                System.out.println("1. Zakiyya");
                                                System.out.println("2. Nicholas");
                                                System.out.println("3. Lintang");
                                                System.out.println("0. exit");
                                                N = input.nextInt();
                                                switch (N)
                                                {
                                                    case 1:
                                                        while (true){
                                                            System.out.println("transfer to Zakkiya");
                                                            System.out.println("jumlah :");
                                                            int jumlah_transfer;
                                                            jumlah_transfer = input.nextInt();
                                                            if ( jumlah_transfer - n1.getSaldo()<0)
                                                            {
                                                                System.out.println("Saldo kurang");
                                                            }
                                                            else {
                                                                System.out.println("Transfer Berhasil sebesar :"+jumlah_transfer+"ke Zakiyya");
                                                                n1.setSaldo(jumlah_transfer - n1.getSaldo());
                                                                n2.setSaldo(jumlah_transfer + n2.getSaldo());
                                                                break;
                                                            }
                                                        }
                                                        break ;
                                                    case 2:
                                                        while (true){
                                                            System.out.println("transfer to Nicholas");
                                                            System.out.println("jumlah :");
                                                            int jumlah;
                                                            int jumlah_transfer;
                                                            jumlah_transfer = input.nextInt();
                                                            if ( jumlah_transfer - n1.getSaldo()<0)
                                                            {
                                                                System.out.println("Saldo kurang");
                                                            }
                                                            else {
                                                                System.out.println("Transfer Berhasil sebesar :"+jumlah_transfer+"ke Nicholas");
                                                                n1.setSaldo(jumlah_transfer - n1.getSaldo());
                                                                n3.setSaldo(jumlah_transfer + n3.getSaldo());
                                                                break;
                                                            }
                                                        }
                                                        break ;
                                                    case 3:
                                                        while (true){
                                                            System.out.println("transfer to Lintang");
                                                            System.out.println("jumlah :");
                                                            int jumlah;
                                                            int jumlah_transfer;
                                                            jumlah_transfer = input.nextInt();
                                                            if ( jumlah_transfer - n1.getSaldo()<0)
                                                            {
                                                                System.out.println("Saldo kurang");
                                                            }
                                                            else {
                                                                System.out.println("Transfer Berhasil sebesar :"+jumlah_transfer+"ke Lintang");
                                                                n1.setSaldo(jumlah_transfer - n1.getSaldo());
                                                                n4.setSaldo(jumlah_transfer + n4.getSaldo());
                                                                break;
                                                            }
                                                        }
                                                        break ;
                                                    default:
                                                        continue home;
                                                }

                                        }
                                    }
                                }
                            case "Zakiyya":
                                while (true)
                                {
                                    System.out.println("masukan pin :");
                                    int pin = input.nextInt();
                                    if (pin==n2.getPin()){
                                        break;
                                    }
                                    else{
                                        System.out.println("Pin salah");
                                        System.out.println("exit?Y/T");
                                        String pilihan;
                                        pilihan = input_string.nextLine();
                                        if (pilihan.equals("Y")){
                                            continue home;
                                        }
                                    }
                                    while (true){
                                        System.out.println("===================== AKSES BANK UPNVJ =================");
                                        System.out.println("1. Cek Saldo");
                                        System.out.println("2. Transfer");
                                        System.out.println("0. exit");
                                        System.out.print("masukan pilihan :");
                                        int pilihan;
                                        pilihan = input.nextInt();
                                        switch (pilihan)
                                        {
                                            case 1:
                                                System.out.println("Saldo Anda : "+n2.getSaldo());
                                                break ;
                                            case 2:
                                                menu:
                                                System.out.println("1. Arif");
                                                System.out.println("2. Nicholas");
                                                System.out.println("0. exit");
                                                N = input.nextInt();
                                                switch (N)
                                                {
                                                    case 1:
                                                        while (true){
                                                            System.out.println("transfer to arif");
                                                            System.out.println("jumlah :");
                                                            int jumlah_transfer;
                                                            jumlah_transfer = input.nextInt();
                                                            if ( jumlah_transfer - n2.getSaldo()<0)
                                                            {
                                                                System.out.println("Saldo kurang");
                                                            }
                                                            else {
                                                                System.out.println("Transfer Berhasil sebesar :"+jumlah_transfer+"ke Arif");
                                                                n2.setSaldo(jumlah_transfer - n2.getSaldo());
                                                                n1.setSaldo(jumlah_transfer + n1.getSaldo());
                                                                break;
                                                            }
                                                        }
                                                        break ;
                                                    case 2:
                                                        while (true){
                                                            System.out.println("transfer to Nicholas");
                                                            System.out.println("jumlah :");
                                                            int jumlah;
                                                            int jumlah_transfer;
                                                            jumlah_transfer = input.nextInt();
                                                            if ( jumlah_transfer - n2.getSaldo()<0)
                                                            {
                                                                System.out.println("Saldo kurang");
                                                            }
                                                            else {
                                                                System.out.println("Transfer Berhasil sebesar :"+jumlah_transfer+"ke Nicholas");
                                                                n2.setSaldo(jumlah_transfer - n2.getSaldo());
                                                                n3.setSaldo(jumlah_transfer + n3.getSaldo());
                                                                break;
                                                            }
                                                        }
                                                        break ;
                                                    case 3:
                                                        while (true){
                                                            System.out.println("transfer to Lintang");
                                                            System.out.println("jumlah :");
                                                            int jumlah;
                                                            int jumlah_transfer;
                                                            jumlah_transfer = input.nextInt();
                                                            if ( jumlah_transfer - n2.getSaldo()<0)
                                                            {
                                                                System.out.println("Saldo kurang");
                                                            }
                                                            else {
                                                                System.out.println("Transfer Berhasil sebesar :"+jumlah_transfer+"ke Lintang");
                                                                n2.setSaldo(jumlah_transfer - n2.getSaldo());
                                                                n4.setSaldo(jumlah_transfer + n4.getSaldo());
                                                                break;
                                                            }
                                                        }
                                                        break ;
                                                    default:
                                                        continue home;
                                                }

                                        }
                                    }
                                }
                            case "Nicholas":
                                while (true)
                                {
                                    System.out.println("masukan pin :");
                                    int pin = input.nextInt();
                                    if (pin==n3.getPin()){
                                        break;
                                    }
                                    else{
                                        System.out.println("Pin salah");
                                        System.out.println("exit?Y/T");
                                        String pilihan;
                                        pilihan = input_string.nextLine();
                                        if (pilihan.equals("Y")){
                                            continue home;
                                        }
                                    }
                                    while (true){
                                        System.out.println("===================== AKSES BANK UPNVJ =================");
                                        System.out.println("1. Cek Saldo");
                                        System.out.println("2. Transfer");
                                        System.out.println("0. exit");
                                        System.out.print("masukan pilihan :");
                                        int pilihan;
                                        pilihan = input.nextInt();
                                        switch (pilihan)
                                        {
                                            case 1:
                                                System.out.println("Saldo Anda : "+n3.getSaldo());
                                                break ;
                                            case 2:
                                                System.out.println("1. Zakiyya");
                                                System.out.println("2. Arif");
                                                System.out.println("3. Lintang");
                                                System.out.println("0. exit");
                                                N = input.nextInt();
                                                switch (N)
                                                {
                                                    case 1:
                                                        while (true){
                                                            System.out.println("transfer to Zakkiya");
                                                            System.out.println("jumlah :");
                                                            int jumlah_transfer;
                                                            jumlah_transfer = input.nextInt();
                                                            if ( jumlah_transfer - n3.getSaldo()<0)
                                                            {
                                                                System.out.println("Saldo kurang");
                                                            }
                                                            else {
                                                                System.out.println("Transfer Berhasil sebesar :"+jumlah_transfer+"ke Zakiyya");
                                                                n3.setSaldo(jumlah_transfer - n3.getSaldo());
                                                                n2.setSaldo(jumlah_transfer + n2.getSaldo());
                                                                break;
                                                            }
                                                        }
                                                        break ;
                                                    case 2:
                                                        while (true){
                                                            System.out.println("transfer to Arif");
                                                            System.out.println("jumlah :");
                                                            int jumlah;
                                                            int jumlah_transfer;
                                                            jumlah_transfer = input.nextInt();
                                                            if ( jumlah_transfer - n3.getSaldo()<0)
                                                            {
                                                                System.out.println("Saldo kurang");
                                                            }
                                                            else {
                                                                System.out.println("Transfer Berhasil sebesar :"+jumlah_transfer+"ke Arif");
                                                                n3.setSaldo(jumlah_transfer - n3.getSaldo());
                                                                n1.setSaldo(jumlah_transfer + n1.getSaldo());
                                                                break;
                                                            }
                                                        }
                                                        break ;
                                                    case 3:
                                                        while (true){
                                                            System.out.println("transfer to Lintang");
                                                            System.out.println("jumlah :");
                                                            int jumlah;
                                                            int jumlah_transfer;
                                                            jumlah_transfer = input.nextInt();
                                                            if ( jumlah_transfer - n3.getSaldo()<0)
                                                            {
                                                                System.out.println("Saldo kurang");
                                                            }
                                                            else {
                                                                System.out.println("Transfer Berhasil sebesar :"+jumlah_transfer+"ke Lintang");
                                                                n3.setSaldo(jumlah_transfer - n3.getSaldo());
                                                                n4.setSaldo(jumlah_transfer + n4.getSaldo());
                                                                break;
                                                            }
                                                        }
                                                    default:
                                                        continue home;
                                                }

                                        }
                                    }
                                }
                            case "Lintang":
                                while (true)
                                {
                                    System.out.println("masukan pin :");
                                    int pin = input.nextInt();
                                    if (pin==n3.getPin()){
                                        break;
                                    }
                                    else{
                                        System.out.println("Pin salah");
                                        System.out.println("exit?Y/T");
                                        String pilihan;
                                        pilihan = input_string.nextLine();
                                        if (pilihan.equals("Y")){
                                            continue home;
                                        }
                                    }
                                    while (true){
                                        System.out.println("===================== AKSES BANK UPNVJ =================");
                                        System.out.println("1. Cek Saldo");
                                        System.out.println("2. Transfer");
                                        System.out.println("0. exit");
                                        System.out.print("masukan pilihan :");
                                        int pilihan;
                                        pilihan = input.nextInt();
                                        switch (pilihan)
                                        {
                                            case 1:
                                                System.out.println("Saldo Anda : "+n4.getSaldo());
                                                break ;
                                            case 2:
                                                System.out.println("1. Zakiyya");
                                                System.out.println("2. Arif");
                                                System.out.println("3. Nicholas");
                                                System.out.println("0. exit");
                                                N = input.nextInt();
                                                switch (N)
                                                {
                                                    case 1:
                                                        while (true){
                                                            System.out.println("transfer to Zakkiya");
                                                            System.out.println("jumlah :");
                                                            int jumlah_transfer;
                                                            jumlah_transfer = input.nextInt();
                                                            if ( jumlah_transfer - n4.getSaldo()<0)
                                                            {
                                                                System.out.println("Saldo kurang");
                                                            }
                                                            else {
                                                                System.out.println("Transfer Berhasil sebesar :"+jumlah_transfer+"ke Zakiyya");
                                                                n4.setSaldo(jumlah_transfer - n4.getSaldo());
                                                                n2.setSaldo(jumlah_transfer + n2.getSaldo());
                                                                break;
                                                            }
                                                        }
                                                        break ;
                                                    case 2:
                                                        while (true){
                                                            System.out.println("transfer to Nicholas");
                                                            System.out.println("jumlah :");
                                                            int jumlah;
                                                            int jumlah_transfer;
                                                            jumlah_transfer = input.nextInt();
                                                            if ( jumlah_transfer - n3.getSaldo()<0)
                                                            {
                                                                System.out.println("Saldo kurang");
                                                            }
                                                            else {
                                                                System.out.println("Transfer Berhasil sebesar :"+jumlah_transfer+"ke Nicholas");
                                                                n4.setSaldo(jumlah_transfer - n4.getSaldo());
                                                                n3.setSaldo(jumlah_transfer + n3.getSaldo());
                                                                break;
                                                            }
                                                        }
                                                        break ;
                                                    case 3:
                                                        while (true){
                                                            System.out.println("transfer to Arif");
                                                            System.out.println("jumlah :");
                                                            int jumlah;
                                                            int jumlah_transfer;
                                                            jumlah_transfer = input.nextInt();
                                                            if ( jumlah_transfer - n4.getSaldo()<0)
                                                            {
                                                                System.out.println("Saldo kurang");
                                                            }
                                                            else {
                                                                System.out.println("Transfer Berhasil sebesar :"+jumlah_transfer+"ke Arif");
                                                                n4.setSaldo(jumlah_transfer - n4.getSaldo());
                                                                n4.setSaldo(jumlah_transfer + n4.getSaldo());
                                                                break;
                                                            }
                                                        }
                                                        break ;
                                                    default:
                                                        continue home;
                                                }

                                        }
                                    }
                                }
                            default:
                                System.out.println();
                            }
                        }

                }
            }
    }

