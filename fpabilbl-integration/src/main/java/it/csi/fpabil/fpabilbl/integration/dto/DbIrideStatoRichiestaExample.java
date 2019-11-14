package it.csi.fpabil.fpabilbl.integration.dto;

import java.util.ArrayList;
import java.util.List;

public class DbIrideStatoRichiestaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbIrideStatoRichiestaExample() {
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

        public Criteria andIdStatoRichiestaOperatoreIsNull() {
            addCriterion("id_stato_richiesta_operatore is null");
            return (Criteria) this;
        }

        public Criteria andIdStatoRichiestaOperatoreIsNotNull() {
            addCriterion("id_stato_richiesta_operatore is not null");
            return (Criteria) this;
        }

        public Criteria andIdStatoRichiestaOperatoreEqualTo(Integer value) {
            addCriterion("id_stato_richiesta_operatore =", value, "idStatoRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdStatoRichiestaOperatoreNotEqualTo(Integer value) {
            addCriterion("id_stato_richiesta_operatore <>", value, "idStatoRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdStatoRichiestaOperatoreGreaterThan(Integer value) {
            addCriterion("id_stato_richiesta_operatore >", value, "idStatoRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdStatoRichiestaOperatoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_stato_richiesta_operatore >=", value, "idStatoRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdStatoRichiestaOperatoreLessThan(Integer value) {
            addCriterion("id_stato_richiesta_operatore <", value, "idStatoRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdStatoRichiestaOperatoreLessThanOrEqualTo(Integer value) {
            addCriterion("id_stato_richiesta_operatore <=", value, "idStatoRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdStatoRichiestaOperatoreIn(List<Integer> values) {
            addCriterion("id_stato_richiesta_operatore in", values, "idStatoRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdStatoRichiestaOperatoreNotIn(List<Integer> values) {
            addCriterion("id_stato_richiesta_operatore not in", values, "idStatoRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdStatoRichiestaOperatoreBetween(Integer value1, Integer value2) {
            addCriterion("id_stato_richiesta_operatore between", value1, value2, "idStatoRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdStatoRichiestaOperatoreNotBetween(Integer value1, Integer value2) {
            addCriterion("id_stato_richiesta_operatore not between", value1, value2, "idStatoRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andDescrizioneIsNull() {
            addCriterion("descrizione is null");
            return (Criteria) this;
        }

        public Criteria andDescrizioneIsNotNull() {
            addCriterion("descrizione is not null");
            return (Criteria) this;
        }

        public Criteria andDescrizioneEqualTo(String value) {
            addCriterion("descrizione =", value, "descrizione");
            return (Criteria) this;
        }

        public Criteria andDescrizioneNotEqualTo(String value) {
            addCriterion("descrizione <>", value, "descrizione");
            return (Criteria) this;
        }

        public Criteria andDescrizioneGreaterThan(String value) {
            addCriterion("descrizione >", value, "descrizione");
            return (Criteria) this;
        }

        public Criteria andDescrizioneGreaterThanOrEqualTo(String value) {
            addCriterion("descrizione >=", value, "descrizione");
            return (Criteria) this;
        }

        public Criteria andDescrizioneLessThan(String value) {
            addCriterion("descrizione <", value, "descrizione");
            return (Criteria) this;
        }

        public Criteria andDescrizioneLessThanOrEqualTo(String value) {
            addCriterion("descrizione <=", value, "descrizione");
            return (Criteria) this;
        }

        public Criteria andDescrizioneLike(String value) {
            addCriterion("descrizione like", value, "descrizione");
            return (Criteria) this;
        }

        public Criteria andDescrizioneNotLike(String value) {
            addCriterion("descrizione not like", value, "descrizione");
            return (Criteria) this;
        }

        public Criteria andDescrizioneIn(List<String> values) {
            addCriterion("descrizione in", values, "descrizione");
            return (Criteria) this;
        }

        public Criteria andDescrizioneNotIn(List<String> values) {
            addCriterion("descrizione not in", values, "descrizione");
            return (Criteria) this;
        }

        public Criteria andDescrizioneBetween(String value1, String value2) {
            addCriterion("descrizione between", value1, value2, "descrizione");
            return (Criteria) this;
        }

        public Criteria andDescrizioneNotBetween(String value1, String value2) {
            addCriterion("descrizione not between", value1, value2, "descrizione");
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