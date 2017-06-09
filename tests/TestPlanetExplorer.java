import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
/*
	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	*/
	@Test
	public void test_move_forth_north() throws PlanetExplorerException{
		PlanetExplorer pe = new PlanetExplorer(3,3,null);
		
		assertEquals("", "(0,1,n)", pe.executeCommand("f"));
	}
	
	@Test
	public void test_move_back_north() throws PlanetExplorerException{
		PlanetExplorer pe = new PlanetExplorer(3,3,null);
		pe.setRoverY(1);
		
		assertEquals("", "(0,0,n)", pe.executeCommand("b"));
	}
	
	@Test
	public void test_rotate_right() throws PlanetExplorerException{
		PlanetExplorer pe = new PlanetExplorer(3,3,null);
		
		assertEquals("", "(0,0,e)", pe.executeCommand("r"));
	}
	
	@Test
	public void test_rotate_left() throws PlanetExplorerException{
		PlanetExplorer pe = new PlanetExplorer(3,3,null);
		
		assertEquals("", "(0,0,w)", pe.executeCommand("l"));
	}
	
}
