package msg.tester.domain;

public class CommCdItemDto {

	private String cdKey;
	private String cdValue;
	private String cdDesc;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommCdItemDto [cdKey=");
		builder.append(cdKey);
		builder.append(", cdValue=");
		builder.append(cdValue);
		builder.append(", cdDesc=");
		builder.append(cdDesc);
		builder.append("]");
		return builder.toString();
	}

	public String getCdKey() {
		return cdKey;
	}

	public void setCdKey(String cdKey) {
		this.cdKey = cdKey;
	}

	public String getCdValue() {
		return cdValue;
	}

	public void setCdValue(String cdValue) {
		this.cdValue = cdValue;
	}

	public String getCdDesc() {
		return cdDesc;
	}

	public void setCdDesc(String cdDesc) {
		this.cdDesc = cdDesc;
	}

}
