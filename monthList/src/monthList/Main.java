package monthList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IncompletListException {
		// TODO Auto-generated method stub

		// Attributes

		HashSet<Month> nonModificableList = new HashSet<Month>();
		ArrayList<Month> printableList = new ArrayList<Month>();
		Scanner userEntry = new Scanner(System.in);
		int userOption = 0;
		int i = 0;

		// Month creation;

		Month month1 = new Month("null");
		month1.setName("Gener");
		printableList.add(month1);
		Month month2 = new Month("null");
		month2.setName("Febrer");
		printableList.add(month2);
		Month month3 = new Month("null");
		month3.setName("Març");
		printableList.add(month3);
		Month month4 = new Month("null");
		month4.setName("Abril");
		printableList.add(month4);
		Month month5 = new Month("null");
		month5.setName("Maig");
		printableList.add(month5);
		Month month6 = new Month("null");
		month6.setName("Juny");
		printableList.add(month6);
		Month month7 = new Month("null");
		month7.setName("Juliol");
		printableList.add(month7);
		Month month8 = new Month("null");
		month8.setName("null");
		Month month9 = new Month("null");
		month9.setName("Septembre");
		printableList.add(month9);
		Month month10 = new Month("null");
		month10.setName("Octubre");
		printableList.add(month10);
		Month month11 = new Month("null");
		month11.setName("Novembre");
		printableList.add(month11);
		Month month12 = new Month("null");
		month12.setName("Desembre");
		printableList.add(month12);
		nonModificableList.addAll(printableList);
		Iterator<Month> it = nonModificableList.iterator();
		// Main code

		while (userOption == 0) {
			System.out
			.println("Escull una opció:" + "\n 1. Veure la llista de mesos." + "\n 2. Introduir el mes faltant."
					+ "\n 3. Ordenar la llista i mostrar-la per pantalla." + "\n 4. Sortir.");
			userOption = userEntry.nextInt();
			switch (userOption) {
			case 1:
				while (it.hasNext()) {
					System.out.println(it.next().getName());
				}
				userOption = 0;
				break;
			case 2:
				try {
					month8.setName(insertMonth());
					printableList.add(7, month8);
					nonModificableList.addAll(printableList);
					userOption = 0;
					break;
				} catch (CorrectMonthException e) {
					System.out.println("El programa ha produit un error: " + e.getLocalizedMessage());
					userOption=0;
					break;
				}

			case 3:
				try {
					if (exceptionIncomplet(nonModificableList)) {
						for (i = 0; i < printableList.size(); i++) {
							System.out.println(printableList.get(i).getName());
						}
						userOption = 0;
						break;
					}
				}

				catch (IncompletListException e) {
					System.out.println("L'acció solicitada no es pot realitzar pel següent motiu: " + e.getMessage());
					userOption = 0;
					break;
				}
			case 4:
				System.out.println("Fins després!");
			}

		}

	}

	public static String insertMonth() throws CorrectMonthException {

		// Attributes

		Scanner sc = new Scanner(System.in);
		String userMonth = "null";

		// Method code

		while (userMonth.equalsIgnoreCase("null")) {
			System.out.println("Introdueix el mes faltant");
			userMonth = sc.nextLine();
			if (userMonth.trim().equalsIgnoreCase("agost")) {
				userMonth = "Agost";
			} else {
				throw new CorrectMonthException("El mes no es correcte.");
			}
		}

		return userMonth;
	}

	public static boolean exceptionIncomplet(HashSet<Month> nonModificableList) throws IncompletListException {

		// Attributes

		boolean statusList = false;

		// Method Code

		if (nonModificableList.size() == 12) {
			statusList = true;
		} else {
			throw new IncompletListException("La llista no es complerta, l'acció no es pot executar");
		}
		return statusList;
	}

}
