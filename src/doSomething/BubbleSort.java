package doSomething;

public class BubbleSort {
	shapes [] sList = new shapes [6]; 
	public BubbleSort(shapes []s){
		for (int x = 0; x < s.length;x++) {
			this.sList[x] = s[x];
		}
	}
	public shapes[] sort() {
		 int n = sList.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (sList[j].getArea() > sList[j+1].getArea())
	                {
	                    shapes temp = sList[j];
	                    sList[j] = sList[j+1];
	                    sList[j+1] = temp;
	                }
		return sList;
		
	}
}
