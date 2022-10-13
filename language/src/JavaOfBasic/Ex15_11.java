import java.io.*;

class Ex15_11 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("Ex15_11.java");
			BufferedReader br = new BufferedReader(fr);

			String line = "";
			for (int i = 1; (line = br.readLine()) != null; i++) {
				// ";" 포함한 라인 출력
				if (line.indexOf(";") != -1)
					System.out.println(i + ":" + line);
			}

			br.close();
		} catch (IOException e) {
		}
	} // main
}