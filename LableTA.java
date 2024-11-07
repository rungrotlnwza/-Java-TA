import javax.swing.*; // นำเข้าไลบรารีสำหรับสร้าง GUI
import java.awt.*; // นำเข้า lib สำหรับจัดการข้อความแบบ GUI

public class LableTA {
    public static void main(String[] args) {
        // สร้างหน้าต่างโปรแกรมใหม่โดยใช้ JFrame
        JFrame container = new JFrame(); // ตั้งชื่อเป็น container เพราะเป็นกรอบทั้งหมดที่ทุกอย่างจะอยู่ภายใน เช่นเดียวกันกับ container html
        container.setTitle("My Program"); // ตั้งชื่อหน้าต่างเป็น "My Program"
        container.setSize(600, 400); // กำหนดขนาดของหน้าต่างเป็น 600x400 พิกเซล
        container.setResizable(true); // อนุญาตให้ผู้ใช้ปรับขนาดหน้าต่างได้
        container.setLocationRelativeTo(null); // จัดให้อยู่กึ่งกลางหน้าจอ
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // กำหนดให้โปรแกรมปิดเมื่อคลิกปุ่มปิดหน้าต่าง
        container.setVisible(true); // แสดงหน้าต่างบนหน้าจอ    

        container.setLayout(new FlowLayout());
        JLabel  lable = new JLabel(); // ตั้งค่าจาก lable เป็นอะไรก็ได้ แต่ที่ตั้ง lable เพราะใน html lable ไช้สื่อความหมายได้ตรงที่สุด
        lable.setText("Unable to use Thai language");//ไช้คำสั่งเพื่อตั้งค่าข้อความภายในก่อนจะนำไปไช้งาน เช่น ไม่สามารถไข้ภาษาอังกฤาใน java ได้
        container.add(lable); // ไช้คำสั่ง add เพื่อเพิ่มข้อความที่ถูกตั้งค่าไว้ไปแสดงในหน้าจอ
        container.add(new JLabel("rungrot muangchalerm")); //หรือจะไม่ตั้งอะไรเลย แต่แอดโดยตรงก็ได้ ไส่คำสั่งขึ้นบันทัดไหม่เอาจำไม่ได้
    }
}
