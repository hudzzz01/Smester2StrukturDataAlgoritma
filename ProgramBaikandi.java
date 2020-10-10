/*

Program 	 : Siapa dirimu
Nama 		 : Baikandi Supriatna
Tanggal Buat : 25 Maret 2020

*/



import java.util.Scanner;
import java.util.Random;

public class ProgramBaikandi
{

	public static void main (String [] args)
	{
		int baikandi = 0, baikandi2 = 1, baikandi3 = 0, jenisKelamin = 0;
		String nama = "", m = "";

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		System.out.println(" \n\n\nSelamat Datang Di Program 'Siapa Dirimu'"
						 + "\nDi sini anda akan kami trawang. Siapa Dirimu Sebenarnya"
						 + "\n\n\n Masukan Nama Anda :   ");
		do
		{
			nama = input.nextLine();
			
			if (baikandi >0)
			{
				System.out.println("Nama tidak boleh kosong");
			}

			System.out.println(nama);

			baikandi +=1;

		}
		while (nama.equalsIgnoreCase("") || nama.equalsIgnoreCase(" "));

		baikandi = 0;

		System.out.println (" masukan jenis kelamin anda : ");
		do
		{
			String baikandilll = "";
			baikandilll = input.nextLine();
			

			if (baikandilll.equalsIgnoreCase("laki-laki") || baikandilll.equalsIgnoreCase("laki") || baikandilll.equalsIgnoreCase("laki laki") || baikandilll.equalsIgnoreCase("cowo") || baikandilll.equalsIgnoreCase("pria") )
			{
				jenisKelamin = 1;
			}
			else if (baikandilll.equalsIgnoreCase("perempuan") || baikandilll.equalsIgnoreCase("cewe") || baikandilll.equalsIgnoreCase("wanita") )
			{
				jenisKelamin = 2;
			}
			if (baikandilll.equalsIgnoreCase("lainya") || baikandilll.equalsIgnoreCase("lainnya") || baikandilll.equalsIgnoreCase("other") || baikandilll.equalsIgnoreCase("tidak punya") || baikandilll.equalsIgnoreCase("transgender") )
			{
				jenisKelamin = 3;
			}

			if (baikandi > 0)
			{
				System.out.println (" masukan dengan benar tidak boleh kosong, laki-laki / laki laki / pria / cowo atau perempuan / wanita / cewe / atau lainnya \n\n\n");
			}
			System.out.println(jenisKelamin);
			baikandi +=1;

		}
		while ( jenisKelamin != 1 && jenisKelamin != 2 && jenisKelamin !=3);
		

		System.out.println("\n\nHai " + nama + "\nBaiklah Kami akan memberianda 3 pertanyaan beberapa pertanyaan. \n");

		String baikandil = "";

		baikandi = random.nextInt(3);

		System.out.println(" pertanyaan ke " + baikandi2 +
			"\n ");

			
		System.out.println (" \n\n\nJawablah dengan memasukan bilangan angka agar program ini berjalan. pertanyaanya adalah \n 'BERAPAKAH JUMLAH MANTAN ANDA SEKARANG ?'");
		m = input.nextLine();
		if(m.equalsIgnoreCase("0") )
		{
			
        }
                
		else if (m.equalsIgnoreCase("1") || m.equalsIgnoreCase("2") || m.equalsIgnoreCase("3") || m.equalsIgnoreCase("4") || m.equalsIgnoreCase("5"))
		{
			baikandi3 +=3;
		}
		else
		{
			baikandi3 +=4;
		}
		//System.out.println(baikandi3);


		System.out.println (" \n\n\njawablah dengan iya atau tidak 'Apakah anda rajin mengaji ?'");
		m = input.nextLine();
		if(m.equalsIgnoreCase("tidak"))
		{
			baikandi3 +=3;
		}
		//System.out.println(baikandi3);

		System.out.println (" \n\n\njawablah dengan jujur iya atau tidak'apakah anda taat kepada orang tua ?'");
		m = input.nextLine();
		if(m.equalsIgnoreCase("tidak"))
		{
			baikandi3 +=3;
		}
		//System.out.println(baikandi3);

		System.out.println(" \n\n\nSelamat " + nama + " menurut penerawangan kami anda adalah seorang :");
		
		//System.out.println(baikandi3);

		if (jenisKelamin != 3)
		{
			if(baikandi3 == 0 && jenisKelamin == 1)
			{
				switch(baikandi)
				{
					case 1 :
						System.out.println ("anda alim");
					break;
					case 2 :
						System.out.println ("anda ahli ibadah");
					break;
					case 3 :
						System.out.println ("anda ustadz sebenarnya");
						break;
					default:
					break;

				}
			}
			else if((baikandi3 > 0) && (baikandi3 < 8)  && (jenisKelamin == 1))
			{
				switch(baikandi)
				{
					case 0 :
					System.out.println ("cukup jahat");
					break;
					case 1 :
					System.out.println ("harus perbanyak istighfar ");
					break;
					case 2 :
					System.out.println ("cukup bar-bar");
					break;
					default :
					break;
				}
			}
			else if(baikandi3 > 8  && jenisKelamin == 1)
			{
				switch(baikandi)
				{
					case 0 :
					System.out.println ("fakboy");
					break;
					case 1 :
					System.out.println ("barbar");
					break;
					case 2 :
					System.out.println ("harus minta ampun kepada tuhan");
					break;
					default :
					break;
				}
			}
			else if(baikandi3 == 0 && jenisKelamin == 2)
			{
				switch(baikandi)
				{
					case 0 :
					System.out.println ("alim");
					break;
					case 1 :
					System.out.println ("ukkhhhttiiii");
					break;
					case 2 :
					System.out.println ("ughtea");
					break;
					default :
					break;
				}
			}
			else if(baikandi3 > 0 && baikandi3 < 8  && jenisKelamin == 2)
			{
				switch(baikandi)
				{
					case 0 :
					System.out.println ("cukup jahat");
					break;
					case 1 :
					System.out.println ("butuh perbanyak istighfar ");
					break;
					case 2 :
					System.out.println ("cukup bar-bar");
					break;
					default:
					break;
				}
			}
			else if(baikandi3 > 8 && jenisKelamin == 2)
			{
				switch(baikandi)
				{
					case 0 :
					System.out.println ("cabe-cabean");
					break;
					case 1 :
					System.out.println ("barbar");
					break;
					case 2 :
					System.out.println ("harus minta ampun kepada tuhan");
					break;
					default :
					break;
				}
			}
		
		}
		else
		{
			System.out.println(" anda manusia tanpa kelamin");
		}


	}





	



}