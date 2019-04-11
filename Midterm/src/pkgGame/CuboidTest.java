package pkgGame;

import static org.junit.Assert.*;
import pkgGame.Cuboid.SortByArea;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

import pkgGame.Cuboid.SortByVolume;

public class CuboidTest {
	private Cuboid c;
	private Cuboid C;
	@Test
	public void Cuboid_test1(){
		C = new Cuboid(1,3,5);
		assertTrue(15 == C.volume());
	}
	@Test
	public void Cuboid_test2(){
		C = new Cuboid(1,3,5);
		assertFalse(159 == C.volume());
	}
	@Test
	public void getDepth_test1(){
		C = new Cuboid(1,3,5);
		assertTrue(5 == C.getDepth());
	}
	@Test
	public void getDepth_test2(){
		C = new Cuboid(1,3,5);
		assertFalse(6 == C.getDepth());
	}
	@Test
	public void setDepth_test1(){
		int D = 5;
		C = new Cuboid(1,3,5);
		int depth = C.getDepth();
		assertTrue(D == depth);
	}
	@Test
	public void setDepth_test2(){
		int D = 5;
		C = new Cuboid(1,3,5);
		int depth = C.getDepth();
		assertFalse(D != depth);
	}
	@Test
	public void volume_test1(){
		C = new Cuboid(1,3,5);
		double V = C.volume();
		assertTrue(15.00 == C.volume());
	}
	@Test
	public void volume_test2(){
		C = new Cuboid(1,3,5);
		double V = C.volume();
		assertFalse(15.00 != C.volume());
	}
	@Test
	public void area_test1(){
		C = new Cuboid(1,3,5);
		int A =(int) C.area();
		assertTrue(46 == C.area());
	}
	@Test
	public void area_test2(){
		C = new Cuboid(1,3,5);
		int A =(int) C.area();
		assertFalse(46 != C.area());
	}
	@Test
	public void setDepth_Test1() {
		C = new Cuboid(879,54,45);
		C.setDepth(45);
		int a = C.getDepth();
		assertTrue(a == 45);
	}
	@Test
	public void compareTo_Test1() {
		C= new Cuboid(5165,546,879);
		c= new Cuboid(875,2165,4894984);
		assertTrue(C.compareTo(c)==1);
	}
	@Test
	public void compareTo_Test2() {
		C= new Cuboid(5165,546,879);
		c= new Cuboid(875,2165,4894984);
		assertTrue(c.compareTo(C)==-1);
	}
	@Test
	public void compareTo_Test3() {
		C= new Cuboid(5165,546,879);
		c= new Cuboid(5165,546,879);
		assertTrue(C.compareTo(c)==0);
	}
	@Test(expected = UnsupportedOperationException.class)
	public void Exception_test1() {
		C = new Cuboid(45,549,78);
		C.perimeter();
		}
	@Test(expected = IllegalArgumentException.class)
	public void Exception_test2() {
		C = new Cuboid(465,546,4);
		C.setDepth(-7);
		}
	@Test(expected = IllegalArgumentException.class)
	public void Exception_test3() {
		C = new Cuboid(5465,465456,-8789);
	}
	@Test
	public void SortByVolume() {
		Cuboid C = new Cuboid(454,79,94);
		SortByVolume volume = C.new SortByVolume();
		Cuboid c = new Cuboid(454846,56544,464);
		SortByVolume Volume = c.new SortByVolume();
		assertTrue(Volume.compare(C, c)==-1);
	}
	@Test
	public void SortByVolume1() {
		Cuboid C = new Cuboid(454,79,94);
		Cuboid c = new Cuboid(454846,56544,464);
		SortByVolume Volume = c.new SortByVolume();
		assertTrue(Volume.compare(c, C)==1);
	}
	@Test
	public void SortByVolume2() {
		Cuboid C = new Cuboid(454,79,94);
		Cuboid c = new Cuboid(454,79,94);
		SortByVolume Volume = c.new SortByVolume();
		assertTrue(Volume.compare(C, c)==0);
	}
	@Test
	public void SortByArea() {
		Cuboid C = new Cuboid(454,79,94);
		Cuboid c = new Cuboid(454,79,94);
		SortByArea Volume = c.new SortByArea();
		assertTrue(Volume.compare(C, c)==0);
	}
	@Test
	public void SortByArea1() {
		Cuboid C = new Cuboid(454949,79,94);
		Cuboid c = new Cuboid(454,79,94);
		SortByArea Volume = c.new SortByArea();
		assertTrue(Volume.compare(C, c)==1);
	}
	@Test
	public void SortByArea2() {
		Cuboid C = new Cuboid(454,79,94);
		Cuboid c = new Cuboid(984549,79,94);
		SortByArea Volume = c.new SortByArea();
		assertTrue(Volume.compare(C, c)==-1);
	}
}

