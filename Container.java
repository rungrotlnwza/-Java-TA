import javax.swing.*; // นำเข้าไลบรารีสำหรับสร้าง GUI
import java.awt.*;
public class Container { // ประกาศคลาสหลักชื่อ Container

    public static void main(String[] args) {
        // สร้างหน้าต่างโปรแกรมใหม่โดยใช้ JFrame
        JFrame container = new JFrame(); // ตั้งชื่อเป็น container เพราะเป็นกรอบทั้งหมดที่ทุกอย่างจะอยู่ภายใน เช่นเดียวกันกับ container html
        container.setTitle("My Program"); // ตั้งชื่อหน้าต่างเป็น "My Program"
        container.setSize(600, 400); // กำหนดขนาดของหน้าต่างเป็น 600x400 พิกเซล

        container.setResizable(true); // อนุญาตให้ผู้ใช้ปรับขนาดหน้าต่างได้
        container.setLocationRelativeTo(null); // จัดให้อยู่กึ่งกลางหน้าจอ
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // กำหนดให้โปรแกรมปิดเมื่อคลิกปุ่มปิดหน้าต่าง
        container.setVisible(true); // แสดงหน้าต่างบนหน้าจอ
    }
}
