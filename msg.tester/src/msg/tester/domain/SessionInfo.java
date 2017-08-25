package msg.tester.domain;

public class SessionInfo {

	private String userId;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SessionInfo [userId=");
		builder.append(userId);
		builder.append("]");
		return builder.toString();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
