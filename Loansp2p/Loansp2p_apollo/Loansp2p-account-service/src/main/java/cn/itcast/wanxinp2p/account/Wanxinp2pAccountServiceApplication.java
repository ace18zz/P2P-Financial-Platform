package cn.itcast.Loansp2p.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = MongoAutoConfiguration.class,scanBasePackages = {"org.dromara.hmily","cn.itcast.Loansp2p.account"})
@EnableDiscoveryClient
@MapperScan("cn.itcast.Loansp2p.account.mapper") //设置mapper接口的扫描包
public class Loansp2pAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Loansp2pAccountServiceApplication.class, args);
    }

}
