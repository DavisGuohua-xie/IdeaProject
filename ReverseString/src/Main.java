public class Main {

    public static void main(String[] args) {
    String result = reverseString("Hello World");
    System.out.println(result);
    }

    public static String reverseString(String s) {
        char[] sArray = s.toCharArray();
        String result = new String();

        for(int i = sArray.length-1; i>=0; i--)
        {
          //  System.out.println(i);
            System.out.println(sArray[i]);
             result += sArray[i];
            //result.append(sArray[i]);
            //  result.append(sArray[i]);
        }
        return result;
    }


}
