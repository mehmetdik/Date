import java.util.Scanner;


public class MyDate
{
	
	int year,month,day,Date;
	Scanner input =new Scanner(System.in);
	
	public void setYear(int year) 
	{
		
		
		while(year<0) // yılın 0 dan küçük girmesi durumunda hata verip girişin yapılmasını tekrardan isteme
		{
			System.out.println("Hatalı Giris.Lütfen yılı tekrar giriniz=");
			year=input.nextInt();
			
		}
		this.year = year;
	}
	public int getYear()
	{
		return year;
	}
	
	
	
	public void setMonth(int month)
	{
		while(month>12 || month<0)  //Ayın 12'den büyük veya 0 'dan küçük  girilmesi durumunda hata verip tekrar girişin istenmesi
		{
			System.out.println("Hatalı Giris.Lütfen Ayı tekrar giriniz=");
			month=input.nextInt();
		}
		
		
			this.month = month;
		
	}
	public int getMonth()
	{
		return month;
	}
	
	
	
	public void setDay(int day)
	{
		while (day<1 || day>31) //Günün 1'den küçük veya 31'den büyük girilmesi durumunda olucaklar.
		{
			System.out.println("Hatalı Giris.Lütfen Günü tekrar giriniz=");
			day=input.nextInt();
			
		}
		
			this.day = day;
		
		
	}
	public int getDay() 
	{
		return day;
	}

	public String getDate()
	{
		String day=Integer.toString(getDay());//girilen günü strin ifadeye cevirir
		String year=Integer.toString(getYear());
		if (getMonth()==1)	//kullanıcının girdiği satı ifadeierini ay  isimlerine çevirme.
		{
			String month="ocak";
			return (day+ " "+month+" "+year);
		}
		else if (getMonth()==2)
		{
			String month="Subat";
			return (day+ " "+month+" "+year);
		}
		else if (getMonth()==3)
		{
			String month="Mart";
			return (day+ " "+month+" "+year);
		}
		else if (getMonth()==4)
		{
			String month="Nisan";
			return (day+ " "+month+" "+year);
		}
		else if (getMonth()==5)
		{
			String month="Mayıs";
			return (day+ " "+month+" "+year);
		}
		else if (getMonth()==6)
		{
			String month="Haziran";
			return (day+ " "+month+" "+year);
		}
		else if (getMonth()==7)
		{
			String month="Temmuz";
			return (day+ " "+month+" "+year);
		}
		else if (getMonth()==8)
		{
			String month="Ağustos";
			return (day+ " "+month+" "+year);
		}
		else if (getMonth()==9)
		{
			String month="Eylül";
			return (day+ " "+month+" "+year);
		}
		else if (getMonth()==10)
		{
			String month="Ekim";
			return (day+ " "+month+" "+year);
		}
		else if (getMonth()==11)
		{
			String month="Kasım";
			return (day+ " "+month+" "+year);
		}
		else if (getMonth()==12)
		{
			String month="Aralık";
			return (day+ " "+month+" "+year);
		}
		else 
			System.out.println("Hatalı giris");
		
		
		return "";
	}
	
	public boolean isBigger(MyDate a,MyDate b)  //2 tarihi karşılaştırır ve bollen değer dönderir
	{
		if (a.getYear()>b.getYear())
		{
		return true;	
		}
		else if (a.getYear()==b.getYear() && a.getMonth()>b.getMonth() )
		{
			return true;
		}
		else if (a.getYear()==b.getYear() && a.getMonth()==b.getMonth() && a.getDay()>b.getDay() )
		{
			return true;
		}
		
		else 
		{
			return false;
		}
		
	}
}
