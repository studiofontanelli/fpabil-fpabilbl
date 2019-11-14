package it.csi.fpabil.fpabilbl.integration.dto;

import java.util.ArrayList;
import java.util.List;

public class TabDocIdentitaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TabDocIdentitaExample() {
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

        public Criteria andCodTipoDocIdentitaIsNull() {
            addCriterion("cod_tipo_doc_identita is null");
            return (Criteria) this;
        }

        public Criteria andCodTipoDocIdentitaIsNotNull() {
            addCriterion("cod_tipo_doc_identita is not null");
            return (Criteria) this;
        }

        public Criteria andCodTipoDocIdentitaEqualTo(String value) {
            addCriterion("cod_tipo_doc_identita =", value, "codTipoDocIdentita");
            return (Criteria) this;
        }

        public Criteria andCodTipoDocIdentitaNotEqualTo(String value) {
            addCriterion("cod_tipo_doc_identita <>", value, "codTipoDocIdentita");
            return (Criteria) this;
        }

        public Criteria andCodTipoDocIdentitaGreaterThan(String value) {
            addCriterion("cod_tipo_doc_identita >", value, "codTipoDocIdentita");
            return (Criteria) this;
        }

        public Criteria andCodTipoDocIdentitaGreaterThanOrEqualTo(String value) {
            addCriterion("cod_tipo_doc_identita >=", value, "codTipoDocIdentita");
            return (Criteria) this;
        }

        public Criteria andCodTipoDocIdentitaLessThan(String value) {
            addCriterion("cod_tipo_doc_identita <", value, "codTipoDocIdentita");
            return (Criteria) this;
        }

        public Criteria andCodTipoDocIdentitaLessThanOrEqualTo(String value) {
            addCriterion("cod_tipo_doc_identita <=", value, "codTipoDocIdentita");
            return (Criteria) this;
        }

        public Criteria andCodTipoDocIdentitaLike(String value) {
            addCriterion("cod_tipo_doc_identita like", value, "codTipoDocIdentita");
            return (Criteria) this;
        }

        public Criteria andCodTipoDocIdentitaNotLike(String value) {
            addCriterion("cod_tipo_doc_identita not like", value, "codTipoDocIdentita");
            return (Criteria) this;
        }

        public Criteria andCodTipoDocIdentitaIn(List<String> values) {
            addCriterion("cod_tipo_doc_identita in", values, "codTipoDocIdentita");
            return (Criteria) this;
        }

        public Criteria andCodTipoDocIdentitaNotIn(List<String> values) {
            addCriterion("cod_tipo_doc_identita not in", values, "codTipoDocIdentita");
            return (Criteria) this;
        }

        public Criteria andCodTipoDocIdentitaBetween(String value1, String value2) {
            addCriterion("cod_tipo_doc_identita between", value1, value2, "codTipoDocIdentita");
            return (Criteria) this;
        }

        public Criteria andCodTipoDocIdentitaNotBetween(String value1, String value2) {
            addCriterion("cod_tipo_doc_identita not between", value1, value2, "codTipoDocIdentita");
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