package mvc;

public class ProductBiz {
	private ProductDAO dao;
	
	public ProductBiz() {
		dao = new ProductDAO();
	}
	
	public void productInsert(ProductDTO product) {
		System.out.println("데이터 체크");
		System.out.println("아이템 입력");
		dao.ProductInsert(product);
	}
	public void productModify(ProductDTO product) {
		System.out.println("데이터 체크");
		dao.ProductUpdate(product);
	}
	public void productRemove(int id) {
		System.out.println("데이터 체크");
		dao.ProductDelete(id);
	}
}
