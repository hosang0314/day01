package mvc;

public class ProductRegisterTest {

	public static void main(String[] args) {
		ProductDTO product = new ProductDTO(10, "�ڵ���", 1000);
		
		ProductBiz biz = new ProductBiz();
		biz.productInsert(product);

	}

}
