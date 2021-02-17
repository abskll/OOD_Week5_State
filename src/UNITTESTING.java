import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

class UNITTESTING {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		StateMachine stateMachine = new StateMachine(true, false, true);
		
		System.out.println(stateMachine);
		
		stateMachine.decreaselandsize();
		stateMachine.increasetemperature();
		stateMachine.inserttraffic();
		assertTrue(stateMachine.isHot);
		assertTrue(stateMachine.hasTraffic);
		assertFalse(stateMachine.isBig);
		
		System.out.println(stateMachine);
		
		stateMachine.decreasetemperature();
		stateMachine.increaselandsize();
		stateMachine.decreasetraffic();
		assertFalse(stateMachine.isHot);
		assertFalse(stateMachine.hasTraffic);
		assertTrue(stateMachine.isBig);
		System.out.println(stateMachine);
		
		stateMachine.decreasetemperature();
		stateMachine.increaselandsize();
		stateMachine.decreasetraffic();
		assertFalse(stateMachine.isHot);
		assertFalse(stateMachine.hasTraffic);
		assertTrue(stateMachine.isBig);
		System.out.println(stateMachine);
	}

}
