package mvc;

public class ProductDAO {
	public ProductDAO(){
		
	}
	public void ProductInsert(ProductDTO product) {
		System.out.println("Product 입력");
		System.out.println(product);
		System.out.println("입력 완료");
	}
	public void ProductDelete(int id) {
		System.out.println("Product 삭제");
		System.out.println(id);
		System.out.println("삭제 완료");
	}
	public void ProductUpdate(ProductDTO product) {
		System.out.println("Product 수정");
		System.out.println(product);
		System.out.println("수정 완료");
	}
}
