package com.atguigu.htm.bean;

import java.io.Serializable;

public class ContractAttribute implements Serializable{
    private Long id;
    private Long loan_contract_id;
    private Long loan_contract_num;
    private String business_type;
    private String is_expedited;
    private java.sql.Timestamp sign_date;
    private Long sign_type;
    private String approve_date;
    private String first_repay_date;
    private Long fee_flag;
    private String interest_flag;
    private Long interest_type;
    private Long grace_days;
    private Long irr;
    private Long lns_rate;
    private String channel_code;
    private String channel_name;
    private String loan_officer_id;
    private String cityid;
    private String city;
    private String is_modify;
    private String is_scheme_modify;
    private Long recycle_way;
    private String is_recycle_load;
    private Long recycle_loan_cnt;
    private String old_contract_num;
    private Long settle_amount;
    private String new_contract_num;
    private String is_shorten;
    private String is_extend;
    private String is_change_produce;
    private String is_overdue;
    private String is_pay_ahead;
    private String is_pay_part;
    private String purpose;
    private String purpose_son;
    private String purpose_detail;
    private String is_div_account;
    private String system_type;
    private String high_risk;
    private String is_buyout;
    private String fee_process_type;
    private String student_corp_name;
    private String settle_date;
    private String habit_time;
    private String repayday;
    private String apply_id;
    private String old_apply_id;
    private String dept_id;
    private String dept_name;
    private String creator;
    private java.sql.Timestamp create_time;
    private String updater;
    private java.sql.Timestamp update_time;
    private String update_type;
    private Long front_charge_discount;
    private Long month_m_rate;
    private Long handle_charge_rate;
    private Long loan_times;
    private String pawn;
    private Long handle_charge;
    private Long month_charge_discount;
    private Long guarantee_fee;
    private String guarantee_company;
    private String def1;
    private String def2;
    private String def3;
    private String def4;
    private String def5;
    private String def6;
    private String def7;
    private String def8;
    private String def9;
    private String def10;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLoan_contract_id() {
        return loan_contract_id;
    }

    public void setLoan_contract_id(Long loan_contract_id) {
        this.loan_contract_id = loan_contract_id;
    }

    public Long getLoan_contract_num() {
        return loan_contract_num;
    }

    public void setLoan_contract_num(Long loan_contract_num) {
        this.loan_contract_num = loan_contract_num;
    }

    public String getBusiness_type() {
        return business_type;
    }

    public void setBusiness_type(String business_type) {
        this.business_type = business_type;
    }

    public String getIs_expedited() {
        return is_expedited;
    }

    public void setIs_expedited(String is_expedited) {
        this.is_expedited = is_expedited;
    }

    public java.sql.Timestamp getSign_date() {
        return sign_date;
    }

    public void setSign_date(java.sql.Timestamp sign_date) {
        this.sign_date = sign_date;
    }

    public Long getSign_type() {
        return sign_type;
    }

    public void setSign_type(Long sign_type) {
        this.sign_type = sign_type;
    }

    public String getApprove_date() {
        return approve_date;
    }

    public void setApprove_date(String approve_date) {
        this.approve_date = approve_date;
    }

    public String getFirst_repay_date() {
        return first_repay_date;
    }

    public void setFirst_repay_date(String first_repay_date) {
        this.first_repay_date = first_repay_date;
    }

    public Long getFee_flag() {
        return fee_flag;
    }

    public void setFee_flag(Long fee_flag) {
        this.fee_flag = fee_flag;
    }

    public String getInterest_flag() {
        return interest_flag;
    }

    public void setInterest_flag(String interest_flag) {
        this.interest_flag = interest_flag;
    }

    public Long getInterest_type() {
        return interest_type;
    }

    public void setInterest_type(Long interest_type) {
        this.interest_type = interest_type;
    }

    public Long getGrace_days() {
        return grace_days;
    }

    public void setGrace_days(Long grace_days) {
        this.grace_days = grace_days;
    }

    public Long getIrr() {
        return irr;
    }

    public void setIrr(Long irr) {
        this.irr = irr;
    }

    public Long getLns_rate() {
        return lns_rate;
    }

    public void setLns_rate(Long lns_rate) {
        this.lns_rate = lns_rate;
    }

    public String getChannel_code() {
        return channel_code;
    }

    public void setChannel_code(String channel_code) {
        this.channel_code = channel_code;
    }

