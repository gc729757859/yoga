package com.yoga.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VipDetailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public VipDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
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
     * This method corresponds to the database table vip_detail
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
     * This method corresponds to the database table vip_detail
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_detail
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
     * This class corresponds to the database table vip_detail
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUseIdIsNull() {
            addCriterion("use_id is null");
            return (Criteria) this;
        }

        public Criteria andUseIdIsNotNull() {
            addCriterion("use_id is not null");
            return (Criteria) this;
        }

        public Criteria andUseIdEqualTo(Integer value) {
            addCriterion("use_id =", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotEqualTo(Integer value) {
            addCriterion("use_id <>", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdGreaterThan(Integer value) {
            addCriterion("use_id >", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_id >=", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdLessThan(Integer value) {
            addCriterion("use_id <", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdLessThanOrEqualTo(Integer value) {
            addCriterion("use_id <=", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdIn(List<Integer> values) {
            addCriterion("use_id in", values, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotIn(List<Integer> values) {
            addCriterion("use_id not in", values, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdBetween(Integer value1, Integer value2) {
            addCriterion("use_id between", value1, value2, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("use_id not between", value1, value2, "useId");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Integer value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Integer value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Integer value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Integer value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Integer value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Integer> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Integer> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Integer value1, Integer value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andUsedateIsNull() {
            addCriterion("usedate is null");
            return (Criteria) this;
        }

        public Criteria andUsedateIsNotNull() {
            addCriterion("usedate is not null");
            return (Criteria) this;
        }

        public Criteria andUsedateEqualTo(Date value) {
            addCriterionForJDBCDate("usedate =", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("usedate <>", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateGreaterThan(Date value) {
            addCriterionForJDBCDate("usedate >", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("usedate >=", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateLessThan(Date value) {
            addCriterionForJDBCDate("usedate <", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("usedate <=", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateIn(List<Date> values) {
            addCriterionForJDBCDate("usedate in", values, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("usedate not in", values, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("usedate between", value1, value2, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("usedate not between", value1, value2, "usedate");
            return (Criteria) this;
        }

        public Criteria andSelfuseIsNull() {
            addCriterion("selfuse is null");
            return (Criteria) this;
        }

        public Criteria andSelfuseIsNotNull() {
            addCriterion("selfuse is not null");
            return (Criteria) this;
        }

        public Criteria andSelfuseEqualTo(Boolean value) {
            addCriterion("selfuse =", value, "selfuse");
            return (Criteria) this;
        }

        public Criteria andSelfuseNotEqualTo(Boolean value) {
            addCriterion("selfuse <>", value, "selfuse");
            return (Criteria) this;
        }

        public Criteria andSelfuseGreaterThan(Boolean value) {
            addCriterion("selfuse >", value, "selfuse");
            return (Criteria) this;
        }

        public Criteria andSelfuseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("selfuse >=", value, "selfuse");
            return (Criteria) this;
        }

        public Criteria andSelfuseLessThan(Boolean value) {
            addCriterion("selfuse <", value, "selfuse");
            return (Criteria) this;
        }

        public Criteria andSelfuseLessThanOrEqualTo(Boolean value) {
            addCriterion("selfuse <=", value, "selfuse");
            return (Criteria) this;
        }

        public Criteria andSelfuseIn(List<Boolean> values) {
            addCriterion("selfuse in", values, "selfuse");
            return (Criteria) this;
        }

        public Criteria andSelfuseNotIn(List<Boolean> values) {
            addCriterion("selfuse not in", values, "selfuse");
            return (Criteria) this;
        }

        public Criteria andSelfuseBetween(Boolean value1, Boolean value2) {
            addCriterion("selfuse between", value1, value2, "selfuse");
            return (Criteria) this;
        }

        public Criteria andSelfuseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("selfuse not between", value1, value2, "selfuse");
            return (Criteria) this;
        }

        public Criteria andVenueUidIsNull() {
            addCriterion("venue_uid is null");
            return (Criteria) this;
        }

        public Criteria andVenueUidIsNotNull() {
            addCriterion("venue_uid is not null");
            return (Criteria) this;
        }

        public Criteria andVenueUidEqualTo(Integer value) {
            addCriterion("venue_uid =", value, "venueUid");
            return (Criteria) this;
        }

        public Criteria andVenueUidNotEqualTo(Integer value) {
            addCriterion("venue_uid <>", value, "venueUid");
            return (Criteria) this;
        }

        public Criteria andVenueUidGreaterThan(Integer value) {
            addCriterion("venue_uid >", value, "venueUid");
            return (Criteria) this;
        }

        public Criteria andVenueUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("venue_uid >=", value, "venueUid");
            return (Criteria) this;
        }

        public Criteria andVenueUidLessThan(Integer value) {
            addCriterion("venue_uid <", value, "venueUid");
            return (Criteria) this;
        }

        public Criteria andVenueUidLessThanOrEqualTo(Integer value) {
            addCriterion("venue_uid <=", value, "venueUid");
            return (Criteria) this;
        }

        public Criteria andVenueUidIn(List<Integer> values) {
            addCriterion("venue_uid in", values, "venueUid");
            return (Criteria) this;
        }

        public Criteria andVenueUidNotIn(List<Integer> values) {
            addCriterion("venue_uid not in", values, "venueUid");
            return (Criteria) this;
        }

        public Criteria andVenueUidBetween(Integer value1, Integer value2) {
            addCriterion("venue_uid between", value1, value2, "venueUid");
            return (Criteria) this;
        }

        public Criteria andVenueUidNotBetween(Integer value1, Integer value2) {
            addCriterion("venue_uid not between", value1, value2, "venueUid");
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

        public Criteria andBak1EqualTo(Integer value) {
            addCriterion("bak1 =", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotEqualTo(Integer value) {
            addCriterion("bak1 <>", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThan(Integer value) {
            addCriterion("bak1 >", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThanOrEqualTo(Integer value) {
            addCriterion("bak1 >=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThan(Integer value) {
            addCriterion("bak1 <", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThanOrEqualTo(Integer value) {
            addCriterion("bak1 <=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1In(List<Integer> values) {
            addCriterion("bak1 in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotIn(List<Integer> values) {
            addCriterion("bak1 not in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1Between(Integer value1, Integer value2) {
            addCriterion("bak1 between", value1, value2, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotBetween(Integer value1, Integer value2) {
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

        public Criteria andBak3EqualTo(Boolean value) {
            addCriterion("bak3 =", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotEqualTo(Boolean value) {
            addCriterion("bak3 <>", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3GreaterThan(Boolean value) {
            addCriterion("bak3 >", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3GreaterThanOrEqualTo(Boolean value) {
            addCriterion("bak3 >=", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3LessThan(Boolean value) {
            addCriterion("bak3 <", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3LessThanOrEqualTo(Boolean value) {
            addCriterion("bak3 <=", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3In(List<Boolean> values) {
            addCriterion("bak3 in", values, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotIn(List<Boolean> values) {
            addCriterion("bak3 not in", values, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3Between(Boolean value1, Boolean value2) {
            addCriterion("bak3 between", value1, value2, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotBetween(Boolean value1, Boolean value2) {
            addCriterion("bak3 not between", value1, value2, "bak3");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table vip_detail
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
     * This class corresponds to the database table vip_detail
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