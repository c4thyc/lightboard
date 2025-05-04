public class LightBoard
{
    /** The lights on the board, where true represents on and false represents off.
    */
    private boolean[][] lights;
    /** Constructs a LightBoard object having numRows rows and numCols columns.
    * Precondition: numRows > 0, numCols > 0
    * Postcondition: each light has a 40% probability of being set to on.
    */
    public LightBoard(int numRows, int numCols)
    {
        lights = new boolean[numRows][numCols];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (Math.random() < 0.4) lights[row][col] = true;
            }
        }
    }

    public LightBoard(boolean[][] list) {
        lights = list;
    }
    /** Evaluates a light in row index row and column index col and returns a status
    * as described in part (b).
    * Precondition: row and col are valid indexes in lights.
    */
    public boolean evaluateLight(int row, int col)
    {
        int count = 0;
        for (int r = 0; r < lights.length; r++) {
            if (lights[r][col] == true) count++;
        }
        if (lights[row][col] == true) {
            return !(count % 2 == 0);
        }
        return count % 3 == 0;
    }
// There may be additional instance variables, constructors, and methods not shown.
}