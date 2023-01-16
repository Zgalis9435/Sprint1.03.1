package monthList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Attributes
		
		HashSet<Month> nonModificableList = new HashSet<Month>();
		List<Month> printableList = new ArrayList<Month>(nonModificableList);
		Iterator<Month> it = printableList.iterator();
		Scanner userEntry = new Scanner (System.in);
		int userOption=0;
		int i = 0;
		
		//Month creation;
		
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
		
		//Main code
		
		
		
	}
}
