package msg.tester.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import msg.tester.dao.BxtTableDao;
import msg.tester.domain.BxtTableDto;
import msg.tester.domain.SimulatorInfoDto;

@Controller
@RequestMapping(value = "/bxt_table", method = { RequestMethod.GET, RequestMethod.POST })
public class BxtTableController {

	final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private BxtTableDao bxtTableDao;

	@RequestMapping(value = "/selectAll")
	public @ResponseBody List<BxtTableDto> selectAll() {
		return bxtTableDao.selectAll();
	}

	@RequestMapping(value = "/insert")
	public @ResponseBody SimulatorInfoDto insert(@RequestParam("key") String key) {
		SimulatorInfoDto dto = new SimulatorInfoDto();
		dto.setSimId("End-Root key:" + key);
		return dto;
	}

	@RequestMapping(value = "/update")
	public @ResponseBody SimulatorInfoDto update(@RequestParam("key") String key) {
		SimulatorInfoDto dto = new SimulatorInfoDto();
		dto.setSimId("End-Root key:" + key);
		return dto;
	}

	@RequestMapping(value = "/delete")
	public @ResponseBody SimulatorInfoDto delete(@RequestParam("key") String key) {
		SimulatorInfoDto dto = new SimulatorInfoDto();
		dto.setSimId("End-Root key:" + key);
		return dto;
	}

}
