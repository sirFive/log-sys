package cn.yunyichina.log.servicecenter.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2016/11/22 12:07
 * @Description:
 */
@EnableEurekaServer
@SpringBootApplication
public class RegistryApp {

    public static void main(String[] args) {
        SpringApplication.run(RegistryApp.class, args);
    }

}
