package cn.itcast.Loansp2p.consumer.service;

import cn.itcast.Loansp2p.api.consumer.model.BorrowerDTO;
import cn.itcast.Loansp2p.api.consumer.model.ConsumerDTO;
import cn.itcast.Loansp2p.api.consumer.model.ConsumerRegisterDTO;
import cn.itcast.Loansp2p.api.consumer.model.ConsumerRequest;
import cn.itcast.Loansp2p.api.depository.GatewayRequest;
import cn.itcast.Loansp2p.api.depository.model.DepositoryConsumerResponse;
import cn.itcast.Loansp2p.common.domain.RestResponse;
import cn.itcast.Loansp2p.consumer.entity.Consumer;
import com.baomidou.mybatisplus.extension.service.IService;

public interface ConsumerService extends IService<Consumer> {
    /**
     * 检测用户是否存在
     * @param mobile
     * @return
     */
    Integer checkMobile(String mobile);
    /**
     * 用户注册
     * @param consumerRegisterDTO
     * @return
     */
    void register(ConsumerRegisterDTO consumerRegisterDTO);

    /**
    生成开户数据
    @param consumerRequest
    @return
    */
    RestResponse<GatewayRequest> createConsumer(ConsumerRequest consumerRequest);

    /**
     * 更新开户结果
     * @param response
     * @return
     */
    Boolean modifyResult(DepositoryConsumerResponse response);

    /**
     * 通过手机号获取当前用户信息
     * @param mobile
     * @return
     */
    ConsumerDTO getByMobile(String mobile);

    /**
        * 获取借款人基本信息
        * @param id
        * @return
     */
    BorrowerDTO getBorrower(Long id);
}