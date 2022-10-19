package com.qa.java.Collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public ArrayList<Product> readProduct(String filePath) {
		ArrayList<Product> productlist = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
			String prodData = br.readLine();
			prodData = br.readLine();
			int indexer = 0;


			while (prodData != null) {

				String[] prodInfoList = prodData.split(",");
				String name = prodInfoList[0];
				float price = Float.parseFloat(prodInfoList[1]);
				int stock = Integer.parseInt(prodInfoList[2]);
				boolean availability = Boolean.parseBoolean(prodInfoList[3]);

				Product product = new Product();
				product.setName(name)
				.setPrice(price)
				.setStock(stock)
				.setAvailable(availability);

				productlist.add(product);

				prodData = br.readLine();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}

		return productlist;
	}
}
