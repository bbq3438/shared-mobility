package sharedmobility;

import sharedmobility.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @Autowired OrderInfoRepository orderInfoRepository;



    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
