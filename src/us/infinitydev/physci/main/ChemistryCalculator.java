package us.infinitydev.physci.main;

import java.util.ArrayList;
import java.util.List;

public class ChemistryCalculator {

	public static ChemistryCalculator instance;
	
	public static ChemistryCalculator getInstance() {
		return instance;
	}
	
	public static List<Element> elements = new ArrayList<Element>();
	
	public static void main(String[] args) {
		
		MainClass.addElements();
		
	}
	
}
