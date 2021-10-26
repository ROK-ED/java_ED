package tset;

public class Student {
	int no;
	String name;
	int score;
	
	public Student( int no, String name, int score) {
		this.no = no;
		this.name = name;
		this.score =score;
	}
	
	public int getNo() {
		return this.no;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}

}
