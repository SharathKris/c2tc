package tns.day7.arrays;

public class MultiDimArray {

	public static void main(String[] args) {
		char[][] ch = new char[][]{{'A','B','C','D'},{'H','K','L','J'},{'Y','U','I','O'}};
		System.out.println(ch.length);
		
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				System.out.print(ch[i][j]+ ", ");
			}
			System.out.println();
		}
		
		for(char[] c:ch) {
			for(char cc:c) {
				System.out.print(cc);
			}
			System.out.println();
		}
	}

}
