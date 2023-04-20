package cn.itcast.Loansp2p.search.service;

import cn.itcast.Loansp2p.api.search.model.ProjectQueryParamsDTO;
import cn.itcast.Loansp2p.api.transaction.model.ProjectDTO;
import cn.itcast.Loansp2p.common.domain.PageVO;

/**
 * 标的检索业务层接口
 */
public interface ProjectIndexService {
    PageVO<ProjectDTO> queryProjectIndex(ProjectQueryParamsDTO
                                                 projectQueryParamsDTO,
                                         Integer pageNo, Integer pageSize,
                                         String sortBy, String order);
}
