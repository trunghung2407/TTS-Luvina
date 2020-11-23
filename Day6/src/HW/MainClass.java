/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author X1 GEN 4
 */
public class MainClass {
    public static void main(String[] args) {
        TreeMap tmt = new TreeMap<String,Trader>();
        TreeSet logon = new TreeSet<Trader>();
        HashMap hms = new HashMap<String, Stock>();
        HashMap<TradeOrder,ArrayList<TradeOrderDetail>> OrderD = new HashMap();//Quản lý Order-Detail
        //Hàm ưu tiên cho sell giá tăng dần
        PriorityQueue<TradeOrder> sellOrder = new PriorityQueue<TradeOrder>(new Comparator<TradeOrder>() {
            @Override
            public int compare(TradeOrder o1, TradeOrder o2) {
                double sumo1=0;
                ArrayList<TradeOrderDetail> vo1= OrderD.get(o1);
                for (TradeOrderDetail a : vo1) {
                    sumo1+=a.Price*a.Amount;
                }
                double sumo2=0;
                ArrayList<TradeOrderDetail> vo2= OrderD.get(o2);
                for (TradeOrderDetail a : vo2) {
                    sumo2+=a.Price*a.Amount;
                }
                return (int) (sumo1-sumo2);
            }
        });
        //Khởi tạo giá trị cho sell
        for(int i=1;i<10;i++){
            TradeOrder to = new TradeOrder(i, i+"", "sell"+i, null);
            ArrayList<TradeOrderDetail> lisd = new ArrayList<TradeOrderDetail>();
            float sum =0;
            for(int j=1;j<5;j++){
                TradeOrderDetail tod = new TradeOrderDetail(i);
                lisd.add(tod);
                sum+=tod.Price*tod.Amount;
            }
            OrderD.put(to, lisd);
            sellOrder.add(to);
            System.out.println("->"+i+"="+sum);
        }
        while (!sellOrder.isEmpty()) {            
            System.out.println(sellOrder.remove().toString());
        }
        //Hàm ưu tiên cho buy giá giảm dần
        PriorityQueue<TradeOrder> buyOrder = new PriorityQueue<TradeOrder>(new Comparator<TradeOrder>() {
            @Override
            public int compare(TradeOrder o1, TradeOrder o2) {
                double sumo1=0;
                ArrayList<TradeOrderDetail> vo1= OrderD.get(o1);
                for (TradeOrderDetail a : vo1) {
                    sumo1+=a.Price*a.Amount;
                }
                double sumo2=0;
                ArrayList<TradeOrderDetail> vo2= OrderD.get(o2);
                for (TradeOrderDetail a : vo2) {
                    sumo2+=a.Price*a.Amount;
                }
                return (int) -(sumo1-sumo2);
            }
        });
        //Khởi tạo giá trị cho sell
        for(int i=1;i<10;i++){
            TradeOrder to = new TradeOrder(i, i+"", null, "buy"+i);
            ArrayList<TradeOrderDetail> lisd = new ArrayList<TradeOrderDetail>();
            float sum =0;
            for(int j=1;j<5;j++){
                TradeOrderDetail tod = new TradeOrderDetail(i);
                lisd.add(tod);
                sum+=tod.Price*tod.Amount;
            }
            OrderD.put(to, lisd);
            buyOrder.add(to);
            System.out.println("->"+i+"="+sum);
        }
        while (!buyOrder.isEmpty()) {            
            System.out.println(buyOrder.remove().toString());
        }
        
        Stock fpt = new Stock("1", "ftp");
        hms.put("01", fpt);
        TreeSet tem = new TreeSet<TradeOrder>();
        tem.addAll((Collection) hms);
        
    }
}
