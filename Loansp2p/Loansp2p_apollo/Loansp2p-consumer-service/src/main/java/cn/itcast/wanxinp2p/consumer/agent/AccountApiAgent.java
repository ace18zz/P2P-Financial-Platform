package cn.itcast.Loansp2p.consumer.agent;

import cn.itcast.Loansp2p.api.account.model.AccountDTO;
import cn.itcast.Loansp2p.api.account.model.AccountRegisterDTO;
import cn.itcast.Loansp2p.common.domain.RestResponse;
import org.dromara.hmily.annotation.Hmily;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value="account-service")
public interface AccountApiAgent {

    @Hmily
    @PostMapping(value = "/account/l/accounts")
    RestResponse<AccountDTO> register(@RequestBody AccountRegisterDTO accountRegisterDTO);
}
