package com.yoga.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoachVenuePjExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coach_venue_pj
     *
     * @mbg.generated Mon Jun 08 15:25:25 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coach_venue_pj
     *
     * @mbg.generated Mon Jun 08 15:25:25 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coach_venue_pj
     *
     * @mbg.generated Mon Jun 08 15:25:25 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venue_pj
     *
     * @mbg.generated Mon Jun 08 15:25:25 CST 2020
     */
    public CoachVenuePjExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venue_pj
     *
     * @mbg.generated Mon Jun 08 15:25:25 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venue_pj
     *
     * @mbg.generated Mon Jun 08 15:25:25 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venue_pj
     *
     * @mbg.generated Mon Jun 08 15:25:25 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venue_pj
     *
     * @mbg.generated Mon Jun 08 15:25:25 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venue_pj
     *
     * @mbg.generated Mon Jun 08 15:25:25 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venue_pj
     *
     * @mbg.generated Mon Jun 08 15:25:25 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venue_pj
     *
     * @mbg.generated Mon Jun 08 15:25:25 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venue_pj
     *
     * @mbg.generated Mon Jun 08 15:25:25 CST 2020
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
     * This method corresponds to the database table coach_venue_pj
     *
     * @mbg.generated Mon Jun 08 15:25:25 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venue_pj
     *
     * @mbg.generated Mon Jun 08 15:25:25 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coach_venue_pj
     *
     * @mbg.generated Mon Jun 08 15:25:25 CST 2020
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

        public Criteria andPjIdIsNull() {
            addCriterion("pj_id is null");
            return (Criteria) this;
        }

        public Criteria andPjIdIsNotNull() {
            addCriterion("pj_id is not null");
            return (Criteria) this;
        }

        public Criteria andPjIdEqualTo(Integer value) {
            addCriterion("pj_id =", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdNotEqualTo(Integer value) {
            addCriterion("pj_id <>", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdGreaterThan(Integer value) {
            addCriterion("pj_id >", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pj_id >=", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdLessThan(Integer value) {
            addCriterion("pj_id <", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdLessThanOrEqualTo(Integer value) {
            addCriterion("pj_id <=", value, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdIn(List<Integer> values) {
            addCriterion("pj_id in", values, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdNotIn(List<Integer> values) {
            addCriterion("pj_id not in", values, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdBetween(Integer value1, Integer value2) {
            addCriterion("pj_id between", value1, value2, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pj_id not between", value1, value2, "pjId");
            return (Criteria) this;
        }

        public Criteria andPjUidIsNull() {
            addCriterion("pj_uid is null");
            return (Criteria) this;
        }

        public Criteria andPjUidIsNotNull() {
            addCriterion("pj_uid is not null");
            return (Criteria) this;
        }

        public Criteria andPjUidEqualTo(Integer value) {
            addCriterion("pj_uid =", value, "pjUid");
            return (Criteria) this;
        }

        public Criteria andPjUidNotEqualTo(Integer value) {
            addCriterion("pj_uid <>", value, "pjUid");
            return (Criteria) this;
        }

        public Criteria andPjUidGreaterThan(Integer value) {
            addCriterion("pj_uid >", value, "pjUid");
            return (Criteria) this;
        }

        public Criteria andPjUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pj_uid >=", value, "pjUid");
            return (Criteria) this;
        }

        public Criteria andPjUidLessThan(Integer value) {
            addCriterion("pj_uid <", value, "pjUid");
            return (Criteria) this;
        }

        public Criteria andPjUidLessThanOrEqualTo(Integer value) {
            addCriterion("pj_uid <=", value, "pjUid");
            return (Criteria) this;
        }

        public Criteria andPjUidIn(List<Integer> values) {
            addCriterion("pj_uid in", values, "pjUid");
            return (Criteria) this;
        }

        public Criteria andPjUidNotIn(List<Integer> values) {
            addCriterion("pj_uid not in", values, "pjUid");
            return (Criteria) this;
        }

        public Criteria andPjUidBetween(Integer value1, Integer value2) {
            addCriterion("pj_uid between", value1, value2, "pjUid");
            return (Criteria) this;
        }

        public Criteria andPjUidNotBetween(Integer value1, Integer value2) {
            addCriterion("pj_uid not between", value1, value2, "pjUid");
            return (Criteria) this;
        }

        public Criteria andPjedUidIsNull() {
            addCriterion("pjed_uid is null");
            return (Criteria) this;
        }

        public Criteria andPjedUidIsNotNull() {
            addCriterion("pjed_uid is not null");
            return (Criteria) this;
        }

        public Criteria andPjedUidEqualTo(Integer value) {
            addCriterion("pjed_uid =", value, "pjedUid");
            return (Criteria) this;
        }

        public Criteria andPjedUidNotEqualTo(Integer value) {
            addCriterion("pjed_uid <>", value, "pjedUid");
            return (Criteria) this;
        }

        public Criteria andPjedUidGreaterThan(Integer value) {
            addCriterion("pjed_uid >", value, "pjedUid");
            return (Criteria) this;
        }

        public Criteria andPjedUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pjed_uid >=", value, "pjedUid");
            return (Criteria) this;
        }

        public Criteria andPjedUidLessThan(Integer value) {
            addCriterion("pjed_uid <", value, "pjedUid");
            return (Criteria) this;
        }

        public Criteria andPjedUidLessThanOrEqualTo(Integer value) {
            addCriterion("pjed_uid <=", value, "pjedUid");
            return (Criteria) this;
        }

        public Criteria andPjedUidIn(List<Integer> values) {
            addCriterion("pjed_uid in", values, "pjedUid");
            return (Criteria) this;
        }

        public Criteria andPjedUidNotIn(List<Integer> values) {
            addCriterion("pjed_uid not in", values, "pjedUid");
            return (Criteria) this;
        }

        public Criteria andPjedUidBetween(Integer value1, Integer value2) {
            addCriterion("pjed_uid between", value1, value2, "pjedUid");
            return (Criteria) this;
        }

        public Criteria andPjedUidNotBetween(Integer value1, Integer value2) {
            addCriterion("pjed_uid not between", value1, value2, "pjedUid");
            return (Criteria) this;
        }

        public Criteria andStarIsNull() {
            addCriterion("star is null");
            return (Criteria) this;
        }

        public Criteria andStarIsNotNull() {
            addCriterion("star is not null");
            return (Criteria) this;
        }

        public Criteria andStarEqualTo(String value) {
            addCriterion("star =", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotEqualTo(String value) {
            addCriterion("star <>", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThan(String value) {
            addCriterion("star >", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThanOrEqualTo(String value) {
            addCriterion("star >=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThan(String value) {
            addCriterion("star <", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThanOrEqualTo(String value) {
            addCriterion("star <=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLike(String value) {
            addCriterion("star like", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotLike(String value) {
            addCriterion("star not like", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarIn(List<String> values) {
            addCriterion("star in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotIn(List<String> values) {
            addCriterion("star not in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarBetween(String value1, String value2) {
            addCriterion("star between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotBetween(String value1, String value2) {
            addCriterion("star not between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andTextIsNull() {
            addCriterion("text is null");
            return (Criteria) this;
        }

        public Criteria andTextIsNotNull() {
            addCriterion("text is not null");
            return (Criteria) this;
        }

        public Criteria andTextEqualTo(String value) {
            addCriterion("text =", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotEqualTo(String value) {
            addCriterion("text <>", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThan(String value) {
            addCriterion("text >", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThanOrEqualTo(String value) {
            addCriterion("text >=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThan(String value) {
            addCriterion("text <", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThanOrEqualTo(String value) {
            addCriterion("text <=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLike(String value) {
            addCriterion("text like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotLike(String value) {
            addCriterion("text not like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextIn(List<String> values) {
            addCriterion("text in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotIn(List<String> values) {
            addCriterion("text not in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextBetween(String value1, String value2) {
            addCriterion("text between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotBetween(String value1, String value2) {
            addCriterion("text not between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
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
     * This class corresponds to the database table coach_venue_pj
     *
     * @mbg.generated do_not_delete_during_merge Mon Jun 08 15:25:25 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coach_venue_pj
     *
     * @mbg.generated Mon Jun 08 15:25:25 CST 2020
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