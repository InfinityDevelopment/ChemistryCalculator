package us.infinitydev.physci.main;

import java.util.Scanner;

public class MainClass {
	
	public static void addElements() {
		
		Element hydrogen = new Element(1, "H", "Hydrogen", 1.008);
		ChemistryCalculator.elements.add(hydrogen);
		
		Element helium = new Element(2, "He", "Helium", 4.003);
		ChemistryCalculator.elements.add(helium);
		
		Element lithium = new Element(3, "Li", "Lithium", 6.941);
		ChemistryCalculator.elements.add(lithium);
		
		Element beryllium = new Element(4, "Be", "Beryllium", 9.012);
		ChemistryCalculator.elements.add(beryllium);
		
		Element boron = new Element(5, "B", "Boron", 10.811);
		ChemistryCalculator.elements.add(boron);
		
		Element carbon = new Element(6, "C", "Carbon", 12.011);
		ChemistryCalculator.elements.add(carbon);
		
		Element nitrogen = new Element(7, "N", "Nitrogen", 14.007);
		ChemistryCalculator.elements.add(nitrogen);
		
		Element oxygen = new Element(8, "O", "Oxygen", 15.999);
		ChemistryCalculator.elements.add(oxygen);
		
		Element fluorine = new Element(9, "F", "Fluorine", 18.998);
		ChemistryCalculator.elements.add(fluorine);
		
		Element neon = new Element(10, "Ne", "Neon", 20.180);
		ChemistryCalculator.elements.add(neon);
		
		Element sodium = new Element(11, "Na", "Sodium", 22.990);
		ChemistryCalculator.elements.add(sodium);
		
		Element magnesium = new Element(12, "Mg", "Magnesium", 24.305);
		ChemistryCalculator.elements.add(magnesium);
		
		Element aluminum = new Element(13, "Al", "Aluminum", 26.982);
		ChemistryCalculator.elements.add(aluminum);
		
		Element silicon = new Element(14, "Si", "Silicon", 28.086);
		ChemistryCalculator.elements.add(silicon);
		
		Element phosphorus = new Element(15, "P", "Phosphorus", 30.974);
		ChemistryCalculator.elements.add(phosphorus);
		
		Element sulfur = new Element(16, "S", "Sulfur", 32.066);
		ChemistryCalculator.elements.add(sulfur);
		
		Element chlorine = new Element(17, "Cl", "Chlorine", 35.453);
		ChemistryCalculator.elements.add(chlorine);
		
		Element argon = new Element(18, "Ar", "Argon", 39.948);
		ChemistryCalculator.elements.add(argon);
		
		Element potassium = new Element(19, "K", "Potassium", 39.098);
		ChemistryCalculator.elements.add(potassium);
		
		Element calcium = new Element(20, "Ca", "Calcium", 40.078);
		ChemistryCalculator.elements.add(calcium);
		
		Element scandium = new Element(21, "Sc", "Scandium", 44.956);
		ChemistryCalculator.elements.add(scandium);
		
		Element titanium = new Element(22, "Ti", "Titanium", 47.88);
		ChemistryCalculator.elements.add(titanium);
		
		Element vanadium = new Element(23, "V", "Vanadium", 50.942);
		ChemistryCalculator.elements.add(vanadium);
		
		Element chromium = new Element(24, "Cr", "Chromium", 51.996);
		ChemistryCalculator.elements.add(chromium);
		
		Element manganese = new Element(25, "Mn", "Manganese", 54.938);
		ChemistryCalculator.elements.add(manganese);
		
		Element iron = new Element(26, "Fe", "Iron", 55.933);
		ChemistryCalculator.elements.add(iron);
		
		Element cobalt = new Element(27, "Co", "Cobalt", 58.933);
		ChemistryCalculator.elements.add(cobalt);
		
		Element nickel = new Element(28, "Ni", "Nickel", 58.693);
		ChemistryCalculator.elements.add(nickel);
		
		Element copper = new Element(29, "Cu", "Copper", 63.546);
		ChemistryCalculator.elements.add(copper);
		
		Element zinc = new Element(30, "Zn", "Zinc", 65.39);
		ChemistryCalculator.elements.add(zinc);
		
		Element gallium = new Element(31, "Ga", "Gallium", 69.732);
		ChemistryCalculator.elements.add(gallium);
		
		Element germanium = new Element(32, "Ge", "Germanium", 72.61);
		ChemistryCalculator.elements.add(germanium);
		
		Element arsenic = new Element(33, "As", "Arsenic", 74.922);
		ChemistryCalculator.elements.add(arsenic);
		
		Element selenium = new Element(34, "Se", "Selenium", 78.972);
		ChemistryCalculator.elements.add(selenium);
		
		Element bromine = new Element(35, "Br", "Bromine", 79.904);
		ChemistryCalculator.elements.add(bromine);
		
		Element krypton = new Element(36, "Kr", "Krypton", 84.80);
		ChemistryCalculator.elements.add(krypton);
		
		Element rubidium = new Element(37, "Rb", "Rubidium", 84.468);
		ChemistryCalculator.elements.add(rubidium);
		
		Element strontium = new Element(38, "Sr", "Strontium", 87.62);
		ChemistryCalculator.elements.add(strontium);
		
		Element yttrium = new Element(39, "Y", "Yttrium", 88.906);
		ChemistryCalculator.elements.add(yttrium);
		
		Element zirconium = new Element(40, "Zr", "Zirconium", 91.224);
		ChemistryCalculator.elements.add(zirconium);
		
		Element niobium = new Element(41, "Nb", "Niobium", 92.906);
		ChemistryCalculator.elements.add(niobium);
		
		Element molybdenum = new Element(42, "Mo", "Molybdenum", 95.95);
		ChemistryCalculator.elements.add(molybdenum);
		
		Element technetium = new Element(43, "Tc", "Technetium", 98.907);
		ChemistryCalculator.elements.add(technetium);
		
		Element ruthenium = new Element(44, "Ru", "Ruthenium", 101.07);
		ChemistryCalculator.elements.add(ruthenium);
		
		Element rhodium = new Element(45, "Rh", "Rhodium", 102.906);
		ChemistryCalculator.elements.add(rhodium);
		
	    Element palladium = new Element(46, "Pd", "Palladium", 106.42);
	    ChemistryCalculator.elements.add(palladium);
	    
	    Element silver = new Element(47, "Ag", "Silver", 107.868);
	    ChemistryCalculator.elements.add(silver);
	    
	    Element cadmium = new Element(48, "Cd", "Cadmium", 112.411);
	    ChemistryCalculator.elements.add(cadmium);
	    
	    Element indium = new Element(49, "In", "Indium", 114.818);
	    ChemistryCalculator.elements.add(indium);
	    
	    Element tin = new Element(50, "Sn", "Tin", 118.71);
	    ChemistryCalculator.elements.add(tin);
	    
	    Element antimony = new Element(51, "Sb", "Antimony", 121.760);
	    ChemistryCalculator.elements.add(antimony);
	    
	    Element tellurium = new Element(52, "Te", "Tellurium", 127.6);
	    ChemistryCalculator.elements.add(tellurium);
	    
	    Element iodine = new Element(53, "I", "Iodine", 126.904);
	    ChemistryCalculator.elements.add(iodine);
	    
	    Element xenon = new Element(54, "Xe", "Xenon", 131.29);
	    ChemistryCalculator.elements.add(xenon);
	    
	    Element cesium = new Element(55, "Cs", "Cesium", 132.905);
	    ChemistryCalculator.elements.add(cesium);
	    
	    Element barium = new Element(56, "Ba", "Barium", 137.327);
	    ChemistryCalculator.elements.add(barium);
	    
	    Element lanthanum = new Element(57, "La", "Lanthanum", 138.906);
	    ChemistryCalculator.elements.add(lanthanum);
	    
	    Element cerium = new Element(58, "Ce", "Cerium", 140.115);
	    ChemistryCalculator.elements.add(cerium);
	    
	    Element praseodymium = new Element(59, "Pr", "Praseodymium", 140.908);
	    ChemistryCalculator.elements.add(praseodymium);
	    
	    Element neodymium = new Element(60, "Nd", "Neodymium", 144.24);
	    ChemistryCalculator.elements.add(neodymium);
	    
	    Element promethium = new Element(61, "Pm", "Promethium", 144.913);
	    ChemistryCalculator.elements.add(promethium);
	    
	    Element samarium = new Element(62, "Sm", "Samarium", 150.36);
	    ChemistryCalculator.elements.add(samarium);
	    
	    Element europium = new Element(63, "Eu", "Europium", 151.966);
	    ChemistryCalculator.elements.add(europium);
	    
	    Element gadolinium = new Element(64, "Gd", "Gadolinium", 157.25);
	    ChemistryCalculator.elements.add(gadolinium);
	    
	    Element terbium = new Element(65, "Tb", "Terbium", 158.925);
	    ChemistryCalculator.elements.add(terbium);
	    
	    Element dysprosium = new Element(66, "Dy", "Dysprosium", 162.50);
	    ChemistryCalculator.elements.add(dysprosium);
	    
	    Element holmium = new Element(67, "Ho", "Hoolmium", 164.930);
	    ChemistryCalculator.elements.add(holmium);
	    
	    Element erbium = new Element(68, "Er", "Erbium", 167.26);
	    ChemistryCalculator.elements.add(erbium);
	    
	    Element thulium = new Element(69, "Tm", "Thulium", 168.934);
	    ChemistryCalculator.elements.add(thulium);
	    
	    Element ytterbium = new Element(70, "Yb", "Ytterbium", 173.04);
	    ChemistryCalculator.elements.add(ytterbium);
	    
	    Element lutetium = new Element(71, "Lu", "Lutetium", 174.967);
	    ChemistryCalculator.elements.add(lutetium);
	    
	    Element hafnium = new Element(72, "Hf", "Hafnium", 178.49);
	    ChemistryCalculator.elements.add(hafnium);
	    
	    Element tantalum = new Element(73, "Ta", "Tantalum", 180.948);
	    ChemistryCalculator.elements.add(tantalum);
	    
	    Element tungsten = new Element(74, "W", "Tungsten", 183.85);
	    ChemistryCalculator.elements.add(tungsten);
	    
	    Element rhenium = new Element(75, "Re", "Rhenium", 186.207);
	    ChemistryCalculator.elements.add(rhenium);
	    
	    Element osmium = new Element(76, "Os", "Osmium", 190.23);
	    ChemistryCalculator.elements.add(osmium);
	    
	    Element iridium = new Element(77, "Ir", "Iridium", 192.22);
	    ChemistryCalculator.elements.add(iridium);
	    
	    Element platinum = new Element(78, "Pt", "Platinum", 195.08);
	    ChemistryCalculator.elements.add(platinum);
	    
	    Element gold = new Element(79, "Au", "Gold", 196.967);
	    ChemistryCalculator.elements.add(gold);
	    
	    Element mercury = new Element(80, "Hg", "Mercury", 200.59);
	    ChemistryCalculator.elements.add(mercury);
	    
	    Element thallium = new Element(81, "Tl", "Thallium", 204.383);
	    ChemistryCalculator.elements.add(thallium);
	    
	    Element lead = new Element(82, "Pb", "Lead", 207.2);
	    ChemistryCalculator.elements.add(lead);
	    
	    Element bismuth = new Element(83, "Bi", "Bismuth", 208.980);
	    ChemistryCalculator.elements.add(bismuth);
	    
	    Element polonium = new Element(84, "Po", "Polonium", 208.982);
	    ChemistryCalculator.elements.add(polonium);
	    
	    Element astatine = new Element(85, "At", "Astatine", 209.987);
	    ChemistryCalculator.elements.add(astatine);
	    
	    Element radon = new Element(86, "Rn", "Radon", 222.018);
	    ChemistryCalculator.elements.add(radon);
	    
	    Element francium = new Element(87, "Fr", "Francium", 223.020);
	    ChemistryCalculator.elements.add(francium);
		
	    Element radium = new Element(88, "Ra", "Radium", 226.025);
	    ChemistryCalculator.elements.add(radium);
	    
	    Element actinium = new Element(89, "Ac", "Actinium", 227.028);
	    ChemistryCalculator.elements.add(actinium);
	    
	    Element thorium = new Element(90, "Th", "Thorium", 232.038);
	    ChemistryCalculator.elements.add(thorium);
	    
	    Element protactinium = new Element(91, "Pa", "Protactinium", 231.036);
	    ChemistryCalculator.elements.add(protactinium);
	    
	    Element uranium = new Element(92, "U", "Uranium", 238.029);
	    ChemistryCalculator.elements.add(uranium);
	    
	    Element neptunium = new Element(93, "Np", "Neptunium", 237.048);
	    ChemistryCalculator.elements.add(neptunium);
	    
	    Element plutonium = new Element(94, "Pu", "Plutonium", 244.064);
	    ChemistryCalculator.elements.add(plutonium);
	    
	    Element americum = new Element(95, "Am", "Americum", 243.061);
	    ChemistryCalculator.elements.add(americum);
	    
	    Element curium = new Element(96, "Cm", "Curium", 247.070);
	    ChemistryCalculator.elements.add(curium);
	    
	    Element berkelium = new Element(97, "Bk", "Berkelium", 247.070);
	    ChemistryCalculator.elements.add(berkelium);
	    
	    Element californium = new Element(98, "Cf", "Californium", 251.080);
	    ChemistryCalculator.elements.add(californium);
	    
	    Element einsteinium = new Element(99, "Es", "Einsteinium", 254);
	    ChemistryCalculator.elements.add(einsteinium);
	    
	    Element fermium = new Element(100, "Fm", "Fermium", 257.095);
	    ChemistryCalculator.elements.add(fermium);
	    
	    Element mendelevium = new Element(101, "Md", "Mendelevium", 258.1);
	    ChemistryCalculator.elements.add(mendelevium);
	    
	    Element nobelium = new Element(102, "No", "Nobelium", 259.101);
	    ChemistryCalculator.elements.add(nobelium);
	    
	    Element lawrencium = new Element(103, "Lr", "Lawrencium", 262);
	    ChemistryCalculator.elements.add(lawrencium);
	    
	    Element rutherfordium = new Element(104, "Rf", "Rutherfordium", 261);
	    ChemistryCalculator.elements.add(rutherfordium);
	    
	    Element dubnium = new Element(105, "Db", "Dubnium", 262);
	    ChemistryCalculator.elements.add(dubnium);
	    
	    Element seaborgium = new Element(106, "Sg", "Seaborgium", 266);
	    ChemistryCalculator.elements.add(seaborgium);
	    
	    Element bohrium = new Element(107, "Bh", "Bohrium", 264);
	    ChemistryCalculator.elements.add(bohrium);
	    
	    Element hassium = new Element(108, "Hs", "Hassium", 269);
	    ChemistryCalculator.elements.add(hassium);
	    
	    Element meitnerium = new Element(109, "Mt", "Meitnerium", 268);
	    ChemistryCalculator.elements.add(meitnerium);
	    
	    Element darmstadtium = new Element(110, "Ds", "Darmstadtium", 269);
	    ChemistryCalculator.elements.add(darmstadtium);
	    
	    Element roentgenium = new Element(111, "Rg", "Roentgenium", 272);
	    ChemistryCalculator.elements.add(roentgenium);
	    
	    Element copernicium = new Element(112, "Cn", "Copernicium", 277);
	    ChemistryCalculator.elements.add(copernicium);
	    
		mainMenu();
	}
	
