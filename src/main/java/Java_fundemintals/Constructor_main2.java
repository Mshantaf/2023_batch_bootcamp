package Java_fundemintals;
//اول شيئ انشأنا كلاسين وخلينا واحد سوبر وواحد تشايلد
//عملنا 2 كونستراكتور واحد في السوبر وواحد في التشايلد وعملنا اوبجيكت في الماين
// بدون استدعاء الانستانس حرف اس تم طباعة الميثود الي موجود في كل كلاس وطباعتها
// عملت باراميتر كونستراكتور واستدعيته بكلمة سوبر في التشايلد كلاس وادخلت الباراميتر في كلمة سوبر 

class school {
	String name ;
	  school() {
		System.out.println("this is school class constracter");
	} 
	  school (String name){ 
		  this.name=name;
		   
	  }
}

class student_3 extends school {
	 student_3 () {
	 super("kkk");
	 System.out.println("this is student class constracter");
	 System.out.println("name is "+ name);

	}
	
	
}

public class Constructor_main2 {

	public static void main(String[] args) {
		student_3 s = new student_3 ();

	}

}
 