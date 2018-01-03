package homework4;

import static org.junit.Assert.*;
import org.junit.Test;

public class test01 {
	@Test
	public void test1() {assertEquals('A',letterGrade(100));}
	@Test
	public void test2() {assertEquals('X',letterGrade(101));}
	@Test
	public void test3() {assertEquals('A',letterGrade(90));}
	@Test
	public void test4() {assertEquals('B',letterGrade(89));}
	@Test
	public void test5() {assertEquals('B',letterGrade(80));}
	@Test
	public void test6() {assertEquals('C',letterGrade(79));}
	@Test
	public void test7() {assertEquals('C',letterGrade(70));}
	@Test
	public void test8() {assertEquals('D',letterGrade(69));}
	@Test
	public void test9() {assertEquals('D',letterGrade(60));}
	@Test
	public void test10() {assertEquals('F',letterGrade(59));}
	@Test
	public void test11() {assertEquals('F',letterGrade(0));}
	@Test
	public void test12() {assertEquals('X',letterGrade(-1));}

	public static char letterGrade(int score) {
		char grade; if (score <0 || score > 100) grade = 'X'; 
		else if (score>=90 && score <=100) grade = 'A'; 
		else if (score>=80 && score <90) grade = 'B'; 
		else if (score>=70 && score <80) grade = 'C'; 
		else if (score>=60 && score <70) grade = 'D'; 
		else grade ='F'; 
		return grade;  
	}
}
