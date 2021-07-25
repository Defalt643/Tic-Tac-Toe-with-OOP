/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.defalt.tictactoewithobjectorientedprogramming.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ming
 */
public class TestTable {

    public TestTable() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testHorizontal1() {
        Player playerX = new Player("X");
        Table table = new Table();
        int position[] = {0, 0};
        table.addIntoTable(playerX.getName(), position);
        int position1[] = {0, 1};
        table.addIntoTable(playerX.getName(), position1);
        int position2[] = {0, 2};
        table.addIntoTable(playerX.getName(), position2);
        table.checkWinner();
        assertEquals(true, table.checkWinner());
        assertEquals("X", table.getWinner());
    }

    @Test
    public void testHorizontal2() {
        Player playerX = new Player("X");
        Table table = new Table();
        int position[] = {1, 0};
        table.addIntoTable(playerX.getName(), position);
        int position1[] = {1, 1};
        table.addIntoTable(playerX.getName(), position1);
        int position2[] = {1, 2};
        table.addIntoTable(playerX.getName(), position2);
        table.checkWinner();
        assertEquals(true, table.checkWinner());
        assertEquals("X", table.getWinner());
    }

    @Test
    public void testHorizontal3() {
        Player playerX = new Player("X");
        Table table = new Table();
        int position[] = {2, 0};
        table.addIntoTable(playerX.getName(), position);
        int position1[] = {2, 1};
        table.addIntoTable(playerX.getName(), position1);
        int position2[] = {2, 2};
        table.addIntoTable(playerX.getName(), position2);
        table.checkWinner();
        assertEquals(true, table.checkWinner());
        assertEquals("X", table.getWinner());
    }@Test
    public void testVertical1() {
        Player playerO = new Player("O");
        Table table = new Table();
        int position[] = {0, 0};
        table.addIntoTable(playerO.getName(), position);
        int position1[] = {1, 0};
        table.addIntoTable(playerO.getName(), position1);
        int position2[] = {2, 0};
        table.addIntoTable(playerO.getName(), position2);
        table.checkWinner();
        assertEquals(true, table.checkWinner());
        assertEquals("O", table.getWinner());
    }
}