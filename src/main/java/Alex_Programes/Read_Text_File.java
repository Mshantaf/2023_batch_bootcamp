package Alex_Programes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Read_Text_File {
//https://www.youtube.com/watch?v=lHFlAYaNfdo&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=40
	public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\mshan\\Desktop\\New folder (2)\\batch7-master\\2023_batch_bootcamp\\Alexfile.txt");	
    Scanner Scan =new Scanner(file);//أكتب الأسطر في الملف لطباعتها لاحقا في الكنسول 
//  System.out.println(Scan.nextLine()); //لكي نتأكد فقط انه يطبع اول سطر وقبل ادخاله لوايل لوب
    String fileContics=""; // للجزء الثاني من البرنامج الي بعمل اكسبورت من ملف لملف تاني، بنعرف سترينغ عشان يوخد الكلام من الملف الاول
    while(Scan.hasNextLine()) { // لوب لأدخال جميع الاسطر، هاز نكست لاين معناها لاخر سطر 
//  System.out.println(Scan.nextLine()); // اطبع السطر	
    fileContics=fileContics.concat(Scan.nextLine()+"\n");// أجمع الاسطر مع بعض من خلال كونكات 
    }
    //لأدخال او اكسبورت الأسطر لملف أخر
    FileWriter writer =new FileWriter("C:\\Users\\mshan\\Desktop\\New folder (2)\\batch7-master\\2023_batch_bootcamp\\AlexfileWriter.txt");
    writer.write(fileContics); // املأ الجمل في الملف الثاني
    writer.close();
    System.out.print(fileContics);
  
	}

}
