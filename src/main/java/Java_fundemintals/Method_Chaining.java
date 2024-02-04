package Java_fundemintals;
//https://www.youtube.com/watch?v=4Lu1oqQe3uE&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=85
class student {
	int age;
	String name;
	
	 student setName(String name) {
		 this.name = name;
		 return this;
	}

	 student setAge(int age) {
	this.age=age;
	return this;
	}
	
	
}

public class Method_Chaining {

	public static void main(String[] args) {
    student s=new student ();
    s.setAge(5).setName("mm");

	}

}
