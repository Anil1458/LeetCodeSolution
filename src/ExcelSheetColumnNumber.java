public class ExcelSheetColumnNumber {
    public int titleToNumber(String str) {
        str.toUpperCase();
        int len = str.length();
        int res = 0;
        int index = 0;
        for(int i = len-1; i >= 0; i--){
            int value = (int)str.charAt(i) - 64;
            res = (int)(res + value*Math.pow(26, index));
            index++;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "AAB";
        System.out.println(new ExcelSheetColumnNumber().titleToNumber(str));
    }
}
