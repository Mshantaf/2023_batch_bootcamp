package Alex_Programes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_a_CSV_File_into_an_Array {

	public static void main(String[] args)  {
		//اخدنا الباث تبع الملف وخزناه ب سترينغ
		String path = "C:\\Users\\mshan\\Downloads\\Sacramentorealestatetransactions.csv";
		//حجزنا للسطور الي رح تطلع من الفايل
		String line ="";
		
		// اوتوماتيك بطلع تراي اند كاش عشان في فايل وممكن يكون الباث خطأ
	            try {
	            	
	            	// استعملنا بافر يدر عشان نقرأ الملف
					//ادخلنا الملف عن طريق نيو فايل وادخلنا موقعه من السترينغ 
	            	BufferedReader bar = new BufferedReader(new FileReader(path));
	            	// عملنا وايل لووب ، والشرط ادخال السطور من الفايل في المتغير لاين الى ان يوصل الى لايوجد
					while ((line = bar.readLine()) !=null){
						// حولنا السترينغ الى ارري 
						String [] array=line.split(","); 
						// صار كل عمود في الفايل عبارة عن اندكس نامبر
						System.out.println(array[5]+"      "+ array[2]);
					}
				} catch (FileNotFoundException e) {
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    
	}}