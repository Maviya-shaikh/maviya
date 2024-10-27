//Name:Vikas gupta
//Roll no:10/231p056/A
//post 3

public class StringBufferDeleteExample {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello, World!");

        System.out.println("Original StringBuffer: " + sb);

        sb.delete(5, 12);

        System.out.println("StringBuffer after deletion: " + sb);
    }
}