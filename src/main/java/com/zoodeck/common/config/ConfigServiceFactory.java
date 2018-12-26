package com.zoodeck.common.config;

import java.util.Map;

public class ConfigServiceFactory {

    private Map<String, String> env;

    public ConfigServiceFactory(Map<String, String> env) {
        this.env = env;
    }

    public ConfigService getConfigService() {
        // todo add logic to figure out which ConfigService implementation to create
        return new LocalConfigService(env);
    }
}
