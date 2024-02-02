package Java_fundemintals;

public class Recursion {
// Recursion هو استدعاء الميثود من داخلها
	public static void main(String[] args) {
	countdown(15);

	}
	// الموضوع سهل بس انا مفصله 
	//اولا : بتعطي للميثود تايب سطر 14 
	// line 15 ثانيا بتعمل الشرط باستعمال اف ستيتمنت عشان توقف تكرار العمليه
	//ثالثا: بتستعمل -- عشان توصل لانهاء التكرارسطر 18
	// line20 رابعا: بتستدعي الميثود في الميثود نغسها
	public static void countdown (int n) {
	if (n==0)	{
		System.out.println("done ");
	}else {
		n--;
		System.out.println(n);
		countdown(n);
	}
		
	}

}
