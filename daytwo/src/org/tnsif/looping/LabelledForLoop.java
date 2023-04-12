package org.tnsif.looping;

public class LabelledForLoop {

	public static void main(String[] args) {
		//label
		outer:
			for(int i=1;i<=5;i++) {
				System.out.println();
				inner:
					for(int j=1;j<=5;j++) {
						
						if(j==4)
							continue;
						System.out.print(j+" ");
						
					}
			}

	}

}
