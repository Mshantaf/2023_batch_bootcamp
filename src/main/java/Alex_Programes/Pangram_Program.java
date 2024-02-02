package Alex_Programes;

public class Pangram_Program {
    
	// panagram هي كلمة تحتوي على جميع الاحرف الانجليزية وعددها 26 حرف
	//فكرة البرنامج هي اننا نعلم ان الكلمة اس موجود فيها جميع احرف اللغة الانجليزية 
    //والهدف من المصفوفة مارك هو التأكد من دخول كامل احرف النجليزية على الاقل مرة   
    public static void main(String[] args) {
		
		String s = "The Quick Brown Fox Jumps Over The Lazy Dog";
    	//جرب تشيل الحروف
//    	String s = "AAN";
		boolean [] mark = new boolean[26];
		int index=0;
		boolean panagram=true;
		for (int i=0;i< s.length();i++) {
			char cha=s.charAt(i);
//			System.out.println(character);
			if (cha>= 'A' && cha<='Z' ) {
			index=cha-'A';
			}
			else if (cha >='a' && cha <='z' ) {
			index=cha-'a';
			}
			//السطر لطباعة الحرف وبجانبة الأندكس والاندكس هو رقمه في الاسكي كود
//		    System.out.println("latter "+ cha +" index "+ index );
			//تم حجز قيمة من ال26 قيمة لحرف
		    mark[index]=true;

		}
	    for(int i =0 ; i<mark.length;i++) {
           if(mark[i]==false) {
        	   panagram=false;}
	    }
	    if (panagram) {System.out.println("its a pangram");}
	    else {System.out.println("its NOT panagram");}
	 
	}}
