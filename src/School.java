import java.util.List;

public class School {
	private List<Student> students;
	private List<Teacher> teachers;
	
	int amount=0;
	
	public School(List<Teacher> teachers2, List<Student> students2) {
		// TODO Auto-generated constructor stub
		this.teachers=teachers2;
		this.students=students2;
	}

	public int calculateAmount() {
		return this.calculateStudentsAmount()-this.calculateTeachersAmount();
	}
	
	public int calculateStudentsAmount() {
		int sum=0;
		for(int i=0;i<students.size();i++) {
			sum=sum+students.get(i).fees;
		}
		return sum;
	}
	
	public int calculateTeachersAmount() {
		int sum=0;
		for(int i=0;i<teachers.size();i++) {
			sum=sum+teachers.get(i).salary;
		}
		return sum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
