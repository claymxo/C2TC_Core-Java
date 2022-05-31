class Static {
	int rollno;
	String name;
	float fee;
    long phNum;
	static String college = "HKBKCE";
	Static(int rollno, String name, float fee, long phNum)
	{
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
		this.phNum = phNum;
		
	}
	static void change() {
		college ="Mtech";
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee+" "+phNum+" "+college);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static s1 = new Static(111, "Owais",1000f, 9980718313L);
		Static s2 = new Static(222, "Yameen", 2000f, 7337882470L);
		Static s3 = new Static(333, "Mumin", 9999f, 9739612082L);
		Static.change();
		Static.change();
       s1.display();
       s2.display();
       s3.display();
	}

}