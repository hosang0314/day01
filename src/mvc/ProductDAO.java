package mvc;

public class ProductDAO {
	public ProductDAO(){
		
	}
	public void ProductInsert(ProductDTO product) {
		System.out.println("Product �Է�");
		System.out.println(product);
		System.out.println("�Է� �Ϸ�");
	}
	public void ProductDelete(int id) {
		System.out.println("Product ����");
		System.out.println(id);
		System.out.println("���� �Ϸ�");
	}
	public void ProductUpdate(ProductDTO product) {
		System.out.println("Product ����");
		System.out.println(product);
		System.out.println("���� �Ϸ�");
	}
}
