package Java_fundemintals;
//https://www.youtube.com/watch?v=Ft88V_rDO4I&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=92
//Polymorphism is many form of method and each method has different implementation 
//اوفر ريدنغ : نفس الميثود موجودة بأكثر من كلاس وكل ميثود كان الها الامبلمنتيشن الخاص فيها
//اوفرلودينغ : اسم الميثود نفسه ،و بنفس الكلاس ، لكن الباراميترز تغيرت 
class bird {
	public void teeet () {
		System.out.println("twet twet ");
	}
}

class bird1 extends bird{
	
	String sound;
	//هاذ اسمه اوفرلودينغ اسم الميثود نفسه ،و بنفس الكلاس ، لكن الباراميترز تغيرت 
	public String teeet (String sound) {
	this.sound=sound;	
    return sound;
    }
	
	public void teeet () {
	System.out.println("who who ");
}
	
	}
class bird2 extends bird{
	String sound;
	public String teeet (String sound) {
	this.sound=sound;	
    return sound;
    }
	}

public class Polymorphism_1 {
//اوفر ريدنغ هو نفس الميثود موجودة بأكثر من كلاس وكل ميثود كان الها الامبلمنتيشن الخاص فيها
	public static void main(String[] args) {
	//الميثود من الكلاس الاول
	bird b =new  bird ();
	b.teeet();	
	//الميثود من الكلاس التاني
	bird1 b1 =new  bird1 ();
	b1.teeet();
	System.out.println(b1.teeet("overloading"));
	//الميثود من الكلاس الثالث
    bird2 b2 =new  bird2 ();
    System.out.println(b2.teeet("ooo")); 
    //كمان هذا اوفر رايدنغ لانه اخذنا الميثود نفسها 
	bird b3 =new  bird1 ();
	b3.teeet();
    
	}

}
