package com.xhh.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类专门用来初始化topic
 *
 * @author PengHui
 */
@Configuration
public class KafkaInitialConfiguration {

    /**
     * 创建一个名为first的Topic并设置分区数为8，分区副本数为2
     * @return
     */
    @Bean
    public NewTopic initialTopic() {
        return new NewTopic("first",8, (short) 2 );
    }

    /**
     * 如果要修改分区数，只需修改配置值重启项目即可
     * 修改分区数并不会导致数据的丢失，但是分区数只能增大不能减小
     * @return
     */
    @Bean
    public NewTopic updateTopic() {
        return new NewTopic("first",10, (short) 2 );
    }
}
