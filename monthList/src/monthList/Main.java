package monthList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Attributes

		HashSet<Month> nonModificableList = new HashSet<Month>();
		ArrayList<Month> printableList = new ArrayList<Month>(nonModificableList);
		Iterator<Month> it = printableList.iterator();
		Scanner userEntry = new Scanner(System.in);
		int userOption = 0;
		int i = 0;

		// Month creation;

		Month month1 = new Month("null");
		month1.setName("Gener");
		nonModificableList.add(month1);
		Month month2 = new Month("null");
		month2.setName("Febrer");
		nonModificableList.add(month2);
		Month month3 = new Month("null");
		month3.setName("Març");
		nonModificableList.add(month3);
		Month month4 = new Month("null");
		month4.setName("Abril");
		nonModificableList.add(month4);
		Month month5 = new Month("null");
		month5.setName("Maig");
		nonModificableList.add(month5);
		Month month6 = new Month("null");
		month6.setName("Juny");
		nonModificableList.add(month6);
		Month month7 = new Month("null");
		month7.setName("Juliol");
		nonModificableList.add(month7);
		Month month8 = new Month("null");
		month8.setName("null");
		Month month9 = new Month("null");
		month9.setName("Septembre");
		nonModificableList.add(month9);
		Month month10 = new Month("null");
		month10.setName("Octubre");
		nonModificableList.add(month10);
		Month month11 = new Month("null");
		month11.setName("Novembre");
		nonModificableList.add(month11);
		Month month12 = new Month("null");
		month12.setName("Desembre");
		nonModificableList.add(month12);

		// Main code

		while (userOption == 0) {
			System.out
			.println("Escull una opció:" + "\n 1. Veure la llista de mesos." + "\n 2. Introduir el mes faltant."
					+ "\n 3. Ordenar la llista i mostrar-la per pantalla." + "\n 4. Sortir.");
			switch (userOption) {

			case 1:
				System.out.println(nonModificableList.getClass().getName());
				userOption = 0;
				break;
			case 2:
				month8.setName(insertMonth());
				nonModificableList.add(month8);
				userOption=0;
				break;
			case 3:
				
			}

		}

	}

	public static String insertMonth() {

		// Attributes

		Scanner sc = new Scanner(System.in);
		String userMonth = "null";

		// Method code

		while (userMonth.equalsIgnoreCase(null)) {
			System.out.println("Introdueix el mes faltant");
			userMonth = sc.nextLine();
			userMonth.trim();
		}

		return userMonth;
	}
	
	public static Month finalList(HashSet<Month> nonModificableList, ArrayList<Month> printableList(nonModificableList)) throws IncompletListException{
		
		//Attributes
		
		if
	}

}
