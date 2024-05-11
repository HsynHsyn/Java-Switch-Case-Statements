/* Write a program to display traffic light colors using following logic:
if code (R/r)-->"Red"
if code (O/o)-->"Orange"
if code (G/g)-->"Green"*/

package Day8_If_Else_Switch_Case_Statements;

public class Task11 {

	public static void main(String[] args) {

		String trafficLight="R/r";
		
		switch(trafficLight) {
		
		case "R/r":
			System.out.println(trafficLight + " -->"+ " Traffic Light is Red" );
			break;
		case "O/o":
			System.out.println(trafficLight + " -->"+ " Traffic Light is Orange" );
			break;
		case "G/g":
			System.out.println(trafficLight + " -->"+ " Traffic Light is Green" );
			break;
		default:
			System.out.println("No traffic light on the way");

	
		}
	}

}
