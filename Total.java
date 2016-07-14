import java.io.*;

public class Total {
	public static void main(String[] args) {
		File f = new File(args[0]);
		long fileSize = f.length();
		long count = fileSize / 8L;
		
		try (DataInputStream dis = 
				new DataInputStream(
				new BufferedInputStream(
				new FileInputStream(args[0])))) {
			double sum = 0.0;
			for (int i=0; i < count; i++)
				sum += dis.readDouble();
			System.out.printf("%.04f", sum);
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}
}