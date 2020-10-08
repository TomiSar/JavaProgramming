package com.timojo.energymart;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.Clock;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.jmx.JmxConfig;
import io.micrometer.jmx.JmxMeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfiguration {
    @Bean
    public MeterRegistry meterRegistry() {
        return new JmxMeterRegistry(new JmxConfig() {
            @Override
            public String get(String key) {
                return null;
            }
        }, Clock.SYSTEM);
    }

    @Bean
    public TimedAspect timedAspect(@Autowired MeterRegistry meterRegistry) {
        return new TimedAspect(meterRegistry);
    }
}
