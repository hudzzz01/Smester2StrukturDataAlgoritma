"""
Program Pengecek Phisikopat
By	: M.Hudzaifah Assyahid
Date : 25 Maret 2020
Support us : hdzzzzzz01@gmail.com


"""

import os

os.system('cls')  # For Windows
os.system('clear')  # For Linux/OS X


print("\n\n\n        Selamat Datang Di Program Cek Phisikopat Hudzzzz \n              about me : hdzzzzzz01@gmail.com \n   Sebelum mulai saya 'hudzzz' sendiri ingin berkenalan dengan anda.\n ")

nama = input("Silahkan Masukan nama anda : ")

while nama is "" or nama is " ":
	print("\n Nama Tidak boleh Kosong")
	nama = input("Silahkan Masukan nama anda : ")
if len(nama) < 5:
	print(" Nama yang Pendek")
elif len(nama) > 5 and len(nama) <= 10 :
	print(" Nama yang bagus")
else:
	print(" Nama anda panjang juga ya ...")

kelamin = input("Silahkan Jenis Kelamin anda : ")

while kelamin is "" or kelamin is " ":
	print("\n Jenis Kelamin Tidak boleh Kosong")
	kelamin = input("Silahkan Masukan jenis kelamin anda : ")


print("\n Baiklah ayo kita mulai, di sini saya akan memberikan beberapa pertanyaan kepada anda. \n\n Tolong anda jawab dengan jujur untuk memperoleh hasil yang akurat \n"
	+ "Pertanyaan pertama :\n"
	+ "Anda berada di sebuah toko kantong plastik kresek untuk membelinya. dan di toko itu hanya tersedia plastik kresek sebagai berikut :"
	+ "\n    1.Plastik Kresek Berwarna Merah."
	+ "\n    2.Plastik Kresek Berwarna Putih."
	+ "\n    3.Plastik Kresek Berwarna Bening."
	+ "\n    4.Plastik Kresek Berwarna Hitam."
	+ "\n\n Plastik berwana apakah yang akan anda beli ?, Merah, Putih, Bening Atau Hitam ?")
jawaban = input("saya pilih warna : ")
nilai = 2
print(jawaban)
nilai = 0
if jawaban == "bening" or jawaban == "Bening" or jawaban == "BENING" or jawaban == "plastik bening" or jawaban == "Plastik Bening" or jawaban == "PLASTIK BENING" or jawaban == "Plastik kresek bening" or jawaban == "plastik kresek bening" or jawaban == "PLASTIK KRESEK BENING" or jawaban == "Plastik kresek berwarna bening" or jawaban == "plastik kresek berwarna bening" or jawaban == "PLASTIK KRESEK BERWARNA BENING":
	nilai +=1
else:
	nilai

#print(nilai)

print("\n"
	+ "Pertanyaan Kedua :\n"
	+ "Anda Berada Di sebuah toko pisau dan melihat berbagai jenis pisau sebagai berikut :"
	+ "\n    1.Pisau Panjang ukuran besar."
	+ "\n    2.Pisau Pendek ukuran besar."
	+ "\n    3.Pisau Panjang ukuran kecil"
	+ "\n    4.Pisau pendek ukuran kecil."
	+ "\n\n Pisau apakah yang akan anda beli ?, Panjang ukuran besar, Pendek ukuran besar, Panjang ukuran kecil Atau Pendek ukuran kecil ?")
jawaban = input("saya pilih  : ")
print(jawaban)
if jawaban == "Pendek ukuran kecil" or jawaban == "pendek ukuran kecil" or jawaban == "PENDEK UKURAN KECIL" or jawaban == "Pisau pendek ukuran kecil" or jawaban == "Pisau pendek ukuran kecil" or jawaban == "PISAU PENDEK UKURAN KECIL":
	nilai +=1
else:
	nilai

#print(nilai)

print("\n"
	+ "Pertanyaan Ketiga :\n"
	+ "Anda sedang bercermin lalu anda merasa kurang tampan/cantik apa yang yang sebenarnya terjadi ? :"
	+ "\n    1.Ada luka di wajah anda."
	+ "\n    2.rambut saya kurang rapih."
	+ "\n    3.Ada yang salah dengan cermin ini"
	+ "\n    4.saya memang terlahir begini"
	+ "\n\n Apakah yang ada di pikiran anda ? adaluka di wajah anda, rambut kurang rapih, ada yang salah dengan cermin ini, atau saya memang terlahir begini ?")
jawaban = input("saya pilih : ")
print(jawaban)
if jawaban == "Ada yang salah dengan cermin ini" or jawaban == "ada yang salah dengan cermin ini" or jawaban == "ADA YANG SALAH DENGAN CERMIN INI" or jawaban == "cerminya salah" or jawaban == "CERMINYA SALAH" or jawaban == "Cerminya salah" or jawaban == "Salah cermin" or jawaban == "SALAH CERMIN" or jawaban == "salah cermin":
	nilai +=1
else:
	nilai

#print(nilai)
print("\n"
	+ "Pertanyaan KeMmpat :\n"
	+ "Anda sedang duduk di kamar lantai 2. lalu melihat dari jendela ada pembunuh bayaran yang masuk lewat pintu depan apa yang anda lakukan"
	+ "\n    1.Berdo'a."
	+ "\n    2.Menghapus History Browser."
	+ "\n    3.Bersembunyi di dalam lemari"
	+ "\n    4.Bersembunyi di belakang pintu."
	+ "\n\n apa yang akan ada lakukan ??, berdo'a,menghapus history browser, bersembunyo di dalam lemari atau bersembunyi di balik pintu")
jawaban = input("saya akan lakukan lakukan : ")
print(jawaban)
if jawaban == "Bersembunyi di belakang pintu" or jawaban == "bersembunyi di belakang pintu" or jawaban == "BERSEMBUNYI DI BELAKANG PINTU" or jawaban == "Belakang pintu" or jawaban == "belakang pintu" or jawaban == "BELAKANG PINTU":
	nilai +=1
else:
	nilai

#print(nilai)

hasil = nilai/4 *100

os.system('cls')  # For Windows
os.system('clear')  # For Linux/OS X

print("\n\n Hasilnya adalah :"
	+ "\n Nama : " + nama + " \n"
	+ "Jenis Kelamin : " + kelamin + " \n" )
selesai = " {} persen psikopat \n\n"

print(selesai.format(hasil))

if hasil > 50.0:
	print("Hati-Hati Anda berpotensi Menjadi psikopat")
elif hasil == 50.0:
	print("Ada sedikit potensi menjadi psikopat")
else:
	print("Selamat anda sehat")






