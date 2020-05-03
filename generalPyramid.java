import java.util.Scanner;

class generalPyramid { 
    
    //prints out the number of spaces given
    public static void spaces(int x) {
	for(int i =0; i < x; i++) {
	    System.out.print(" " );
	} //for loop
    } //spaces
    
    public static void pyramid(int numLines) {
	int bound = 0;
	int size = (2 * numLines) - 1;
	numLines++;
	for(int i = 0; i <  numLines; i++) {
	    bound = (size - ((2*i) - 1)) / 2;
	    spaces(bound);
	    for( int j = 0; j < 2 * i - 1; j++) {
		System.out.print('*');
	    } // inner for
	    spaces(bound);
	    System.out.println();
	} //outter for
	
	
    } //pyramid

    
    public static void inversePyramid(int numLines) {
	int bound = 0;
	int size = (2 * numLines) - 1;
	for(int i = numLines; i > 0; i--) {
	    bound = (size - ( (2 * i ) - 1) ) / 2;
	    spaces(bound);
	    for(int j = 2*i - 1; j > 0; j--) {
		System.out.print('*');
		
	    } //inner for
	    spaces(bound);
	    System.out.println();
	}//outter for
    } // inversePyramid
    

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int lines = 0;
	System.out.print("Enter the number of lines: ");
	lines = keyboard.nextInt();
	System.out.println();
	System.out.print("Enter 'R' for regular pyramid, 'I' for inverse pyramid: ");
	String type = keyboard.next();
	System.out.println();
	if(type.toLowerCase().equals("r")) {
	   pyramid(lines);
	}
	else if (type.toLowerCase().equals("i")) {
	   inversePyramid(lines);
	} else {
	    System.out.println("Invalid Type");
	} //if-else block
    }//main
    
} //generalPyramid