
public class RomanToNumeral {

	public int getNumeral(String numRom) {
		int numDeci = 0;
		for(int i = 0; i<numRom.length() ; ++i) {
			if(numRom[i]=='I') numDeci = numDeci +1;
			//if(numRom[i]=='V') numDeci = numDeci +5;
			//if(numRom[i]=='X') numDeci = numDeci +10;
			//if(numRom[i]=='L') numDeci = numDeci +50;
			//if(numRom[i]=='C') numDeci = numDeci +100;
			//if(numRom[i]=='D') numDeci = numDeci +500;
			//if(numRom[i]=='M') numDeci = numDeci +1000;
		}
		return numDeci;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
