import java.util.Scanner;
import java.io.*;

public class VowelCount {
	public static void main(String[] args) {
		//load file
		File file = new File("warandpeace.txt")
		Scanner inputFile = new Scanner(file);
		
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		//read
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				for (int i=0; i<line.length(); i++) {
					if (line.charAt(i) == 'a' || line.charAt(i) == 'A') {
						aCount++;
					} else if (line.charAt(i) == 'e' || line.charAt(i) == 'E') {
						eCount++;
					} else if (line.charAt(i) == 'i' || line.charAt(i) == 'I') {
						iCount++;
					} else if (line.charAt(i) == 'o' || line.charAt(i) == 'O') {
						oCount++;
					} else if (line.charAt(i) == 'u' || line.charAt(i) == 'U') {
						uCount++;
					}
				}
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("File not found.");
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}
}