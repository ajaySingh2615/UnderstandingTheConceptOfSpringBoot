package com.ajay;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestcontainersTest extends AbstractTestcontainers {

    @Test
    void canStartPostgresDB() {
        assertThat(postgreSqlContainer.isRunning()).isTrue();
        assertThat(postgreSqlContainer.isCreated()).isTrue();
    }
}
