package com.rejasupotaro.android.kvs.internal;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTest {
    @Test
    public void capitalize() {
        assertThat(StringUtils.capitalize("username")).isEqualTo("Username");
    }

    @Test
    public void isEmpty() {
        assertThat(StringUtils.isEmpty(null)).isTrue();
        assertThat(StringUtils.isEmpty("")).isTrue();
        assertThat(StringUtils.isEmpty("foo")).isFalse();
    }
}
