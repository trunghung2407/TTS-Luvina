/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package On;

/**
 *
 * @author X1 GEN 4
 */
public class Producer extends Thread {
 private Buffer sharedBuffer;
 public Producer(Buffer shared) {
 super("Producer");
 sharedBuffer = shared;
 }
 @Override
 public void run() {
 for (int i = 1; i <= 5; i++) {
 try {
 Thread.sleep((long) (Math.random() *1000));
 sharedBuffer.set(i);
 System.out.println("Producer day hang vao kho " + i);
 } catch (InterruptedException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 }
 }
 System.out.println(getName() + " completed");
 }
}


