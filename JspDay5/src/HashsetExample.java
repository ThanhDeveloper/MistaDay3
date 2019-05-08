import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//hash set ko cho phep add ptu trung lap vao mang
public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> list=new HashSet<>();
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
