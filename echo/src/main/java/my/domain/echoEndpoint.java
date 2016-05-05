package my.domain;

import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.impl.DefaultEndpoint;
import org.apache.camel.spi.UriParam;

/**
 * Represents a echo endpoint.
 */
public class echoEndpoint extends DefaultEndpoint {

	@UriParam
	private long delay;

	public echoEndpoint() {
	}

	public echoEndpoint(String uri, echoComponent component) {
		super(uri, component);
	}

	public echoEndpoint(String endpointUri) {
		super(endpointUri);
	}

	public Producer createProducer() throws Exception {
		return new echoProducer(this);
	}

	public Consumer createConsumer(Processor processor) throws Exception {
		return new echoConsumer(this, processor);
	}

	public boolean isSingleton() {
		return true;
	}

	public long getDelay() {
		return delay;
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}

}
