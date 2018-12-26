package com.zoodeck.common.config;

import java.util.Map;

class EnvConfigService implements ConfigService {

    private Map<String, String> env;

    EnvConfigService(Map<String, String> env) {
        this.env = env;
    }

    @Override
    public String get(String key) {
        return env.getOrDefault(key, "");
    }
}
