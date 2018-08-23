package com.atguigu.htm.bean;

import java.io.Serializable;

public class RepaymentDetail implements Serializable{
    private Long id;
    private Long repayment_plan_id;
    private Long repayment_record_id;
    private Long business_request_id;
    private Long loan_contract_num;
    private java.sql.Date repayment_date;
    private Long instalment;
    private Long should_capital;
    private Long should_interest;
    private Long should_inst_fee;
    private Long should_amerce;
    private Long should_forfeit;
    private Long should_penalty;
    private Long should_change_fee;
    private Long should_other_fee;
    private Long should_amount;
    private Long indeed_capital;
    private Long indeed_interest;
    private Long indeed_inst_fee;
    private Long indeed_amerce;
    private Long indeed_forfeit;
    private Long indeed_penalty;
    private Long indeed_change_fee;
    private Long indeed_other_fee;
    private Long indeed_amount;
    private String status;
    private Long reduce_capital;
    private Long reduce_interest;
    private Long reduce_amerce;
    private Long reduce_forfeit;
    private Long reduce_penalty;
    private Long reduce_inst_fee;
    private Long reduce_pre_fee;
    private Long reduce_other_fee;
    private String data_create_type;
    private String remark;
    private String special_code;
    private Long sort;
    private String creator;
    private java.sql.Timestamp create_time;
    private String updater;
    private java.sql.Timestamp update_time;
    private String update_type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRepayment_plan_id() {
        return repayment_plan_id;
    }

    public void setRepayment_plan_id(Long repayment_plan_id) {
        this.repayment_plan_id = repayment_plan_id;
    }

    public Long getRepayment_record_id() {
        return repayment_record_id;
    }

    public void setRepayment_record_id(Long repayment_record_id) {
        this.repayment_record_id = repayment_record_id;
    }

    public Long getBusiness_request_id() {
        return business_request_id;
    }

    public void setBusiness_request_id(Long business_request_id) {
        this.business_request_id = business_request_id;
    }

    public Long getLoan_contract_num() {
        return loan_contract_num;
    }

    public void setLoan_contract_num(Long loan_contract_num) {
        this.loan_contract_num = loan_contract_num;
    }

    public java.sql.Date getRepayment_date() {
        return repayment_date;
    }

    public void setRepayment_date(java.sql.Date repayment_date) {
        this.repayment_date = repayment_date;
    }

    public Long getInstalment() {
        return instalment;
    }

    public void setInstalment(Long instalment) {
        this.instalment = instalment;
    }

    public Long getShould_capital() {
        return should_capital;
    }

    public void setShould_capital(Long should_capital) {
        this.should_capital = should_capital;
    }

    public Long getShould_interest() {
        return should_interest;
    }

    public void setShould_interest(Long should_interest) {
        this.should_interest = should_interest;
    }

    public Long getShould_inst_fee() {
        return should_inst_fee;
    }

    public void setShould_inst_fee(Long should_inst_fee) {
        this.should_inst_fee = should_inst_fee;
    }

    public Long getShould_amerce() {
        return should_amerce;
    }

    public void setShould_amerce(Long should_amerce) {
        this.should_amerce = should_amerce;
    }

    public Long getShould_forfeit() {
        return should_forfeit;
    }

    public void setShould_forfeit(Long should_forfeit) {
        this.should_forfeit = should_forfeit;
    }

    public Long getShould_penalty() {
        return should_penalty;
    }

    public void setShould_penalty(Long should_penalty) {
        this.should_penalty = should_penalty;
    }

    public Long getShould_change_fee() {
        return should_change_fee;
    }

    public void setShould_change_fee(Long should_change_fee) {
        this.should_change_fee = should_change_fee;
    }

    public Long getShould_other_fee() {
        return should_other_fee;
    }

    public void setShould_other_fee(Long should_other_fee) {
        this.should_other_fee = should_other_fee;
    }

    public Long getShould_amount() {
        return should_amount;
    }

    public void setShould_amount(Long should_amount) {
        this.should_amount = should_amount;
    }

