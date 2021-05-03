package dsa;
/**
 * 
 */

public class searchText {

	/**
	 * 
	 */
	private String text;
	
	public searchText(String text) {
		// TODO Auto-generated constructor stub
		this.text = text;
	}
	
	public int numberPosition(String p) {
		double m = text.length();
		double n = p.length();
		double hashP = p.hashCode();
		int count = 0;
		if(m < n) return 0;
		for(int i = 0; i <= m - n ; i++) {
			String subText = text.substring(i,(int) (i + n));
			double hashText = subText.hashCode();
			if(hashP == hashText) {
				if(p.equals(subText)) {
					count ++;
				}
				
			}
		}
		return count;
	}
	
	private int numberPositionRecursive(String text, String p) {
		double hashP = p.hashCode();
		int n = p.length();
		int m = text.length();
		
		if(m < n ) return 0;
		
		String subText = text.substring(0, n);
		double hashText = subText.hashCode();
		
		if(hashP == hashText) {
			if(p.equals(subText)) {
				return 1 + numberPositionRecursive(text.substring(1), p);
			}
		}
		
		return numberPositionRecursive(text.substring(1), p);
		
	}
	
	public int numberPositionRecursive(String p) {
		searchText st = new searchText(text);
		return st.numberPositionRecursive(text, p);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "There are N courses 1, 2, ..., N that must be assigned to M periods 1, 2, ..., M. Each course i has credit ci and has some courses as prerequisites. The load of a period is defined to be the sum of credits of courses assigned to that period. The prerequisites information is represented by a matrix ANxN in which Ai,j = 1 indicates that course i must be assigned to a period before the period to which the course j is assigned. Given constants a, b. Compute the solution satisfying constraints."
				+ "There are N courses 1, 2, ..., N that must be assigned to M periods 1, 2, ..., M. Each course i has credit ci and has some courses as prerequisites. The load of a period is defined to be the sum of credits of courses assigned to that period. The prerequisites information is represented by a matrix ANxN in which Ai,j = 1 indicates that course i must be assigned to a period before the period to which the course j is assigned. Given constants a, b. Compute the solution satisfying constraints."
				+ "There are N courses 1, 2, ..., N that must be assigned to M periods 1, 2, ..., M. Each course i has credit ci and has some courses as prerequisites. The load of a period is defined to be the sum of credits of courses assigned to that period. The prerequisites information is represented by a matrix ANxN in which Ai,j = 1 indicates that course i must be assigned to a period before the period to which the course j is assigned. Given constants a, b. Compute the solution satisfying constraints."
				+ "There are N courses 1, 2, ..., N that must be assigned to M periods 1, 2, ..., M. Each course i has credit ci and has some courses as prerequisites. The load of a period is defined to be the sum of credits of courses assigned to that period. The prerequisites information is represented by a matrix ANxN in which Ai,j = 1 indicates that course i must be assigned to a period before the period to which the course j is assigned. Given constants a, b. Compute the solution satisfying constraints."
				+ "There are N courses 1, 2, ..., N that must be assigned to M periods 1, 2, ..., M. Each course i has credit ci and has some courses as prerequisites. The load of a period is defined to be the sum of credits of courses assigned to that period. The prerequisites information is represented by a matrix ANxN in which Ai,j = 1 indicates that course i must be assigned to a period before the period to which the course j is assigned. Given constants a, b. Compute the solution satisfying constraints."
				+ "There are N courses 1, 2, ..., N that must be assigned to M periods 1, 2, ..., M. Each course i has credit ci and has some courses as prerequisites. The load of a period is defined to be the sum of credits of courses assigned to that period. The prerequisites information is represented by a matrix ANxN in which Ai,j = 1 indicates that course i must be assigned to a period before the period to which the course j is assigned. Given constants a, b. Compute the solution satisfying constraints."
				+ "There are N courses 1, 2, ..., N that must be assigned to M periods 1, 2, ..., M. Each course i has credit ci and has some courses as prerequisites. The load of a period is defined to be the sum of credits of courses assigned to that period. The prerequisites information is represented by a matrix ANxN in which Ai,j = 1 indicates that course i must be assigned to a period before the period to which the course j is assigned. Given constants a, b. Compute the solution satisfying constraints."
				+ "There are N courses 1, 2, ..., N that must be assigned to M periods 1, 2, ..., M. Each course i has credit ci and has some courses as prerequisites. The load of a period is defined to be the sum of credits of courses assigned to that period. The prerequisites information is represented by a matrix ANxN in which Ai,j = 1 indicates that course i must be assigned to a period before the period to which the course j is assigned. Given constants a, b. Compute the solution satisfying constraints."
				+ "There are N courses 1, 2, ..., N that must be assigned to M periods 1, 2, ..., M. Each course i has credit ci and has some courses as prerequisites. The load of a period is defined to be the sum of credits of courses assigned to that period. The prerequisites information is represented by a matrix ANxN in which Ai,j = 1 indicates that course i must be assigned to a period before the period to which the course j is assigned. Given constants a, b. Compute the solution satisfying constraints.";
		
//		String text2 = text + text + text;
//		String text3 = text2 + text2 + text2;
//		text = text3;
		String p = "There are";
		searchText s = new searchText(text);
		
		System.out.println(text.length());
		System.out.println(s.numberPosition(p));
		System.out.println(s.numberPositionRecursive(p));

	}

}
