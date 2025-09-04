package experiments;

public class SudokuSolver {
	

	    public void solveSudoku(char[][] board) {
	        solve(board);
	    }

	    private boolean solve(char[][] board) {
	        for (int row = 0; row < 9; row++) {
	            for (int col = 0; col < 9; col++) {
	                // Check for empty cell
	                if (board[row][col] == '.') {
	                    // Try all digits
	                    for (char num = '1'; num <= '9'; num++) {
	                        if (isValid(board, row, col, num)) {
	                            board[row][col] = num;

	                            if (solve(board)) return true;  // Recurse
	                            else board[row][col] = '.';     // Backtrack
	                        }
	                    }
	                    return false; // No valid number found
	                }
	            }
	        }
	        return true; // Solved
	    }

	    private boolean isValid(char[][] board, int row, int col, char num) {
	        // Check row and column
	        for (int i = 0; i < 9; i++) {
	            if (board[row][i] == num || board[i][col] == num) return false;
	        }

	        // Check 3x3 box
	        int boxRowStart = row - row % 3;
	        int boxColStart = col - col % 3;
	        
	        for (int i = boxRowStart; i < boxRowStart + 3; i++) {
	            for (int j = boxColStart; j < boxColStart + 3; j++) {
	                if (board[i][j] == num) return false;
	            }
	        }

	        return true;
	    }

	    // Test the Sudoku Solver
	    public static void main(String[] args) {
	        SudokuSolver solver = new SudokuSolver();
	        char[][] board = {
	        		{'5','.','.','.','7','.','.','.','2'},
     	            {'.','.','.','.','.','.','.','.','.'},
     	            {'.','.','8','.','.','.','.','.','.'},
     	            {'8','.','.','.','6','.','4','.','3'},
     	            {'4','.','6','.','.','.','.','.','1'},
     	            {'.','.','.','.','.','.','.','.','.'},
     	            {'.','.','1','.','.','.','.','.','.'},
     	            {'.','.','.','.','.','.','.','.','.'},
     	            {'3','.','.','.','8','.','1','.','9'}
	        };

	        solver.solveSudoku(board);

	        // Print the solved board
	        for (char[] row : board) {
	            for (char c : row) {
	                System.out.print(c + " ");
	            }
	            System.out.println();
	        }
	    }
	}