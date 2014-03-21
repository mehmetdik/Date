import java.util.Scanner;


public class MyDateTest 
{
	public static void main(String[] args)
	{
		try {


			int year,month,day,kek;
			Scanner scan=new Scanner(System.in);
			MyDate d1=new MyDate(); //d1 diye bir tarih obje  oluşturuyoruz.
			MyDate d2=new MyDate();//d2 diye ikinci tarih objesini oluşturuyoruz

			System.out.print("Day(Date1)=");
			d1.setDay(scan.nextInt());	//Girilen değeri 1.tarihin gününe atar.
			System.out.print("Month(Date1)=");
			d1.setMonth(scan.nextInt());
			System.out.print("Year(Date1)=");
			d1.setYear(scan.nextInt());

			System.out.println(d1.getDate());

			System.out.print("Day(Date2)=");
			d2.setDay(scan.nextInt());//Girilen değeri 2.tarihin gününe atar.
			System.out.print("Month(Date2)=");
			d2.setMonth(scan.nextInt());
			System.out.print("Year(Date2)=");
			d2.setYear(scan.nextInt());

			System.out.println(d2.getDate());

			if(d1.isBigger(d1, d2))//Karşılaştırma
			{
				System.out.println("Girdiğiniz ilk tarih diğerinden büyük");
			}
			else if (d1.isBigger(d2, d1))
			{
				System.out.println("Girdiğiniz ilk tarih diğerinden küçük");
			}
		} 
		catch (Exception e)
		{
			System.out.println("Hatalı Giriş");
			main(args);
		}
	}
}
