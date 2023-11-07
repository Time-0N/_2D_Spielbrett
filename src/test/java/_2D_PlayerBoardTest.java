import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class _2D_PlayerBoardTest {

    @Test
    void _2D_PlayerBoard_whenW_thenMoveUp() {
        //GIVEN
        int pos1 = 2;
        int minus = 0;
        //WHEN
        int actual = _2D_PlayerBoard.moveUpDown(pos1, minus);

        //THEN
        assertEquals(3, actual);

    }

    @Test
    void _2D_PlayerBoard_whenS_thenMoveDown() {
        //GIVEN
        int pos1 = 2;
        int minus = 1;
        //WHEN
        int actual = _2D_PlayerBoard.moveUpDown(pos1, minus);

        //THEN
        assertEquals(1, actual);
    }

    @Test
    void _2D_PlayerBoard_whenA_thenMoveLeft() {
        //GIVEN
        int pos2 = 2;
        int minus = 1;

        //WHEN
        int actual = _2D_PlayerBoard.moveLeftRight(pos2, minus);

        //THEN
        assertEquals(1, actual);
    }

    @Test
    void _2D_PlayerBoard_whenA_thenMoveRight() {
        //GIVEN
        int pos2 = 2;
        int minus = 0;

        //WHEN
        int actual = _2D_PlayerBoard.moveLeftRight(pos2, minus);

        //THEN
        assertEquals(3, actual);
    }
}