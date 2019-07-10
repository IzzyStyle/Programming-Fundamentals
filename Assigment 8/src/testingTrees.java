import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class testingTrees {
	public static void main(String[] args) throws IOException {

		// reads text file
		BufferedReader content = Files.newBufferedReader(Paths.get("fruitsandveggies.txt"));

		int i = 0;// sets count at zeor

		// gives the array 81 spaces since there are 81 entries in the text
		String[] array = new String[81];

		String line;

		while ((line = content.readLine()) != null) {
			array[i] = line;
			i++;
		}

		// need to close to avoid "leak"
		content.close();

		stringTree t2 = new stringTree();

		t2.root = t2.insert(array, t2.root, 0);

		// prints tree in order
		t2.inOrder(t2.root);

	}

}