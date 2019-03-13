package triangle;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TriangleTest {
    private TriangleJudge tj;
    public Boolean b;
    public int x;
    
    
	public TriangleTest(Boolean b,int x) {
		this.b=b;
		this.x=x;
	}
	@Before
	public void setUp(){
	  tj=new TriangleJudge();
	}
	@Parameters
	public static Collection<Object[]> triangleValues(){
		return Arrays.asList(new Object[][]{{true,83},{false,84}});
	}
	@Test
	public void testTriangle(){
	 equals(b==tj.IsTriangle(x));
		
	}

}
