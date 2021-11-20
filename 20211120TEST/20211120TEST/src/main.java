
public class main {
    public static int arr[]= {3,7,45,1,6,75,85,24,11,87};
	public static void main(String[] args) {
		for(int arr=1;arr<=100;arr++) {
			for(int j=2;(arr%j!=0 && j<arr)||j==arr;j++) {
				   if(j==arr) {
					   System.out.println(arr+"は素数です。");
				   }
			}
		}
	}
}