    public String getChannel_name() {
        return channel_name;
    }

    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }

    public String getLoan_officer_id() {
        return loan_officer_id;
    }

    public void setLoan_officer_id(String loan_officer_id) {
        this.loan_officer_id = loan_officer_id;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIs_modify() {
        return is_modify;
    }

    public void setIs_modify(String is_modify) {
        this.is_modify = is_modify;
    }

    public String getIs_scheme_modify() {
        return is_scheme_modify;
    }

    public void setIs_scheme_modify(String is_scheme_modify) {
        this.is_scheme_modify = is_scheme_modify;
    }

    public Long getRecycle_way() {
        return recycle_way;
    }

    public void setRecycle_way(Long recycle_way) {
        this.recycle_way = recycle_way;
    }

    public String getIs_recycle_load() {
        return is_recycle_load;
    }

    public void setIs_recycle_load(String is_recycle_load) {
        this.is_recycle_load = is_recycle_load;
    }

    public Long getRecycle_loan_cnt() {
        return recycle_loan_cnt;
    }

    public void setRecycle_loan_cnt(Long recycle_loan_cnt) {
        this.recycle_loan_cnt = recycle_loan_cnt;
    }

    public String getOld_contract_num() {
        return old_contract_num;
    }

    public void setOld_contract_num(String old_contract_num) {
        this.old_contract_num = old_contract_num;
    }

    public Long getSettle_amount() {
        return settle_amount;
    }

    public void setSettle_amount(Long settle_amount) {
        this.settle_amount = settle_amount;
    }

    public String getNew_contract_num() {
        return new_contract_num;
    }

    public void setNew_contract_num(String new_contract_num) {
        this.new_contract_num = new_contract_num;
    }

    public String getIs_shorten() {
        return is_shorten;
    }

    public void setIs_shorten(String is_shorten) {
        this.is_shorten = is_shorten;
    }

    public String getIs_extend() {
        return is_extend;
    }

    public void setIs_extend(String is_extend) {
        this.is_extend = is_extend;
    }

    public String getIs_change_produce() {
        return is_change_produce;
    }

    public void setIs_change_produce(String is_change_produce) {
        this.is_change_produce = is_change_produce;
    }

    public String getIs_overdue() {
        return is_overdue;
    }

    public void setIs_overdue(String is_overdue) {
        this.is_overdue = is_overdue;
    }

    public String getIs_pay_ahead() {
        return is_pay_ahead;
    }

    public void setIs_pay_ahead(String is_pay_ahead) {
        this.is_pay_ahead = is_pay_ahead;
    }

    public String getIs_pay_part() {
        return is_pay_part;
    }

    public void setIs_pay_part(String is_pay_part) {
        this.is_pay_part = is_pay_part;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose_son() {
        return purpose_son;
    }

    public void setPurpose_son(String purpose_son) {
        this.purpose_son = purpose_son;
    }

    public String getPurpose_detail() {
        return purpose_detail;
    }

    public void setPurpose_detail(String purpose_detail) {
        this.purpose_detail = purpose_detail;
    }

    public String getIs_div_account() {
        return is_div_account;
    }

    public void setIs_div_account(String is_div_account) {
        this.is_div_account = is_div_account;
    }

    public String getSystem_type() {
        return system_type;
    }

    public void setSystem_type(String system_type) {
        this.system_type = system_type;
    }

    public String getHigh_risk() {
        return high_risk;
    }

    public void setHigh_risk(String high_risk) {
        this.high_risk = high_risk;
    }

    public String getIs_buyout() {
        return is_buyout;
    }

    public void setIs_buyout(String is_buyout) {
        this.is_buyout = is_buyout;
    }

    public String getFee_process_type() {
        return fee_process_type;
    }

    public void setFee_process_type(String fee_process_type) {
        this.fee_process_type = fee_process_type;
    }

    public String getStudent_corp_name() {
        return student_corp_name;
    }

    public void setStudent_corp_name(String student_corp_name) {
        this.student_corp_name = student_corp_name;
    }

    public String getSettle_date() {
        return settle_date;
    }

    public void setSettle_date(String settle_date) {
        this.settle_date = settle_date;
    }

    public String getHabit_time() {
        return habit_time;
    }

    public void setHabit_time(String habit_time) {
        this.habit_time = habit_time;
    }

    public String getRepayday() {
        return repayday;
    }

    public void setRepayday(String repayday) {
        this.repayday = repayday;
    }

    public String getApply_id() {
        return apply_id;
    }

    public void setApply_id(String apply_id) {
        this.apply_id = apply_id;
    }

    public String getOld_apply_id() {
        return old_apply_id;
    }

    public void setOld_apply_id(String old_apply_id) {
        this.old_apply_id = old_apply_id;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
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

    public Long getFront_charge_discount() {
        return front_charge_discount;
    }

    public void setFront_charge_discount(Long front_charge_discount) {
        this.front_charge_discount = front_charge_discount;
    }

    public Long getMonth_m_rate() {
        return month_m_rate;
    }

    public void setMonth_m_rate(Long month_m_rate) {
        this.month_m_rate = month_m_rate;
    }

    public Long getHandle_charge_rate() {
        return handle_charge_rate;
    }

    public void setHandle_charge_rate(Long handle_charge_rate) {
        this.handle_charge_rate = handle_charge_rate;
    }

    public Long getLoan_times() {
        return loan_times;
    }

    public void setLoan_times(Long loan_times) {
        this.loan_times = loan_times;
    }

    public String getPawn() {
        return pawn;
    }

    public void setPawn(String pawn) {
        this.pawn = pawn;
    }

    public Long getHandle_charge() {
        return handle_charge;
    }

    public void setHandle_charge(Long handle_charge) {
        this.handle_charge = handle_charge;
    }

    public Long getMonth_charge_discount() {
        return month_charge_discount;
    }

    public void setMonth_charge_discount(Long month_charge_discount) {
        this.month_charge_discount = month_charge_discount;
    }

    public Long getGuarantee_fee() {
        return guarantee_fee;
    }

    public void setGuarantee_fee(Long guarantee_fee) {
        this.guarantee_fee = guarantee_fee;
    }

    public String getGuarantee_company() {
        return guarantee_company;
    }

    public void setGuarantee_company(String guarantee_company) {
        this.guarantee_company = guarantee_company;
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1;
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2;
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3;
    }

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4;
    }

    public String getDef5() {
        return def5;
    }

    public void setDef5(String def5) {
        this.def5 = def5;
    }

    public String getDef6() {
        return def6;
    }

    public void setDef6(String def6) {
        this.def6 = def6;
    }

    public String getDef7() {
        return def7;
    }

    public void setDef7(String def7) {
        this.def7 = def7;
    }

    public String getDef8() {
        return def8;
    }

    public void setDef8(String def8) {
        this.def8 = def8;
    }

    public String getDef9() {
        return def9;
    }

    public void setDef9(String def9) {
        this.def9 = def9;
    }

    public String getDef10() {
        return def10;
    }

    public void setDef10(String def10) {
        this.def10 = def10;
    }
}
