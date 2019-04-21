package lab5;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int chose;
		int num = 0;
		int dem = 0;
		String name[] = new String[5];
		String age[] = new String[5];
		do {
			System.out.println("Choose one numbers");
			System.out.println("1: Create  new Employees");
			System.out.println("2: Show the existing Employees");
			System.out.println("3: exit");

			Scanner sc = new Scanner(System.in);
			chose = sc.nextInt();

			switch (chose) {
			case 1:

				System.out.println("How many do you want to Create? : ");
				String pattern="[0-9]";
				num = sc.nextInt();
				for (int i = 0; i < num; i++) {
					
					name[i] = sc.nextLine();
					age[i] = sc.next();
					if(name[i].matches("^[A-Za-z, ]++$") && age[i].matches(pattern))
					{
						System.out.println("Name or Age invalid,Enter again ! ");
						name[i] = sc.nextLine();
						age[i] = sc.next();
					}
				}

				break;
			case 2:
				// check mang obj co empty hay khong
				for (int i = 0; i < 5; i++) {
					if (name[i] == null) {
						dem++;
					}
				}
				if (dem == name.length) {
					System.out.println("No exist");
					
				}
				// duyet obj trong mang
				for (int i = 0; i < num; i++) {
					System.out.print(name[i] + " ");
					System.out.println(age[i]);

				}
				break;
			case 3:

				break;
			}

		} while (chose != 3);
	}

}
