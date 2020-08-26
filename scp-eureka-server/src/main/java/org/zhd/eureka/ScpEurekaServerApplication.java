package org.zhd.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author juny
 */
@SpringBootApplication
@EnableEurekaServer
public class ScpEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScpEurekaServerApplication.class, args);
    }

}
