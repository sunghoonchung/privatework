package msg.tester;

import java.util.Properties;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.DataSourceFactory;

public class JdbcTester {

	public static void main(String[] args) throws Exception {
		Class.forName("org.postgresql.Driver");
		DataSourceFactory dsf = new DataSourceFactory();

		Properties properties = new Properties();
		properties.put("url", "jdbc:h2:tcp://localhost:8090/~/test");
		properties.put("username", "sa");
		properties.put("password", "sa");
		DataSource ds = (DataSource) dsf.createDataSource(properties);
	}
}
