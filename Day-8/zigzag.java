public class zigzag {
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int numRows = 3;
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();    
        }
        int currentRow = 0;
        boolean goingDown = false;
        for (char c : str.toCharArray()) {
            rows[currentRow].append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        System.out.println(result);

    }
    
}
