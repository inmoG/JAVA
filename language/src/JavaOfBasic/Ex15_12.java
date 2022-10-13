import java.io.*;

class Ex15_12 {
	public static void main(String[] args) {
		String line = "";

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			System.out.println("사용중인 OS 인코딩 :" + isr.getEncoding());

			do {
				System.out.print("문장을 입력하세요 마치시려면 q를 입력하세요.>");
				line = br.readLine();
				System.out.println("입력하신 문장 : " + line);
			} while (!line.equalsIgnoreCase("q"));

			// br.close(); // System.in�� ���� ǥ��������� ���� �ʾƵ� �ȴ�.
			System.out.println("프로그램을 종료합니다.");
		} catch (IOException e) {
		}
	} // main
}