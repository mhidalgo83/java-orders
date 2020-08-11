package com.ordersproject.demo.services;

import com.ordersproject.demo.models.Agent;
import com.ordersproject.demo.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service (value = "agentServices")
public class AgentServicesImpl implements AgentServices {
    @Autowired
    AgentsRepository agentrepos;

    @Override
    public Agent save(Agent agent) {
        return agentrepos.save(agent);
    }
}
