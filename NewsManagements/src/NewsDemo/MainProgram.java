package NewsDemo;

import java.awt.Menu;
import java.util.Scanner;
import News.Dao.NewsDaoImpl;
public class MainProgram {
	public static int inputNumber;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsDaoImpl display=new NewsDaoImpl();
		display.menu();
		System.out.println("The Program end !!! ");
	}

}
