
import java.util.TreeSet;

public class SortTreeSet {

	public static void main(String[] args) {
		TreeSet<Object> treeSet = new TreeSet<Object>((d1, d2) -> ((Integer) d2).compareTo((Integer) d1));

		treeSet.add(4);
		treeSet.add(86);
		treeSet.add(56);
		treeSet.add(72);
		treeSet.add(79);
		treeSet.add(23);

		treeSet.stream().forEach(e -> System.out.println("Tree Set Value: " + e));
	}
}
