package us.infinitydev.physci.main;

public class Element {

	public int atomicNumber;
	public String symbol;
	public String name;
	public double atomicWeight;
	
	public Element(int atomicNumberI, String symbolI, String nameI, double atomicWeightI) {
		atomicNumber = atomicNumberI;
		symbol = symbolI;
		name = nameI;
		atomicWeight = atomicWeightI;
	}
	
	public int getAtomicNumber() {
		return atomicNumber;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public String getName() {
		return name;
	}
	
	public double getAtomicWeight() {
		return atomicWeight;
	}
	
}
