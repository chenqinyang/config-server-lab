package qy.lab.cloud.config.center;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
public class ConfigLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigLabApplication.class, args);
	}

}
