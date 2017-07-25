package msg.tester.domain;

import java.util.List;

public class SimulatorDto {

	private List<SimulatorInfoDto> sim;

	@Override
	public String toString() {
		return "SimulatorDto [sim=" + sim + "]";
	}

	public List<SimulatorInfoDto> getSim() {
		return sim;
	}

	public void setSim(List<SimulatorInfoDto> sim) {
		this.sim = sim;
	}
}
