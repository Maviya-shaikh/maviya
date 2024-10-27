//Name:Vikas gupta
//UIN:2312p056/10

package b3;

public class mythread extends Thread 
{
public static void main(String args[])

{
mythread ex=new mythread();
ex.create(); 
System.out.println("this is the main thread!");
}
public void create()
{

Thread t=new Thread(this); 

t.start();
}
public void run()
{
while(true) 
{
try
{

System.out.println("this is the child thread!");
Thread.sleep(5000);
}
catch (InterruptedException e) { }
}

}

}