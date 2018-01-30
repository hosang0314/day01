package mvc;

public class ProductRegisterTest {

	public static void main(String[] args) {
		ProductDTO product = new ProductDTO(10, "ÀÚµ¿Â÷", 1000);
		
		ProductBiz biz = new ProductBiz();
		biz.productInsert(product);

	}

}
