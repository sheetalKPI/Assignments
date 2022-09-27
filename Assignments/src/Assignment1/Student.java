package Assignment1;

public class Student {
	String name;
	String course;
	int age;
	
	public Student(String name, String course, int age)
	{
		this.name=name;
		this.course=course;
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student("Vaidehi","CS",21);
		Student s2 = new Student("Naina","BA",22);
		Student s3 = new Student("Nancy","MBA",23);
		Student s4 = new Student("Anu","BBA",20);
		Student s5 = new Student("Shivya","BCA",20);
		
		System.out.println(s1.getName(),s2.getName(),s3.getName(),s4.getName(),s5.getName());
	}
}
