package Java_fundemintals;
//https://www.youtube.com/watch?v=hLYOpvoM4vk&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=88
//الكونستراكتر هو سبيشال ميثود للاوبجيكت 
//بتستعمل اساسا اذا سوينا اوفر رايدنغ لميثود لكن اردنا ان نرجع للامبلمنتيشن في الميثود الي مودود في السوبر كلاس
//بنستعمل الكونستراكتور في حال اردنا ان نغير قيم لمتغيرات ثابتة للاوبجيكت  
// بتمرر الباراميتر في الاوبجيكت نفسه مباشرة 
// الكونسراكتور نفس اسم الكلاس بس اسم الكلاس مع برانتسيس وكيرلي بريسيس وبدون فويد ،  
class first {
	//ابسط صورة للكونستراكتور ، وبمجرد انشاء اوبجكت بتم استدعاءه اوتوماتيك
	 first (){ System.out.println("constractor of first automaticly called,we just create normal opject ");}
}
class Constructor extends first{
public int size ;
public String colour ;

//هذا كونسراكتور مع بارمايترز
// بنمرر الباراميترز 
//وبنمرر الفاليو في الماين كلاس
Constructor (int newsize, String NewColour){
size=newsize;
colour=NewColour;
}

}
public class Constructor_main  {

	public static void main(String[] args) {
    
		Constructor c=new Constructor(55, "RED");
        System.out.println(c.size +" "+ c.colour);
        first f =new first();
	}

}
