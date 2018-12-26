package com.zoodeck.common.config;

import java.util.Map;

public class ConfigServiceFactory {
    public static ConfigService getConfigService(Map<String, String> env) {
        // todo add logic to figure out which ConfigService implementation to create
        return new LocalConfigService(env);
    }
}
