package Java_fundemintals;

public class Opject_Argument_Person {
String name;
int age;

Opject_Argument_Person(String name, int age){
		this.name=name;
		this.age=age;
		
	}
	
	public void print () {
		System.out.println("name is " + this.name);
		System.out.println("age is " + this.age);
		
	}
	
	public void compareAge(Opject_Argument_Person otherPerson  ) {
		if (this.age < otherPerson.age) {
            System.out.println(this.name + " is younger than " + otherPerson.name);
        } else if (this.age > otherPerson.age) {
            System.out.println(this.name + " is older than " + otherPerson.name);
        } else {
            System.out.println(this.name + " is the same age as " + otherPerson.name);}
		
	}
	
	
	public static void main(String[] args) {
		Opject_Argument_Person p1 = new Opject_Argument_Person ("Ahmed",10);
		Opject_Argument_Person p2 = new Opject_Argument_Person ("Mohamed",20);
		
        p1.compareAge(p2);

    
    
	}

}
