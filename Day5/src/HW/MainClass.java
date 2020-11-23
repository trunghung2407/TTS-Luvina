/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import sun.reflect.generics.tree.Tree;

/**
 *
 * @author X1 GEN 4
 */
public class MainClass {
    
    public static void main(String[] args) {
        //Tạo order
        Order or1 = new Order (1,"06/8/2020", "Cus01");
        Order or2 = new Order (2,"06/9/2020", "Cus02");
        //Tạo OrderDetail
        OrderDetail orDetail1 = new OrderDetail (1,1, 1, 10, 100);
        OrderDetail orDetail2 = new  OrderDetail (1, 2, 5, 7, 20);
        OrderDetail orDetail3 = new OrderDetail (2,3, 3, 10, 500);
        OrderDetail orDetail4 = new OrderDetail (2, 4, 7, 7, 60);
        //Mảng OrderDetail
        ArrayList ord1 = new ArrayList<OrderDetail>();
        ord1.add(orDetail1);
        ord1.add(orDetail2);
        ArrayList ord2 = new ArrayList<OrderDetail>();
        ord2.add(orDetail3);
        ord2.add(orDetail4);
        //TreeMap  
        TreeMap treemap_od = new TreeMap <Order, ArrayList<OrderDetail>>();
        treemap_od.put(or1,ord1);
        treemap_od.put(or2, ord2);
        //Tìm kiếm theo CustomerID
//        timkiemCId(treemap_od,"Cus02");
        //Tìm kiếm theo Date
//        timkiemDate(treemap_od,"06/9/2020");
        //Hashmap
        HashMap hashmap_od=new HashMap <Order, ArrayList<OrderDetail>>() ;
        hashmap_od.put(or1,ord1);
        hashmap_od.put(or2, ord2);
        //Tìm kiếm theo CustomerID
//        htimkiemCId(treemap_od,"Cus02");
        //Tìm kiếm theo Date
//        htimkiemDate(treemap_od,"08/8/2020");
        //Hashmap
        //Tạo danh sách PurchaseDetail
        PurchaseDetail pd1 = new PurchaseDetail(1, 1, 1, 1, (float) 1.1);
        PurchaseDetail pd2 = new PurchaseDetail(2, 2, 2, 2, (float) 2.2);
        ArrayList lpd1 = new ArrayList<PurchaseDetail>();
        lpd1.add(pd1);
        lpd1.add(pd2);
        PurchaseDetail pd3 = new PurchaseDetail(3, 3, 3, 3, (float) 3.3);
        PurchaseDetail pd4 = new PurchaseDetail(4, 4, 4, 4, (float) 4.4);
        ArrayList lpd2 = new ArrayList<PurchaseDetail>();
        lpd2.add(pd3);
        lpd2.add(pd4);
        ArrayList lpd4 = new ArrayList<PurchaseDetail>();
        //Tạo TreeMap Purchase
        Purchase pc1 = new Purchase(1, "0/0/2000", "SupplierID");
        Purchase pc2 = new Purchase(2, "1/1/2001", "SupplierID1");
        TreeMap treemap_pd1= new TreeMap<Purchase, ArrayList<PurchaseDetail>>();
        treemap_pd1.put(pc1, lpd1);
        treemap_pd1.put(pc2, lpd2);

        //Tạo HashMap Supplier
        Supplier sl = new Supplier("1", "Supplier1", "Address1", "Tel1");
        HashMap hashmap_st= new HashMap< Supplier ,TreeMap<Purchase, ArrayList<PurchaseDetail>>>(); 
        for(int i=0;i<1000;i++){
            hashmap_st.put(new Supplier("1", "Supplier"+i, "Address1", "Tel1"), treemap_pd1);
        }
        timkiemnhacungcap(hashmap_st,"Supplier888");
        
   
    }
    
    public static void timkiemCId(TreeMap a,String CustomerID){
        ArrayList<OrderDetail> b = (ArrayList<OrderDetail>) a.get(new Order (1,"06/8/2020", CustomerID));
        if(b==null){
            System.out.println("Không tìm thấy");
            return;
        }
        for (OrderDetail orderDetail : b) {
            System.out.println(orderDetail);
        }
    }
    
    public static void timkiemDate(TreeMap a,String OrdDate){
        TreeMap b = new TreeMap(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.OrdDate.compareTo(o2.OrdDate);
            }
        });
        b.putAll(a);
        ArrayList<OrderDetail> c = (ArrayList<OrderDetail>) b.get(new Order (1,OrdDate, ""));
        if(c==null){
            System.out.println("Không tìm thấy");
            return;
        }
        for (OrderDetail orderDetail : c) {
            System.out.println(orderDetail);
        }
    }

    private static void htimkiemCId(TreeMap a, String CustomerID) {
        ArrayList<OrderDetail> b = (ArrayList<OrderDetail>) a.get(new Order (1,"06/8/2020", CustomerID));
        if(b==null){
            System.out.println("Không tìm thấy");
            return;
        }
        for (OrderDetail orderDetail : b) {
            System.out.println(orderDetail);
        }
    }

    private static void htimkiemDate(TreeMap a, String OrdDate) {        
        TreeMap b = new TreeMap(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.OrdDate.compareTo(o2.OrdDate);
            }
        });
        b.putAll(a);
        ArrayList<OrderDetail> c = (ArrayList<OrderDetail>) b.get(new Order (1,OrdDate, ""));
        if(c==null){
            System.out.println("Không tìm thấy");
            return;
        }
        for (OrderDetail orderDetail : c) {
            System.out.println(orderDetail);
        }
    }
    
    private static void timkiemnhacungcap(HashMap a,String NameSupplier){
        System.out.println(a.get(new Supplier("1", "Supplier1", "Address1", "Tel1") ));
    }
}
