package org.mvnsearch.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * log sink
 *
 * @author linux_china
 */
@Component
public class LogSink {
    private static Logger logger = LoggerFactory.getLogger(LogSink.class);

    @StreamListener(Sink.INPUT)
    public void log(String payload) {
        System.out.println(payload);
    }

}