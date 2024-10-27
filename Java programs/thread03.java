//Name:Vikas gupta
//UIN:2312p056/10

package Vector02;
public class threadexample3 {
	 public static void main(String[] args) {
	 Thread alphabetThread = new Thread(new PrintAlphabets());
	 Thread numberThread = new Thread(new PrintNumbers());
	 alphabetThread.start();
	 numberThread.start();
	 }
	 static class PrintAlphabets implements Runnable {
	 @Override
	 public void run() {
	 for (char ch = 'A'; ch <= 'K'; ch++) {
	 System.out.print(ch + " ");
	 try {
	 Thread.sleep(100); // Small delay for visibility
	 } catch (InterruptedException e) {
	 Thread.currentThread().interrupt();
	 }
	 }
	 }
	 }
	 static class PrintNumbers implements Runnable {
	 @Override
	 public void run() {
	 for (int i = 0; i <= 9; i++) {
	 System.out.print(i + " ");
	 try {
	 Thread.sleep(100); // Small delay for visibility
	 } catch (InterruptedException e) {
	 Thread.currentThread().interrupt();
	 }
	 }
	 }
	 }
	}