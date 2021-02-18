package FinalOdevi;

import java.io.*;
import java.util.Scanner;

import java.util.ArrayList;

//D�LARA SEV�M POLAT 19010011064
public class AnaSayfa {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		String kursAd, kursiyerAdSoyad;

		ArrayList<Kursiyer> a = new ArrayList<Kursiyer>();
		ArrayList<Kurs> b = new ArrayList<Kurs>();
		ArrayList<Kursiyer> kursiyerler = new ArrayList<Kursiyer>();
		ArrayList<Kurs> Kurslar = new ArrayList<Kurs>();
		int kursId, kursiyerId, kursiyerYas;

		File f1 = new File("kursiyer.txt");
		FileReader fr1 = new FileReader(f1);
		BufferedReader br1 = new BufferedReader(fr1);
		String line1;

		String[] out1 = {};
		String out2;
		char ilk = '#';
		char son = '*';
		int[] k = new int[50];// Bunu olusturma nedenim her bir kursiyerin kac kurs sahip oldugunu ogrenmek.
		int syc = 0;
		int syc2 = 0;
		while ((line1 = br1.readLine()) != null) {
			out1 = line1.split("-");
			if (ilk == out1[0].charAt(0)) {
				out2 = out1[0].substring(1);
				for (int i = 0; i < out1.length - 2; i++) {
					kursiyerId = Integer.parseInt(out2);
					kursiyerAdSoyad = out1[i + 1];
					kursiyerYas = Integer.parseInt(out1[i + 2]);
					Kursiyer kursiyer1 = new Kursiyer(kursiyerId, kursiyerAdSoyad, kursiyerYas);
					a.add(kursiyer1);

				}
				k[syc2] = syc;
				syc = 0;
				syc2++;
			}

			if (son == out1[0].charAt(0)) {
				out2 = out1[0].substring(1);
				for (int i = 0; i < out1.length - 1; i++) {
					kursId = Integer.parseInt(out2);
					kursAd = out1[i + 1];
					Kurs kurs1 = new Kurs(kursId, kursAd);
					b.add(kurs1);
				}
				syc++;
				k[syc2] = syc;// burada yazmam�n nedeni son kurs say�s�n� ogrenmek cunku kursiyer icinde
								// sadece yazd�g�mda son kursiyerin kurs say�s�n� alam�yorum
			}
		}

		fr1.close();

		int tut = 0, tut1 = 0;
		for (Kursiyer c : a) {
			Kursiyer kursiyer = new Kursiyer(c.getKursiyerId(), c.getKursiyerAdSoyad(), c.getKursiyerYas());
			tut1++;
			tut = 0;
			for (Kurs m : b) {
				Kurs kurslar = new Kurs(m.getKursId(), m.getKursAd());
				kursiyer.alinanKurslar.add(kurslar);
				tut++;
				if (k[tut1] == tut) {// eger kursiyerin kurs say�s�na ulas�rsa o �ndekse kadar olan bilgileri
										// siliyorum bastan basl�y�nca tekrar ayni bilgileri gostermesini engellemek
					for (int f = 0; f < tut; f++) {
						b.remove(0);
					}
					break;
				}
			}
			kursiyerler.add(kursiyer);
		}

