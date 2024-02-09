package shoes;
//https://www.youtube.com/watch?v=iV-rrFETXjY&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=88
//الخلاصة هي عملية set and get
//انشانا 3 كلاسات واحد سوبر واتنين ساب كلاس
//السوبر كلاس (شو)انشانا داخله كونستراكتور سيت ميثود لقيمتين براند وسايز
//الساب كلاس انشانا فيه قيمة جديدة وعملنا اكستند للسوبر كلاس وعملناله كونستراكتور للقيمه الجديدة 
//الحلو في الموضوع انه اجباري واوتوماتيك اضيف القيم الموجودة من السوبر كلاس
//وانشانا ساب كلاس ثالث وكذلك اضفناله قيمة مختلفة وعملنالع كونستراكتر ببقيمة الجديدة
//في الماين كلاس استدعينا الكونستراكتر في ميثود جديدة وسميتها باير1 وباير2 عشان فقط ياخدو القيم في الساب كلا الاول
//وعملت ميثود ثالثة اسمها بير3 عشان تاخد خصائص الساب كلاس3 رانينغ
public class main_class {

	public static void main(String[] args) {
		//using toString Method 
		//https://www.youtube.com/watch?v=d08oJlwVgyo&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=91
		//شوف بفندمنتال تة سترينغ ميثود
		walking w1=new walking("nike", 10, true);
		System.out.println(w1);
		
		walking w2=new walking("Adiddas", 5, false);
		System.out.println(w2);

		walking r1=new walking("pomma", 9, false);
		System.out.println(r1);

		
	pair1();
	pair2();
	pair3();
		
	}
	static void pair1() {
	walking w=new walking("nike", 10, true);
	System.out.println(w.brand +" " + w.size + " "+w.goreTex);

		
	}	
	static void pair2() {
    walking w=new walking("addidas", 9, false);
	System.out.println(w.brand +" " + w.size +" " + w.goreTex);


		
	}
	static void pair3() {
	running r=new running("nike", 11, 45);
	System.out.println(r.brand +" " + r.size +" " + r.weight);


	}


}
