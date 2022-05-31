class Demo {
  Demo()
  {
	  System.out.println
	  ("Hello a");
  }
Demo(int x)
   {
	this();
	System.out.println(x);
   }
}
class TestThis5
{
	public static void main(String[] args)
	{
		Demo a = new Demo(10);
	}
}