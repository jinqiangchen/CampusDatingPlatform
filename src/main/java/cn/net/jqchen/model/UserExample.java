package cn.net.jqchen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNull() {
            addCriterion("user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNotNull() {
            addCriterion("user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualTo(String value) {
            addCriterion("user_nickname =", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualTo(String value) {
            addCriterion("user_nickname <>", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThan(String value) {
            addCriterion("user_nickname >", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nickname >=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThan(String value) {
            addCriterion("user_nickname <", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("user_nickname <=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLike(String value) {
            addCriterion("user_nickname like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotLike(String value) {
            addCriterion("user_nickname not like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIn(List<String> values) {
            addCriterion("user_nickname in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotIn(List<String> values) {
            addCriterion("user_nickname not in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameBetween(String value1, String value2) {
            addCriterion("user_nickname between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotBetween(String value1, String value2) {
            addCriterion("user_nickname not between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameIsNull() {
            addCriterion("user_realname is null");
            return (Criteria) this;
        }

        public Criteria andUserRealnameIsNotNull() {
            addCriterion("user_realname is not null");
            return (Criteria) this;
        }

        public Criteria andUserRealnameEqualTo(String value) {
            addCriterion("user_realname =", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameNotEqualTo(String value) {
            addCriterion("user_realname <>", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameGreaterThan(String value) {
            addCriterion("user_realname >", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("user_realname >=", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameLessThan(String value) {
            addCriterion("user_realname <", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameLessThanOrEqualTo(String value) {
            addCriterion("user_realname <=", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameLike(String value) {
            addCriterion("user_realname like", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameNotLike(String value) {
            addCriterion("user_realname not like", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameIn(List<String> values) {
            addCriterion("user_realname in", values, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameNotIn(List<String> values) {
            addCriterion("user_realname not in", values, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameBetween(String value1, String value2) {
            addCriterion("user_realname between", value1, value2, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameNotBetween(String value1, String value2) {
            addCriterion("user_realname not between", value1, value2, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNull() {
            addCriterion("user_age is null");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNotNull() {
            addCriterion("user_age is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgeEqualTo(Integer value) {
            addCriterion("user_age =", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotEqualTo(Integer value) {
            addCriterion("user_age <>", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThan(Integer value) {
            addCriterion("user_age >", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_age >=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThan(Integer value) {
            addCriterion("user_age <", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThanOrEqualTo(Integer value) {
            addCriterion("user_age <=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeIn(List<Integer> values) {
            addCriterion("user_age in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotIn(List<Integer> values) {
            addCriterion("user_age not in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeBetween(Integer value1, Integer value2) {
            addCriterion("user_age between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_age not between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserHobbyIsNull() {
            addCriterion("user_hobby is null");
            return (Criteria) this;
        }

        public Criteria andUserHobbyIsNotNull() {
            addCriterion("user_hobby is not null");
            return (Criteria) this;
        }

        public Criteria andUserHobbyEqualTo(String value) {
            addCriterion("user_hobby =", value, "userHobby");
            return (Criteria) this;
        }

        public Criteria andUserHobbyNotEqualTo(String value) {
            addCriterion("user_hobby <>", value, "userHobby");
            return (Criteria) this;
        }

        public Criteria andUserHobbyGreaterThan(String value) {
            addCriterion("user_hobby >", value, "userHobby");
            return (Criteria) this;
        }

        public Criteria andUserHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("user_hobby >=", value, "userHobby");
            return (Criteria) this;
        }

        public Criteria andUserHobbyLessThan(String value) {
            addCriterion("user_hobby <", value, "userHobby");
            return (Criteria) this;
        }

        public Criteria andUserHobbyLessThanOrEqualTo(String value) {
            addCriterion("user_hobby <=", value, "userHobby");
            return (Criteria) this;
        }

        public Criteria andUserHobbyLike(String value) {
            addCriterion("user_hobby like", value, "userHobby");
            return (Criteria) this;
        }

        public Criteria andUserHobbyNotLike(String value) {
            addCriterion("user_hobby not like", value, "userHobby");
            return (Criteria) this;
        }

        public Criteria andUserHobbyIn(List<String> values) {
            addCriterion("user_hobby in", values, "userHobby");
            return (Criteria) this;
        }

        public Criteria andUserHobbyNotIn(List<String> values) {
            addCriterion("user_hobby not in", values, "userHobby");
            return (Criteria) this;
        }

        public Criteria andUserHobbyBetween(String value1, String value2) {
            addCriterion("user_hobby between", value1, value2, "userHobby");
            return (Criteria) this;
        }

        public Criteria andUserHobbyNotBetween(String value1, String value2) {
            addCriterion("user_hobby not between", value1, value2, "userHobby");
            return (Criteria) this;
        }

        public Criteria andUserPictureIsNull() {
            addCriterion("user_picture is null");
            return (Criteria) this;
        }

        public Criteria andUserPictureIsNotNull() {
            addCriterion("user_picture is not null");
            return (Criteria) this;
        }

        public Criteria andUserPictureEqualTo(String value) {
            addCriterion("user_picture =", value, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureNotEqualTo(String value) {
            addCriterion("user_picture <>", value, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureGreaterThan(String value) {
            addCriterion("user_picture >", value, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureGreaterThanOrEqualTo(String value) {
            addCriterion("user_picture >=", value, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureLessThan(String value) {
            addCriterion("user_picture <", value, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureLessThanOrEqualTo(String value) {
            addCriterion("user_picture <=", value, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureLike(String value) {
            addCriterion("user_picture like", value, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureNotLike(String value) {
            addCriterion("user_picture not like", value, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureIn(List<String> values) {
            addCriterion("user_picture in", values, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureNotIn(List<String> values) {
            addCriterion("user_picture not in", values, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureBetween(String value1, String value2) {
            addCriterion("user_picture between", value1, value2, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserPictureNotBetween(String value1, String value2) {
            addCriterion("user_picture not between", value1, value2, "userPicture");
            return (Criteria) this;
        }

        public Criteria andUserRegistertimeIsNull() {
            addCriterion("user_registerTime is null");
            return (Criteria) this;
        }

        public Criteria andUserRegistertimeIsNotNull() {
            addCriterion("user_registerTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegistertimeEqualTo(Date value) {
            addCriterion("user_registerTime =", value, "userRegistertime");
            return (Criteria) this;
        }

        public Criteria andUserRegistertimeNotEqualTo(Date value) {
            addCriterion("user_registerTime <>", value, "userRegistertime");
            return (Criteria) this;
        }

        public Criteria andUserRegistertimeGreaterThan(Date value) {
            addCriterion("user_registerTime >", value, "userRegistertime");
            return (Criteria) this;
        }

        public Criteria andUserRegistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_registerTime >=", value, "userRegistertime");
            return (Criteria) this;
        }

        public Criteria andUserRegistertimeLessThan(Date value) {
            addCriterion("user_registerTime <", value, "userRegistertime");
            return (Criteria) this;
        }

        public Criteria andUserRegistertimeLessThanOrEqualTo(Date value) {
            addCriterion("user_registerTime <=", value, "userRegistertime");
            return (Criteria) this;
        }

        public Criteria andUserRegistertimeIn(List<Date> values) {
            addCriterion("user_registerTime in", values, "userRegistertime");
            return (Criteria) this;
        }

        public Criteria andUserRegistertimeNotIn(List<Date> values) {
            addCriterion("user_registerTime not in", values, "userRegistertime");
            return (Criteria) this;
        }

        public Criteria andUserRegistertimeBetween(Date value1, Date value2) {
            addCriterion("user_registerTime between", value1, value2, "userRegistertime");
            return (Criteria) this;
        }

        public Criteria andUserRegistertimeNotBetween(Date value1, Date value2) {
            addCriterion("user_registerTime not between", value1, value2, "userRegistertime");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("user_state is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("user_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(Integer value) {
            addCriterion("user_state =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(Integer value) {
            addCriterion("user_state <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(Integer value) {
            addCriterion("user_state >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_state >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(Integer value) {
            addCriterion("user_state <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(Integer value) {
            addCriterion("user_state <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<Integer> values) {
            addCriterion("user_state in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<Integer> values) {
            addCriterion("user_state not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(Integer value1, Integer value2) {
            addCriterion("user_state between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(Integer value1, Integer value2) {
            addCriterion("user_state not between", value1, value2, "userState");
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