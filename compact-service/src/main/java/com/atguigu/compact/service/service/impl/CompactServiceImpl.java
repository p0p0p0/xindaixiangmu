package com.atguigu.compact.service.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.compact.service.mapper.BorrowerInfoMapper;
import com.atguigu.compact.service.mapper.ContractAttributeMapper;
import com.atguigu.compact.service.mapper.LoanContractMapper;
import com.atguigu.compact.service.mapper.RepaymentPlanMapper;
import com.atguigu.htm.bean.LoanContract;
import com.atguigu.htm.bean.RepaymentPlan;
import com.atguigu.htm.service.CompactService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.apache.log4j.Logger;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class CompactServiceImpl implements CompactService{
    private static final Logger LOGGER = Logger.getLogger(CompactServiceImpl.class);
    @Autowired
    BorrowerInfoMapper borrowerInfoMapper;
    @Autowired
    LoanContractMapper loanContractMapper;
    @Autowired
    ContractAttributeMapper contractAttributeMapper;
    @Autowired
    RepaymentPlanMapper repaymentPlanMapper;

    @Override
    @Transactional(readOnly = true)
    public Integer queryCompactCount(Map<String, Object> params) {
        Long count = loanContractMapper.queryLoanContractCountByMap(params);
        return count.intValue();
    }

    @Override
    @Transactional(readOnly = true)
    public List<LoanContract> queryCompactList(Map<String, Object> params) {
        List<LoanContract> loanContractList = loanContractMapper.queryLoanContractsByMap(params);
        return loanContractList;
    }

    @Override
    public LoanContract queryCompact4Repay(String loadContractNum) {
        LoanContract loanContract = loanContractMapper.queryCompact4Repay(loadContractNum);
        return loanContract;
    }

    @Override
    public List<RepaymentPlan> queryRepayPlanListByContractNum(String loanContractNum) {
        EntityWrapper<RepaymentPlan> wrapper = new EntityWrapper<>();
        wrapper.eq("LOAN_CONTRACT_NUM",loanContractNum);
        List<RepaymentPlan> repaymentPlanList = repaymentPlanMapper.selectList(wrapper);
        return repaymentPlanList;
    }

    @Override
    public Integer queryRepayPlanCountByContractNum(String loanContractNum) {
        EntityWrapper<RepaymentPlan> wrapper = new EntityWrapper<>();
        wrapper.eq("LOAN_CONTRACT_NUM",loanContractNum);
        Integer total = repaymentPlanMapper.selectCount(wrapper);
        return total;
    }
}
