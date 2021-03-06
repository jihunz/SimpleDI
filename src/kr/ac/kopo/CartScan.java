package kr.ac.kopo;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CartScan{

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:cart_scan.xml");
		ctx.refresh();
		
		Cart cart = (Cart) ctx.getBean("cart");
		cart.run();
		
		ctx.close();
	}

}
