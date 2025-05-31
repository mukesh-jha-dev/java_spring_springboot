package com.wikimedia_producer.producer;

import java.beans.EventHandler;
import java.net.URI;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.launchdarkly.eventsource.EventSource;
import com.launchdarkly.eventsource.EventSource.Builder;
import com.wikimedia_producer.eventhandler.WikimediaEventHandler;

@Service
public class WikMediaRecentChangesProducer {
	@Autowired
	private KafkaTemplate< String, String> kt;
	
	
	
	public void sendMessage() throws InterruptedException {
	    String url = "https://stream.wikimedia.org/v2/stream/recentchange";
	    
	  WikimediaEventHandler wikimediaEventHandler = new  WikimediaEventHandler(kt, "wikimedia_recentchanges");
	    Builder builder = new EventSource.Builder(wikimediaEventHandler,URI.create(url));
	    EventSource eventSource = builder.build();
	    System.out.println("Starting stream from Wikimedia...");
	    eventSource.start();

	    TimeUnit.MINUTES.sleep(2);

	    System.out.println("Stopping stream...");
	    eventSource.close();  // Optional but recommended
	}

	

}
