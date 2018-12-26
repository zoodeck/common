package com.zoodeck.common.config;

import java.util.Map;

class LocalConfigService implements ConfigService {

    private Map<String, String> env;

    LocalConfigService(Map<String, String> env) {
        this.env = env;
    }

    @Override
    public String get(String key) {
        return null;
    }
}
