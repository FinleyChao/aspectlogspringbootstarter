package com.finley.aspectlogspringbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description: 读取配置文件自动配置的类
 * @author: xianfei.chao
 * @date 2021/5/14 15:40
 * @version: 1.0
 */
@ConfigurationProperties("aspectLog")
public class AspectLogProperties {

    private boolean enable;
    public boolean isEnable() {
        return enable;
    }
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
