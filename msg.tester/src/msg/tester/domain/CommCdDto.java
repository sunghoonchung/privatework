package msg.tester.domain;

import java.util.List;

public class CommCdDto {
	private String cdId;
	private String cdType;
	private List<CommCdItemDto> items;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommCdDto [cdId=");
		builder.append(cdId);
		builder.append(", cdType=");
		builder.append(cdType);
		builder.append(", items=");
		builder.append(items);
		builder.append("]");
		return builder.toString();
	}

	public String getCdId() {
		return cdId;
	}

	public void setCdId(String cdId) {
		this.cdId = cdId;
	}

	public String getCdType() {
		return cdType;
	}

	public void setCdType(String cdType) {
		this.cdType = cdType;
	}

	public List<CommCdItemDto> getItems() {
		return items;
	}

	public void setItems(List<CommCdItemDto> items) {
		this.items = items;
	}

}
