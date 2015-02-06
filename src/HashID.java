import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class HashID {

	public static void main(String[] args) {
		Map<Integer, String> userIDHash = new HashMap<Integer, String>();
		Map<Integer, String> productIDHash = new HashMap<Integer, String>();
		int userCount = 0;
		int productCount = 0;
		String filePath = "/home/ralph/workspace/BigData_PA4_Recommender/test.txt";
		String line;
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(fr);
		
		try {
			while ((line = br.readLine()) != null) {
				String[] temp = line.split(",");
				if (!userIDHash.containsValue(temp[1])) {
					userIDHash.put(userCount, temp[1]);
					userCount++;
				}
				if (!productIDHash.containsValue(temp[0])) {
					productIDHash.put(productCount, temp[0]);
					productCount++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
