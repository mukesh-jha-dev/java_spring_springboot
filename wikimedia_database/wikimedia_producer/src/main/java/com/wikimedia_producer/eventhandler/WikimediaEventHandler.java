package com.wikimedia_producer.eventhandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.MessageEvent;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class WikimediaEventHandler implements EventHandler {
	KafkaTemplate<String , String> kt;
	String topic;
		private static final Logger LOGGER=LoggerFactory.getLogger(WikimediaEventHandler.class);
	@Override
	public void onOpen() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClosed() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMessage(String event, MessageEvent messageEvent) throws Exception {
		LOGGER.info(String.format("data sent -> %s", messageEvent.getData()));
		kt.send("wikimedia_recentchanges", messageEvent.getData());
	}

	@Override
	public void onComment(String comment) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onError(Throwable t) {
		// TODO Auto-generated method stub
		
	}

}
