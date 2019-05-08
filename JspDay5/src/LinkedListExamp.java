import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// su dung khi them hoac bot o dau hoac cuoi mang
		// Create LinkedList
		LinkedList<String> list = new LinkedList<>();
		list.add("Java");
		list.add("C++");
		list.add("PHP");
		list.add("Java");

		// Show list through Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ,");

		}
		System.out.println();
		// addFirst
		list.addFirst("Python");

		// show list through index
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " , ");
		}
		System.out.println();
		// add last
		list.addLast("Ruby");
		// show list through for-each
		for (String list1 : list) {
			System.out.print(list1 + ", ");
		}
		System.out.println();
		// remove
		list.remove(3);
		// show list through for-each
		for (String list1 : list) {
			System.out.print(list1 + ", ");
		}
	}

}
