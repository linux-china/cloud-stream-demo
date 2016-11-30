package org.mvnsearch.cloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * message output test
 *
 * @author linux_china
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE,classes = CloudStreamDemoApplication.class)
public class MessageOutputTest {
    @Autowired
    private Source source;

    @Test
    public void testSend() {
        source.output().send(MessageBuilder.withPayload("good").build());
    }
}
