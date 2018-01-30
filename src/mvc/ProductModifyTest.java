package mvc;

public class ProductModifyTest {

	public static void main(String[] args) {
		ProductDTO product = new ProductDTO(10, "°¶·°½Ã", 2000);
		
		ProductBiz biz = new ProductBiz();
		biz.productModify(product);
		
	}

}
