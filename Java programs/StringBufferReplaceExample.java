//Name:Vikas gupta
//Roll no:10/231p056/A
//post 4

public class StringBufferReplaceExample {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello, World!");

        System.out.println("Original StringBuffer: " + sb);


        sb.replace(7, 12, "Java");

        System.out.println("StringBuffer after replace: " + sb);
    }
}
