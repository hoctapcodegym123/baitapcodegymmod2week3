package BaiQLKS;

import java.util.ArrayList;

import java.util.Scanner;

public class ManageHotel {
    ArrayList<Hotel> hotels = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("Menu");
        System.out.println("1. Tạo phòng mới");
        System.out.println("2. Tạo khách hàng mới");
        System.out.println("3. Hiển thị các phòng theo giá");
        System.out.println("4. Hiển thị khách hàng theo id");
        System.out.println("5. Tìm kiếm khách hàng theo tên");
        int choice= Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                createRoom();
                break;
            case 2:
                createPerson();;
                break;
            case 3:
            case 4:
            case 5:
        }

    }
    public Hotel createRoom(){
        System.out.println("Nhập loại phòng");
        String typeRoom = scanner.nextLine();
        System.out.println("Nhập giá phòng");
        double cost =Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ phòng");
        String idRoom = scanner.nextLine();
        return new Hotel(typeRoom,cost,idRoom);
    }
    public Person createPerson(){
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ tên");
        String name = scanner.nextLine();
        System.out.println("Nhập năm sinh");
        int age = Integer.parseInt(scanner.nextLine());
        return  new Person(id,name,age);
    }
}
