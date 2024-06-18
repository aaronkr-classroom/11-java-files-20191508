import java.io.File;
import java.io.IOException;

public class Ex1201 {

	public static void main(String[] args) {
		File fileobj = new File("example01.txt");//생성자
		
try {
	//새로운 파일을 생성하면 변화값은 true입니다.
	boolean success = fileobj.createNewFile();	
	if (success) {
		System.out.println("파일 생성 성공!");
	}else {
		System.out.println("파일 생성 실패!");
	}	
}catch(IOException e) {
	System.out.println(e);
}
		
		
		
	}

}
