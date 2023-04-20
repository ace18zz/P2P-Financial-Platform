package cn.itcast.Loansp2p.api.search;

import cn.itcast.Loansp2p.api.search.model.ProjectQueryParamsDTO;
import cn.itcast.Loansp2p.api.transaction.model.ProjectDTO;
import cn.itcast.Loansp2p.common.domain.PageVO;
import cn.itcast.Loansp2p.common.domain.RestResponse;

public interface ContentSearchApi {
    /**
     * 检索标的
     * @param projectQueryParamsDTO
     * @return
     */
    RestResponse<PageVO<ProjectDTO>> queryProjectIndex(
            ProjectQueryParamsDTO projectQueryParamsDTO,
            Integer pageNo,Integer pageSize,String sortBy,String order);
}
