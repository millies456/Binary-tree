import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class driver {



	public static void main(String[] args) throws IOException {
		PersonDatabase based = new PersonDatabase();
		

		/*
		 * month day persons name x.ins(new person(99, "playboi")); x.ins(new person(99,
		 * "delete")); x.ins(new person(99, "insigni")); x.ins(new person(99, "veter"));
		 * x.change(new person(99,"veter"),new person(99,"killer"));
		 * x.inorder(x.getRoot());
		 */
// 20 millies
		
File file = new File("textFile.txt");

		try{
			based.read(file);
		}catch(FileNotFoundException f) {
			System.out.print("not found");
		}
		System.out.println(based.getAll());
		based.insert(new person("4", "veter"));
		based.delete(new person("12","micheal"));
		based.modMonth("11","zuko");
		based.modName("martin","kai");
		based.change(new person("3","rich"), new person("10","lumbardo"));
System.out.println(based.getAll());
	System.out.println("mila");
	}

}