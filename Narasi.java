/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hudzzz2;

/*
 
Program Quizz Hudzzz
21 -03- 2020

 */
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author hudzaifah
 */
class Properti 
{

    private double nilai = 100;
    private int pilihanMenu = 0;
    private int tangkap = 0;
    private String nama = "";
    private String tangkapNama   = "tangkap ";
    private boolean manusia = false;
    private boolean hewan   = false;
    private boolean tumbuhan = false;
    private boolean komputer = false;
    private int perulangan = 0;
    private String jawabanUser = " ";
    
    //setter hudzzz
    public void setJawabanUser (String jawabanUser)
    {
        this.jawabanUser = jawabanUser;
    }
    public void setNilai ( double nilai)
    {
        this.nilai = nilai;
    }
    public void setPilihMenu (int pilihMenu )
    {
        this.pilihanMenu = pilihMenu;
    }
    public void setTangkap (int tangkap)
    {
        this.tangkap = tangkap;
    }
    public void setNama (String nama)
    {
        this.nama = nama;
    }
    public void setTangkapNama (String tangkapNama)
    {
        this.tangkapNama = tangkapNama;
    }
    public void setManusia (boolean manusia )
    {
        this.manusia = manusia;
    }
    public void setHewan (boolean hewan)
    {
        this.hewan = hewan;
    }
    public void setTumbuhan (boolean tumbuhan)
    {
        this.tumbuhan = tumbuhan;
    }
    public void setKomputer (boolean komputer)
    {
        this.komputer = komputer;
    }
    public void setPerulangan (int perulangan)
    {
        this.perulangan = perulangan;
    }
    
    
    //getter hudzzz
    public String getJawabanUser ()
    {
        return this.jawabanUser;
    }
    public double getNilai ()
    {
        return this.nilai;
    }
    public int getPilihMenu ()
    {
        return this.pilihanMenu;
    }
    public int getTangkap ()
    {
        return this.tangkap;
    }
    public String getNama ()
    {
        return this.nama;
    }
    public String getTangkapNama ()
    {
        return this.tangkapNama;
    }
    public boolean getManusia ()
    {
        return this.manusia;
    }
    public boolean getHewan ()
    {
        return this.hewan;
    }
    public boolean getTumbuhan ()
    {
        return this.tumbuhan;
    }
    public boolean getKomputer ()
    {
        return this.komputer;
    }
    public int getPerulangan ()
    {
        return this.perulangan;
    }


}


public class Narasi {
    
    public static void main (String[] args) 
    {
        uwu();
        
    }
    
