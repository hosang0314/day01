package mvc;

public class ProductBiz {
	private ProductDAO dao;
	
	public ProductBiz() {
		dao = new ProductDAO();
	}
	
	public void productInsert(ProductDTO product) {
		System.out.println("������ üũ");
		System.out.println("������ �Է�");
		dao.ProductInsert(product);
	}
	public void productModify(ProductDTO product) {
		System.out.println("������ üũ");
		dao.ProductUpdate(product);
	}
	public void productRemove(int id) {
		System.out.println("������ üũ");
		dao.ProductDelete(id);
	}
}
