package com.atguigu.htm.bean;

import java.io.Serializable;

public class OverdueContract implements Serializable{
    private String id;
    private String loan_contract_num;
    private String overdue_status;
    private Long overdue_days;
    private Long instalment_cnt;
    private Long all_days;
    private Long all_instalment_cnt;
    private Long all_number;
    private Long principal_interest;
    private Long all_forfeit;
    private Long all_amerce;
    private Long all_should;
    private Long all_indeed;
    private Long current_repay;
    private Long all_repayment_amount;
    private String first_date;
    private String start_date;
    private String serial_start_date;
    private String overdue_history;
    private String compute_date;
    private String creator;
    private java.sql.Timestamp create_time;
    private String updater;
    private java.sql.Timestamp update_time;
    private String update_type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoan_contract_num() {
        return loan_contract_num;
    }

    public void setLoan_contract_num(String loan_contract_num) {
        this.loan_contract_num = loan_contract_num;
    }

    public String getOverdue_status() {
        return overdue_status;
    }

    public void setOverdue_status(String overdue_status) {
        this.overdue_status = overdue_status;
    }

    public Long getOverdue_days() {
        return overdue_days;
    }

    public void setOverdue_days(Long overdue_days) {
        this.overdue_days = overdue_days;
    }

    public Long getInstalment_cnt() {
        return instalment_cnt;
    }

    public void setInstalment_cnt(Long instalment_cnt) {
        this.instalment_cnt = instalment_cnt;
    }

    public Long getAll_days() {
        return all_days;
    }

    public void setAll_days(Long all_days) {
        this.all_days = all_days;
    }

    public Long getAll_instalment_cnt() {
        return all_instalment_cnt;
    }

    public void setAll_instalment_cnt(Long all_instalment_cnt) {
        this.all_instalment_cnt = all_instalment_cnt;
    }

    public Long getAll_number() {
        return all_number;
    }

    public void setAll_number(Long all_number) {
        this.all_number = all_number;
    }

    public Long getPrincipal_interest() {
        return principal_interest;
    }

    public void setPrincipal_interest(Long principal_interest) {
        this.principal_interest = principal_interest;
    }

    public Long getAll_forfeit() {
        return all_forfeit;
    }

    public void setAll_forfeit(Long all_forfeit) {
        this.all_forfeit = all_forfeit;
    }

    public Long getAll_amerce() {
        return all_amerce;
    }

    public void setAll_amerce(Long all_amerce) {
        this.all_amerce = all_amerce;
    }

    public Long getAll_should() {
        return all_should;
    }

    public void setAll_should(Long all_should) {
        this.all_should = all_should;
    }

    public Long getAll_indeed() {
        return all_indeed;
    }

    public void setAll_indeed(Long all_indeed) {
        this.all_indeed = all_indeed;
    }

    public Long getCurrent_repay() {
        return current_repay;
    }

    public void setCurrent_repay(Long current_repay) {
        this.current_repay = current_repay;
    }

    public Long getAll_repayment_amount() {
        return all_repayment_amount;
    }

    public void setAll_repayment_amount(Long all_repayment_amount) {
        this.all_repayment_amount = all_repayment_amount;
    }

    public String getFirst_date() {
        return first_date;
    }

    public void setFirst_date(String first_date) {
        this.first_date = first_date;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getSerial_start_date() {
        return serial_start_date;
    }

    public void setSerial_start_date(String serial_start_date) {
        this.serial_start_date = serial_start_date;
    }

    public String getOverdue_history() {
        return overdue_history;
    }

    public void setOverdue_history(String overdue_history) {
        this.overdue_history = overdue_history;
    }

    public String getCompute_date() {
        return compute_date;
    }

    public void setCompute_date(String compute_date) {
        this.compute_date = compute_date;
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
