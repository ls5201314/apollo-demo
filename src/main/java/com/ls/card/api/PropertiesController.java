package com.ls.card.api;

import com.ls.card.api.entity.SwitchConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Autowired
    private SwitchConfigProperties switchConfigProperties;

    @Autowired
    private ApplicationContext applicationContext;

    private static String methodParam;

    @GetMapping("switch-config")
    public Boolean getSwitchConfigProperties() {
        return switchConfigProperties.getHasRelatedOrder();
    }

    /*@ApolloConfigChangeListener
    public void onChange(ConfigChangeEvent configChangeEvent) {
        applicationContext.publishEvent(new EnvironmentChangeEvent(configChangeEvent.changedKeys()));
    }*/

    @GetMapping("method-param")
    public String getMethodParameterValue() {
        return methodParam;
    }

    @Value("${methodParam:}")
    private void setMethodParam(String methodParam) {
        this.methodParam = methodParam;
    }
}
