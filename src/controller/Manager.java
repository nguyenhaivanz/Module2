package controller;

import io.ReadAndWrite;
import models.Product;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    File file = new File("C:\\Users\\Admin\\Desktop\\BaiTap2\\Casemodule_2\\Case2module\\src\\filetext\\product.txt");
    ReadAndWrite<Product> readAndWrite = new ReadAndWrite<>();
    ArrayList<Product> products = readAndWrite.read(file);
    Scanner scanner = new Scanner(System.in);
    ManagerProduct managerProduct = new ManagerProduct();

    public void menuProduct() {
        while (true) {
            System.out.println( " QUẢN LÝ SẢN PHẨM ");
            System.out.println( "1. Hiển thị toàn phẩm ");
            System.out.println( "2. Thêm sản phẩm ");
            System.out.println( "3. Sửa sản phẩm theo id ");
            System.out.println( "4. Xóa sản phẩm theo id ");
            System.out.println( "5. Sắp Xếp ");
            System.out.println( "6. Back ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerProduct.show();
                    break;
                case 2:
                    Product product = managerProduct.create();
                    managerProduct.add(product);
                    break;
                case 3:
                    managerProduct.edit();
                    break;
                case 4:
                    managerProduct.delete();
                    break;
                case 5:
                    managerProduct.Sapxep();
                    break;
                case 6:
                    break;

            }
        }
    }

        }