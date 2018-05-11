public class Main {

    public static void main(String[] args) {

        String str = "ab cd z";
        char [] charArray  = str.toCharArray();

        char[] result = reverseWords(charArray);


        //System.out.println("Hello World!");

        System.out.println(result);

    }

    public static char[] reverseWords(char[] str) {
        int i=0;
        for(int j=0; j<str.length; j++){
            if(str[j]==' '){
                 System.out.println("str[j] == ' ' ");
             //   System.out.println(str[j]);
                System.out.println("calling the first time ");
                reverse(str, i, j-1);
                System.out.println("$indivisual word reversed now ");

                i=j+1;

                System.out.println("int i  " + i);
                System.out.println("int j  "+ j);
                System.out.println();
            }
            System.out.println(str[j]);
        }

        System.out.println(str);

        System.out.println("before the second time");

        System.out.println("calling the second time ");
        reverse(str, i, str.length-1);

        System.out.println("  ");
        System.out.println(str);
        System.out.println("  ");



        System.out.println("calling the third time ");
        System.out.println("str.length");
        System.out.println(str.length);
        System.out.println();
        reverse(str, 0, str.length-1);
        return str;
    }

    public static void reverse(char[] s, int i, int j){
        System.out.println("int i");
        System.out.println(i);
        System.out.println("int j");
        System.out.println(j);
        System.out.println("char[]s");
        System.out.println(s);
        while(i<j){

            System.out.println("inside the while loop");
            System.out.println("int i  "+i);
            System.out.println("int j  "+j);

            char temp = s[i];
            System.out.println("temp " +s[i] );
            System.out.println("s[i] " +s[i] );
            System.out.println("s[j] " +s[j] );
            s[i]=s[j];
            s[j]=temp;
            System.out.println("temp " +s[i] );
            System.out.println("s[i] " +s[i] );
            System.out.println("s[j] " +s[j] );
            System.out.println("before ");
            System.out.println(i);
            System.out.println(j);
            i++;
            j--;
            System.out.println("after");
            System.out.println(i);
            System.out.println(j);
        }

        System.out.println("After first while loop");
        System.out.println(s);
        System.out.println( );

    }



}
