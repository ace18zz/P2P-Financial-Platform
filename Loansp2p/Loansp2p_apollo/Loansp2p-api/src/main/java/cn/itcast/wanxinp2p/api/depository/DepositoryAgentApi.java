package cn.itcast.Loansp2p.api.depository;

import cn.itcast.Loansp2p.api.consumer.model.ConsumerRequest;
import cn.itcast.Loansp2p.api.depository.model.LoanRequest;
import cn.itcast.Loansp2p.api.depository.model.RepaymentRequest;
import cn.itcast.Loansp2p.api.depository.model.UserAutoPreTransactionRequest;
import cn.itcast.Loansp2p.api.transaction.model.ModifyProjectStatusDTO;
import cn.itcast.Loansp2p.api.transaction.model.ProjectDTO;
import cn.itcast.Loansp2p.common.domain.RestResponse;

/**
 * 银行存管系统代理服务API
 */
public interface DepositoryAgentApi {
    /**
     * 开通存管账户
     * @param consumerRequest 开户信息
     * @return
     */
    RestResponse<GatewayRequest> createConsumer(ConsumerRequest consumerRequest);

    /**
     * 向银行存管系统发送标的信息
     @param projectDTO
    * @return
        */
    RestResponse<String> createProject(ProjectDTO projectDTO);

    /**
     * 预授权处理
     * @param userAutoPreTransactionRequest 预授权处理信息
     * @return
     */
    RestResponse<String> userAutoPreTransaction(UserAutoPreTransactionRequest
                                                        userAutoPreTransactionRequest);


    /**
       * 审核标的满标放款
        * @param loanRequest
        * @return
        */
    RestResponse<String> confirmLoan(LoanRequest loanRequest);

    /**
     * 修改标的状态
     * @param modifyProjectStatusDTO
     * @return
     */
    RestResponse<String> modifyProjectStatus(ModifyProjectStatusDTO
                                                     modifyProjectStatusDTO);

    /**
     * 还款确认
     * @param  repaymentRequest  还款信息
     * @return
     */
    RestResponse<String> confirmRepayment(RepaymentRequest repaymentRequest);
}