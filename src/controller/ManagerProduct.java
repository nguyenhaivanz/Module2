package controller;

import io.ReadAndWrite;
import models.Product;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerProduct {
    File file = new File("C:\\Users\\Admin\\Desktop\\BaiTap2\\Casemodule_2\\Case2module\\src\\filetext\\product.txt");

    ReadAndWrite<Product> readAndWrite = new ReadAndWrite<>();
    ArrayList<Product> products = readAndWrite.read(file);
    Scanner scanner = new Scanner(System.in);

    public void show() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }

    public void add(Product product) {
        products.add(product);

        readAndWrite.write(file, products);
    }

    public int findIndexById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public Product create1() {
        int id;
        System.out.println("Nhập id :");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Amount");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mota");
        String mota = scanner.nextLine();
        return new Product(id, name, price,amount,mota);
    }

    public Product create() {
        int id;
        int index;
        while (true) {
            System.out.println("Nhập id :");
            id = Integer.parseInt(scanner.nextLine());
            index = findIndexById(id);
            if (index == -1) {
                break;
            }
            System.out.println("Nhập trùng id rồi.");
        }
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Amount");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mota");
        String mota = scanner.nextLine();
        return new Product(id, name, price,amount,mota);    }

    public void edit() {
        int id;
        int index;
        while (true) {
            System.out.println("Nhập id sản phẩm cần sửa :");
            id = Integer.parseInt(scanner.nextLine());
            index = findIndexById(id);
            if (index != -1) {
                products.set(index, create1());
                System.out.println("Sửa thành công");
                break;
            } else {
                System.out.println("Không tìm thấy id sản phẩm ");
            }
        }

    }

    public void delete() {
        int id;
        int index;
        while (true) {
            System.out.println("Nhập id sản phẩm muốn xóa");
            id = Integer.parseInt(scanner.nextLine());
            index = findIndexById(id);
            if (index != -1) {
                products.remove(index);
                System.out.println("Xóa thành công ");
                break;
            } else {
                System.err.println("Không có id sản phẩm cần xóa");
            }
        }
        readAndWrite.write(file, products);
    }
    public void Sapxep() {
        Product temp;
        for (int i = 0; i < products.size() - 1; i++) {
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(i).getId() < products.get(j).getId()) {
                    temp = products.get(i);
                    products.set(i, products.get(j));
                    products.set(j, temp);
                }
            }
        }
        show();
    }
}