package Demo;
import org.apache.logging.log4j.*;
public class LoggerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = LogManager.getLogger("LoggerDemo");
		log.info("for info only");
		log.debug("for debug only");
		log.error("for errror only");
		log.warn("for warning only");

	}

}
