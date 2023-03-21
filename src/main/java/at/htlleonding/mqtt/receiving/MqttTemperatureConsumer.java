package at.htlleonding.mqtt.receiving;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MqttTemperatureConsumer {

    @Inject
    Logger LOG;

    @Incoming("measurements")
    public void consume(byte[] raw) {
        LOG.info(new String(raw));
    }
}
