package Java_fundemintals;
//استخدمنا تو سترينغ عشان نطبع الانستانس وهدا محور الموضوع كله 
//الخلاصة هي عملية set and get
//https://www.youtube.com/watch?v=d08oJlwVgyo&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=91
//انشانا 3 كلاسات واحد سوبر واتنين ساب كلاس
//السوبر كلاس (شو1)انشانا داخله كونستراكتور سيت ميثود لقيمتين براند وسايز
//الساب كلاس انشانا فيه قيمة جديدة وعملنا اكستند للسوبر كلاس وعملناله كونستراكتور للقيمه الجديدة 
//الحلو في الموضوع انه اجباري واوتوماتيك اضيف القيم الموجودة من السوبر كلاس
//انشانا جيت ميثود مع ريتيرن واستخدمنا toString() 
//استخدمنا تو سترينغ عشان نطبع الانستانس وهدا محور الموضوع كله 
//وانشانا ساب كلاس ثالث وكذلك اضفناله قيمة مختلفة وعملنالع كونستراكتر ببقيمة الجديدة
//في الماين كلاس عملنا اوبجيكت وادخنا فيه القيم لانه كونستراكتور 
//
//وعملت ميثود ثالثة اسمها بير3 عشان تاخد خصائص الساب كلاس3 رانينغ

class shoe1 {

	 String brand ;
	 double size;
	//set methd
	shoe1(String brand ,double size ){
		this.brand=brand;
		this.size=size;
		
	}
}
class walking1 extends shoe1 {
   boolean goreTex;
   
   //set method for the constructor
	walking1(String brand, double size, boolean goreTex) {
		super(brand, size);
		this.goreTex=goreTex;
	}
	//get method using toString()method
	public String toString() {
		return brand + " " + size + " " + goreTex ;}
}

class running1 extends shoe1{
   double weight;
	running1(String brand, double size,  double weight) {
		super(brand, size);
		this.weight=weight;
	}
	public String toString() {
		return brand + " " + size + " " + weight;
		}
	
}

public class to_String_method {

	public static void main(String[] args) {
		//call the method by the instance w1 and print it using the instance because toString
		walking1 w1=new walking1("nike", 10, true);
		System.out.println(w1);
		
		walking1 w2=new walking1("Adiddas", 5, false);
		System.out.println(w2);

		walking1 r1=new walking1("pomma", 9, false);
		System.out.println(r1);
	}

}
