import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class _2D_PlayerBoardTest {

    @Test
    void _2D_PlayerBoard_whenW_thenMoveUp() {
        //GIVEN
        char W = 'W';
        int[][] board = new int[4] [4];

        //WHEN
         actual = _2D_PlayerBoard.moveUp(W);

        //THEN
        assertEquals('W', actual);

    }
}
