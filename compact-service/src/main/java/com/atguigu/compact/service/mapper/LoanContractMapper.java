package com.atguigu.compact.service.mapper;

import com.atguigu.htm.bean.LoanContract;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.Object;


import java.util.List;
import java.util.Map;

public interface LoanContractMapper extends BaseMapper<LoanContract> {
    Long queryLoanContractCountByMap(Map<String,Object> params);
    LoanContract queryCompact4Repay(@Param("loanContractNum") String loanContractNum);
    List<LoanContract> queryLoanContractsByMap(Map<String, Object> params);
}
