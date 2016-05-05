package my.domain;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The echo producer.
 */
public class echoProducer extends DefaultProducer {
    private static final Logger LOG = LoggerFactory.getLogger(echoProducer.class);
    private echoEndpoint endpoint;

    public echoProducer(echoEndpoint endpoint) {
        super(endpoint);
        this.endpoint = endpoint;
    }

    public void process(Exchange exchange) throws Exception {
        System.out.println(exchange.getIn().getBody());    
    }

}
