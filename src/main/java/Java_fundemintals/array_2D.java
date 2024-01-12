package Java_fundemintals;

public class array_2D {

	public static void main(String[] args) {
		
	//الطريقة الاولى لتعريف مصفوفه
    int[][] array_2D= { {1,2,3},  //03  11 30
    		            {4,5,6},
    		            {7,8,9}
    		            };
      //print diagonally  1  5  9
//    for (int i=0;i<3;i++) 
//    {System.out.println(array_2D[i][i]);	
//    }
    
    System.out.println("_______________");
      //print diagonally  3 5 7
//    System.out.println(array_2D[0][2]);
//    System.out.println(array_2D[1][1]);
//    System.out.println(array_2D[2][0]);
    
    //print all 2D array elements
    for (int i= 0 ; i<3 ; i++) {
    for (int j= 0 ; j<3 ; j++) {
    System.out.println(array_2D[i][j]);	
    }	
    }
    //الطريقة الثانية لتعريف مصفوفه
    int[][] lotteryCard2 = new int[3][3];
	lotteryCard2[0][0] = 20;
	lotteryCard2[0][1] = 15;
	lotteryCard2[0][2] = 7;
	lotteryCard2[1][0] = 8;
	lotteryCard2[1][1] = 7;
	lotteryCard2[1][2] = 19;
	lotteryCard2[2][0] = 7;
	lotteryCard2[2][1] = 13;
	lotteryCard2[2][1] = 41;  
    

}
	

}
