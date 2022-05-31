
class Student {
	int rollno;
	String name;
	float fee;
	Student(int rollno, String name, float fee)
	{
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s1 = new Student(111, "Owais",1000f);
       Student s2 = new Student(222, "Yameen", 2000f);
       s1.display();
       s2.display();
	}

}
