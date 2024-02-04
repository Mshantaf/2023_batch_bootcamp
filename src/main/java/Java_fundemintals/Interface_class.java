package Java_fundemintals;

// https://www.youtube.com/watch?v=kTpp5n_CppQ&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=78
// الفكرة الرئيسيه : اوت لاين للماين كلاس، بمعنى جميع الميثود يجب ان يتم تنفيذها داخل الماين كلاس
//  فتحنا كلاس انترفيس داخل الماين كلاس بدون اقواس صغيرة وسميناه
// الفرق بينه وبين البستراكت يتم انشاء البيهفيار  للميثود في الماين ودائما مافي كود في الانترفيس 
//الميثود داخل الانترفيس مابتحتاج كيرلي بريسيز الي هو بدي لأنك رح تدخلة في الماين
//بنستعمل الماين كلاس لأستدعاء الميثود لأنهم صارو داخل الميثود وعليهم اوفر رايد
//Interface : its contract that says any class implement 
//this interface has to provide their own implementation of the method specified by the interface
 interface outLine {
//ريتيرن تايب ميثود	
//اذا في ريتيرن دايما لازم نعيم التايب للميثود
String setcolor();
//فويد ميثود
void setspeed () ;
}

//اضفنا كلمة امبليمنتس 
public class Interface_class implements  outLine   {
    
	public static void main(String[] args) {
	//استدعينا الانستانس من السوير كلاس	
	Interface_class k=new Interface_class();
	//حددنا متغير لتخزين النتيجة
    String c= k.setcolor();
	System.out.println(c);
	
    k.setspeed();
	}

	@Override
	public  String setcolor() {
    return "red";
		}

	@Override
	public void setspeed() {
	int speed=150;
	System.out.println(speed);
	}

	}