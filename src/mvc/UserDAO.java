package mvc;

public class UserDAO {
	// Driver Loading
	// DB�� ���� �Ѵ�.
	// CRUD�� �Լ��� �����ȴ�.
	public UserDAO() {
		
	}
	public void userInsert(UserDTO user) {
		System.out.println("DB�� User �Է�");
		System.out.println(user);
		System.out.println("�Է� �Ϸ�");
	}
	public void userDelete(String id) {
		System.out.println("DB�� ID ����");
		System.out.println(id);
		System.out.println("���� �Ϸ�");
	}
	public void userUpdate(UserDTO user) {
		System.out.println("DB�� User ����");
		System.out.println(user);
		System.out.println("���� �Ϸ�");
	}
}
