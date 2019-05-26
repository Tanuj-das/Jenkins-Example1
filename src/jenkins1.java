import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jenkins1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String a="";
			System.out.println("Enter a string");
			String s=br.readLine();
			int t=s.length();
			for(int i=(t-1);i>-1;i--) {
			char ch=s.charAt(i);
			 a=a+ch;
			 }
			System.out.println(a);
	}
	
}

