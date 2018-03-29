package com.yht.codingSecond.srp.good;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public static List<Product> getProduct(String pathName) throws IOException{

        List<Product> products = new ArrayList<>();

            File file = new File(pathName);
            BufferedReader br = null;
            String[] data;
            try {
                br = new BufferedReader(new FileReader(file)) ;
                while(br.read() != -1){
                    String temp = br.readLine();
                    data = temp.split(" ");
                    Product product = new Product();
                    product.setProductID(data[0]);
                    product.setProductDesc(data[1]);

                    System.out.println("产品ID = " + product.getProductID() + "\n");
                    System.out.println("产品描述 = " + product.getProductDesc() + "\n");

                    products.add(product);
                }

            } catch (IOException e) {
                throw new IOException(e.getMessage());
            } finally {
                br.close();
            }
        return products;
    }



}