	public static boolean isDouble(String s) {
		boolean isNumber = true;
		for(Character cPrimer : s.toCharArray()) {
			
			String c = Character.toString(cPrimer);
			
			if(c.equalsIgnoreCase("a") ||
					c.equalsIgnoreCase("b") ||
					c.equalsIgnoreCase("c") ||
					c.equalsIgnoreCase("d") ||
					c.equalsIgnoreCase("e") ||
					c.equalsIgnoreCase("f") ||
					c.equalsIgnoreCase("g") ||
					c.equalsIgnoreCase("h") ||
					c.equalsIgnoreCase("i") ||
					c.equalsIgnoreCase("j") ||
					c.equalsIgnoreCase("k") ||
					c.equalsIgnoreCase("l") ||
					c.equalsIgnoreCase("m") ||
					c.equalsIgnoreCase("n") ||
					c.equalsIgnoreCase("o") ||
					c.equalsIgnoreCase("p") ||
					c.equalsIgnoreCase("q") ||
					c.equalsIgnoreCase("r") ||
					c.equalsIgnoreCase("s") ||
					c.equalsIgnoreCase("t") ||
					c.equalsIgnoreCase("u") ||
					c.equalsIgnoreCase("v") ||
					c.equalsIgnoreCase("w") ||
					c.equalsIgnoreCase("x") ||
					c.equalsIgnoreCase("y") ||
					c.equalsIgnoreCase("z") ||
					c.equalsIgnoreCase(" ")) {
				
				isNumber = false;
				break;
				
			}
		}
		return isNumber;
	}
	
