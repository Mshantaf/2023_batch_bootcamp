package Java_fundemintals;

    public class Constructor {
	public int size ;
	public String colour ;
	static boolean On_Or_Off=true;
	
    public static void tv_On() {
	On_Or_Off=true;}
    
    public static void tv_Off() {
    	On_Or_Off=false;}
    // بنمرر الباراميترز 
    //وبنمرر الفاليو في الماين كلاس
    Constructor (int newsize, String NewColour){
    size=newsize;
    colour=NewColour;
    }
    
    

}
