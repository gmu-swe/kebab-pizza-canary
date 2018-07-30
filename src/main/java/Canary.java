/**
 * Created by michaelhilton on 5/1/17.
 */
@FlakyAnno
public class Canary {
	class inner{
		int i = 10;
		int k= 5;
	}
	
	
	
    public static void main(String args[]){
        System.out.println("Canary");
        System.out.println("testChange");
    }
    
    
    
    
    int i;
    static void m2(){
    	int k = 10;
    	System.out.println("M2");
    	System.out.println("Untested");
    }
    
    static void m3(){
    	System.out.println("new m3");
    }
    public Canary()
    {
    	
    }
}
