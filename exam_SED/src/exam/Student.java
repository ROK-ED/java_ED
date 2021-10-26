package exam;

public class Student {
		// 필드
		int id;
		String name;
		int score;
		
		// 생성자
		public Student(int id, String name, int score) {
			this.id = id;
			this.name = name;
			this.score = score;
		}

		// 메소드
		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public int getScore() {
			return score;
		}
		
	}



