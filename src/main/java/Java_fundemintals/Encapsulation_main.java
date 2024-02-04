package Java_fundemintals;
//الفكرة انا بدل مانشغل اليوزر بالعمليات الي ممكن نسويها داخل الكود
// بنعطيه فقط اكسيس للرقم الي المفروض يضيفه 
// ممكن تعملها اوتوماتيك من الايكلبس تضغط رايت كليك على اي مكان وتختار سورس وتختار المتغير
public class Encapsulation_main {

	public static void main(String[] args) {


    Encapsulation_set_get s=new  Encapsulation_set_get();
   
    s.setAge(5);
    System.out.println(s.getAge());
    
    s.setName("Jenna");
    System.out.println(s.GetName());

//    Encapsulation_set_get.age=5;
//    s.age=5;
	}

}
