
public class Student {
	int id;
	String name;
	char grade;
	int fees=0;
	
	public Student(int id, String name, char grade){
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	
	public Student(int id, String name, char grade, int fees){
		this.id=id;
		this.name=name;
		this.grade=grade;
		this.fees=fees;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
	
}
