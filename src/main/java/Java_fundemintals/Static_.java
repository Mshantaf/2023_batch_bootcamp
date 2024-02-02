package Java_fundemintals;
//فتحنا كلاس ثاني داخل الماين كلاس
class no_static{
void method1() {
	System.out.println("this is non static method ");
}  	
static void method2() {
		System.out.println("this is  static method ");
}	
}
//فتحنا كلاس  داخل الماين كلاس
//معنى ستاتيك انك مابتحتاج اوبجيكت لاستدعاء فاريبل
public class Static_ {
		
	
    // static is : مابتحتاج اوبجكت(انستانس)لاستدعائها ، او بتنتمي للكلاس
	static int m= 4;
	//non-static: instance of the class 
	int a= 5;
	
	public static void main(String[] args) {
		
    //عملنا اوبجيكت عشان نستديه
	Static_ c = new Static_();
	System.out.println(c.a);
	
	//مااستعملنا اوبجيكت واستدعيناه مباشرة مع انه جلوبال
	System.out.println(m);
    
	//لانه ستاتيك وبنفس الباكيج تم استدعائه مباشر بأضافة اسم الكلاس
	no_static.method2();
	//لانه ليس ستاتيك وبنفس الباكيج تم استدعائه عن طريق الاتستانس كي
	no_static k=new no_static();
	k.method1();
	
	}

}
