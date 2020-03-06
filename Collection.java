import java.util.*;
/*
 * Lister  class definition that contains various methods for performing operations on the declared list.
 */
class Lister{
	/*
	 * Add method adds an element to the list.
	 * It has two parameters. 
	 * The List object and the element to be added.
	 */
	void add(List<String> list,String n)
	{
		list.add(n);
		System.out.println(list.toString());
	}
	/*
	 * The remove method is also similar to the add method.
	 * The difference is that the element to be removed is given as the parameter.
	 * Based on the given element, the list item is removed.
	 */
	void remove(List<String> list,String n)
	{
		list.remove(n);
		System.out.println(list.toString());
	}
	/*
	 * The fetch method is used to check the availability of an element in the list.
	 * If the element is not available, the method prints saying the element is not present.
	 */
	void fetch(List<String> list,String n)
	{
		boolean a=list.contains(n);
		if(a)
		{
			System.out.println("The list has the element");
		}
		else
		{
			System.out.println("The list has no such element");
		}
	}
	/*
	 * The print method prints the list in order.
	 */
	void print(List<String> list)
	{
		System.out.println(list.toString());
	}
}
public class Collection {
	public static void main(String args[])
	{
		List<String> list = new ArrayList<>(Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten"));
	    Lister l = new Lister();
	    /*
	     * The lister object is used to call various methods to perform corresponding operations on the list.
	     */
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the element to be added:");
	   String  n=sc.nextLine();
	   //Calling Add method
	    l.add(list, n);
	    System.out.println("enter the element to be removed:");
	    String x=sc.nextLine();
	    // Calling Remove method
	    l.remove(list,x);
	    System.out.println("enter the element to be fetched:");
	    String y= sc.nextLine();
	    // Calling Fetch and Print  methods.
	    l.fetch(list,y);
	    l.print(list);
	}

}