	public static boolean isInteger(String s) {
		boolean isNumber = true;
		for(Character cPrimer : s.toCharArray()) {
			
			String c = Character.toString(cPrimer);
			
			if(c.equalsIgnoreCase("a") ||
					c.equalsIgnoreCase("b") ||
					c.equalsIgnoreCase("c") ||
					c.equalsIgnoreCase("d") ||
					c.equalsIgnoreCase("e") ||
					c.equalsIgnoreCase("f") ||
					c.equalsIgnoreCase("g") ||
					c.equalsIgnoreCase("h") ||
					c.equalsIgnoreCase("i") ||
					c.equalsIgnoreCase("j") ||
					c.equalsIgnoreCase("k") ||
					c.equalsIgnoreCase("l") ||
					c.equalsIgnoreCase("m") ||
					c.equalsIgnoreCase("n") ||
					c.equalsIgnoreCase("o") ||
					c.equalsIgnoreCase("p") ||
					c.equalsIgnoreCase("q") ||
					c.equalsIgnoreCase("r") ||
					c.equalsIgnoreCase("s") ||
					c.equalsIgnoreCase("t") ||
					c.equalsIgnoreCase("u") ||
					c.equalsIgnoreCase("v") ||
					c.equalsIgnoreCase("w") ||
					c.equalsIgnoreCase("x") ||
					c.equalsIgnoreCase("y") ||
					c.equalsIgnoreCase("z") ||
					c.equalsIgnoreCase(".") ||
					c.equalsIgnoreCase(" ")) {
				
				isNumber = false;
				break;
				
			}
		}
		return isNumber;
	}
	
