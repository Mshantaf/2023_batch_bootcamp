package Java_fundemintals;
//تشير الى قيمة المتغير في الكلاس الموجودة فيه كلمة ذيس ، 
//اما كلمة سوبر تشير الى البيرنت كلاس وليس التشايلد
//https://www.youtube.com/watch?v=CSWrefLneXE&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=80
// ذيس كي وورد لاتعمل مع الاستاتيك
//عشان ماتلخبط ممكن ن تغير اسماء المتغيرات 
//اذا بدك ترجع تستخدم ذيس كي وورد شيل كلمة ستاتيك الا من الماين ميثود

class try_1 {
// int a;
// int b;	 
 
 // بتغيير اسماء المتغيرات
 static int c;
 static int d;
 static void set(int a, int b) {
	 
// this.a=a;
// this.b=b;
 
 // بتغيير اسماء المتغيرات
 c=a;
 d=b;
 }	
}
public class this_keyword extends try_1 {

	public static void main(String[] args) {
		//لانه الميثود مش ستاتيك عملنا اوبجيكت
//		try_1 ob=new try_1();
//		ob.set(500, 600);
//		System.out.println(ob.a);
//		System.out.println(ob.b);
		set(5, 9);
		System.out.println(c);
		System.out.println(d);

		


	}

}
