package Java_fundemintals;
//https://www.youtube.com/watch?v=zbVAU7lK25Q&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=86
// الهدف منها هو انشاء جيناريك كلاس يحتوي جميع الخصائص المشتركة بين الكلاسات الاخرى

class genaric_class{
	String name;
	int age;
public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
void setName(String name) {
this.name=name;
}	
String  getName() {
return name;
}	

}

class st1 extends genaric_class {
	
	
}

public class inhertence extends genaric_class {

	public static void main(String[] args) {
		genaric_class ob =new genaric_class();
		st1 ob1 =new st1();
		ob1.setAge(44);
		ob.setAge(55);
		System.out.println(ob.getAge());
		System.out.println(ob1.getAge());
		

	}

}
