import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		//add Object to Arraylist
		list.add("Java");
		list.add("C++");
		list.add("PHP");
		list.add("Java");
		//Show list through Iterator
		Iterator<String> itr=list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ,");
			
		}
		System.out.println();
		//show list through for-each
		for (String list1 : list) {
			System.out.print(list1+", ");
		}
	}

}
