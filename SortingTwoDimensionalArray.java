//U10316048 劉信佑

public class SortingTwoDimensionalArray{
	public static void main (String[] args){
		//Main method
		int[][] m = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		sort(m);//進行二維陣列的排序
		for (int i =0;i<m.length;i++){
			for (int j =0;j<m[i].length;j++){
			System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}//把結果print出來
	}

	public static void sort(int[][] m){
		//Sorting method
		for (int i =0;i<m.length;i++){
			for (int j =0;j<m.length-1;j++){
				if (m[j][0] >m[j+1][0]){
					int temp = m[j][0];
					int temp1 = m[j][1];
					m[j][0]= m[j+1][0];
					m[j][1]= m[j+1][1];
					m[j+1][0] = temp;
					m[j+1][1] = temp1;
				}/*Bubble sort 去比對前後的大小，如果前面的比較小則不變，
				如果前面的比較大則暫存到一個變數，然後把後面那個存進前面的，
				再把暫存的存到後面。這邊都只比對左邊的數字*/
				if (m[j][0] == m[j+1][0]){
					if(m[j][1] >m[j+1][1]){
						int temp2 = m[j][1];
						m[j][1] = m[j+1][1];
						m[j+1][1] = temp2;
					}
				}/*當左邊的數字一樣時，去做 Bubble sort 比對前後的大小，
				如果前面的比較小則不變，如果前面的比較大則暫存到一個變數，
				然後把後面那個存進前面的，再把暫存的存到後面。這邊都比對右邊的數字*/
			}
		}
	}
}
