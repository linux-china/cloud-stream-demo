package org.mvnsearch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
@EnableBinding({Sink.class, Source.class})
public class CloudStreamDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudStreamDemoApplication.class, args);
	}
}
