package tns.day7.arrays;

public class JaggedArray {

	public static void main(String[] args) {
		String student[][]= {
				{"Amit","C++"},
				{"NIsha","Pyhton"},
				{"Kris","Java"},
				{"Tan","Java","Python"}};
		
		for(String[] s:student) {
			for(String ss:s) {
				System.out.print(ss+"\t");
			}
			System.out.println();
		}
	}
}
