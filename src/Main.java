import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"Suresh",'A',1000);
		Student s2=new Student(2,"ruresh",'A',2000);
		
		Teacher t1=new Teacher(1,"Ddubb",500);
		
		List<Student> students=new ArrayList<>();
		students.add(s1);
		students.add(s2);
		
		List<Teacher> teachers=new ArrayList<>();
		teachers.add(t1);
		
		School s=new School(teachers,students);
		System.out.println(s.calculateAmount());
	}

}
