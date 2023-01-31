package myTasks;

public class Star1 {
	public static void main(String[]args) {
		for(int i=1; i<=3; i++) {
			System.out.println(i);
				for(int l=0; l<3; l++) {
				System.out.print("*_");
	            } 
			System.out.println();
	      }
//////////////////////////////////////////////
		for (int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("*_");
			}
			System.out.print(" ");
		}
		System.out.println();
//////////////////////////////////////////////
		for (int i=1; i<4; i++) {
			System.out.print(i+"_");
			for (int j=1; j<=5; j++) {
				System.out.print(j);
			}
		}
		System.out.println();
//////////////////////////////////////////////
		for(int i=0; i<3; i++) {
			System.out.println();
			for(int j=0; j<3; j++) {
				System.out.print("10");
			}
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.println();
			for(int j=0; j<6; j++) {
				if(j%2==0) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
			}
		}
		System.out.println();
//////////////////////////////////////////////
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.println();
			for(int j=1; j<7; j++) {
				if(j%3==0) {
					System.out.print("x");
				}else if(j%2==0){
					System.out.print(0);
				}else {
					System.out.print(1);
				}
			}
		}
		System.out.println();
//////////////////////////////////////////////
   }
}
