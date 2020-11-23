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
public class Main {
 public static void main(String[] args) {
 Buffer sharedBuffer = new Buffer(3);
 Producer producer = new Producer(sharedBuffer);
 Consumer consumer = new Consumer(sharedBuffer);
 producer.start();
 consumer.start();
 }
}
