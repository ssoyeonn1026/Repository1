import java.util.*;

public class set_example {
	public static void main(String[] args) {
		Set<String> uniques = new HashSet<>();
		uniques.add("apple");
        uniques.add("banana");
        uniques.add("grape");
        uniques.add("banana");
        
        for (String element : uniques) {
            System.out.println(element);
        }
	}
}
