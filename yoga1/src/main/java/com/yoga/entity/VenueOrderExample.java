package com.yoga.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VenueOrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table venue_order
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table venue_order
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table venue_order
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_order
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public VenueOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_order
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_order
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_order
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_order
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_order
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_order
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_order
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_order
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_order
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venue_order
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table venue_order
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andVenueOrderIdIsNull() {
            addCriterion("venue_order_id is null");
            return (Criteria) this;
        }

        public Criteria andVenueOrderIdIsNotNull() {
            addCriterion("venue_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andVenueOrderIdEqualTo(String value) {
            addCriterion("venue_order_id =", value, "venueOrderId");
            return (Criteria) this;
        }

        public Criteria andVenueOrderIdNotEqualTo(String value) {
            addCriterion("venue_order_id <>", value, "venueOrderId");
            return (Criteria) this;
        }

        public Criteria andVenueOrderIdGreaterThan(String value) {
            addCriterion("venue_order_id >", value, "venueOrderId");
            return (Criteria) this;
        }

        public Criteria andVenueOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("venue_order_id >=", value, "venueOrderId");
            return (Criteria) this;
        }

        public Criteria andVenueOrderIdLessThan(String value) {
            addCriterion("venue_order_id <", value, "venueOrderId");
            return (Criteria) this;
        }

        public Criteria andVenueOrderIdLessThanOrEqualTo(String value) {
            addCriterion("venue_order_id <=", value, "venueOrderId");
            return (Criteria) this;
        }

        public Criteria andVenueOrderIdLike(String value) {
            addCriterion("venue_order_id like", value, "venueOrderId");
            return (Criteria) this;
        }

        public Criteria andVenueOrderIdNotLike(String value) {
            addCriterion("venue_order_id not like", value, "venueOrderId");
            return (Criteria) this;
        }

        public Criteria andVenueOrderIdIn(List<String> values) {
            addCriterion("venue_order_id in", values, "venueOrderId");
            return (Criteria) this;
        }

        public Criteria andVenueOrderIdNotIn(List<String> values) {
            addCriterion("venue_order_id not in", values, "venueOrderId");
            return (Criteria) this;
        }

        public Criteria andVenueOrderIdBetween(String value1, String value2) {
            addCriterion("venue_order_id between", value1, value2, "venueOrderId");
            return (Criteria) this;
        }

        public Criteria andVenueOrderIdNotBetween(String value1, String value2) {
            addCriterion("venue_order_id not between", value1, value2, "venueOrderId");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Date value) {
            addCriterion("confirm_time =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Date value) {
            addCriterion("confirm_time <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Date value) {
            addCriterion("confirm_time >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("confirm_time >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Date value) {
            addCriterion("confirm_time <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("confirm_time <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Date> values) {
            addCriterion("confirm_time in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Date> values) {
            addCriterion("confirm_time not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("confirm_time between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("confirm_time not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andPayUidIsNull() {
            addCriterion("pay_uid is null");
            return (Criteria) this;
        }

        public Criteria andPayUidIsNotNull() {
            addCriterion("pay_uid is not null");
            return (Criteria) this;
        }

        public Criteria andPayUidEqualTo(Integer value) {
            addCriterion("pay_uid =", value, "payUid");
            return (Criteria) this;
        }

        public Criteria andPayUidNotEqualTo(Integer value) {
            addCriterion("pay_uid <>", value, "payUid");
            return (Criteria) this;
        }

        public Criteria andPayUidGreaterThan(Integer value) {
            addCriterion("pay_uid >", value, "payUid");
            return (Criteria) this;
        }

        public Criteria andPayUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_uid >=", value, "payUid");
            return (Criteria) this;
        }

        public Criteria andPayUidLessThan(Integer value) {
            addCriterion("pay_uid <", value, "payUid");
            return (Criteria) this;
        }

        public Criteria andPayUidLessThanOrEqualTo(Integer value) {
            addCriterion("pay_uid <=", value, "payUid");
            return (Criteria) this;
        }

        public Criteria andPayUidIn(List<Integer> values) {
            addCriterion("pay_uid in", values, "payUid");
            return (Criteria) this;
        }

        public Criteria andPayUidNotIn(List<Integer> values) {
            addCriterion("pay_uid not in", values, "payUid");
            return (Criteria) this;
        }

        public Criteria andPayUidBetween(Integer value1, Integer value2) {
            addCriterion("pay_uid between", value1, value2, "payUid");
            return (Criteria) this;
        }

        public Criteria andPayUidNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_uid not between", value1, value2, "payUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidIsNull() {
            addCriterion("receive_uid is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUidIsNotNull() {
            addCriterion("receive_uid is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUidEqualTo(Integer value) {
            addCriterion("receive_uid =", value, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidNotEqualTo(Integer value) {
            addCriterion("receive_uid <>", value, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidGreaterThan(Integer value) {
            addCriterion("receive_uid >", value, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_uid >=", value, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidLessThan(Integer value) {
            addCriterion("receive_uid <", value, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidLessThanOrEqualTo(Integer value) {
            addCriterion("receive_uid <=", value, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidIn(List<Integer> values) {
            addCriterion("receive_uid in", values, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidNotIn(List<Integer> values) {
            addCriterion("receive_uid not in", values, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidBetween(Integer value1, Integer value2) {
            addCriterion("receive_uid between", value1, value2, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_uid not between", value1, value2, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andOrderCoinIsNull() {
            addCriterion("order_coin is null");
            return (Criteria) this;
        }

        public Criteria andOrderCoinIsNotNull() {
            addCriterion("order_coin is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCoinEqualTo(Integer value) {
            addCriterion("order_coin =", value, "orderCoin");
            return (Criteria) this;
        }

        public Criteria andOrderCoinNotEqualTo(Integer value) {
            addCriterion("order_coin <>", value, "orderCoin");
            return (Criteria) this;
        }

        public Criteria andOrderCoinGreaterThan(Integer value) {
            addCriterion("order_coin >", value, "orderCoin");
            return (Criteria) this;
        }

        public Criteria andOrderCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_coin >=", value, "orderCoin");
            return (Criteria) this;
        }

        public Criteria andOrderCoinLessThan(Integer value) {
            addCriterion("order_coin <", value, "orderCoin");
            return (Criteria) this;
        }

        public Criteria andOrderCoinLessThanOrEqualTo(Integer value) {
            addCriterion("order_coin <=", value, "orderCoin");
            return (Criteria) this;
        }

        public Criteria andOrderCoinIn(List<Integer> values) {
            addCriterion("order_coin in", values, "orderCoin");
            return (Criteria) this;
        }

        public Criteria andOrderCoinNotIn(List<Integer> values) {
            addCriterion("order_coin not in", values, "orderCoin");
            return (Criteria) this;
        }

        public Criteria andOrderCoinBetween(Integer value1, Integer value2) {
            addCriterion("order_coin between", value1, value2, "orderCoin");
            return (Criteria) this;
        }

        public Criteria andOrderCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("order_coin not between", value1, value2, "orderCoin");
            return (Criteria) this;
        }

        public Criteria andPayCoinIsNull() {
            addCriterion("pay_coin is null");
            return (Criteria) this;
        }

        public Criteria andPayCoinIsNotNull() {
            addCriterion("pay_coin is not null");
            return (Criteria) this;
        }

        public Criteria andPayCoinEqualTo(Integer value) {
            addCriterion("pay_coin =", value, "payCoin");
            return (Criteria) this;
        }

        public Criteria andPayCoinNotEqualTo(Integer value) {
            addCriterion("pay_coin <>", value, "payCoin");
            return (Criteria) this;
        }

        public Criteria andPayCoinGreaterThan(Integer value) {
            addCriterion("pay_coin >", value, "payCoin");
            return (Criteria) this;
        }

        public Criteria andPayCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_coin >=", value, "payCoin");
            return (Criteria) this;
        }

        public Criteria andPayCoinLessThan(Integer value) {
            addCriterion("pay_coin <", value, "payCoin");
            return (Criteria) this;
        }

        public Criteria andPayCoinLessThanOrEqualTo(Integer value) {
            addCriterion("pay_coin <=", value, "payCoin");
            return (Criteria) this;
        }

        public Criteria andPayCoinIn(List<Integer> values) {
            addCriterion("pay_coin in", values, "payCoin");
            return (Criteria) this;
        }

        public Criteria andPayCoinNotIn(List<Integer> values) {
            addCriterion("pay_coin not in", values, "payCoin");
            return (Criteria) this;
        }

        public Criteria andPayCoinBetween(Integer value1, Integer value2) {
            addCriterion("pay_coin between", value1, value2, "payCoin");
            return (Criteria) this;
        }

        public Criteria andPayCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_coin not between", value1, value2, "payCoin");
            return (Criteria) this;
        }

        public Criteria andPayScoreIsNull() {
            addCriterion("pay_score is null");
            return (Criteria) this;
        }

        public Criteria andPayScoreIsNotNull() {
            addCriterion("pay_score is not null");
            return (Criteria) this;
        }

        public Criteria andPayScoreEqualTo(Integer value) {
            addCriterion("pay_score =", value, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreNotEqualTo(Integer value) {
            addCriterion("pay_score <>", value, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreGreaterThan(Integer value) {
            addCriterion("pay_score >", value, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_score >=", value, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreLessThan(Integer value) {
            addCriterion("pay_score <", value, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreLessThanOrEqualTo(Integer value) {
            addCriterion("pay_score <=", value, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreIn(List<Integer> values) {
            addCriterion("pay_score in", values, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreNotIn(List<Integer> values) {
            addCriterion("pay_score not in", values, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreBetween(Integer value1, Integer value2) {
            addCriterion("pay_score between", value1, value2, "payScore");
            return (Criteria) this;
        }

        public Criteria andPayScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_score not between", value1, value2, "payScore");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIsNull() {
            addCriterion("order_info is null");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIsNotNull() {
            addCriterion("order_info is not null");
            return (Criteria) this;
        }

        public Criteria andOrderInfoEqualTo(String value) {
            addCriterion("order_info =", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoNotEqualTo(String value) {
            addCriterion("order_info <>", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoGreaterThan(String value) {
            addCriterion("order_info >", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoGreaterThanOrEqualTo(String value) {
            addCriterion("order_info >=", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoLessThan(String value) {
            addCriterion("order_info <", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoLessThanOrEqualTo(String value) {
            addCriterion("order_info <=", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoLike(String value) {
            addCriterion("order_info like", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoNotLike(String value) {
            addCriterion("order_info not like", value, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIn(List<String> values) {
            addCriterion("order_info in", values, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoNotIn(List<String> values) {
            addCriterion("order_info not in", values, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoBetween(String value1, String value2) {
            addCriterion("order_info between", value1, value2, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andOrderInfoNotBetween(String value1, String value2) {
            addCriterion("order_info not between", value1, value2, "orderInfo");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Boolean value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Boolean value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Boolean value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Boolean value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Boolean> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Boolean> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andBak1IsNull() {
            addCriterion("bak1 is null");
            return (Criteria) this;
        }

        public Criteria andBak1IsNotNull() {
            addCriterion("bak1 is not null");
            return (Criteria) this;
        }

        public Criteria andBak1EqualTo(Boolean value) {
            addCriterion("bak1 =", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotEqualTo(Boolean value) {
            addCriterion("bak1 <>", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThan(Boolean value) {
            addCriterion("bak1 >", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("bak1 >=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThan(Boolean value) {
            addCriterion("bak1 <", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThanOrEqualTo(Boolean value) {
            addCriterion("bak1 <=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1In(List<Boolean> values) {
            addCriterion("bak1 in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotIn(List<Boolean> values) {
            addCriterion("bak1 not in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1Between(Boolean value1, Boolean value2) {
            addCriterion("bak1 between", value1, value2, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("bak1 not between", value1, value2, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak2IsNull() {
            addCriterion("bak2 is null");
            return (Criteria) this;
        }

        public Criteria andBak2IsNotNull() {
            addCriterion("bak2 is not null");
            return (Criteria) this;
        }

        public Criteria andBak2EqualTo(String value) {
            addCriterion("bak2 =", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotEqualTo(String value) {
            addCriterion("bak2 <>", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2GreaterThan(String value) {
            addCriterion("bak2 >", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2GreaterThanOrEqualTo(String value) {
            addCriterion("bak2 >=", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2LessThan(String value) {
            addCriterion("bak2 <", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2LessThanOrEqualTo(String value) {
            addCriterion("bak2 <=", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2Like(String value) {
            addCriterion("bak2 like", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotLike(String value) {
            addCriterion("bak2 not like", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2In(List<String> values) {
            addCriterion("bak2 in", values, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotIn(List<String> values) {
            addCriterion("bak2 not in", values, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2Between(String value1, String value2) {
            addCriterion("bak2 between", value1, value2, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotBetween(String value1, String value2) {
            addCriterion("bak2 not between", value1, value2, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak3IsNull() {
            addCriterion("bak3 is null");
            return (Criteria) this;
        }

        public Criteria andBak3IsNotNull() {
            addCriterion("bak3 is not null");
            return (Criteria) this;
        }

        public Criteria andBak3EqualTo(String value) {
            addCriterion("bak3 =", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotEqualTo(String value) {
            addCriterion("bak3 <>", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3GreaterThan(String value) {
            addCriterion("bak3 >", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3GreaterThanOrEqualTo(String value) {
            addCriterion("bak3 >=", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3LessThan(String value) {
            addCriterion("bak3 <", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3LessThanOrEqualTo(String value) {
            addCriterion("bak3 <=", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3Like(String value) {
            addCriterion("bak3 like", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotLike(String value) {
            addCriterion("bak3 not like", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3In(List<String> values) {
            addCriterion("bak3 in", values, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotIn(List<String> values) {
            addCriterion("bak3 not in", values, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3Between(String value1, String value2) {
            addCriterion("bak3 between", value1, value2, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotBetween(String value1, String value2) {
            addCriterion("bak3 not between", value1, value2, "bak3");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table venue_order
     *
     * @mbg.generated do_not_delete_during_merge Mon Jun 08 15:16:38 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table venue_order
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}