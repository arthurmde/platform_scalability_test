package org.platform.scalability_test.REST;
import java.util.Map;

import org.platform.scalability_test.strategy.RESTStrategy;

public class ResourceCreate extends RESTStrategy {

	@Override
	public String request(String string) throws Exception {
		get(buildUrl(KALIBRO_MODULE_PATH + "/1/exists"));
		return null;
	}

	@Override
	public void configure(Map<Object, Object> options) {
		configure(options, "kalibro_processor");
	}

}
