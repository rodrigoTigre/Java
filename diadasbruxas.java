package porjecto2;
import java.io.*;
public class diadasbruxas {

	
	public static void main(String[] args)throws IOException {
	String C="";
	System.out.println("digite do�ura ou travessura");
	InputStreamReader LerS  = new InputStreamReader (System.in);
	BufferedReader GuardaS = new BufferedReader (LerS);
	C = GuardaS.readLine();
	System.out.printf("digitou:"+ C, args);
			

	}

}