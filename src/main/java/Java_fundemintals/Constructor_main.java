package Java_fundemintals;

public class Constructor_main {
// بنستعمل الكونستراكتور في حال اردنا ان نغير قيم لمتغيرات ثابتة للاوبجيكت  
	// بتمرر الباراميتر في الاوبجيكت نفسه مباشرة 
	//الكونسراكتور نفس اسم الكلاس ،شوف الساب كلاس
	public static void main(String[] args) {
    
		Constructor c=new Constructor(55, "white");
        c.tv_Off();	
        System.out.println(c.size +" "+ c.colour);
	}

}
