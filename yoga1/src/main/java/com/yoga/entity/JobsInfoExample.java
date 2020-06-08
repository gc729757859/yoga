package com.yoga.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JobsInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jobs_info
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jobs_info
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jobs_info
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobs_info
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public JobsInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobs_info
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobs_info
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobs_info
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobs_info
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobs_info
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobs_info
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobs_info
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
     * This method corresponds to the database table jobs_info
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
     * This method corresponds to the database table jobs_info
     *
     * @mbg.generated Mon Jun 08 15:16:38 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobs_info
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
     * This class corresponds to the database table jobs_info
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

        public Criteria andJobsInfoIdIsNull() {
            addCriterion("jobs_info_id is null");
            return (Criteria) this;
        }

        public Criteria andJobsInfoIdIsNotNull() {
            addCriterion("jobs_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobsInfoIdEqualTo(Integer value) {
            addCriterion("jobs_info_id =", value, "jobsInfoId");
            return (Criteria) this;
        }

        public Criteria andJobsInfoIdNotEqualTo(Integer value) {
            addCriterion("jobs_info_id <>", value, "jobsInfoId");
            return (Criteria) this;
        }

        public Criteria andJobsInfoIdGreaterThan(Integer value) {
            addCriterion("jobs_info_id >", value, "jobsInfoId");
            return (Criteria) this;
        }

        public Criteria andJobsInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobs_info_id >=", value, "jobsInfoId");
            return (Criteria) this;
        }

        public Criteria andJobsInfoIdLessThan(Integer value) {
            addCriterion("jobs_info_id <", value, "jobsInfoId");
            return (Criteria) this;
        }

        public Criteria andJobsInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("jobs_info_id <=", value, "jobsInfoId");
            return (Criteria) this;
        }

        public Criteria andJobsInfoIdIn(List<Integer> values) {
            addCriterion("jobs_info_id in", values, "jobsInfoId");
            return (Criteria) this;
        }

        public Criteria andJobsInfoIdNotIn(List<Integer> values) {
            addCriterion("jobs_info_id not in", values, "jobsInfoId");
            return (Criteria) this;
        }

        public Criteria andJobsInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("jobs_info_id between", value1, value2, "jobsInfoId");
            return (Criteria) this;
        }

        public Criteria andJobsInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jobs_info_id not between", value1, value2, "jobsInfoId");
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

        public Criteria andFlowtypeIsNull() {
            addCriterion("flowtype is null");
            return (Criteria) this;
        }

        public Criteria andFlowtypeIsNotNull() {
            addCriterion("flowtype is not null");
            return (Criteria) this;
        }

        public Criteria andFlowtypeEqualTo(Integer value) {
            addCriterion("flowtype =", value, "flowtype");
            return (Criteria) this;
        }

        public Criteria andFlowtypeNotEqualTo(Integer value) {
            addCriterion("flowtype <>", value, "flowtype");
            return (Criteria) this;
        }

        public Criteria andFlowtypeGreaterThan(Integer value) {
            addCriterion("flowtype >", value, "flowtype");
            return (Criteria) this;
        }

        public Criteria andFlowtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("flowtype >=", value, "flowtype");
            return (Criteria) this;
        }

        public Criteria andFlowtypeLessThan(Integer value) {
            addCriterion("flowtype <", value, "flowtype");
            return (Criteria) this;
        }

        public Criteria andFlowtypeLessThanOrEqualTo(Integer value) {
            addCriterion("flowtype <=", value, "flowtype");
            return (Criteria) this;
        }

        public Criteria andFlowtypeIn(List<Integer> values) {
            addCriterion("flowtype in", values, "flowtype");
            return (Criteria) this;
        }

        public Criteria andFlowtypeNotIn(List<Integer> values) {
            addCriterion("flowtype not in", values, "flowtype");
            return (Criteria) this;
        }

        public Criteria andFlowtypeBetween(Integer value1, Integer value2) {
            addCriterion("flowtype between", value1, value2, "flowtype");
            return (Criteria) this;
        }

        public Criteria andFlowtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("flowtype not between", value1, value2, "flowtype");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andOfferIsNull() {
            addCriterion("offer is null");
            return (Criteria) this;
        }

        public Criteria andOfferIsNotNull() {
            addCriterion("offer is not null");
            return (Criteria) this;
        }

        public Criteria andOfferEqualTo(String value) {
            addCriterion("offer =", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotEqualTo(String value) {
            addCriterion("offer <>", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferGreaterThan(String value) {
            addCriterion("offer >", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferGreaterThanOrEqualTo(String value) {
            addCriterion("offer >=", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferLessThan(String value) {
            addCriterion("offer <", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferLessThanOrEqualTo(String value) {
            addCriterion("offer <=", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferLike(String value) {
            addCriterion("offer like", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotLike(String value) {
            addCriterion("offer not like", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferIn(List<String> values) {
            addCriterion("offer in", values, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotIn(List<String> values) {
            addCriterion("offer not in", values, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferBetween(String value1, String value2) {
            addCriterion("offer between", value1, value2, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotBetween(String value1, String value2) {
            addCriterion("offer not between", value1, value2, "offer");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime not between", value1, value2, "endtime");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jobs_info
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
     * This class corresponds to the database table jobs_info
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