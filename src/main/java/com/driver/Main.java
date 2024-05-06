package com.driver;
public class Main{
public static void main(String[],args) {
    Product p = new Product();

    int ans = p.product(x: 10, y: 20);
    int ans1 = p.product(x: 10, y:2 0, z: 30);

    int ans3 = p.product(x: 1.0, y: 2.0);

    System.out.println(ans+" "+ans1+" "+ans3);

}


   static class Product {
       public int product(int x, int y) {
       return x*y;

       }
       public int product(int x, int y, int z) {
       return x*y*z;
       }

       public double product(double x, double y) {
           return  x*y;
       }
   }
   }


