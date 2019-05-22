package Tests;

import Main.Pow;

import static org.junit.Assert.*;

public class PowTest {

    @org.junit.Test
    public void powRecoursive() {
        Pow obj = new Pow();
        assertEquals("4 в степени 2 это 16?",obj.PowRecoursive(4,2),16 );
    }

    @org.junit.Test
    public void powNoRecoursive() {
        Pow obj = new Pow();
        assertEquals("2 в степени 3 это 8?",obj.PowNoRecoursive(2,3),8 );
    }

    @org.junit.Test
    public void searchSquareNumbersR() {
        Pow obj = new Pow();
        assertEquals("В промежутке от 9 до 10 число которое имеет свой квадрат это 3.0 ",obj.SearchSquareNumbersR(10,9),3.0,100 );
    }

    @org.junit.Test
    public void searchSquareNumbers() {
        Pow obj = new Pow();
        assertEquals("В промежутке от 9 до 10 число которое имеет свой квадрат это 3.0 ",obj.SearchSquareNumbers(10,9),3.0,100 );
    }
}