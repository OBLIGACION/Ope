//Loop Control (break)
public class Main {
	public static void main(String[] args) {
		int y = 1;
		
		while (y>0) {
		    System.out.println(y);
		    if (y==4) {
		        break; // stop loop to 4 only
		    }
		    y++;
		}
		
// Loop Control (continue)
		for(int x= 10; x<=40; x=x+10) {
		    if(x == 30) {
		        continue; /* skip the no.30 and continue to 40*/
		    }
		    System.out.println(x);
		}
	}
}