    public static void uwwu (Properti user) 
    {
        spasi();
        String anuan = " ";
        if (user.getNilai() >= 75)
        {
            anuan = " Anda Hebat ";
        }
        else if (user.getNilai() >= 50 && user.getNilai()<= 75)
        {
            anuan = " Ayo BErjuang Lagi";
        }
        else if (user.getNilai() >= 25 && user.getNilai()<= 50)
        {
            anuan = " Ganbatte";
        }
        else if (user.getNilai()<= 25)
        {
            anuan = " GANBATTEEEE !!!";
        }
        
        System.out.println("Anda Telah Menyelesaikan Seluruh Soal Quizz Hudzzz"
                + "\n berikut adalah hasil yang anda capai"
                + "\n"
                + "\n Nama : " + user.getNama() + 
                "\n Score : " + user.getNilai() + anuan
                + "\n Terimakasih telah bermain");
    }
    
    
    public static void uwu() 
    {
        
        
        Scanner hudzz = new Scanner(System.in);
        Properti user = new Properti();
        int cek = 0;
        
        
        
        
        
        
        System.out.println
                ( "\n Copyright by : M.hudzaifah Assyahid \n support us : hdzzzzzz01@gmail.com \n\n\n " 
                +"       Selamat Datang Di Program Quiz Hudzzz \n"
                + "          Senang Bertemu Dengan Anda\n"
                + "              Masukan Nama anda :  \n ");
        
        do{
        	if ( cek > 0 )
        	{
        		System.out.print(" Nama tidak boleh kosong \n :");
        	}
        	cek +=1;
        	user.setNama(hudzz.nextLine());
        	System.out.print("\n");

        }while((user.getNama() == null) || (user.getNama().equalsIgnoreCase(" ")) || (user.getNama().equalsIgnoreCase("")));

        System.out.println("Hallo " + user.getNama() +" :) \n\n berikut adalah aturan yang harus kamu ketahui tentang quizz ini :"
                + "\n 1. Kamu memiliki 100 poin"
                + "\n 2. kamu akan di berikan 4 pertanyaan pertanyaan seputar topik 'Manusia',hewan,tumbuhan,komputer"
                + "\n 3. jika kamu salah maka akan di kurangi sebanyak -25 poin"
                + "\n 4. ayo bermain dengan jujur"
                + "\n"
                + "\n"
                + "\n");
        
     int perulangan = user.getPerulangan();
     String pilihSementara = "";
     while ( user.getPerulangan() <4)
     {
         
         
         if (user.getPerulangan() == 0)
         {
             System.out.println("Baiklah Silahkan Pilih Soal yang ingin anda kerjakan :");
         
         }
         else
         {
         
             System.out.println("Anda Telah Menyelesaikan Soal tentang " + user.getTangkapNama() + " Silahkan pilih soal berikutnya :");
         
         }
         
         menu(user.getManusia(),user.getHewan(),user.getTumbuhan(),user.getKomputer(),user);
       
        do
        {
            pilihSementara = hudzz.nextLine();
            boolean dump = false;
            
            if(pilihSementara.equalsIgnoreCase("soal manusia") || pilihSementara.equalsIgnoreCase("1") || pilihSementara.equalsIgnoreCase("1. soal manusia") || pilihSementara.equalsIgnoreCase("manusia"))
            {
                user.setPilihMenu(1);
            }
            else if (pilihSementara.equalsIgnoreCase("soal hewan") || pilihSementara.equalsIgnoreCase("2") || pilihSementara.equalsIgnoreCase("2. soal hewan") || pilihSementara.equalsIgnoreCase("hewan"))
            {
                user.setPilihMenu(2);
            }
            else if (pilihSementara.equalsIgnoreCase("soal tumbuhan") || pilihSementara.equalsIgnoreCase("3") || pilihSementara.equalsIgnoreCase("1. soal tumbuhan") || pilihSementara.equalsIgnoreCase("tumbuhan"))
            {
                user.setPilihMenu(3); 
            }
            else if (pilihSementara.equalsIgnoreCase("soal komputer") || pilihSementara.equalsIgnoreCase("4") || pilihSementara.equalsIgnoreCase("1. soal komputer")|| pilihSementara.equalsIgnoreCase("komputer"))
            {
                user.setPilihMenu(4);
            }
            else if ((pilihSementara.equalsIgnoreCase("")) || (pilihSementara.equalsIgnoreCase(" ")) || (pilihSementara.equalsIgnoreCase("  "))|| (pilihSementara.equalsIgnoreCase("   "))|| (pilihSementara.equalsIgnoreCase("     ")))
           	{
            	System.out.println("Pilihan Tidak Boleh Kosong");
            }
            if ((user.getPilihMenu() == 1 && user.getManusia() == true) || (user.getPilihMenu() == 2 && user.getHewan() == true) || (user.getPilihMenu() == 3 && user.getTumbuhan() == true) || (user.getPilihMenu() == 4 && user.getKomputer() == true))
            {
            
                System.out.println("Anda Telah Menyelesaikan soal itu, silahkan pilih yang lain");
                
            }
            

            
        }
        while((user.getPilihMenu() == 1 && user.getManusia() == true) || (user.getPilihMenu() == 2 && user.getHewan() == true) || (user.getPilihMenu() == 3 && user.getTumbuhan() == true) || (user.getPilihMenu() == 4 && user.getKomputer() == true) || (pilihSementara.equalsIgnoreCase("") || (pilihSementara.equalsIgnoreCase(" "))));

            switch (user.getPilihMenu()) {
                case 1:
                    user.setManusia(true);
                    user.setTangkapNama("Manusia");
                    break;
                case 2:
                    user.setHewan(true);
                    user.setTangkapNama("Hewan");
                    break;
                case 3:
                    user.setTumbuhan(true);
                    user.setTangkapNama("Tumbuhan");
                    break;
                case 4:
                    user.setKomputer(true);
                    user.setTangkapNama("Komputer");
                    break;
                default:
                    break;        
            }

            soal(user,user.getPilihMenu());
            
            perulangan ++;
            
            user.setPerulangan(perulangan);
            
            //System.out.println("perulangan" + user.getPerulangan());
            
            
     
     }
    
        uwwu(user);
    }
    
    
    public static void menu (boolean manusia, boolean hewan, boolean tumbuhan, boolean komputer, Properti user)
    {
        
        if (manusia == false)
        {
            System.out.println("1. Soal Manusia");
        
        }
        if (hewan == false)
        {
        
            System.out.println("2. Soal Hewan");
        
        }
        if (tumbuhan == false)
        {
        
            System.out.println("3. Soal Tumbuhan");
            
        }
        if (komputer == false)
        {
        
            System.out.println("4. Soal Komputer");
            
        }
    
    
    }
    
