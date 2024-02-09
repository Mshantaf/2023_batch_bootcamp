package Java_fundemintals;
//https://www.youtube.com/watch?v=LYKHxwQ0QH8&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=96
//enue its a list of thing do not change
//متل الاري بس ثابته ومابتتغير قيمها 
//بتكتبها بين اسم الكلاس والماين ميثود
public class enum_1 {
	
enum dificulity { HARD , MEDIUM ,EASY		
    }
	public static void main(String[] args) {
    
		dificulity DIF=dificulity.HARD;
		if(DIF==dificulity.EASY) {
			System.out.println("dificulity is EASY");
		}else if (DIF==dificulity.MEDIUM){
			System.out.println("dificulity is MEDIUM");
		}else if (DIF==dificulity.HARD) {
			System.out.println("dificulity is HARD");
		}
    
	}

}
