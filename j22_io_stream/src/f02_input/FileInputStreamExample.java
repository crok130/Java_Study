package f02_input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		
		String filePath = "c:\\Temp\\file.txt";
		InputStream is = null;
		
		try {
			// 기반스트림 들은
			// 객체 생성 시 매개변수를 통해서 연결할 파일정보를 전달
			is = new FileInputStream(filePath);
			int readByte = 0;
			
			while(true) {
				// 1byte 단위로 읽어와서 byte를 int type으로 반환
				readByte = is.read();
				System.out.println(readByte);
				// EOF - EndOfFile
				// read()는 더이상 읽을 파일 정보가 존재하지 않으면
				// -1을 반환
				if(readByte == -1) {
					break;
				}
			} // end read while
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을수 없습니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}