		File f = new File("kurs.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String line;
		String[] out = {};
		while ((line = br.readLine()) != null) {
			out = line.split("-");
			for (int i = 0; i < out.length - 1; i++) {
				kursId = Integer.parseInt(out[i]);
				kursAd = out[i + 1];
				Kurs kurs = new Kurs(kursId, kursAd);
				Kurslar.add(kurs);

			}
		}

		fr.close();

		int secenek;
		System.out.println("*************************  MEN�  *****************************");
		while (true) {
			System.out.println("1-Kurs Ekle()\n2-Kurs Listeleme()\n3-Kursiyer Ekle()\n"
					+ "4-Kursiyer Arama(kursiyerAdSoyad)\n5-Kursiyer Sil(kursiyerId)\n6-Kursiyer Listele()\n"
					+ "7-Kursiyer Ayr�nt�l� Listele()\n8-Kursiyerin �deyece�i Tutar Hesaplama(kursiyerId)\n"
					+ "9-Bitir()\nBir secenek giriniz:");
			secenek = scan.nextInt();

			if (secenek == 1) {
				int kurs�d;
				String kursad;
				while (true) {
					int sayac = 0;
					System.out.println("Kurs Id giriniz:");
					kurs�d = scan.nextInt();
					for (Kurs krs : Kurslar) {
						if (kurs�d == krs.getKursId()) {
							System.out.println("Lutfen farkl� bir Id giriniz!Girdiginiz Id kullan�lmaktad�r.");
							sayac++;
							break;
						}
					}
					if (sayac == 0) {
						System.out.println("Kurs Ad� giriniz:");
						kursad = scan.next();
						Kurs kurs = new Kurs(kurs�d, kursad);
						Kurslar.add(kurs);
						break;
					}
				}
			}

			else if (secenek == 2) {
				System.out.println("Kurs Id - Kurs Ad�");
				for (Kurs krs : Kurslar) {
					System.out.println(krs.getKursId() + " " + krs.getKursAd());
				}
				System.out.println();
			} else if (secenek == 3) {
				int ksyId, ksyYas, ksId;
				String ksyAdSoyad, ksAd;
				while (true) {
					int sayac = 0;
					System.out.println("Kursiyer Id giriniz:");
					ksyId = scan.nextInt();

					for (Kursiyer krsy : kursiyerler) {
						if (ksyId == krsy.getKursiyerId()) {
							System.out.println("Lutfen farkl� bir Id giriniz!Girdiginiz Id kullan�lmaktad�r.");
							sayac++;
							break;
						}
					}
					if (sayac == 0) {
						break;

					}
				}
				int kursSay;
				System.out.println("Kursiyer Ad�Soyad giriniz:");
				scan.nextLine();
				ksyAdSoyad = scan.nextLine();
				System.out.println("Kursiyer Ya� giriniz:");
				ksyYas = scan.nextInt();
				Kursiyer kursiyer = new Kursiyer(ksyId, ksyAdSoyad, ksyYas);
				System.out.println("Kurs say�s� giriniz:");
				kursSay = scan.nextInt();
				int[] kursIDtut = new int[kursSay];//kurs eklerken ayn� �d giremyi engelemek icin olusturdum
				int indis = 0;
				for (int i = 0; i < kursSay; i++) {
					while (true) {
						int sayac1 = 0;
						System.out.println("Kurs Id giriniz:");
						ksId = scan.nextInt();
						for (Kursiyer krsy : kursiyerler) {
							for (Kurs krs : krsy.alinanKurslar) {
								if (ksId == krs.getKursId()) {
									System.out.println("Lutfen farkl� bir Id giriniz! Girdi�iniz Id kullan�lmaktad�r.");
									sayac1++;
									break;
								}
							}
							if (sayac1 != 0)
								break;
						}
						for (int liste : kursIDtut) {
							if (liste == ksId) {
								System.out.println("Lutfen farkl� bir Id giriniz! Girdi�iniz Id kullan�lmaktad�r.");
								sayac1++;
								break;
							}

						}

						if (sayac1 == 0) {
							System.out.println("Kurs Ad� giriniz:");
							ksAd = scan.next();
							kursIDtut[indis] = ksId;
							indis++;
							Kurs kurs = new Kurs(ksId, ksAd);
							kursiyer.alinanKurslar.add(kurs);
							break;
						}

					}
				}
				kursiyerler.add(kursiyer);
			}

			else if (secenek == 4) {

				String aranacak;
				int sayac = 0;
				System.out.println("Aranacak KursiyerAdSoyad giriniz:");
				scan.nextLine();
				aranacak = scan.nextLine();
				for (Kursiyer krsy : kursiyerler) {
					if (aranacak.equals(krsy.getKursiyerAdSoyad())) {
						System.out.println(
								krsy.getKursiyerId() + " " + krsy.getKursiyerAdSoyad() + " " + krsy.getKursiyerYas());
						for (Kurs krs : krsy.alinanKurslar) {
							System.out.println("\t" + krs.getKursId() + " " + krs.getKursAd());
						}
						sayac++;
						break;
					}
				}
				if (sayac == 0) {
					System.out.println("�zg�n�m:( Arad���n�z Kursiyer bulunamad�.");
					System.out.println();
				}

			}

			else if (secenek == 5) {

				int aranan, sayac = 0;
				System.out.println("Aranacak Kursiyer Id giriniz:");
				aranan = scan.nextInt();
				for (Kursiyer krsy : kursiyerler) {
					if (aranan == krsy.getKursiyerId()) {
						System.out.println(krsy.getKursiyerAdSoyad() + "" + "Kursu Listeden Siliniyor.");
						System.out.println();
						kursiyerler.remove(krsy);
						sayac++;
						break;
					}
				}
				if (sayac == 0) {
					System.out.println("�zg�n�m:(Girdiginiz Id'den Kursiyer bulunamad�.");
					System.out.println();
				}

			}

			else if (secenek == 6) {

				System.out.println("-T�m Kursiyerler-");
				for (Kursiyer krsy : kursiyerler) {
					System.out.println(
							krsy.getKursiyerId() + " " + krsy.getKursiyerAdSoyad() + " " + krsy.getKursiyerYas());
				}
				System.out.println();
			}

			else if (secenek == 7) {

				System.out.println("T�m Kursiyerler ve Ald�klar� Kurslar");
				for (Kursiyer krsy : kursiyerler) {
					System.out.println(
							krsy.getKursiyerId() + " " + krsy.getKursiyerAdSoyad() + " " + krsy.getKursiyerYas());
					for (Kurs krs : krsy.alinanKurslar) {
						System.out.println("\t" + krs.getKursId() + " " + krs.getKursAd());
					}
					System.out.println();
				}
			}

			else if (secenek == 8) {

				int aranan, sayac = 0, sayac1 = 0, kampanya = 0, hesap = 400;
				System.out.println("Kursiyerin �deyece�i Tutar� Hesaplamak i�in Kursiyer Id giriniz:");
				aranan = scan.nextInt();
				for (Kursiyer krsy : kursiyerler) {
					if (aranan == krsy.getKursiyerId()) {
						for (Kurs krs : krsy.alinanKurslar) {
							sayac1++;
						}
						if (sayac1 == 2) {
							hesap = 400 - (4 * 15);
							hesap = hesap + 400;
							kampanya = 1;
						} else if (sayac1 == 3) {
							hesap = 400 - (4 * 25);
							hesap = hesap + 800;
							kampanya = 2;
						} else if (sayac1 > 3) {
							hesap = 400 - (4 * 10);
							hesap = hesap * sayac1;
							kampanya = 3;
						}
						if (kampanya == 0) {
							System.out.println(
									"Uzgunuz:( Sadece bir kurs alan m�sterilerimiz Kampanyalarimizdan faydalanamaz...");
							System.out.println("Kursiyerin �deyece�i tutar: " + hesap);
							System.out.println();
							sayac++;
							break;
						}
						System.out.println("Tebrikler:) " + sayac1 + " Kursunuz oldu�u i�in " + kampanya
								+ ". Kampanyam�zdan faydaland�n�z...");
						System.out.println("Kursiyerin �deyece�i tutar: " + hesap);
						System.out.println();
						sayac++;
						break;
					}
				}
				if (sayac == 0) {
					System.out.println("�zg�n�m:( Girdiginiz Id'den Kursiyer bulunamad�.");
					System.out.println();
				}
			}

			else if (secenek == 9) {
				PrintWriter DosyaTemizle = null;
				DosyaTemizle = new PrintWriter(new FileOutputStream(f1));
				DosyaTemizle = new PrintWriter(new FileOutputStream(f));
				FileWriter fw = new FileWriter(f1);
				BufferedWriter bw = new BufferedWriter(fw);
				for (Kursiyer krsy : kursiyerler) {
					bw.write("#" + krsy.getKursiyerId() + "-" + krsy.getKursiyerAdSoyad() + "-" + krsy.getKursiyerYas()
							+ "\n");
					for (Kurs krs : krsy.alinanKurslar) {
						bw.write("*" + krs.getKursId() + "-" + krs.getKursAd() + "\n");
					}

				}

				bw.close();

				FileWriter fw1 = new FileWriter(f);
				BufferedWriter bw1 = new BufferedWriter(fw1);
				for (Kurs krs : Kurslar) {
					bw1.write(krs.getKursId() + "-" + krs.getKursAd() + "\n");
				}
				bw1.close();
				DosyaTemizle.close();
				System.out.println("********** MEN�DEN �IKTINIZ:( **************");
				break;

			}

		}

	}
}
