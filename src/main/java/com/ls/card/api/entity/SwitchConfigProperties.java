package com.ls.card.api.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "com.switch")
@Configuration
@Data
public class SwitchConfigProperties {

    private Boolean hasRelatedOrder;
}
