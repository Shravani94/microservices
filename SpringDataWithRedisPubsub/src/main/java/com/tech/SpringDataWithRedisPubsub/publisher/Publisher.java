package com.tech.SpringDataWithRedisPubsub.publisher;

import com.tech.SpringDataWithRedisPubsub.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Publisher {

    @Autowired
    private RedisTemplate template;

    @Autowired
    private ChannelTopic topic;

    @PostMapping
    public String publish(@RequestBody Product product){
        template.convertAndSend(topic.getTopic(),product.toString());
        return "Event Published !!";
    }

}
