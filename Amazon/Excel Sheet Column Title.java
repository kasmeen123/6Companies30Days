class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder ();
        while (columnNumber > 0) {
            columnNumber--;
            int rem = columnNumber % 26;
            columnNumber /= 26;
            char letter = (char) (rem + 'A');
            sb.append(letter);
        }
        return sb.reverse().toString();
    }
}