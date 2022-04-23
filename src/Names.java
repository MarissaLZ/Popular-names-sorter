import java.util.*;
import java.io.*;

public class Names {

	public static void main(String[] args) throws IOException {
		// ask user to enter file
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a file name for baby name ranking:");
		String fileName = input.next();
		fileName = "src/" + fileName;
		
		//read file +create file instance
		//pass in the path of the file as a string
		
		File file = new File (fileName); 
		Scanner scan = new Scanner(file);
		
		//System.out.print(fileName);
		//only gets the fist line of text file
		//System.out.println(scan.nextLine() );
		
		ArrayList<String> boyNames = new ArrayList<String>();
		ArrayList<String> girlNames = new ArrayList<String>();
		ArrayList<String> sharedNames = new ArrayList<String>();
		
		while (scan.hasNext()) {
			String[] lineArray = scan.nextLine().split("\\s+");
			//System.out.println(lineArray[1]);
			//System.out.println(Arrays.toString(lineArray));
			boyNames.add(lineArray[1]);
			girlNames.add(lineArray[3]);
		}
		
		//System.out.printf("%n"+boyNames);
		//System.out.println(boyNames.size());
		//System.out.printf("%n"+girlNames);
		//System.out.println(girlNames.size());
		
		for (int i = 0; i<boyNames.size(); i++ ) {
			if (girlNames.contains(boyNames.get(i))) {
				sharedNames.add(boyNames.get(i));	
			}
		}
		
		System.out.printf("%d names are used for both genders%n", sharedNames.size() );
		System.out.print("They are ");
		for (String name: sharedNames ) {
			System.out.print(name + " ");
		}
		//System.out.println(sharedNames);

	}
}
