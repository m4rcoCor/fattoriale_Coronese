/**
 * 
 * @author marcoCor
 * @version 2.0
 *
 */
public class FattorialeClass {
	
/**
 * costruttore
 */
	
	public FattorialeClass() {}
	
	public int fattoriale(int n) {
		int fatt,i; 
		
		fatt=1;
		
		for (i=1; i<n; i++) //corretto <=
		{
			fatt=fatt*i;
		}
		return fatt;
	}

	public static void main(String[] args) {
		FattorialeClass f=new FattorialeClass();
		System.out.println("fattoriale: "+f.fattoriale(2));

	}

}