    public Long getIndeed_capital() {
        return indeed_capital;
    }

    public void setIndeed_capital(Long indeed_capital) {
        this.indeed_capital = indeed_capital;
    }

    public Long getIndeed_interest() {
        return indeed_interest;
    }

    public void setIndeed_interest(Long indeed_interest) {
        this.indeed_interest = indeed_interest;
    }

    public Long getIndeed_inst_fee() {
        return indeed_inst_fee;
    }

    public void setIndeed_inst_fee(Long indeed_inst_fee) {
        this.indeed_inst_fee = indeed_inst_fee;
    }

    public Long getIndeed_amerce() {
        return indeed_amerce;
    }

    public void setIndeed_amerce(Long indeed_amerce) {
        this.indeed_amerce = indeed_amerce;
    }

    public Long getIndeed_forfeit() {
        return indeed_forfeit;
    }

    public void setIndeed_forfeit(Long indeed_forfeit) {
        this.indeed_forfeit = indeed_forfeit;
    }

    public Long getIndeed_penalty() {
        return indeed_penalty;
    }

    public void setIndeed_penalty(Long indeed_penalty) {
        this.indeed_penalty = indeed_penalty;
    }

    public Long getIndeed_change_fee() {
        return indeed_change_fee;
    }

    public void setIndeed_change_fee(Long indeed_change_fee) {
        this.indeed_change_fee = indeed_change_fee;
    }

    public Long getIndeed_other_fee() {
        return indeed_other_fee;
    }

    public void setIndeed_other_fee(Long indeed_other_fee) {
        this.indeed_other_fee = indeed_other_fee;
    }

    public Long getIndeed_amount() {
        return indeed_amount;
    }

    public void setIndeed_amount(Long indeed_amount) {
        this.indeed_amount = indeed_amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getReduce_capital() {
        return reduce_capital;
    }

    public void setReduce_capital(Long reduce_capital) {
        this.reduce_capital = reduce_capital;
    }

    public Long getReduce_interest() {
        return reduce_interest;
    }

    public void setReduce_interest(Long reduce_interest) {
        this.reduce_interest = reduce_interest;
    }

    public Long getReduce_amerce() {
        return reduce_amerce;
    }

    public void setReduce_amerce(Long reduce_amerce) {
        this.reduce_amerce = reduce_amerce;
    }

    public Long getReduce_forfeit() {
        return reduce_forfeit;
    }

    public void setReduce_forfeit(Long reduce_forfeit) {
        this.reduce_forfeit = reduce_forfeit;
    }

    public Long getReduce_penalty() {
        return reduce_penalty;
    }

    public void setReduce_penalty(Long reduce_penalty) {
        this.reduce_penalty = reduce_penalty;
    }

    public Long getReduce_inst_fee() {
        return reduce_inst_fee;
    }

    public void setReduce_inst_fee(Long reduce_inst_fee) {
        this.reduce_inst_fee = reduce_inst_fee;
    }

    public Long getReduce_pre_fee() {
        return reduce_pre_fee;
    }

    public void setReduce_pre_fee(Long reduce_pre_fee) {
        this.reduce_pre_fee = reduce_pre_fee;
    }

    public Long getReduce_other_fee() {
        return reduce_other_fee;
    }

    public void setReduce_other_fee(Long reduce_other_fee) {
        this.reduce_other_fee = reduce_other_fee;
    }

    public String getData_create_type() {
        return data_create_type;
    }

    public void setData_create_type(String data_create_type) {
        this.data_create_type = data_create_type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSpecial_code() {
        return special_code;
    }

    public void setSpecial_code(String special_code) {
        this.special_code = special_code;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public java.sql.Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(java.sql.Timestamp create_time) {
        this.create_time = create_time;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public java.sql.Timestamp getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(java.sql.Timestamp update_time) {
        this.update_time = update_time;
    }

    public String getUpdate_type() {
        return update_type;
    }

    public void setUpdate_type(String update_type) {
        this.update_type = update_type;
    }
}
