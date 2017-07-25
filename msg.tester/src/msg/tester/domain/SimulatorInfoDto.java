package msg.tester.domain;

public class SimulatorInfoDto {

	private String simId;
	private String simTp;

	public String getSimId() {
		return simId;
	}

	public void setSimId(String simId) {
		this.simId = simId;
	}

	public String getSimTp() {
		return simTp;
	}

	public void setSimTp(String simTp) {
		this.simTp = simTp;
	}

	@Override
	public String toString() {
		return "SimulatorInfoDto [simId=" + simId + ", simTp=" + simTp + "]";
	}

}
