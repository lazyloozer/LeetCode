
public class Fibonnai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int first=0;
		int second=1;
		int next=0;
		for(int i=2;i<=n;i++) {
			next=first+second;
			first=second;
			second=next;
			
			
		}
		System.out.println("fiboonai"+next);

	}

}
