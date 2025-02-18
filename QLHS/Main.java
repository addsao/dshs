import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Quản lý học sinh ===");
            System.out.println("1. Thêm học sinh");
            System.out.println("2. Sửa học sinh");
            System.out.println("3. Xoá học sinh");
            System.out.println("4. Xem danh sách học sinh");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên: ");
                    String name = scanner.next();
                    System.out.print("Nhập tuổi: ");
                    int age = scanner.nextInt();
                    dao.addStudent(name, age);
                    break;
                case 2:
                    System.out.print("Nhập ID: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.next();
                    System.out.print("Nhập tuổi mới: ");
                    int newAge = scanner.nextInt();
                    dao.updateStudent(updateId, newName, newAge);
                    break;
                case 3:
                    System.out.print("Nhập ID: ");
                    int deleteId = scanner.nextInt();
                    dao.deleteStudent(deleteId);
                    break;
                case 4:
                    List<Student> students = dao.getAllStudents();
                    students.forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("👋 Tạm biệt!");
                    return;
                default:
                    System.out.println("❌ Lựa chọn không hợp lệ!");
            }
        }
    }
}
