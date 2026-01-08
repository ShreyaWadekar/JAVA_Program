class Dog
{
	String name="Sunny";
void bark()

{
	System.out.println(name+" Bark");
}
	public static void main(String args[])
{
	Dog d1=new Dog();
	
	d1.bark();
	System.out.println(d1.name);

}
}