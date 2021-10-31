import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



//https://stackoverflow.com/questions/29179194/compare-two-objects-with-or-operators-in-java
//https://www.geeksforgeeks.org/binary-search/
//stackabuse.com/java-read-a-file-into-a-string/
public class PersonDatabase {
	public BinaryTree<person> tree = new BinaryTree<person>();

	public void insert(person p) {
		tree.ins(p);
	}

	public void delete(person p) {
		tree.del(p);
	}
	
	PersonDatabase read(File file) throws IOException{
	    Scanner scanner = new Scanner(file);

	    while(scanner.hasNext()){
	    	String[] pe = new String[2];
	       pe = scanner.nextLine().split(";");
	     
	        this.insert(new person(pe[0],pe[1]));
	    
	    }
	    scanner.close();
		return null;
	    
	}
	
	PersonDatabase person(File file) throws IOException {
	return read(file);
	}

	
	public ArrayList<person> getAll() {
		return tree.getList(tree.getRoot());
	}

	// TODO
	public person recSearch(String name) {
		ArrayList<person> param = getAll();
		return SearchName(param, 0, param.size(), param.size() / 2);

	}

	public void modName(String name, String newname) {
		person p = recSearch(name);
		tree.del(p);
		tree.ins(new person(p.getMonth(), newname));
	}

	public void modMonth(String newMonth,String name) {
		person p = recSearch(name);
		tree.del(p);
		tree.ins(new person(newMonth, p.getName()));
	}

	public person SearchName(ArrayList<person> List, int start, int end, int x) {
		if (end >= start) {
			int mid = start + (end - start) / 2;

			// If the element is present at the
			// middle itself
			if (List.get(mid) == List.get(mid)) {
				return List.get(mid);
			}
			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (List.get(mid).compareTo(List.get(x)) > 0) {

				return SearchName(List, start, mid - 1, x);

			}
			// Else the element can only be present
			// in right subarray
			return SearchName(List, mid + 1, end, x);
		}

		// We reach here when element is not present
		// in array
		return null;
	}

	public void change(person p, person p2) {
		tree.change(p, p2);
	}

}
