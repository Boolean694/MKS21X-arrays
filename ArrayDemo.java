public class ArrayDemo {
	
	//0a. (WORKING)
	public static void printArray(int[] a) {
		System.out.print("[");
		for(int qo = 0; qo < a.length - 1; qo++) {
			System.out.print(a[qo] + ",");
		}
		System.out.print(a[a.length - 1]);
		System.out.print("]");
	}
	
	//0b. (WORKING)
	public static void printArray(int[][] a) {
		System.out.print("[");
		for(int as = 0; as < a.length - 1; as++) {
			printArray(a[as]);
			System.out.print(",");
		}
		printArray(a[a.length - 1]);
		System.out.print("]");
	}	
	
	//1.
	public static int countZeros2D(int[][] a) {
		int c = 0;
		for(int sd = 0; sd < a.length; sd++) {
			for(int bs = 0; bs < a[sd].length; bs++) {
				if(a[sd][bs] == 0){c++;}
				else{c += 0;}
			}	
		}	
		return c;
	}	
	
    public static void main(String[] args) {
        int[] aaa = {1,3,5,7,9};
		int[][] bbb = {{1,2,3},{4,5,6,7},{8,9},{0}};
		int[][] ccc = {{1,5,8,0},{3,5,0,4,3,0},{0,1,0,8}};
		printArray(aaa);
		printArray(bbb);
		System.out.println(countZeros2D(ccc));
    }
}
