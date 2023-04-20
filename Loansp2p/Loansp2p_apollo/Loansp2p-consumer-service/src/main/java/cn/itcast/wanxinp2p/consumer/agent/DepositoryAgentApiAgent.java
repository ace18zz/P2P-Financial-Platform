package cn.itcast.Loansp2p.consumer.agent;

import cn.itcast.Loansp2p.api.consumer.model.ConsumerRequest;
import cn.itcast.Loansp2p.api.depository.GatewayRequest;
import cn.itcast.Loansp2p.common.domain.RestResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "depository-agent-service")
public interface DepositoryAgentApiAgent {
    @PostMapping("/depository-agent/l/consumers")
    RestResponse<GatewayRequest> createConsumer(@RequestBody ConsumerRequest consumerRequest);
}
