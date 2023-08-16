import java.util.Scanner;
public class Main {
	
	static void plus() {
		Scanner inp = new Scanner(System.in);
		int i=1,result=0,number;
		
		while (true) {
			System.out.print(i++ +".Sayi: ");
			number = inp.nextInt();
			result+=number;
			
			if (number==0) {
				break;
			}
		}
		System.out.print("Sonuc: "+result);
	}		
	static void minus() {
		int result=0,number = 0,count;
		Scanner inp = new Scanner(System.in);
		System.out.print("Kac Sayi Girmek Istiyorsunuz: ");
		count = inp.nextInt();
		
		for (int i = 1; i <= count; i++) {
			System.out.print(i+".Sayi: ");
			number=inp.nextInt();
			if (i == 1) {
				result+=number;
				continue;
			}
			result-=number;
		}
			
		System.out.print("Sonuc: "+result);	
	}
	static void times() {
		int result=1,number = 0,count;
		Scanner inp = new Scanner(System.in);
		System.out.print("Kac Sayi Girmek Istiyorsunuz: ");
		count = inp.nextInt();
		
		for (int i = 1; i <= count; i++) {
			System.out.print(i+".Sayi: ");
			number=inp.nextInt();
			if (i == 0) {
				result=0;
				break;
			}
			result*=number;
		}
			
		System.out.print("Sonuc: "+result);	
	}
	static void divided() {
		double result=0,number = 0;
		int count;
		Scanner inp = new Scanner(System.in);
		System.out.print("Kac Sayi Girmek Istiyorsunuz: ");
		count = inp.nextInt();
		
		for (int i = 1; i <= count; i++) {
			System.out.print(i+".Sayi: ");
			number=inp.nextDouble();
			if (i != 1 && number == 0) {
				System.out.print("Boleni Sifir Giremezsiniz!");;
				continue;
			}
			if (i == 1) {
				result = number;
				continue;
			}
			result/=number;
		}
			
		System.out.print("Sonuc: "+result);	
	}
	static void power() {
		int result=1,base,exponent;
		Scanner inp = new Scanner(System.in);
		System.out.print("Taban Degerini Giriniz: ");
		base = inp.nextInt();
		System.out.print("Us Degerini Giriniz: ");
		exponent=inp.nextInt();
		
		for (int i = 1; i <= exponent; i++) {
			result*=base;
		}
			
		System.out.print("Sonuc: "+result);	
	}
	static void factorial() {
		int result=1,number;
		Scanner inp = new Scanner(System.in);
		System.out.print("Sayi Giriniz: ");
		number = inp.nextInt();
		
		for (int i = 1; i <= number; i++) {
			result*=i;
		}
		System.out.print("Sonuc: "+result);
		}
	static void mod() {
		int result=0,n1,n2;
		Scanner inp = new Scanner(System.in);
		System.out.print("n1 Sayisini Giriniz: ");
		n1 = inp.nextInt();
		System.out.print("n1 Sayisini Giriniz: ");
		n2 = inp.nextInt();
		
		result=n1%n2;
		System.out.print("Sonuc: "+result);
		
		}
	static void rectangle() {
		int alan=0,cevre,a,b;
		Scanner inp = new Scanner(System.in);
		System.out.println("Kenar Sayisini Giriniz: ");
		a = inp.nextInt();
		System.out.println("Kenar Sayisini Giriniz: ");
		b = inp.nextInt();
		
		alan = a*b;
		cevre = 2*(a+b);
		
		
		System.out.println("Dikdortgenin alani: "+alan+"\n"+"Dikdortgenin Cevresi: "+cevre);
		}	
	

	public static void main(String[] args) {
		int select;
		Scanner inp = new Scanner(System.in);
		String menu = "\n1- Toplama Islemi\n"
				+ "2- Cikarma Islemi\n"
				+ "3- Carpma Islemi\n"
				+ "4- Bolme Islemi\n"
				+ "5- Uslu Sayi Hesaplama\n"
				+ "6- Faktoriyel Hesaplama\n"
				+ "7- Mod Alma\n"
				+ "8- Dikdortgen Alan ve Cevre Hesabi\n"
				+ "0- Cikis Yap";
	
		do {
			System.out.println(menu);
			System.out.println("Lutfen Bir Islem Seciniz: ");
			select=inp.nextInt();
			
			switch (select) {
			case 1:
				plus();
				break;
            case 2:
				minus();
				break;
            case 3:
				times();
				break;
            case 4:
				divided();
				break;
            case 5:
				power();
				break;
            case 6:
            	factorial();
	            break;
            case 7:
            	mod();
	            break;
            case 8:
            	rectangle();
	            break;
            case 0:
            	System.out.println("Cikis Yaptiniz.");
	            break;

			default:
				System.out.println("Yanlis Bir deger Girdiniz, Tekrar Deneyiniz!");
				break;
			}
			
			
			
		} while (select!=0);

	}

}