    public static void keteranganSoal (Properti user, boolean a)
    {
        if (a == true)
        {
            spasi();
            System.out.println("jawaban anda benar, Anda tidak kehilangan poin.Ini adalah jumlah poin anda sebelumnya " + user.getNilai());
        }
        else
        {
            spasi();
            double nilai = user.getNilai(); nilai -= 25; user.setNilai(nilai);
            System.out.println("jawaban anda salah anda kehilangan 25 poin");
        }
         
    }
    
    public static void soal (Properti user,int pilihMenu)
    {
        Scanner huudz = new Scanner(System.in);
            Random s = new Random();
            
            int noSoal = s.nextInt(3);
            boolean a = false;
        
        if (pilihMenu == 1)
        {
            spasi();
            System.out.println("tentang manusia \n");
                    
            switch (noSoal)
            {
                
                case 0:
                    System.out.println("bobot nilai kesalahan = -25 poin");
                    System.out.println("ada berapa jumlah panca indra pada manusia ?");
                    user.setJawabanUser(huudz.nextLine());
                    if ( user.getJawabanUser().equalsIgnoreCase("lima") || user.getJawabanUser().equalsIgnoreCase("5"))
                    {
                        a = true;
                         //System.out.println("benar");
                        keteranganSoal(user,a);
                        
                    }
                    else
                    {
                        a = false;
                        //System.out.println("salah");
                        keteranganSoal(user,a);
                    }
                    System.out.println("Jumlah Point Anda Sekarang adalah "+ user.getNilai());
                    
                    break;
                 case 1:
                    System.out.println("bobot nilai kesalahan = -25 poin");
                    System.out.println("Gender Manusia Apa yang sangat sult di pahami, ketiaka di tanaya kenapa jawabnya gpp ? ?");
                    user.setJawabanUser(huudz.nextLine());
                    if (user.getJawabanUser().equalsIgnoreCase("wanita") || user.getJawabanUser().equalsIgnoreCase("perempuan") || user.getJawabanUser().equalsIgnoreCase("cewe") || user.getJawabanUser().equalsIgnoreCase("mahluk halus"))
                    {
                        a = true;
                        // System.out.println("benar");
                        keteranganSoal(user,a);
                        
                    }
                    else
                    {
                        a = false;
                        //System.out.println("salah");
                        keteranganSoal(user,a);
                    }
                    System.out.println("Jumlah Point Anda Sekarang adalah "+ user.getNilai());
                    
                    break;
                    
                 case 2:
                    System.out.println("bobot nilai kesalahan = -25 poin");
                    System.out.println(" Disaat Perut Keroncongan Apakah yang akan Manusia lakukan ?"
                            + "\n a. mengemis"
                            + "\n b. jungkirbalik"
                            + "\n c. makan"
                            + "\n d. minta tugas ke dosen");
                    user.setJawabanUser(huudz.nextLine());
                    if (user.getJawabanUser().equalsIgnoreCase("c") || user.getJawabanUser().equalsIgnoreCase("makan") || user.getJawabanUser().equalsIgnoreCase("c. makan") || user.getJawabanUser().equalsIgnoreCase("c makan") || user.getJawabanUser().equalsIgnoreCase("cmakan"))
                    {
                        a = true;
                        // System.out.println("benar");
                        keteranganSoal(user,a);
                         
                    }
                    else
                    {
                        a = false;
                       // System.out.println("salah");
                        keteranganSoal(user,a);
                    }
                    System.out.println("Jumlah Point Anda Sekarang adalah "+ user.getNilai());
                    
                    break;
                    
                 
            
            
            }
        
        }
        else if (pilihMenu == 2)
        {
            spasi();
             System.out.println("tentang hewan \n");
                    
            switch (noSoal)
            {
                
                case 0:
                    System.out.println("bobot nilai kesalahan = -25 poin");
                    System.out.println("hewan yang hidup di malam hari di sebut ?");
                    user.setJawabanUser(huudz.nextLine());
                    if ( user.getJawabanUser().equalsIgnoreCase("nokturnal") || user.getJawabanUser().equalsIgnoreCase("hewan nokturnal"))
                    {
                        a = true;
                        // System.out.println("benar");
                        keteranganSoal(user,a);
                        
                    }
                    else
                    {
                        a = false;
                        //System.out.println("salah");
                        keteranganSoal(user,a);
                    }
                    System.out.println("Jumlah Point Anda Sekarang adalah "+ user.getNilai());
                    
                    break;
                 case 1:
                    System.out.println("bobot nilai kesalahan = -25 poin");
                    System.out.println("kucing yang paling bringas adalah ?");
                    user.setJawabanUser(huudz.nextLine());
                    if (user.getJawabanUser().equalsIgnoreCase("kucing oren") || user.getJawabanUser().equalsIgnoreCase("kucing jingga") || user.getJawabanUser().equalsIgnoreCase("singa") || user.getJawabanUser().equalsIgnoreCase("macan") || user.getJawabanUser().equalsIgnoreCase("oren") || user.getJawabanUser().equalsIgnoreCase("jingga") )
                    {
                        a = true;
                         //System.out.println("benar");
                        keteranganSoal(user,a);
                        
                    }
                    else
                    {
                        a = false;
                        //System.out.println("salah");
                        keteranganSoal(user,a);
                    }
                    System.out.println("Jumlah Point Anda Sekarang adalah "+ user.getNilai());
                    
                    break;
                    
                 case 2:
                    System.out.println("bobot nilai kesalahan = -25 poin");
                    System.out.println(" jika hewan ini terbang, maka sisi rumah akan porak-poranda. Apakah nama hewan itu ?"
                            + "\n a. ular"
                            + "\n b. kecoa"
                            + "\n c. Badak"
                            + "\n d. Belalang");
                    user.setJawabanUser(huudz.nextLine());
                    if (user.getJawabanUser().equalsIgnoreCase("b") || user.getJawabanUser().equalsIgnoreCase("kecoa") || user.getJawabanUser().equalsIgnoreCase("b. kecoa") || user.getJawabanUser().equalsIgnoreCase("b kecoa") || user.getJawabanUser().equalsIgnoreCase("bkecoa"))
                    {
                        a = true;
                        // System.out.println("benar");
                        keteranganSoal(user,a);
                         
                    }
                    else
                    {
                        a = false;
                        //System.out.println("salah");
                        keteranganSoal(user,a);
                    }
                    System.out.println("Jumlah Point Anda Sekarang adalah "+ user.getNilai());
                    
                    break;
                }
            }
        else if (pilihMenu == 3)
        {
            spasi();
             System.out.println("tentang Tumbuhan \n");
                    
            switch (noSoal)
            {
                
                case 0:
                    System.out.println("bobot nilai kesalahan = -25 poin");
                    System.out.println("Nama zat pemberi warna pada dau adalah?");
                    user.setJawabanUser(huudz.nextLine());
                    if ( user.getJawabanUser().equalsIgnoreCase("klorofil"))
                    {
                        a = true;
                         //System.out.println("benar");
                        keteranganSoal(user,a);
                        
                    }
                    else
                    {
                        a = false;
                        //System.out.println("salah");
                        keteranganSoal(user,a);
                    }
                    System.out.println("Jumlah Point Anda Sekarang adalah "+ user.getNilai());
                    
                    break;
                 case 1:
                    System.out.println("bobot nilai kesalahan = -25 poin");
                    System.out.println("Bagian tumbuhan yang berfungsi menyerap air");
                    user.setJawabanUser(huudz.nextLine());
                    if (user.getJawabanUser().equalsIgnoreCase("akar") || user.getJawabanUser().equalsIgnoreCase("serabur"))
                    {
                        a = true;
                         //System.out.println("benar");
                        keteranganSoal(user,a);
                        
                    }
                    else
                    {
                        a = false;
                        //System.out.println("salah");
                        keteranganSoal(user,a);
                    }
                    System.out.println("Jumlah Point Anda Sekarang adalah "+ user.getNilai());
                    
                    break;
                    
                 case 2:
                    System.out.println("bobot nilai kesalahan = -25 poin");
                    System.out.println(" Bagaimana Tanaman bisa makan ?"
                            + "\n a. Hibernasi"
                            + "\n b. Foto Sintesis"
                            + "\n c. Adaptasi"
                            + "\n d. Reboisasi");
                    user.setJawabanUser(huudz.nextLine());
                    if (user.getJawabanUser().equalsIgnoreCase("b") || user.getJawabanUser().equalsIgnoreCase("Foto Sintetis") || user.getJawabanUser().equalsIgnoreCase("b. foto sintetis") || user.getJawabanUser().equalsIgnoreCase("b foto sintetis") || user.getJawabanUser().equalsIgnoreCase("dfotosintetis") || user.getJawabanUser().equalsIgnoreCase("fotosintetis"))
                    {
                        a = true;
                         //System.out.println("benar");
                        keteranganSoal(user,a);
                         
                    }
                    else
                    {
                        a = false;
                        //System.out.println("salah");
                        keteranganSoal(user,a);
                    }
                    System.out.println("Jumlah Point Anda Sekarang adalah "+ user.getNilai());
                    
                    break;
            }
        }
        else if (pilihMenu == 4)
        {
            spasi();
             System.out.println("Komputer \n");
                    
            switch (noSoal)
            {
                
                case 0:
                    System.out.println("bobot nilai kesalahan = -25 poin");
                    System.out.println("keyboard termasuk ke dalam .......... device ?");
                    user.setJawabanUser(huudz.nextLine());
                    if ( user.getJawabanUser().equalsIgnoreCase("input") || user.getJawabanUser().equalsIgnoreCase("masuk"))
                    {
                        a = true;
                         //System.out.println("benar");
                        keteranganSoal(user,a);
                        
                    }
                    else
                    {
                        a = false;
                        //System.out.println("salah");
                        keteranganSoal(user,a);
                    }
                    System.out.println("Jumlah Point Anda Sekarang adalah "+ user.getNilai());
                    
                    break;
                 case 1:
                    System.out.println("bobot nilai kesalahan = -25 poin");
                    System.out.println("Apakah HTML adalah Bahasa Pemrograman ?");
                    user.setJawabanUser(huudz.nextLine());
                    if (user.getJawabanUser().equalsIgnoreCase("tidak") || user.getJawabanUser().equalsIgnoreCase("enggak") || user.getJawabanUser().equalsIgnoreCase("bukan") || user.getJawabanUser().equalsIgnoreCase("kaga"))
                    {
                        a = true;
                         //System.out.println("benar");
                        keteranganSoal(user,a);
                        
                    }
                    else
                    {
                        a = false;
                        //System.out.println("salah");
                        keteranganSoal(user,a);
                    }
                    System.out.println("Jumlah Point Anda Sekarang adalah "+ user.getNilai());
                    
                    break;
                    
                 case 2:
                    System.out.println("bobot nilai kesalahan = -25 poin");
                    System.out.println(" Bagian Komputer yang berfungsi sebagai penyimpanan data sementara untuk numpang lewat adalah ?"
                            + "\n a. RAM"
                            + "\n b. REM"
                            + "\n c. ROM"
                            + "\n d. Gelas");
                    user.setJawabanUser(huudz.nextLine());
                    if (user.getJawabanUser().equalsIgnoreCase("a") || user.getJawabanUser().equalsIgnoreCase("ram") || user.getJawabanUser().equalsIgnoreCase("a. ram") || user.getJawabanUser().equalsIgnoreCase("a ram") || user.getJawabanUser().equalsIgnoreCase("aram"))
                    {
                        a = true;
                         //System.out.println("benar");
                        keteranganSoal(user,a);
                         
                    }
                    else
                    {
                        a = false;
                        //System.out.println("salah");
                        keteranganSoal(user,a);
                    }
                    System.out.println("Jumlah Point Anda Sekarang adalah "+ user.getNilai());
                    
                    break;
             }
        
       }
    }
    
    public static void spasi ()
    {
    
        System.out.println("\n\n\n");
    
    }
 
    
   
}


