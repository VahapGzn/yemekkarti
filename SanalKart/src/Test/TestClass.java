package Test;

import java.util.Random;
import java.util.Scanner;

import yemekPaketi.Address;
import yemekPaketi.YemekKarti;

public class TestClass {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 int a=0;
		 String b;
		 String c;
		 String d;
		 String e;
		 
		 System.out.println("ONCE BiR HESAP OLUSTURUNUZ");
		 System.out.println();
		System.out.println("isim degerini giriniz");
		b = in.nextLine();
		
		System.out.println("soyisim degerini giriniz");
		c = in.nextLine();
		
		System.out.println("ilce adres bilgisini giriniz");
		d = in.nextLine();
		
		System.out.println("mahalle adres bilgisini giriniz");
		e = in.nextLine();
		
		Address adrs = new Address(d,e);
		
		 System.out.println("lutfen id degerini giriniz");
		 
			
		try { if(in.hasNextInt()) {
			 a= in.nextInt();}else {
				 a=new Random().nextInt(1000);
				 System.out.println("id degeri otomotik girildi");
			 }
			 
			 }catch(Exception ex) {
				 
				 a=new Random().nextInt(1000);
				 System.out.println("id degeri otomotik girildi");
			 }
		
		YemekKarti k1= new YemekKarti(a,b,c,adrs);
		System.out.println("TL yuklemek istermisiniz E/H ?");
		Scanner inn = new Scanner(System.in);
		
			switch (inn.nextLine()) {
			case "E":
			case "e":
				System.out.println("TL tutarInI Girin");	
					try {
						
					           if(inn.hasNextInt()) {
							k1.amount=inn.nextInt();
							}else {
								System.out.println("TL tutari 100 tl olarak belirlendi.");
							}
						
					}catch (Exception ex) {
						System.out.println("TL tutari 100 tl olarak belirlendi.");
						}
					break;
			
			case "H":
			case "h":
			default:
				System.out.println("TL tutari 100 tl olarak belirlendi.");
				break;
			}
			
		           
		
		
   k1.display();

System.out.println();
System.out.println();

System.out.println("SiMDi ALISVERiS YAPABiLiRSiNiZ");
System.out.println();
k1.yemekList();
Scanner ing =new  Scanner(System.in);
try { while (true) {int n=ing.nextInt();
 if(n>k1.amount) {
	 System.out.println("BAKiYE YETERSiZ YUKLENECEK TUTARI GiRiNiZ");
	 k1.amount+=ing.nextInt();
	 System.out.println("YENi BAKiYE : "+k1.amount);
 }else {
	 
switch(n) {
case 1:
	k1.amount -=3;
	System.out.println("KALAN : "+k1.amount+" TL");
	break;
case 2:
	k1.amount -=3;
	System.out.println("KALAN : "+k1.amount+" TL");
	break;
case 3:
	k1.amount -=5;
	System.out.println("KALAN : "+k1.amount+" TL");
	break;
case 4:
	k1.amount -=6;
	System.out.println("KALAN : "+k1.amount+" TL");
	break;
case 5:
	k1.amount -=9;
	System.out.println("KALAN : "+k1.amount+" TL");
	break;
case 6:
	k1.amount -=15;
	System.out.println("KALAN : "+k1.amount+" TL");
	break;
case 7:
	k1.amount -=10;
	System.out.println("KALAN : "+k1.amount+" TL");
	break;
case 8:
	k1.amount -=7;
	System.out.println("KALAN : "+k1.amount+" TL");
	break;
case 9:
	k1.amount -=5;
	System.out.println("KALAN : "+k1.amount+" TL");
	break;
case 10:	
	k1.amount -=9;
	System.out.println("KALAN : "+k1.amount+" TL");
	break;
	default:
		System.out.println("GECERSiZ DEGER ALISVERiS TAMAMLANDI");
		break;
}
 }}

}catch(Exception ex) {
	System.out.println("GECERSiZ DEGER ALISVERiS TAMAMLANDI");
}
}

	}
