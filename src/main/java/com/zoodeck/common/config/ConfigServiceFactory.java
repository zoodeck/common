package com.zoodeck.common.config;

import java.util.Map;

import static com.zoodeck.common.ConstantsService.*;

public class ConfigServiceFactory {
    public static ConfigService getConfigService(Map<String, String> localEnv) {
        Map<String, String> env = System.getenv();
        if (env.containsKey(DEPLOYED_ENV)) {
            return new EnvConfigService(env);
        }

        return new EnvConfigService(localEnv);
    }
}
