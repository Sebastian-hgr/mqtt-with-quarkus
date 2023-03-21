package at.htlleonding.mqtt.outgoing;

import io.smallrye.reactive.messaging.mqtt.MqttMessage;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import javax.inject.Inject;
import java.util.Random;

public class MqttPressurePublisher {

    @Inject
    @Channel("outgoing-channel")
    Emitter<String> emitter;

//    public void send(double d) {
//        emitter.send(d);
//    }


    public void send(String payload) {

        String topic = "itp/measurements/hygro";

        MqttMessage message = MqttMessage.of(topic, payload);
        emitter.send(message);

    }
}
