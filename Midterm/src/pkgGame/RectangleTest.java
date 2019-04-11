package pkgGame;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class RectangleTest {
	private Rectangle R;
	private Rectangle r;

	
	@Test
	public void getWidth_test1(){
		R = new Rectangle(4,5);
		assertTrue(4 == R.getWidth());
	}
	@Test
	public void getWidth_test2(){
		R = new Rectangle(4,5);
		assertFalse(9 == R.getWidth());	
	}
	@Test
	public void Rectangle_test1(){
		R = new Rectangle(4,5);
		assertTrue((4 == R.getWidth()&&(5 == R.getLength())));	
	}
	@Test
	public void Rectangle_test2(){
		R = new Rectangle(18,29);
		assertTrue((18 == R.getWidth()&&(29 == R.getLength())));
	}
	@Test
	public void Rectangle_test3(){
		R = new Rectangle(4,5);
		assertFalse((6== R.getWidth()&&(5 == R.getLength())));
	}
	@Test
	public void setWidth_test1(){
		R = new Rectangle(4,5);
		int iWidth = 4;
		R.setWidth(4);
		int width = R.getWidth();
		assertTrue(iWidth == width);
	}
	@Test
	public void setWidth_test2(){
		R = new Rectangle(4,5);
		int iWidth = 4;
		R.setWidth(5);
		int width = R.getWidth();
		assertFalse(iWidth == width);
	}
	@Test
	public void setLength_test1(){
		R = new Rectangle(4,5);
		int iLength = 5;
		R.setLength(5);
		int Length = R.getLength();
		assertTrue(iLength == Length);
	}
	@Test
	public void setLength_test2(){
		R = new Rectangle(4,5);
		int iLength = 5;
		R.setLength(6);
		int Length = R.getLength();
		assertFalse(iLength == Length);
	}
	@Test
	public void area_test1() {
		R = new Rectangle(4,5);
		assertTrue(20 == R.area());
	}
	@Test
	public void area_test2(){
		R = new Rectangle(4,5);
		assertFalse(27 == R.area());
	}
	@Test
	public void perimeter_test1(){
		R = new Rectangle(4,5);
		assertFalse(848 == R.perimeter());
	}
	@Test
	public void perimeter_test2(){
		R = new Rectangle(4,5);
		assertTrue(18 == R.perimeter());
	}
	@Test( expected = IllegalArgumentException.class)
	public void Exception_test1() {
		Rectangle r = new Rectangle(45,549);
		r.setWidth(-9);
	}
	@Test( expected = IllegalArgumentException.class)
	public void Exception_test2() {
		Rectangle r = new Rectangle(45,-549);
	}
	@Test( expected = IllegalArgumentException.class)
	public void Exception_test3() {
		Rectangle r = new Rectangle(45,549);
		r.setLength(-9);
	}
	@Test
	public void compareTo_test1() {
		R = new Rectangle(4,5);
		r = new Rectangle(4,5);
		assertTrue(0==r.compareTo(R));
	}
	@Test
	public void compareTo_test2() {
		R = new Rectangle(4,5);
		r = new Rectangle(4,6);
		assertTrue(1==r.compareTo(R));
	}
	@Test
	public void compareTo_test3() {
		R = new Rectangle(4,6);
		r = new Rectangle(4,5);
		assertTrue(-1==r.compareTo(R));
	}
	@Test
	public void compareTo_test4() {
		R = new Rectangle(4,6);
		r = new Rectangle(4,5);
		assertFalse(1==r.compareTo(R));
	}
	
}

