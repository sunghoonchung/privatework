package msg.tester.module;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
public class CommonVariable {

	private final ThreadLocal<String> userId = new ThreadLocal<>();
	private final ThreadLocal<String> uid = new ThreadLocal<>();

	public void clear() {
		userId.remove();
		uid.remove();
	}

	public String getUserId() {
		return userId.get();
	}

	public void setUserId(String userId) {
		this.userId.set(userId);
	}

	public String getUid() {
		return uid.get();
	}

	public void setUid(String uid) {
		this.uid.set(uid);
	}

	@Override
	public String toString() {
		return "CommonVariable [userId=" + userId + ", uid=" + uid + "]";
	}

}
