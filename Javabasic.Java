// 1. สร้าง class ชื่อ Main
public class Main {

    // 2. สร้าง method หลัก main() ที่โปรแกรมจะเริ่มทำงาน
    public static void main(String[] args) {
        
        // แสดงข้อความ "Hello, World!" ออกหน้าจอ
        System.out.println("Hello, World!"); 

        // 3. การประกาศตัวแปร
        int age = 18;             // ประกาศตัวแปรชนิด int สำหรับเก็บอายุ
        double salary = 5000.5;   // ประกาศตัวแปรชนิด double สำหรับเก็บเงินเดือน
        String name = "Java";     // ประกาศตัวแปรชนิด String สำหรับเก็บชื่อ
        boolean isActive = true;  // ประกาศตัวแปรชนิด boolean สำหรับเก็บสถานะ

        // แสดงค่าในตัวแปรออกหน้าจอ
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Name: " + name);
        System.out.println("Is Active: " + isActive);

        // 4. การใช้ตัวดำเนินการพื้นฐาน
        int x = 10;
        int y = 3;
        int sum = x + y;       // บวก x กับ y
        int diff = x - y;      // ลบ y จาก x
        int product = x * y;   // คูณ x กับ y
        int quotient = x / y;  // หาร x ด้วย y
        int remainder = x % y; // หารเอาเศษ x กับ y

        // แสดงผลของการใช้ตัวดำเนินการออกหน้าจอ
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // 5. การใช้คำสั่งเงื่อนไข if-else
        if (age >= 18) {
            System.out.println("You are an adult."); // ถ้าอายุ 18 ขึ้นไป แสดงข้อความนี้
        } else {
            System.out.println("You are a minor.");  // ถ้าอายุน้อยกว่า 18 แสดงข้อความนี้
        }

        // 6. การใช้การวนซ้ำ for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("รอบที่ " + i); // แสดงรอบที่ i ตั้งแต่ 0 ถึง 4
        }

        // 7. การใช้การวนซ้ำ while loop
        int count = 0;
        while (count < 5) {
            System.out.println("รอบที่ " + count); // แสดงรอบที่ count ตั้งแต่ 0 ถึง 4
            count++; // เพิ่มค่า count ขึ้น 1 ในแต่ละรอบ
        }

        // 8. การเรียกใช้ฟังก์ชัน (Method)
        sayHello(); // เรียกใช้ฟังก์ชัน sayHello() ที่สร้างไว้ด้านล่าง

        // 9. การใช้อาเรย์ (Array)
        int[] numbers = {1, 2, 3, 4, 5}; // ประกาศอาเรย์เก็บจำนวนเต็ม
        System.out.println("First element in array: " + numbers[0]); // แสดงค่าแรกในอาเรย์
    }

    // ฟังก์ชัน sayHello() ใช้แสดงข้อความทักทาย
    public static void sayHello() {
        System.out.println("Hello from sayHello function!");
    }
}