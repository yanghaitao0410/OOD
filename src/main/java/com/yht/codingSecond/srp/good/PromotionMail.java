package com.yht.codingSecond.srp.good;

import java.util.List;

public class PromotionMail {
	private MailSender sender = null;

	public static void main (String[]args) {
		boolean emailDebug = false;

		PromotionMail pe = new PromotionMail(emailDebug);
	}

	public PromotionMail(boolean emailBebug) {


		try {
			List<Product> products = ProductService.getProduct(
					"E:\\idea\\OOD\\src\\main\\java\\com\\yht\\codingSecond\\srp\\good\\product_promotion.txt");
			List<User> users = UserService.getUser(products);
			sender = new MailSender();
				sender.sendEMails(emailBebug, users, products);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}




}
