package mvc;

public class UserDAO {
	// Driver Loading
	// DB에 접속 한다.
	// CRUD가 함수로 구현된다.
	public UserDAO() {
		
	}
	public void userInsert(UserDTO user) {
		System.out.println("DB에 User 입력");
		System.out.println(user);
		System.out.println("입력 완료");
	}
	public void userDelete(String id) {
		System.out.println("DB에 ID 삭제");
		System.out.println(id);
		System.out.println("삭제 완료");
	}
	public void userUpdate(UserDTO user) {
		System.out.println("DB에 User 수정");
		System.out.println(user);
		System.out.println("수정 완료");
	}
}
