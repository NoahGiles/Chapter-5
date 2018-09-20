package practice;

import java.util.Scanner;

public class IdScanner {
	
	public static void main(String[] args) {
		int idNumber;
		String result;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Scan the barcode to find a person >> ");
		idNumber = input.nextInt();
		
		switch(idNumber)
		{
		case 316338:
			result = "Logan DeWilfond";
			break;
		case 155706:
			result = "Joseph Chalupa";
			break;
		case 274891:
			result = "Jason Wells";
			break;
		case 137112:
			result = "Adam Burton";
			break;
		case 137160:
			result = "Zach Canada";
			break;
		case 153184:
			result = "Jayden Graap";
			break;
		case 159343:
			result = "Giovanni Jacobsen";
			break;
		case 129001:
			result = "Isaac Dibbern";
			break;
		case 274871:
			result = "Tavius Sterling";
			break;
		case 153182:
			result = "Orion Gardner";
			break;
		case 274904:
			result = "Amia Combs";
			break;
		case 304345:
			result = "Cheyenne Jones";
			break;
		case 274894:
			result = "John Brosius";
			break;
		case 118314:
			result = "Benjamen Brooks";
			break;
		case 146891:
			result = "De'Antwan Hanes";
			break;
		case 146468:
			result = "Noah Giles";
			break;
		case 274888:
			result = "Travis Hodges";
			break;
		case 315135:
			result = "Phero Luong";
			break;
		default:
			result = "Not available";
		}
		System.out.println(result);
		
	}
}
