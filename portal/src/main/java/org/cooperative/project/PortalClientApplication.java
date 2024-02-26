package org.cooperative.project;

import com.ctrip.framework.apollo.Apollo;
import com.ctrip.framework.apollo.ConfigService;
import com.ctrip.framework.apollo.core.dto.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig
@Slf4j
public class PortalClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(PortalClientApplication.class);
    }
}