	public static void mainMenu() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Would you like to lookup an element by symbol (symbol)?\n" + "Would you like to calculate half-lives (halflife)?");
		String choice = scanner.nextLine();
		
		if(choice.equalsIgnoreCase("symbol")) {
			symbol();
		}else if(choice.equalsIgnoreCase("halflife")) {
			halfLife();
		//}
		//else if(choice.equalsIgnoreCase("isotope")) {
			//isotope();
		//}else if(choice.equalsIgnoreCase("decay")) {
			//decay();
		}else {
			System.out.println("That is not an option. Please re-enter your answer.");
			mainMenu();
			return;
		}
		
	}
	
	public static void symbol() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("To find an element, enter it's name, symbol, atomic number, or atomic weight: ");
		String dataInput = scanner.nextLine();
		
		Element data = null;
		
		for(Element e : ChemistryCalculator.elements) {
			if(e.getSymbol().equalsIgnoreCase(dataInput)) {
				data = e;
			}else if(e.getName().equalsIgnoreCase(dataInput)) {
				data = e;
			}else if(isInteger(dataInput)) {
			    if(e.getAtomicNumber() == (Integer.parseInt(dataInput))) {
					data = e;
				}
			}else if(isDouble(dataInput)) {
				if(e.getAtomicWeight() == (Double.parseDouble(dataInput))) {
					data = e;
				}
			}
		}
		
		if(data != null) {
			System.out.println("Name: " + data.getName());
			System.out.println("Symbol: " + data.getSymbol());
			System.out.println("Atomic Number: " + String.valueOf(data.getAtomicNumber()));
			System.out.println("Atomic Weight: " + String.valueOf(data.getAtomicWeight()));
		}else {
			System.out.println("That element doesn't exist. Remember that the program's periodic table stops at Copernicium (112).");
			symbol();
			return;
		}
		
		System.out.println("Go back to main menu? (Y/N): ");
		String goBack = scanner.nextLine();
		
		if(goBack.equalsIgnoreCase("Y")) {
			mainMenu();
		}else {
			return;
		}
	}
	
	public static void isotope() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Go back to main menu? (Y/N): ");
		String goBack = scanner.nextLine();
		
		if(goBack.equalsIgnoreCase("Y")) {
			mainMenu();
		}else {
			return;
		}
	}
	
	public static void decay() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Go back to main menu? (Y/N): ");
		String goBack = scanner.nextLine();
		
		if(goBack.equalsIgnoreCase("Y")) {
			mainMenu();
		}else {
			return;
		}
	}
	
	public static void halfLife() {
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Grams of radioactive isotope: ");
		String gramspre = scanner.nextLine();
		
		if(!isDouble(gramspre)) {
			System.out.println("Your amount of grams must be a double!");
			halfLife();
			return;
		}
		
		System.out.println("Half-lifes: ");
		String halflifespre = scanner.nextLine();
		
		if(!isInteger(halflifespre)) {
			System.out.println("Your amount of half-lifes must be an integer!");
			halfLife();
			return;
		}
		
		Double remainingGrams = Double.valueOf(gramspre);
		Integer halflifes = Integer.valueOf(halflifespre);
		
		for(int i = 0; i < (halflifes); i++) {
			remainingGrams = remainingGrams / 2;
		}
		
		System.out.println("Remaining grams: " + String.valueOf(remainingGrams) + " grams.");
		
		System.out.println("Go back to main menu? (Y/N): ");
		String goBack = scanner.nextLine();
		
		if(goBack.equalsIgnoreCase("Y")) {
			mainMenu();
		}else {
			return;
		}
		
		return;
	}
	
}
