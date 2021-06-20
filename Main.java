package study;

public class Main {
	public static void main(String[]args) {
	final String firstName="tetsuji";
    final String lastName="inoue";
        System.out.println(getName(firstName,lastName));           
        System.out.println(); 
     int[]arr= {11,12,13,14,15,16,17,18,19,20}; {
     for(int num=10;num<arr.length+10;num++){
       isOdd(num); 
     }
     }
	}
        public static String getName (String firstName, String lastName) {
	    String first_name=firstName;
	    String last_name=lastName;
    	return  first_name+last_name;
        }
        public static void isOdd(int num) {
          if(num % 2!=0) {
          System.out.println(num+"は奇数です。");
          }
        }
 }
