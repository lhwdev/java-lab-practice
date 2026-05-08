import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reverse {
	public static void main(String[] args) throws IOException {
		List<String> lines = new ArrayList<>();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream("D:\\develop\\cs\\java-programming-lab\\lab-practice\\input.txt")));
		String d;
		while((d = reader.readLine()) != null) lines.add(d);
		reader.close();
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("D:\\develop\\cs\\java-programming-lab\\lab-practice\\output.txt")));
		for(int i = lines.size() - 1; i >= 0; i--) {
			writer.write(lines.get(i));
			writer.newLine();
		}
		writer.close();
	}
}
