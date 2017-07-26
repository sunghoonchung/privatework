package msg.tester.utils;

import java.util.UUID;

public class UidUtils {

	private final static UidUtils instance = new UidUtils();

	private UidUtils() {
	}

	public static UidUtils getInstance() {
		return instance;
	}

	public String genUid() {
		UUID uuid = UUID.randomUUID();
		String strUuid = uuid.toString().replaceAll("-", "");
		return strUuid;
	}
}
