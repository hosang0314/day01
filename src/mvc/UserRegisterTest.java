package mvc;

public class UserRegisterTest {

	public static void main(String[] args) {
		UserDTO user = new UserDTO("id01", "pwd01", "�̸���");
		
		UserBiz biz = new UserBiz();
		biz.register(user);
		

	}

}
