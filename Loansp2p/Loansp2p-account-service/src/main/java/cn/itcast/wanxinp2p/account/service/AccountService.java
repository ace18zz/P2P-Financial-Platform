package cn.itcast.Loansp2p.account.service;

import cn.itcast.Loansp2p.account.entity.Account;
import cn.itcast.Loansp2p.api.account.model.AccountDTO;
import cn.itcast.Loansp2p.api.account.model.AccountLoginDTO;
import cn.itcast.Loansp2p.api.account.model.AccountRegisterDTO;
import cn.itcast.Loansp2p.common.domain.RestResponse;
import com.baomidou.mybatisplus.extension.service.IService;


public interface AccountService extends IService<Account> {

    RestResponse getSMSCode(String mobile) ;

    Integer checkMobile(String mobile,String key,String code);

    AccountDTO register(AccountRegisterDTO accountRegisterDTO) ;

    AccountDTO login(AccountLoginDTO accountLoginDTO);
}
