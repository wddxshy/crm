package com.shy.beans;

import java.util.ArrayList;
import java.util.List;

public class BaseDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseDictExample() {
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

        public Criteria andDictidIsNull() {
            addCriterion("dictId is null");
            return (Criteria) this;
        }

        public Criteria andDictidIsNotNull() {
            addCriterion("dictId is not null");
            return (Criteria) this;
        }

        public Criteria andDictidEqualTo(String value) {
            addCriterion("dictId =", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidNotEqualTo(String value) {
            addCriterion("dictId <>", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidGreaterThan(String value) {
            addCriterion("dictId >", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidGreaterThanOrEqualTo(String value) {
            addCriterion("dictId >=", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidLessThan(String value) {
            addCriterion("dictId <", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidLessThanOrEqualTo(String value) {
            addCriterion("dictId <=", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidLike(String value) {
            addCriterion("dictId like", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidNotLike(String value) {
            addCriterion("dictId not like", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidIn(List<String> values) {
            addCriterion("dictId in", values, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidNotIn(List<String> values) {
            addCriterion("dictId not in", values, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidBetween(String value1, String value2) {
            addCriterion("dictId between", value1, value2, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidNotBetween(String value1, String value2) {
            addCriterion("dictId not between", value1, value2, "dictid");
            return (Criteria) this;
        }

        public Criteria andDicttypecodeIsNull() {
            addCriterion("dictTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andDicttypecodeIsNotNull() {
            addCriterion("dictTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andDicttypecodeEqualTo(String value) {
            addCriterion("dictTypeCode =", value, "dicttypecode");
            return (Criteria) this;
        }

        public Criteria andDicttypecodeNotEqualTo(String value) {
            addCriterion("dictTypeCode <>", value, "dicttypecode");
            return (Criteria) this;
        }

        public Criteria andDicttypecodeGreaterThan(String value) {
            addCriterion("dictTypeCode >", value, "dicttypecode");
            return (Criteria) this;
        }

        public Criteria andDicttypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("dictTypeCode >=", value, "dicttypecode");
            return (Criteria) this;
        }

        public Criteria andDicttypecodeLessThan(String value) {
            addCriterion("dictTypeCode <", value, "dicttypecode");
            return (Criteria) this;
        }

        public Criteria andDicttypecodeLessThanOrEqualTo(String value) {
            addCriterion("dictTypeCode <=", value, "dicttypecode");
            return (Criteria) this;
        }

        public Criteria andDicttypecodeLike(String value) {
            addCriterion("dictTypeCode like", value, "dicttypecode");
            return (Criteria) this;
        }

        public Criteria andDicttypecodeNotLike(String value) {
            addCriterion("dictTypeCode not like", value, "dicttypecode");
            return (Criteria) this;
        }

        public Criteria andDicttypecodeIn(List<String> values) {
            addCriterion("dictTypeCode in", values, "dicttypecode");
            return (Criteria) this;
        }

        public Criteria andDicttypecodeNotIn(List<String> values) {
            addCriterion("dictTypeCode not in", values, "dicttypecode");
            return (Criteria) this;
        }

        public Criteria andDicttypecodeBetween(String value1, String value2) {
            addCriterion("dictTypeCode between", value1, value2, "dicttypecode");
            return (Criteria) this;
        }

        public Criteria andDicttypecodeNotBetween(String value1, String value2) {
            addCriterion("dictTypeCode not between", value1, value2, "dicttypecode");
            return (Criteria) this;
        }

        public Criteria andDicttypenameIsNull() {
            addCriterion("dictTypeName is null");
            return (Criteria) this;
        }

        public Criteria andDicttypenameIsNotNull() {
            addCriterion("dictTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andDicttypenameEqualTo(String value) {
            addCriterion("dictTypeName =", value, "dicttypename");
            return (Criteria) this;
        }

        public Criteria andDicttypenameNotEqualTo(String value) {
            addCriterion("dictTypeName <>", value, "dicttypename");
            return (Criteria) this;
        }

        public Criteria andDicttypenameGreaterThan(String value) {
            addCriterion("dictTypeName >", value, "dicttypename");
            return (Criteria) this;
        }

        public Criteria andDicttypenameGreaterThanOrEqualTo(String value) {
            addCriterion("dictTypeName >=", value, "dicttypename");
            return (Criteria) this;
        }

        public Criteria andDicttypenameLessThan(String value) {
            addCriterion("dictTypeName <", value, "dicttypename");
            return (Criteria) this;
        }

        public Criteria andDicttypenameLessThanOrEqualTo(String value) {
            addCriterion("dictTypeName <=", value, "dicttypename");
            return (Criteria) this;
        }

        public Criteria andDicttypenameLike(String value) {
            addCriterion("dictTypeName like", value, "dicttypename");
            return (Criteria) this;
        }

        public Criteria andDicttypenameNotLike(String value) {
            addCriterion("dictTypeName not like", value, "dicttypename");
            return (Criteria) this;
        }

        public Criteria andDicttypenameIn(List<String> values) {
            addCriterion("dictTypeName in", values, "dicttypename");
            return (Criteria) this;
        }

        public Criteria andDicttypenameNotIn(List<String> values) {
            addCriterion("dictTypeName not in", values, "dicttypename");
            return (Criteria) this;
        }

        public Criteria andDicttypenameBetween(String value1, String value2) {
            addCriterion("dictTypeName between", value1, value2, "dicttypename");
            return (Criteria) this;
        }

        public Criteria andDicttypenameNotBetween(String value1, String value2) {
            addCriterion("dictTypeName not between", value1, value2, "dicttypename");
            return (Criteria) this;
        }

        public Criteria andDictitemnameIsNull() {
            addCriterion("dictItemName is null");
            return (Criteria) this;
        }

        public Criteria andDictitemnameIsNotNull() {
            addCriterion("dictItemName is not null");
            return (Criteria) this;
        }

        public Criteria andDictitemnameEqualTo(String value) {
            addCriterion("dictItemName =", value, "dictitemname");
            return (Criteria) this;
        }

        public Criteria andDictitemnameNotEqualTo(String value) {
            addCriterion("dictItemName <>", value, "dictitemname");
            return (Criteria) this;
        }

        public Criteria andDictitemnameGreaterThan(String value) {
            addCriterion("dictItemName >", value, "dictitemname");
            return (Criteria) this;
        }

        public Criteria andDictitemnameGreaterThanOrEqualTo(String value) {
            addCriterion("dictItemName >=", value, "dictitemname");
            return (Criteria) this;
        }

        public Criteria andDictitemnameLessThan(String value) {
            addCriterion("dictItemName <", value, "dictitemname");
            return (Criteria) this;
        }

        public Criteria andDictitemnameLessThanOrEqualTo(String value) {
            addCriterion("dictItemName <=", value, "dictitemname");
            return (Criteria) this;
        }

        public Criteria andDictitemnameLike(String value) {
            addCriterion("dictItemName like", value, "dictitemname");
            return (Criteria) this;
        }

        public Criteria andDictitemnameNotLike(String value) {
            addCriterion("dictItemName not like", value, "dictitemname");
            return (Criteria) this;
        }

        public Criteria andDictitemnameIn(List<String> values) {
            addCriterion("dictItemName in", values, "dictitemname");
            return (Criteria) this;
        }

        public Criteria andDictitemnameNotIn(List<String> values) {
            addCriterion("dictItemName not in", values, "dictitemname");
            return (Criteria) this;
        }

        public Criteria andDictitemnameBetween(String value1, String value2) {
            addCriterion("dictItemName between", value1, value2, "dictitemname");
            return (Criteria) this;
        }

        public Criteria andDictitemnameNotBetween(String value1, String value2) {
            addCriterion("dictItemName not between", value1, value2, "dictitemname");
            return (Criteria) this;
        }

        public Criteria andDictitemcodeIsNull() {
            addCriterion("dictItemCode is null");
            return (Criteria) this;
        }

        public Criteria andDictitemcodeIsNotNull() {
            addCriterion("dictItemCode is not null");
            return (Criteria) this;
        }

        public Criteria andDictitemcodeEqualTo(String value) {
            addCriterion("dictItemCode =", value, "dictitemcode");
            return (Criteria) this;
        }

        public Criteria andDictitemcodeNotEqualTo(String value) {
            addCriterion("dictItemCode <>", value, "dictitemcode");
            return (Criteria) this;
        }

        public Criteria andDictitemcodeGreaterThan(String value) {
            addCriterion("dictItemCode >", value, "dictitemcode");
            return (Criteria) this;
        }

        public Criteria andDictitemcodeGreaterThanOrEqualTo(String value) {
            addCriterion("dictItemCode >=", value, "dictitemcode");
            return (Criteria) this;
        }

        public Criteria andDictitemcodeLessThan(String value) {
            addCriterion("dictItemCode <", value, "dictitemcode");
            return (Criteria) this;
        }

        public Criteria andDictitemcodeLessThanOrEqualTo(String value) {
            addCriterion("dictItemCode <=", value, "dictitemcode");
            return (Criteria) this;
        }

        public Criteria andDictitemcodeLike(String value) {
            addCriterion("dictItemCode like", value, "dictitemcode");
            return (Criteria) this;
        }

        public Criteria andDictitemcodeNotLike(String value) {
            addCriterion("dictItemCode not like", value, "dictitemcode");
            return (Criteria) this;
        }

        public Criteria andDictitemcodeIn(List<String> values) {
            addCriterion("dictItemCode in", values, "dictitemcode");
            return (Criteria) this;
        }

        public Criteria andDictitemcodeNotIn(List<String> values) {
            addCriterion("dictItemCode not in", values, "dictitemcode");
            return (Criteria) this;
        }

        public Criteria andDictitemcodeBetween(String value1, String value2) {
            addCriterion("dictItemCode between", value1, value2, "dictitemcode");
            return (Criteria) this;
        }

        public Criteria andDictitemcodeNotBetween(String value1, String value2) {
            addCriterion("dictItemCode not between", value1, value2, "dictitemcode");
            return (Criteria) this;
        }

        public Criteria andDictsortIsNull() {
            addCriterion("dictSort is null");
            return (Criteria) this;
        }

        public Criteria andDictsortIsNotNull() {
            addCriterion("dictSort is not null");
            return (Criteria) this;
        }

        public Criteria andDictsortEqualTo(Integer value) {
            addCriterion("dictSort =", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortNotEqualTo(Integer value) {
            addCriterion("dictSort <>", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortGreaterThan(Integer value) {
            addCriterion("dictSort >", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortGreaterThanOrEqualTo(Integer value) {
            addCriterion("dictSort >=", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortLessThan(Integer value) {
            addCriterion("dictSort <", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortLessThanOrEqualTo(Integer value) {
            addCriterion("dictSort <=", value, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortIn(List<Integer> values) {
            addCriterion("dictSort in", values, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortNotIn(List<Integer> values) {
            addCriterion("dictSort not in", values, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortBetween(Integer value1, Integer value2) {
            addCriterion("dictSort between", value1, value2, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictsortNotBetween(Integer value1, Integer value2) {
            addCriterion("dictSort not between", value1, value2, "dictsort");
            return (Criteria) this;
        }

        public Criteria andDictenableIsNull() {
            addCriterion("dictEnable is null");
            return (Criteria) this;
        }

        public Criteria andDictenableIsNotNull() {
            addCriterion("dictEnable is not null");
            return (Criteria) this;
        }

        public Criteria andDictenableEqualTo(String value) {
            addCriterion("dictEnable =", value, "dictenable");
            return (Criteria) this;
        }

        public Criteria andDictenableNotEqualTo(String value) {
            addCriterion("dictEnable <>", value, "dictenable");
            return (Criteria) this;
        }

        public Criteria andDictenableGreaterThan(String value) {
            addCriterion("dictEnable >", value, "dictenable");
            return (Criteria) this;
        }

        public Criteria andDictenableGreaterThanOrEqualTo(String value) {
            addCriterion("dictEnable >=", value, "dictenable");
            return (Criteria) this;
        }

        public Criteria andDictenableLessThan(String value) {
            addCriterion("dictEnable <", value, "dictenable");
            return (Criteria) this;
        }

        public Criteria andDictenableLessThanOrEqualTo(String value) {
            addCriterion("dictEnable <=", value, "dictenable");
            return (Criteria) this;
        }

        public Criteria andDictenableLike(String value) {
            addCriterion("dictEnable like", value, "dictenable");
            return (Criteria) this;
        }

        public Criteria andDictenableNotLike(String value) {
            addCriterion("dictEnable not like", value, "dictenable");
            return (Criteria) this;
        }

        public Criteria andDictenableIn(List<String> values) {
            addCriterion("dictEnable in", values, "dictenable");
            return (Criteria) this;
        }

        public Criteria andDictenableNotIn(List<String> values) {
            addCriterion("dictEnable not in", values, "dictenable");
            return (Criteria) this;
        }

        public Criteria andDictenableBetween(String value1, String value2) {
            addCriterion("dictEnable between", value1, value2, "dictenable");
            return (Criteria) this;
        }

        public Criteria andDictenableNotBetween(String value1, String value2) {
            addCriterion("dictEnable not between", value1, value2, "dictenable");
            return (Criteria) this;
        }

        public Criteria andDictmemoIsNull() {
            addCriterion("dictMemo is null");
            return (Criteria) this;
        }

        public Criteria andDictmemoIsNotNull() {
            addCriterion("dictMemo is not null");
            return (Criteria) this;
        }

        public Criteria andDictmemoEqualTo(String value) {
            addCriterion("dictMemo =", value, "dictmemo");
            return (Criteria) this;
        }

        public Criteria andDictmemoNotEqualTo(String value) {
            addCriterion("dictMemo <>", value, "dictmemo");
            return (Criteria) this;
        }

        public Criteria andDictmemoGreaterThan(String value) {
            addCriterion("dictMemo >", value, "dictmemo");
            return (Criteria) this;
        }

        public Criteria andDictmemoGreaterThanOrEqualTo(String value) {
            addCriterion("dictMemo >=", value, "dictmemo");
            return (Criteria) this;
        }

        public Criteria andDictmemoLessThan(String value) {
            addCriterion("dictMemo <", value, "dictmemo");
            return (Criteria) this;
        }

        public Criteria andDictmemoLessThanOrEqualTo(String value) {
            addCriterion("dictMemo <=", value, "dictmemo");
            return (Criteria) this;
        }

        public Criteria andDictmemoLike(String value) {
            addCriterion("dictMemo like", value, "dictmemo");
            return (Criteria) this;
        }

        public Criteria andDictmemoNotLike(String value) {
            addCriterion("dictMemo not like", value, "dictmemo");
            return (Criteria) this;
        }

        public Criteria andDictmemoIn(List<String> values) {
            addCriterion("dictMemo in", values, "dictmemo");
            return (Criteria) this;
        }

        public Criteria andDictmemoNotIn(List<String> values) {
            addCriterion("dictMemo not in", values, "dictmemo");
            return (Criteria) this;
        }

        public Criteria andDictmemoBetween(String value1, String value2) {
            addCriterion("dictMemo between", value1, value2, "dictmemo");
            return (Criteria) this;
        }

        public Criteria andDictmemoNotBetween(String value1, String value2) {
            addCriterion("dictMemo not between", value1, value2, "dictmemo");
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