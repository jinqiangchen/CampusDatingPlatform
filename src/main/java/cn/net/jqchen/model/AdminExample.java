package cn.net.jqchen.model;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andAdminAccountIsNull() {
            addCriterion("admin_account is null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNotNull() {
            addCriterion("admin_account is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountEqualTo(String value) {
            addCriterion("admin_account =", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotEqualTo(String value) {
            addCriterion("admin_account <>", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThan(String value) {
            addCriterion("admin_account >", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThanOrEqualTo(String value) {
            addCriterion("admin_account >=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThan(String value) {
            addCriterion("admin_account <", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThanOrEqualTo(String value) {
            addCriterion("admin_account <=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLike(String value) {
            addCriterion("admin_account like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotLike(String value) {
            addCriterion("admin_account not like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIn(List<String> values) {
            addCriterion("admin_account in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotIn(List<String> values) {
            addCriterion("admin_account not in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountBetween(String value1, String value2) {
            addCriterion("admin_account between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotBetween(String value1, String value2) {
            addCriterion("admin_account not between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameIsNull() {
            addCriterion("admin_nickname is null");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameIsNotNull() {
            addCriterion("admin_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameEqualTo(String value) {
            addCriterion("admin_nickname =", value, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameNotEqualTo(String value) {
            addCriterion("admin_nickname <>", value, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameGreaterThan(String value) {
            addCriterion("admin_nickname >", value, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_nickname >=", value, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameLessThan(String value) {
            addCriterion("admin_nickname <", value, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameLessThanOrEqualTo(String value) {
            addCriterion("admin_nickname <=", value, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameLike(String value) {
            addCriterion("admin_nickname like", value, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameNotLike(String value) {
            addCriterion("admin_nickname not like", value, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameIn(List<String> values) {
            addCriterion("admin_nickname in", values, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameNotIn(List<String> values) {
            addCriterion("admin_nickname not in", values, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameBetween(String value1, String value2) {
            addCriterion("admin_nickname between", value1, value2, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameNotBetween(String value1, String value2) {
            addCriterion("admin_nickname not between", value1, value2, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminRealnameIsNull() {
            addCriterion("admin_realname is null");
            return (Criteria) this;
        }

        public Criteria andAdminRealnameIsNotNull() {
            addCriterion("admin_realname is not null");
            return (Criteria) this;
        }

        public Criteria andAdminRealnameEqualTo(String value) {
            addCriterion("admin_realname =", value, "adminRealname");
            return (Criteria) this;
        }

        public Criteria andAdminRealnameNotEqualTo(String value) {
            addCriterion("admin_realname <>", value, "adminRealname");
            return (Criteria) this;
        }

        public Criteria andAdminRealnameGreaterThan(String value) {
            addCriterion("admin_realname >", value, "adminRealname");
            return (Criteria) this;
        }

        public Criteria andAdminRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_realname >=", value, "adminRealname");
            return (Criteria) this;
        }

        public Criteria andAdminRealnameLessThan(String value) {
            addCriterion("admin_realname <", value, "adminRealname");
            return (Criteria) this;
        }

        public Criteria andAdminRealnameLessThanOrEqualTo(String value) {
            addCriterion("admin_realname <=", value, "adminRealname");
            return (Criteria) this;
        }

        public Criteria andAdminRealnameLike(String value) {
            addCriterion("admin_realname like", value, "adminRealname");
            return (Criteria) this;
        }

        public Criteria andAdminRealnameNotLike(String value) {
            addCriterion("admin_realname not like", value, "adminRealname");
            return (Criteria) this;
        }

        public Criteria andAdminRealnameIn(List<String> values) {
            addCriterion("admin_realname in", values, "adminRealname");
            return (Criteria) this;
        }

        public Criteria andAdminRealnameNotIn(List<String> values) {
            addCriterion("admin_realname not in", values, "adminRealname");
            return (Criteria) this;
        }

        public Criteria andAdminRealnameBetween(String value1, String value2) {
            addCriterion("admin_realname between", value1, value2, "adminRealname");
            return (Criteria) this;
        }

        public Criteria andAdminRealnameNotBetween(String value1, String value2) {
            addCriterion("admin_realname not between", value1, value2, "adminRealname");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andIscancelIsNull() {
            addCriterion("isCancel is null");
            return (Criteria) this;
        }

        public Criteria andIscancelIsNotNull() {
            addCriterion("isCancel is not null");
            return (Criteria) this;
        }

        public Criteria andIscancelEqualTo(Integer value) {
            addCriterion("isCancel =", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelNotEqualTo(Integer value) {
            addCriterion("isCancel <>", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelGreaterThan(Integer value) {
            addCriterion("isCancel >", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelGreaterThanOrEqualTo(Integer value) {
            addCriterion("isCancel >=", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelLessThan(Integer value) {
            addCriterion("isCancel <", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelLessThanOrEqualTo(Integer value) {
            addCriterion("isCancel <=", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelIn(List<Integer> values) {
            addCriterion("isCancel in", values, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelNotIn(List<Integer> values) {
            addCriterion("isCancel not in", values, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelBetween(Integer value1, Integer value2) {
            addCriterion("isCancel between", value1, value2, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelNotBetween(Integer value1, Integer value2) {
            addCriterion("isCancel not between", value1, value2, "iscancel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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