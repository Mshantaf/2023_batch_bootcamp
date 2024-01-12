package Java_fundemintals;

public class Methods_And_ArrayWithReturn {

	public static void main(String[] args) {
		multipluy(5,10);
		
		int mul=multipluy(5,10,20);
	    System.out.println(mul);
	    
	    System.out.println(capitalies ("word"));
	    //ندخل قيم المصفوفة
	    int [] awsome_array=array(5,6,7);
	    for(int i =0; i<awsome_array.length;i++) {
	    System.out.println(awsome_array[i]);	
	    }
	}
    public static void multipluy (int a, int b) {
	System.out.println(a * b);
    }
    //تذكر اول ماتشيل فويد نضيف نوع المتغير
    public static int multipluy (int a, int b , int c ){
    return a*b*c;	
    }
    
    public static String capitalies (String word) {
		return word.toUpperCase();
    }
    
    public static int[] array(int a, int b, int c) {
    	//نعرف المصفوفة
    	int [] array=new int[3];  //new int not array
    	//نضيف المتغيرات
    	array[0]=a;
    	array[1]=b;
    	array[2]=c;
    	//نضيف اسم المصفوفه 
		return array;
    	
    	
    }
    
}
