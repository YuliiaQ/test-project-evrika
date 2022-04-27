package cache;

import lombok.Getter;

public enum TestCacheKey {
    PASSWORD("password");

    @Getter
    private final String key;

    TestCacheKey(String key) {
        this.key = key;
    }
}
