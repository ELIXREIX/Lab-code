package P1.Term2.week2term2.Homework2;

class Product 

{ 

    String productName; 

    String type; 

    int rating; 

     

    void rateIt(int rating) { 

         

        System.out.println("This product has rating: " + rating);  

         

    } 

} 

 

public class ProductTest { 

 

    public static void main (String [] args) { 

     

     

        Product asahiBeer = new Product (); 

        asahiBeer.productName = "Asahi Beer"; 

        asahiBeer.type = "Beer"; 

        asahiBeer.rating = 5; 

        asahiBeer.rateIt(asahiBeer.rating); 

         

        Product iPhone13 = new Product (); 

        iPhone13.productName = "iPhone13"; 

        iPhone13.type = "Smart Phone"; 

        iPhone13.rating = 3; 

        iPhone13.rateIt(iPhone13.rating); 

         

        Product poysian = new Product(); 

        poysian.productName = "ยาดมโป้ยเซียน"; 

        poysian.type = "ยาดม"; 

        poysian.rating = 10; 

        poysian.rateIt(poysian.rating); 
  

        // 2. จากโจทย์ จงสร้าง object 4 ตามข้อกำหนด โดยการเขียนโค้ดเอง 

        Product Coke = new Product (); 

        Coke.productName = "โค๊ก"; 

        Coke.type = "Cola"; 

        Coke.rating = 10; 

        Coke.rateIt(Coke.rating); 

         

         

        // 3. ลองคิดผลิตภัณฑ์ขึ้นมา 1 อย่าง ระบุชื่อ ชนิด เรตติ้ง และ สั่งให้ทำการแสดงค่าเรตติ้งออกมา 

         

    }
}