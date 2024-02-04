package Java_fundemintals;
//https://www.youtube.com/watch?v=hLYOpvoM4vk&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=87
//تستخدم غالبا مع الكونسراكتر وشوف كلاس كونستراكتور ماين 2
//تستعمل اذا كان عندنا نفس المتغير او الميثود في اكثر من كلاس ولكننا نريد استعمال الاساس
// كلمة سوبر تشير الى المتغير الموجود في البيرنت كلاس وليس التشايلد
//طبعا لازم يكون اسم المتغير متطابق في الكلاسين البيرنت والساب طلاس 
//this key word: تشير الى قيمة المتغير في الكلاس الموجودة فيه كلمة ذيس ، 
//انشأنا سوبر كلاس فيهكل وساب كلاس كار ،والكار رح ياخذ خصاصئص من فيهكل

class vihecle {
	int maxspeed=120;
	
	void sound() {
		System.out.println("wwwwww");
	}
}

class car extends vihecle {
	//انشأنا نفس المتغير في السوبر والساب كلاس
	int maxspeed = 100;
	
	//انشأنا نفس الميثود في السوبر والساب كلاس
	void sound() {
		System.out.println("kkkkk");
		super.sound();
	}

}
public class super_keyword {

	public static void main(String[] args) {
	car c =new car ();
	System.out.println(c.maxspeed);
	c.sound();
	

	}

}
