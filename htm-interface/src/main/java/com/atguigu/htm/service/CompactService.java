package com.atguigu.htm.service;

import com.atguigu.htm.bean.LoanContract;
import com.atguigu.htm.bean.RepaymentPlan;
import org.omg.CORBA.Object;

import java.util.List;
import java.util.Map;

public interface CompactService {

    List<LoanContract> queryCompactList(Map<String, Object> params);

    LoanContract queryCompact4Repay(String loadContractNum);

    List<RepaymentPlan> queryRepayPlanListByContractNum(String loanContractNum);

    Integer queryRepayPlanCountByContractNum(String loanContractNum);

    Integer queryCompactCount(Map<String, Object> params);
}
