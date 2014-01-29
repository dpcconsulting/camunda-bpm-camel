package org.camunda.bpm.camel.component;

import org.apache.camel.CamelContext;
import org.apache.camel.Component;
import org.apache.camel.spi.ComponentResolver;
import org.camunda.bpm.engine.ProcessEngine;

public class CamundaComponentResolver implements ComponentResolver {

    private ProcessEngine processEngine;

    @Override
    public Component resolveComponent(String name, CamelContext context) throws Exception {
        return new CamundaBpmComponent(processEngine);
    }

    public ProcessEngine getProcessEngine() {
        return processEngine;
    }

    public void setProcessEngine(ProcessEngine processEngine) {
        this.processEngine = processEngine;
    }
}
