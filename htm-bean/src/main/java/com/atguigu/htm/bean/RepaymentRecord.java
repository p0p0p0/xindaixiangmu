package com.atguigu.htm.bean;

import java.io.Serializable;

public class RepaymentRecord implements Serializable{
    private Long id;
    private Long business_request_id;
    private Long loan_contract_num;
    private java.sql.Date repayment_date;
    private Long overdue_days;
    private Long overdue_amount;
    private Long repayment_amount;
    private Long success_amount;
    private String status;
    private String remark;
    private String special_code;
    private Long sort;
    private String data_create_type;
    private java.sql.Timestamp reserve_time;
    private String creator;
    private java.sql.Timestamp create_time;
    private String updater;
    private java.sql.Timestamp update_time;
    private String account_name;
    private String acct_iden_type;
    private String acct_iden_num;
    private String account_no;
    private String account_type;
    private String account_bankid;
    private String account_branch_no;
    private String account_bank_name;
    private String public_private;
    private String act_province;
    private String account_city;
    private String update_type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getOverdue_days() {
        return overdue_days;
    }

    public void setOverdue_days(Long overdue_days) {
        this.overdue_days = overdue_days;
    }

    public Long getOverdue_amount() {
        return overdue_amount;
    }

    public void setOverdue_amount(Long overdue_amount) {
        this.overdue_amount = overdue_amount;
    }

    public Long getRepayment_amount() {
        return repayment_amount;
    }

    public void setRepayment_amount(Long repayment_amount) {
        this.repayment_amount = repayment_amount;
    }

    public Long getSuccess_amount() {
        return success_amount;
    }

    public void setSuccess_amount(Long success_amount) {
        this.success_amount = success_amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getData_create_type() {
        return data_create_type;
    }

    public void setData_create_type(String data_create_type) {
        this.data_create_type = data_create_type;
    }

    public java.sql.Timestamp getReserve_time() {
        return reserve_time;
    }

    public void setReserve_time(java.sql.Timestamp reserve_time) {
        this.reserve_time = reserve_time;
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

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getAcct_iden_type() {
        return acct_iden_type;
    }

    public void setAcct_iden_type(String acct_iden_type) {
        this.acct_iden_type = acct_iden_type;
    }

    public String getAcct_iden_num() {
        return acct_iden_num;
    }

    public void setAcct_iden_num(String acct_iden_num) {
        this.acct_iden_num = acct_iden_num;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getAccount_bankid() {
        return account_bankid;
    }

    public void setAccount_bankid(String account_bankid) {
        this.account_bankid = account_bankid;
    }

    public String getAccount_branch_no() {
        return account_branch_no;
    }

    public void setAccount_branch_no(String account_branch_no) {
        this.account_branch_no = account_branch_no;
    }

    public String getAccount_bank_name() {
        return account_bank_name;
    }

    public void setAccount_bank_name(String account_bank_name) {
        this.account_bank_name = account_bank_name;
    }

    public String getPublic_private() {
        return public_private;
    }

    public void setPublic_private(String public_private) {
        this.public_private = public_private;
    }

    public String getAct_province() {
        return act_province;
    }

    public void setAct_province(String act_province) {
        this.act_province = act_province;
    }

    public String getAccount_city() {
        return account_city;
    }

    public void setAccount_city(String account_city) {
        this.account_city = account_city;
    }

    public String getUpdate_type() {
        return update_type;
    }

    public void setUpdate_type(String update_type) {
        this.update_type = update_type;
    }

}
