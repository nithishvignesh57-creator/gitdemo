package encapsulation;

class Phonepay
{
	private int pin=1234;
	public int getter()
	{
	 return pin;	
	}
	public void setter(int pin)
	{
		this.pin=pin;
	}
}

public class Mainclass
{
	public static void main(String[] args)
	{
		Phonepay p1=new Phonepay();
		System.out.println(p1.getter());
		p1.setter(531478);
		System.out.println(p1.getter());
	}
	

}
