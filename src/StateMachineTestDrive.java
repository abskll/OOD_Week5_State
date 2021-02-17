
public class StateMachineTestDrive {
	
	public static void main(String[] args) {
		StateMachine stateMachine = new StateMachine(true, false, true);
		
		System.out.println(stateMachine);
		
		stateMachine.decreaselandsize();
		stateMachine.increasetemperature();
		stateMachine.inserttraffic();
		System.out.println(stateMachine);
		
		stateMachine.decreasetemperature();
		stateMachine.increaselandsize();
		stateMachine.decreasetraffic();
		System.out.println(stateMachine);
		
		stateMachine.decreasetemperature();
		stateMachine.increaselandsize();
		stateMachine.decreasetraffic();
		System.out.println(stateMachine);
		
	}

	
}
