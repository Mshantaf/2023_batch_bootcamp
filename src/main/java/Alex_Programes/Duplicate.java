package Alex_Programes;

public class Duplicate {

	public static void main(String[] args) {
		String sentence = "mohamed hassan elshantaf";
		System.out.println(sentence);

		String characters = "";
//		System.out.println("this is characters in line 10 "+characters);
		String duplicates = "";
//		System.out.println("this is duplicates in line 12 "+duplicates);

		for (int i = 0; i < sentence.length(); i++) {
		String current = Character.toString(sentence.charAt(i));//تم استخراج الحرف الحالي من الجملة وتحويله إلى نص.
//		System.out.println("this is current in line 15 "+current);

			if (characters.contains(current)) {// فحص ما إذا كانت الحروف المفحوصة تحتوي على الحرف الحالي.
//				System.out.println("this char checked "+": "+ characters.contains(current));
				if (!duplicates.contains(current)) {//ا كانت الحروف المكررة لا تحتوي على الحرف الحالي، يتم إضافته إلى الحروف المكررة.
//					System.out.println("this is duplicate char " + ": "+!duplicates.contains(current));
					duplicates += current + ",";
//					System.out.println("this is duplicates in line 22 "+duplicates);

					
				}
			}
			characters += current;//تم إضافة الحرف الحالي إلى الحروف المفحوصة.
//			System.out.println("this is characters in line 28 "+characters);

		}

		System.out.println("this is characters in line 33 is duplicated "+duplicates);
	}

}
