package it.csi.fpabil.fpabilbl.integration.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DbIrideRichiestaOperatoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbIrideRichiestaOperatoreExample() {
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

        public Criteria andIdRichiestaOperatoreIsNull() {
            addCriterion("id_richiesta_operatore is null");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreIsNotNull() {
            addCriterion("id_richiesta_operatore is not null");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreEqualTo(Integer value) {
            addCriterion("id_richiesta_operatore =", value, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreNotEqualTo(Integer value) {
            addCriterion("id_richiesta_operatore <>", value, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreGreaterThan(Integer value) {
            addCriterion("id_richiesta_operatore >", value, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_richiesta_operatore >=", value, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreLessThan(Integer value) {
            addCriterion("id_richiesta_operatore <", value, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreLessThanOrEqualTo(Integer value) {
            addCriterion("id_richiesta_operatore <=", value, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreIn(List<Integer> values) {
            addCriterion("id_richiesta_operatore in", values, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreNotIn(List<Integer> values) {
            addCriterion("id_richiesta_operatore not in", values, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreBetween(Integer value1, Integer value2) {
            addCriterion("id_richiesta_operatore between", value1, value2, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreNotBetween(Integer value1, Integer value2) {
            addCriterion("id_richiesta_operatore not between", value1, value2, "idRichiestaOperatore");
            return (Criteria) this;
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

        public Criteria andDataRichiestaIsNull() {
            addCriterion("data_richiesta is null");
            return (Criteria) this;
        }

        public Criteria andDataRichiestaIsNotNull() {
            addCriterion("data_richiesta is not null");
            return (Criteria) this;
        }

        public Criteria andDataRichiestaEqualTo(Date value) {
            addCriterionForJDBCDate("data_richiesta =", value, "dataRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataRichiestaNotEqualTo(Date value) {
            addCriterionForJDBCDate("data_richiesta <>", value, "dataRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataRichiestaGreaterThan(Date value) {
            addCriterionForJDBCDate("data_richiesta >", value, "dataRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataRichiestaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data_richiesta >=", value, "dataRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataRichiestaLessThan(Date value) {
            addCriterionForJDBCDate("data_richiesta <", value, "dataRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataRichiestaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data_richiesta <=", value, "dataRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataRichiestaIn(List<Date> values) {
            addCriterionForJDBCDate("data_richiesta in", values, "dataRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataRichiestaNotIn(List<Date> values) {
            addCriterionForJDBCDate("data_richiesta not in", values, "dataRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataRichiestaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data_richiesta between", value1, value2, "dataRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataRichiestaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data_richiesta not between", value1, value2, "dataRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataInvioRichiestaIsNull() {
            addCriterion("data_invio_richiesta is null");
            return (Criteria) this;
        }

        public Criteria andDataInvioRichiestaIsNotNull() {
            addCriterion("data_invio_richiesta is not null");
            return (Criteria) this;
        }

        public Criteria andDataInvioRichiestaEqualTo(Date value) {
            addCriterionForJDBCDate("data_invio_richiesta =", value, "dataInvioRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataInvioRichiestaNotEqualTo(Date value) {
            addCriterionForJDBCDate("data_invio_richiesta <>", value, "dataInvioRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataInvioRichiestaGreaterThan(Date value) {
            addCriterionForJDBCDate("data_invio_richiesta >", value, "dataInvioRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataInvioRichiestaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data_invio_richiesta >=", value, "dataInvioRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataInvioRichiestaLessThan(Date value) {
            addCriterionForJDBCDate("data_invio_richiesta <", value, "dataInvioRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataInvioRichiestaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data_invio_richiesta <=", value, "dataInvioRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataInvioRichiestaIn(List<Date> values) {
            addCriterionForJDBCDate("data_invio_richiesta in", values, "dataInvioRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataInvioRichiestaNotIn(List<Date> values) {
            addCriterionForJDBCDate("data_invio_richiesta not in", values, "dataInvioRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataInvioRichiestaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data_invio_richiesta between", value1, value2, "dataInvioRichiesta");
            return (Criteria) this;
        }

        public Criteria andDataInvioRichiestaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data_invio_richiesta not between", value1, value2, "dataInvioRichiesta");
            return (Criteria) this;
        }

        public Criteria andLrCognomeIsNull() {
            addCriterion("lr_cognome is null");
            return (Criteria) this;
        }

        public Criteria andLrCognomeIsNotNull() {
            addCriterion("lr_cognome is not null");
            return (Criteria) this;
        }

        public Criteria andLrCognomeEqualTo(String value) {
            addCriterion("lr_cognome =", value, "lrCognome");
            return (Criteria) this;
        }

        public Criteria andLrCognomeNotEqualTo(String value) {
            addCriterion("lr_cognome <>", value, "lrCognome");
            return (Criteria) this;
        }

        public Criteria andLrCognomeGreaterThan(String value) {
            addCriterion("lr_cognome >", value, "lrCognome");
            return (Criteria) this;
        }

        public Criteria andLrCognomeGreaterThanOrEqualTo(String value) {
            addCriterion("lr_cognome >=", value, "lrCognome");
            return (Criteria) this;
        }

        public Criteria andLrCognomeLessThan(String value) {
            addCriterion("lr_cognome <", value, "lrCognome");
            return (Criteria) this;
        }

        public Criteria andLrCognomeLessThanOrEqualTo(String value) {
            addCriterion("lr_cognome <=", value, "lrCognome");
            return (Criteria) this;
        }

        public Criteria andLrCognomeLike(String value) {
            addCriterion("lr_cognome like", value, "lrCognome");
            return (Criteria) this;
        }

        public Criteria andLrCognomeNotLike(String value) {
            addCriterion("lr_cognome not like", value, "lrCognome");
            return (Criteria) this;
        }

        public Criteria andLrCognomeIn(List<String> values) {
            addCriterion("lr_cognome in", values, "lrCognome");
            return (Criteria) this;
        }

        public Criteria andLrCognomeNotIn(List<String> values) {
            addCriterion("lr_cognome not in", values, "lrCognome");
            return (Criteria) this;
        }

        public Criteria andLrCognomeBetween(String value1, String value2) {
            addCriterion("lr_cognome between", value1, value2, "lrCognome");
            return (Criteria) this;
        }

        public Criteria andLrCognomeNotBetween(String value1, String value2) {
            addCriterion("lr_cognome not between", value1, value2, "lrCognome");
            return (Criteria) this;
        }

        public Criteria andLrNomeIsNull() {
            addCriterion("lr_nome is null");
            return (Criteria) this;
        }

        public Criteria andLrNomeIsNotNull() {
            addCriterion("lr_nome is not null");
            return (Criteria) this;
        }

        public Criteria andLrNomeEqualTo(String value) {
            addCriterion("lr_nome =", value, "lrNome");
            return (Criteria) this;
        }

        public Criteria andLrNomeNotEqualTo(String value) {
            addCriterion("lr_nome <>", value, "lrNome");
            return (Criteria) this;
        }

        public Criteria andLrNomeGreaterThan(String value) {
            addCriterion("lr_nome >", value, "lrNome");
            return (Criteria) this;
        }

        public Criteria andLrNomeGreaterThanOrEqualTo(String value) {
            addCriterion("lr_nome >=", value, "lrNome");
            return (Criteria) this;
        }

        public Criteria andLrNomeLessThan(String value) {
            addCriterion("lr_nome <", value, "lrNome");
            return (Criteria) this;
        }

        public Criteria andLrNomeLessThanOrEqualTo(String value) {
            addCriterion("lr_nome <=", value, "lrNome");
            return (Criteria) this;
        }

        public Criteria andLrNomeLike(String value) {
            addCriterion("lr_nome like", value, "lrNome");
            return (Criteria) this;
        }

        public Criteria andLrNomeNotLike(String value) {
            addCriterion("lr_nome not like", value, "lrNome");
            return (Criteria) this;
        }

        public Criteria andLrNomeIn(List<String> values) {
            addCriterion("lr_nome in", values, "lrNome");
            return (Criteria) this;
        }

        public Criteria andLrNomeNotIn(List<String> values) {
            addCriterion("lr_nome not in", values, "lrNome");
            return (Criteria) this;
        }

        public Criteria andLrNomeBetween(String value1, String value2) {
            addCriterion("lr_nome between", value1, value2, "lrNome");
            return (Criteria) this;
        }

        public Criteria andLrNomeNotBetween(String value1, String value2) {
            addCriterion("lr_nome not between", value1, value2, "lrNome");
            return (Criteria) this;
        }

        public Criteria andLrProvNascitaIsNull() {
            addCriterion("lr_prov_nascita is null");
            return (Criteria) this;
        }

        public Criteria andLrProvNascitaIsNotNull() {
            addCriterion("lr_prov_nascita is not null");
            return (Criteria) this;
        }

        public Criteria andLrProvNascitaEqualTo(String value) {
            addCriterion("lr_prov_nascita =", value, "lrProvNascita");
            return (Criteria) this;
        }

        public Criteria andLrProvNascitaNotEqualTo(String value) {
            addCriterion("lr_prov_nascita <>", value, "lrProvNascita");
            return (Criteria) this;
        }

        public Criteria andLrProvNascitaGreaterThan(String value) {
            addCriterion("lr_prov_nascita >", value, "lrProvNascita");
            return (Criteria) this;
        }

        public Criteria andLrProvNascitaGreaterThanOrEqualTo(String value) {
            addCriterion("lr_prov_nascita >=", value, "lrProvNascita");
            return (Criteria) this;
        }

        public Criteria andLrProvNascitaLessThan(String value) {
            addCriterion("lr_prov_nascita <", value, "lrProvNascita");
            return (Criteria) this;
        }

        public Criteria andLrProvNascitaLessThanOrEqualTo(String value) {
            addCriterion("lr_prov_nascita <=", value, "lrProvNascita");
            return (Criteria) this;
        }

        public Criteria andLrProvNascitaLike(String value) {
            addCriterion("lr_prov_nascita like", value, "lrProvNascita");
            return (Criteria) this;
        }

        public Criteria andLrProvNascitaNotLike(String value) {
            addCriterion("lr_prov_nascita not like", value, "lrProvNascita");
            return (Criteria) this;
        }

        public Criteria andLrProvNascitaIn(List<String> values) {
            addCriterion("lr_prov_nascita in", values, "lrProvNascita");
            return (Criteria) this;
        }

        public Criteria andLrProvNascitaNotIn(List<String> values) {
            addCriterion("lr_prov_nascita not in", values, "lrProvNascita");
            return (Criteria) this;
        }

        public Criteria andLrProvNascitaBetween(String value1, String value2) {
            addCriterion("lr_prov_nascita between", value1, value2, "lrProvNascita");
            return (Criteria) this;
        }

        public Criteria andLrProvNascitaNotBetween(String value1, String value2) {
            addCriterion("lr_prov_nascita not between", value1, value2, "lrProvNascita");
            return (Criteria) this;
        }

        public Criteria andLrComuneNascitaIsNull() {
            addCriterion("lr_comune_nascita is null");
            return (Criteria) this;
        }

        public Criteria andLrComuneNascitaIsNotNull() {
            addCriterion("lr_comune_nascita is not null");
            return (Criteria) this;
        }

        public Criteria andLrComuneNascitaEqualTo(String value) {
            addCriterion("lr_comune_nascita =", value, "lrComuneNascita");
            return (Criteria) this;
        }

        public Criteria andLrComuneNascitaNotEqualTo(String value) {
            addCriterion("lr_comune_nascita <>", value, "lrComuneNascita");
            return (Criteria) this;
        }

        public Criteria andLrComuneNascitaGreaterThan(String value) {
            addCriterion("lr_comune_nascita >", value, "lrComuneNascita");
            return (Criteria) this;
        }

        public Criteria andLrComuneNascitaGreaterThanOrEqualTo(String value) {
            addCriterion("lr_comune_nascita >=", value, "lrComuneNascita");
            return (Criteria) this;
        }

        public Criteria andLrComuneNascitaLessThan(String value) {
            addCriterion("lr_comune_nascita <", value, "lrComuneNascita");
            return (Criteria) this;
        }

        public Criteria andLrComuneNascitaLessThanOrEqualTo(String value) {
            addCriterion("lr_comune_nascita <=", value, "lrComuneNascita");
            return (Criteria) this;
        }

        public Criteria andLrComuneNascitaLike(String value) {
            addCriterion("lr_comune_nascita like", value, "lrComuneNascita");
            return (Criteria) this;
        }

        public Criteria andLrComuneNascitaNotLike(String value) {
            addCriterion("lr_comune_nascita not like", value, "lrComuneNascita");
            return (Criteria) this;
        }

        public Criteria andLrComuneNascitaIn(List<String> values) {
            addCriterion("lr_comune_nascita in", values, "lrComuneNascita");
            return (Criteria) this;
        }

        public Criteria andLrComuneNascitaNotIn(List<String> values) {
            addCriterion("lr_comune_nascita not in", values, "lrComuneNascita");
            return (Criteria) this;
        }

        public Criteria andLrComuneNascitaBetween(String value1, String value2) {
            addCriterion("lr_comune_nascita between", value1, value2, "lrComuneNascita");
            return (Criteria) this;
        }

        public Criteria andLrComuneNascitaNotBetween(String value1, String value2) {
            addCriterion("lr_comune_nascita not between", value1, value2, "lrComuneNascita");
            return (Criteria) this;
        }

        public Criteria andLrStatoEsteroNascitaIsNull() {
            addCriterion("lr_stato_estero_nascita is null");
            return (Criteria) this;
        }

        public Criteria andLrStatoEsteroNascitaIsNotNull() {
            addCriterion("lr_stato_estero_nascita is not null");
            return (Criteria) this;
        }

        public Criteria andLrStatoEsteroNascitaEqualTo(Short value) {
            addCriterion("lr_stato_estero_nascita =", value, "lrStatoEsteroNascita");
            return (Criteria) this;
        }

        public Criteria andLrStatoEsteroNascitaNotEqualTo(Short value) {
            addCriterion("lr_stato_estero_nascita <>", value, "lrStatoEsteroNascita");
            return (Criteria) this;
        }

        public Criteria andLrStatoEsteroNascitaGreaterThan(Short value) {
            addCriterion("lr_stato_estero_nascita >", value, "lrStatoEsteroNascita");
            return (Criteria) this;
        }

        public Criteria andLrStatoEsteroNascitaGreaterThanOrEqualTo(Short value) {
            addCriterion("lr_stato_estero_nascita >=", value, "lrStatoEsteroNascita");
            return (Criteria) this;
        }

        public Criteria andLrStatoEsteroNascitaLessThan(Short value) {
            addCriterion("lr_stato_estero_nascita <", value, "lrStatoEsteroNascita");
            return (Criteria) this;
        }

        public Criteria andLrStatoEsteroNascitaLessThanOrEqualTo(Short value) {
            addCriterion("lr_stato_estero_nascita <=", value, "lrStatoEsteroNascita");
            return (Criteria) this;
        }

        public Criteria andLrStatoEsteroNascitaIn(List<Short> values) {
            addCriterion("lr_stato_estero_nascita in", values, "lrStatoEsteroNascita");
            return (Criteria) this;
        }

        public Criteria andLrStatoEsteroNascitaNotIn(List<Short> values) {
            addCriterion("lr_stato_estero_nascita not in", values, "lrStatoEsteroNascita");
            return (Criteria) this;
        }

        public Criteria andLrStatoEsteroNascitaBetween(Short value1, Short value2) {
            addCriterion("lr_stato_estero_nascita between", value1, value2, "lrStatoEsteroNascita");
            return (Criteria) this;
        }

        public Criteria andLrStatoEsteroNascitaNotBetween(Short value1, Short value2) {
            addCriterion("lr_stato_estero_nascita not between", value1, value2, "lrStatoEsteroNascita");
            return (Criteria) this;
        }

        public Criteria andLrCittaEsteraNascitaIsNull() {
            addCriterion("lr_citta_estera_nascita is null");
            return (Criteria) this;
        }

        public Criteria andLrCittaEsteraNascitaIsNotNull() {
            addCriterion("lr_citta_estera_nascita is not null");
            return (Criteria) this;
        }

        public Criteria andLrCittaEsteraNascitaEqualTo(String value) {
            addCriterion("lr_citta_estera_nascita =", value, "lrCittaEsteraNascita");
            return (Criteria) this;
        }

        public Criteria andLrCittaEsteraNascitaNotEqualTo(String value) {
            addCriterion("lr_citta_estera_nascita <>", value, "lrCittaEsteraNascita");
            return (Criteria) this;
        }

        public Criteria andLrCittaEsteraNascitaGreaterThan(String value) {
            addCriterion("lr_citta_estera_nascita >", value, "lrCittaEsteraNascita");
            return (Criteria) this;
        }

        public Criteria andLrCittaEsteraNascitaGreaterThanOrEqualTo(String value) {
            addCriterion("lr_citta_estera_nascita >=", value, "lrCittaEsteraNascita");
            return (Criteria) this;
        }

        public Criteria andLrCittaEsteraNascitaLessThan(String value) {
            addCriterion("lr_citta_estera_nascita <", value, "lrCittaEsteraNascita");
            return (Criteria) this;
        }

        public Criteria andLrCittaEsteraNascitaLessThanOrEqualTo(String value) {
            addCriterion("lr_citta_estera_nascita <=", value, "lrCittaEsteraNascita");
            return (Criteria) this;
        }

        public Criteria andLrCittaEsteraNascitaLike(String value) {
            addCriterion("lr_citta_estera_nascita like", value, "lrCittaEsteraNascita");
            return (Criteria) this;
        }

        public Criteria andLrCittaEsteraNascitaNotLike(String value) {
            addCriterion("lr_citta_estera_nascita not like", value, "lrCittaEsteraNascita");
            return (Criteria) this;
        }

        public Criteria andLrCittaEsteraNascitaIn(List<String> values) {
            addCriterion("lr_citta_estera_nascita in", values, "lrCittaEsteraNascita");
            return (Criteria) this;
        }

        public Criteria andLrCittaEsteraNascitaNotIn(List<String> values) {
            addCriterion("lr_citta_estera_nascita not in", values, "lrCittaEsteraNascita");
            return (Criteria) this;
        }

        public Criteria andLrCittaEsteraNascitaBetween(String value1, String value2) {
            addCriterion("lr_citta_estera_nascita between", value1, value2, "lrCittaEsteraNascita");
            return (Criteria) this;
        }

        public Criteria andLrCittaEsteraNascitaNotBetween(String value1, String value2) {
            addCriterion("lr_citta_estera_nascita not between", value1, value2, "lrCittaEsteraNascita");
            return (Criteria) this;
        }

        public Criteria andLrDataNascitaIsNull() {
            addCriterion("lr_data_nascita is null");
            return (Criteria) this;
        }

        public Criteria andLrDataNascitaIsNotNull() {
            addCriterion("lr_data_nascita is not null");
            return (Criteria) this;
        }

        public Criteria andLrDataNascitaEqualTo(Date value) {
            addCriterionForJDBCDate("lr_data_nascita =", value, "lrDataNascita");
            return (Criteria) this;
        }

        public Criteria andLrDataNascitaNotEqualTo(Date value) {
            addCriterionForJDBCDate("lr_data_nascita <>", value, "lrDataNascita");
            return (Criteria) this;
        }

        public Criteria andLrDataNascitaGreaterThan(Date value) {
            addCriterionForJDBCDate("lr_data_nascita >", value, "lrDataNascita");
            return (Criteria) this;
        }

        public Criteria andLrDataNascitaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lr_data_nascita >=", value, "lrDataNascita");
            return (Criteria) this;
        }

        public Criteria andLrDataNascitaLessThan(Date value) {
            addCriterionForJDBCDate("lr_data_nascita <", value, "lrDataNascita");
            return (Criteria) this;
        }

        public Criteria andLrDataNascitaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lr_data_nascita <=", value, "lrDataNascita");
            return (Criteria) this;
        }

        public Criteria andLrDataNascitaIn(List<Date> values) {
            addCriterionForJDBCDate("lr_data_nascita in", values, "lrDataNascita");
            return (Criteria) this;
        }

        public Criteria andLrDataNascitaNotIn(List<Date> values) {
            addCriterionForJDBCDate("lr_data_nascita not in", values, "lrDataNascita");
            return (Criteria) this;
        }

        public Criteria andLrDataNascitaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lr_data_nascita between", value1, value2, "lrDataNascita");
            return (Criteria) this;
        }

        public Criteria andLrDataNascitaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lr_data_nascita not between", value1, value2, "lrDataNascita");
            return (Criteria) this;
        }

        public Criteria andLrNumTelefonoIsNull() {
            addCriterion("lr_num_telefono is null");
            return (Criteria) this;
        }

        public Criteria andLrNumTelefonoIsNotNull() {
            addCriterion("lr_num_telefono is not null");
            return (Criteria) this;
        }

        public Criteria andLrNumTelefonoEqualTo(String value) {
            addCriterion("lr_num_telefono =", value, "lrNumTelefono");
            return (Criteria) this;
        }

        public Criteria andLrNumTelefonoNotEqualTo(String value) {
            addCriterion("lr_num_telefono <>", value, "lrNumTelefono");
            return (Criteria) this;
        }

        public Criteria andLrNumTelefonoGreaterThan(String value) {
            addCriterion("lr_num_telefono >", value, "lrNumTelefono");
            return (Criteria) this;
        }

        public Criteria andLrNumTelefonoGreaterThanOrEqualTo(String value) {
            addCriterion("lr_num_telefono >=", value, "lrNumTelefono");
            return (Criteria) this;
        }

        public Criteria andLrNumTelefonoLessThan(String value) {
            addCriterion("lr_num_telefono <", value, "lrNumTelefono");
            return (Criteria) this;
        }

        public Criteria andLrNumTelefonoLessThanOrEqualTo(String value) {
            addCriterion("lr_num_telefono <=", value, "lrNumTelefono");
            return (Criteria) this;
        }

        public Criteria andLrNumTelefonoLike(String value) {
            addCriterion("lr_num_telefono like", value, "lrNumTelefono");
            return (Criteria) this;
        }

        public Criteria andLrNumTelefonoNotLike(String value) {
            addCriterion("lr_num_telefono not like", value, "lrNumTelefono");
            return (Criteria) this;
        }

        public Criteria andLrNumTelefonoIn(List<String> values) {
            addCriterion("lr_num_telefono in", values, "lrNumTelefono");
            return (Criteria) this;
        }

        public Criteria andLrNumTelefonoNotIn(List<String> values) {
            addCriterion("lr_num_telefono not in", values, "lrNumTelefono");
            return (Criteria) this;
        }

        public Criteria andLrNumTelefonoBetween(String value1, String value2) {
            addCriterion("lr_num_telefono between", value1, value2, "lrNumTelefono");
            return (Criteria) this;
        }

        public Criteria andLrNumTelefonoNotBetween(String value1, String value2) {
            addCriterion("lr_num_telefono not between", value1, value2, "lrNumTelefono");
            return (Criteria) this;
        }

        public Criteria andLrEmailIsNull() {
            addCriterion("lr_email is null");
            return (Criteria) this;
        }

        public Criteria andLrEmailIsNotNull() {
            addCriterion("lr_email is not null");
            return (Criteria) this;
        }

        public Criteria andLrEmailEqualTo(String value) {
            addCriterion("lr_email =", value, "lrEmail");
            return (Criteria) this;
        }

        public Criteria andLrEmailNotEqualTo(String value) {
            addCriterion("lr_email <>", value, "lrEmail");
            return (Criteria) this;
        }

        public Criteria andLrEmailGreaterThan(String value) {
            addCriterion("lr_email >", value, "lrEmail");
            return (Criteria) this;
        }

        public Criteria andLrEmailGreaterThanOrEqualTo(String value) {
            addCriterion("lr_email >=", value, "lrEmail");
            return (Criteria) this;
        }

        public Criteria andLrEmailLessThan(String value) {
            addCriterion("lr_email <", value, "lrEmail");
            return (Criteria) this;
        }

        public Criteria andLrEmailLessThanOrEqualTo(String value) {
            addCriterion("lr_email <=", value, "lrEmail");
            return (Criteria) this;
        }

        public Criteria andLrEmailLike(String value) {
            addCriterion("lr_email like", value, "lrEmail");
            return (Criteria) this;
        }

        public Criteria andLrEmailNotLike(String value) {
            addCriterion("lr_email not like", value, "lrEmail");
            return (Criteria) this;
        }

        public Criteria andLrEmailIn(List<String> values) {
            addCriterion("lr_email in", values, "lrEmail");
            return (Criteria) this;
        }

        public Criteria andLrEmailNotIn(List<String> values) {
            addCriterion("lr_email not in", values, "lrEmail");
            return (Criteria) this;
        }

        public Criteria andLrEmailBetween(String value1, String value2) {
            addCriterion("lr_email between", value1, value2, "lrEmail");
            return (Criteria) this;
        }

        public Criteria andLrEmailNotBetween(String value1, String value2) {
            addCriterion("lr_email not between", value1, value2, "lrEmail");
            return (Criteria) this;
        }

        public Criteria andOpIpAddressIsNull() {
            addCriterion("op_ip_address is null");
            return (Criteria) this;
        }

        public Criteria andOpIpAddressIsNotNull() {
            addCriterion("op_ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andOpIpAddressEqualTo(String value) {
            addCriterion("op_ip_address =", value, "opIpAddress");
            return (Criteria) this;
        }

        public Criteria andOpIpAddressNotEqualTo(String value) {
            addCriterion("op_ip_address <>", value, "opIpAddress");
            return (Criteria) this;
        }

        public Criteria andOpIpAddressGreaterThan(String value) {
            addCriterion("op_ip_address >", value, "opIpAddress");
            return (Criteria) this;
        }

        public Criteria andOpIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("op_ip_address >=", value, "opIpAddress");
            return (Criteria) this;
        }

        public Criteria andOpIpAddressLessThan(String value) {
            addCriterion("op_ip_address <", value, "opIpAddress");
            return (Criteria) this;
        }

        public Criteria andOpIpAddressLessThanOrEqualTo(String value) {
            addCriterion("op_ip_address <=", value, "opIpAddress");
            return (Criteria) this;
        }

        public Criteria andOpIpAddressLike(String value) {
            addCriterion("op_ip_address like", value, "opIpAddress");
            return (Criteria) this;
        }

        public Criteria andOpIpAddressNotLike(String value) {
            addCriterion("op_ip_address not like", value, "opIpAddress");
            return (Criteria) this;
        }

        public Criteria andOpIpAddressIn(List<String> values) {
            addCriterion("op_ip_address in", values, "opIpAddress");
            return (Criteria) this;
        }

        public Criteria andOpIpAddressNotIn(List<String> values) {
            addCriterion("op_ip_address not in", values, "opIpAddress");
            return (Criteria) this;
        }

        public Criteria andOpIpAddressBetween(String value1, String value2) {
            addCriterion("op_ip_address between", value1, value2, "opIpAddress");
            return (Criteria) this;
        }

        public Criteria andOpIpAddressNotBetween(String value1, String value2) {
            addCriterion("op_ip_address not between", value1, value2, "opIpAddress");
            return (Criteria) this;
        }

        public Criteria andOpCodiceIsNull() {
            addCriterion("op_codice is null");
            return (Criteria) this;
        }

        public Criteria andOpCodiceIsNotNull() {
            addCriterion("op_codice is not null");
            return (Criteria) this;
        }

        public Criteria andOpCodiceEqualTo(Integer value) {
            addCriterion("op_codice =", value, "opCodice");
            return (Criteria) this;
        }

        public Criteria andOpCodiceNotEqualTo(Integer value) {
            addCriterion("op_codice <>", value, "opCodice");
            return (Criteria) this;
        }

        public Criteria andOpCodiceGreaterThan(Integer value) {
            addCriterion("op_codice >", value, "opCodice");
            return (Criteria) this;
        }

        public Criteria andOpCodiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_codice >=", value, "opCodice");
            return (Criteria) this;
        }

        public Criteria andOpCodiceLessThan(Integer value) {
            addCriterion("op_codice <", value, "opCodice");
            return (Criteria) this;
        }

        public Criteria andOpCodiceLessThanOrEqualTo(Integer value) {
            addCriterion("op_codice <=", value, "opCodice");
            return (Criteria) this;
        }

        public Criteria andOpCodiceIn(List<Integer> values) {
            addCriterion("op_codice in", values, "opCodice");
            return (Criteria) this;
        }

        public Criteria andOpCodiceNotIn(List<Integer> values) {
            addCriterion("op_codice not in", values, "opCodice");
            return (Criteria) this;
        }

        public Criteria andOpCodiceBetween(Integer value1, Integer value2) {
            addCriterion("op_codice between", value1, value2, "opCodice");
            return (Criteria) this;
        }

        public Criteria andOpCodiceNotBetween(Integer value1, Integer value2) {
            addCriterion("op_codice not between", value1, value2, "opCodice");
            return (Criteria) this;
        }

        public Criteria andOpDenominazioneIsNull() {
            addCriterion("op_denominazione is null");
            return (Criteria) this;
        }

        public Criteria andOpDenominazioneIsNotNull() {
            addCriterion("op_denominazione is not null");
            return (Criteria) this;
        }

        public Criteria andOpDenominazioneEqualTo(String value) {
            addCriterion("op_denominazione =", value, "opDenominazione");
            return (Criteria) this;
        }

        public Criteria andOpDenominazioneNotEqualTo(String value) {
            addCriterion("op_denominazione <>", value, "opDenominazione");
            return (Criteria) this;
        }

        public Criteria andOpDenominazioneGreaterThan(String value) {
            addCriterion("op_denominazione >", value, "opDenominazione");
            return (Criteria) this;
        }

        public Criteria andOpDenominazioneGreaterThanOrEqualTo(String value) {
            addCriterion("op_denominazione >=", value, "opDenominazione");
            return (Criteria) this;
        }

        public Criteria andOpDenominazioneLessThan(String value) {
            addCriterion("op_denominazione <", value, "opDenominazione");
            return (Criteria) this;
        }

        public Criteria andOpDenominazioneLessThanOrEqualTo(String value) {
            addCriterion("op_denominazione <=", value, "opDenominazione");
            return (Criteria) this;
        }

        public Criteria andOpDenominazioneLike(String value) {
            addCriterion("op_denominazione like", value, "opDenominazione");
            return (Criteria) this;
        }

        public Criteria andOpDenominazioneNotLike(String value) {
            addCriterion("op_denominazione not like", value, "opDenominazione");
            return (Criteria) this;
        }

        public Criteria andOpDenominazioneIn(List<String> values) {
            addCriterion("op_denominazione in", values, "opDenominazione");
            return (Criteria) this;
        }

        public Criteria andOpDenominazioneNotIn(List<String> values) {
            addCriterion("op_denominazione not in", values, "opDenominazione");
            return (Criteria) this;
        }

        public Criteria andOpDenominazioneBetween(String value1, String value2) {
            addCriterion("op_denominazione between", value1, value2, "opDenominazione");
            return (Criteria) this;
        }

        public Criteria andOpDenominazioneNotBetween(String value1, String value2) {
            addCriterion("op_denominazione not between", value1, value2, "opDenominazione");
            return (Criteria) this;
        }

        public Criteria andOpCodFiscaleIsNull() {
            addCriterion("op_cod_fiscale is null");
            return (Criteria) this;
        }

        public Criteria andOpCodFiscaleIsNotNull() {
            addCriterion("op_cod_fiscale is not null");
            return (Criteria) this;
        }

        public Criteria andOpCodFiscaleEqualTo(String value) {
            addCriterion("op_cod_fiscale =", value, "opCodFiscale");
            return (Criteria) this;
        }

        public Criteria andOpCodFiscaleNotEqualTo(String value) {
            addCriterion("op_cod_fiscale <>", value, "opCodFiscale");
            return (Criteria) this;
        }

        public Criteria andOpCodFiscaleGreaterThan(String value) {
            addCriterion("op_cod_fiscale >", value, "opCodFiscale");
            return (Criteria) this;
        }

        public Criteria andOpCodFiscaleGreaterThanOrEqualTo(String value) {
            addCriterion("op_cod_fiscale >=", value, "opCodFiscale");
            return (Criteria) this;
        }

        public Criteria andOpCodFiscaleLessThan(String value) {
            addCriterion("op_cod_fiscale <", value, "opCodFiscale");
            return (Criteria) this;
        }

        public Criteria andOpCodFiscaleLessThanOrEqualTo(String value) {
            addCriterion("op_cod_fiscale <=", value, "opCodFiscale");
            return (Criteria) this;
        }

        public Criteria andOpCodFiscaleLike(String value) {
            addCriterion("op_cod_fiscale like", value, "opCodFiscale");
            return (Criteria) this;
        }

        public Criteria andOpCodFiscaleNotLike(String value) {
            addCriterion("op_cod_fiscale not like", value, "opCodFiscale");
            return (Criteria) this;
        }

        public Criteria andOpCodFiscaleIn(List<String> values) {
            addCriterion("op_cod_fiscale in", values, "opCodFiscale");
            return (Criteria) this;
        }

        public Criteria andOpCodFiscaleNotIn(List<String> values) {
            addCriterion("op_cod_fiscale not in", values, "opCodFiscale");
            return (Criteria) this;
        }

        public Criteria andOpCodFiscaleBetween(String value1, String value2) {
            addCriterion("op_cod_fiscale between", value1, value2, "opCodFiscale");
            return (Criteria) this;
        }

        public Criteria andOpCodFiscaleNotBetween(String value1, String value2) {
            addCriterion("op_cod_fiscale not between", value1, value2, "opCodFiscale");
            return (Criteria) this;
        }

        public Criteria andOpPartitaIvaIsNull() {
            addCriterion("op_partita_iva is null");
            return (Criteria) this;
        }

        public Criteria andOpPartitaIvaIsNotNull() {
            addCriterion("op_partita_iva is not null");
            return (Criteria) this;
        }

        public Criteria andOpPartitaIvaEqualTo(String value) {
            addCriterion("op_partita_iva =", value, "opPartitaIva");
            return (Criteria) this;
        }

        public Criteria andOpPartitaIvaNotEqualTo(String value) {
            addCriterion("op_partita_iva <>", value, "opPartitaIva");
            return (Criteria) this;
        }

        public Criteria andOpPartitaIvaGreaterThan(String value) {
            addCriterion("op_partita_iva >", value, "opPartitaIva");
            return (Criteria) this;
        }

        public Criteria andOpPartitaIvaGreaterThanOrEqualTo(String value) {
            addCriterion("op_partita_iva >=", value, "opPartitaIva");
            return (Criteria) this;
        }

        public Criteria andOpPartitaIvaLessThan(String value) {
            addCriterion("op_partita_iva <", value, "opPartitaIva");
            return (Criteria) this;
        }

        public Criteria andOpPartitaIvaLessThanOrEqualTo(String value) {
            addCriterion("op_partita_iva <=", value, "opPartitaIva");
            return (Criteria) this;
        }

        public Criteria andOpPartitaIvaLike(String value) {
            addCriterion("op_partita_iva like", value, "opPartitaIva");
            return (Criteria) this;
        }

        public Criteria andOpPartitaIvaNotLike(String value) {
            addCriterion("op_partita_iva not like", value, "opPartitaIva");
            return (Criteria) this;
        }

        public Criteria andOpPartitaIvaIn(List<String> values) {
            addCriterion("op_partita_iva in", values, "opPartitaIva");
            return (Criteria) this;
        }

        public Criteria andOpPartitaIvaNotIn(List<String> values) {
            addCriterion("op_partita_iva not in", values, "opPartitaIva");
            return (Criteria) this;
        }

        public Criteria andOpPartitaIvaBetween(String value1, String value2) {
            addCriterion("op_partita_iva between", value1, value2, "opPartitaIva");
            return (Criteria) this;
        }

        public Criteria andOpPartitaIvaNotBetween(String value1, String value2) {
            addCriterion("op_partita_iva not between", value1, value2, "opPartitaIva");
            return (Criteria) this;
        }

        public Criteria andOpSedeProvinciaIsNull() {
            addCriterion("op_sede_provincia is null");
            return (Criteria) this;
        }

        public Criteria andOpSedeProvinciaIsNotNull() {
            addCriterion("op_sede_provincia is not null");
            return (Criteria) this;
        }

        public Criteria andOpSedeProvinciaEqualTo(String value) {
            addCriterion("op_sede_provincia =", value, "opSedeProvincia");
            return (Criteria) this;
        }

        public Criteria andOpSedeProvinciaNotEqualTo(String value) {
            addCriterion("op_sede_provincia <>", value, "opSedeProvincia");
            return (Criteria) this;
        }

        public Criteria andOpSedeProvinciaGreaterThan(String value) {
            addCriterion("op_sede_provincia >", value, "opSedeProvincia");
            return (Criteria) this;
        }

        public Criteria andOpSedeProvinciaGreaterThanOrEqualTo(String value) {
            addCriterion("op_sede_provincia >=", value, "opSedeProvincia");
            return (Criteria) this;
        }

        public Criteria andOpSedeProvinciaLessThan(String value) {
            addCriterion("op_sede_provincia <", value, "opSedeProvincia");
            return (Criteria) this;
        }

        public Criteria andOpSedeProvinciaLessThanOrEqualTo(String value) {
            addCriterion("op_sede_provincia <=", value, "opSedeProvincia");
            return (Criteria) this;
        }

        public Criteria andOpSedeProvinciaLike(String value) {
            addCriterion("op_sede_provincia like", value, "opSedeProvincia");
            return (Criteria) this;
        }

        public Criteria andOpSedeProvinciaNotLike(String value) {
            addCriterion("op_sede_provincia not like", value, "opSedeProvincia");
            return (Criteria) this;
        }

        public Criteria andOpSedeProvinciaIn(List<String> values) {
            addCriterion("op_sede_provincia in", values, "opSedeProvincia");
            return (Criteria) this;
        }

        public Criteria andOpSedeProvinciaNotIn(List<String> values) {
            addCriterion("op_sede_provincia not in", values, "opSedeProvincia");
            return (Criteria) this;
        }

        public Criteria andOpSedeProvinciaBetween(String value1, String value2) {
            addCriterion("op_sede_provincia between", value1, value2, "opSedeProvincia");
            return (Criteria) this;
        }

        public Criteria andOpSedeProvinciaNotBetween(String value1, String value2) {
            addCriterion("op_sede_provincia not between", value1, value2, "opSedeProvincia");
            return (Criteria) this;
        }

        public Criteria andOpSedeComuneIsNull() {
            addCriterion("op_sede_comune is null");
            return (Criteria) this;
        }

        public Criteria andOpSedeComuneIsNotNull() {
            addCriterion("op_sede_comune is not null");
            return (Criteria) this;
        }

        public Criteria andOpSedeComuneEqualTo(String value) {
            addCriterion("op_sede_comune =", value, "opSedeComune");
            return (Criteria) this;
        }

        public Criteria andOpSedeComuneNotEqualTo(String value) {
            addCriterion("op_sede_comune <>", value, "opSedeComune");
            return (Criteria) this;
        }

        public Criteria andOpSedeComuneGreaterThan(String value) {
            addCriterion("op_sede_comune >", value, "opSedeComune");
            return (Criteria) this;
        }

        public Criteria andOpSedeComuneGreaterThanOrEqualTo(String value) {
            addCriterion("op_sede_comune >=", value, "opSedeComune");
            return (Criteria) this;
        }

        public Criteria andOpSedeComuneLessThan(String value) {
            addCriterion("op_sede_comune <", value, "opSedeComune");
            return (Criteria) this;
        }

        public Criteria andOpSedeComuneLessThanOrEqualTo(String value) {
            addCriterion("op_sede_comune <=", value, "opSedeComune");
            return (Criteria) this;
        }

        public Criteria andOpSedeComuneLike(String value) {
            addCriterion("op_sede_comune like", value, "opSedeComune");
            return (Criteria) this;
        }

        public Criteria andOpSedeComuneNotLike(String value) {
            addCriterion("op_sede_comune not like", value, "opSedeComune");
            return (Criteria) this;
        }

        public Criteria andOpSedeComuneIn(List<String> values) {
            addCriterion("op_sede_comune in", values, "opSedeComune");
            return (Criteria) this;
        }

        public Criteria andOpSedeComuneNotIn(List<String> values) {
            addCriterion("op_sede_comune not in", values, "opSedeComune");
            return (Criteria) this;
        }

        public Criteria andOpSedeComuneBetween(String value1, String value2) {
            addCriterion("op_sede_comune between", value1, value2, "opSedeComune");
            return (Criteria) this;
        }

        public Criteria andOpSedeComuneNotBetween(String value1, String value2) {
            addCriterion("op_sede_comune not between", value1, value2, "opSedeComune");
            return (Criteria) this;
        }

        public Criteria andOpSedeIndirizzoIsNull() {
            addCriterion("op_sede_indirizzo is null");
            return (Criteria) this;
        }

        public Criteria andOpSedeIndirizzoIsNotNull() {
            addCriterion("op_sede_indirizzo is not null");
            return (Criteria) this;
        }

        public Criteria andOpSedeIndirizzoEqualTo(String value) {
            addCriterion("op_sede_indirizzo =", value, "opSedeIndirizzo");
            return (Criteria) this;
        }

        public Criteria andOpSedeIndirizzoNotEqualTo(String value) {
            addCriterion("op_sede_indirizzo <>", value, "opSedeIndirizzo");
            return (Criteria) this;
        }

        public Criteria andOpSedeIndirizzoGreaterThan(String value) {
            addCriterion("op_sede_indirizzo >", value, "opSedeIndirizzo");
            return (Criteria) this;
        }

        public Criteria andOpSedeIndirizzoGreaterThanOrEqualTo(String value) {
            addCriterion("op_sede_indirizzo >=", value, "opSedeIndirizzo");
            return (Criteria) this;
        }

        public Criteria andOpSedeIndirizzoLessThan(String value) {
            addCriterion("op_sede_indirizzo <", value, "opSedeIndirizzo");
            return (Criteria) this;
        }

        public Criteria andOpSedeIndirizzoLessThanOrEqualTo(String value) {
            addCriterion("op_sede_indirizzo <=", value, "opSedeIndirizzo");
            return (Criteria) this;
        }

        public Criteria andOpSedeIndirizzoLike(String value) {
            addCriterion("op_sede_indirizzo like", value, "opSedeIndirizzo");
            return (Criteria) this;
        }

        public Criteria andOpSedeIndirizzoNotLike(String value) {
            addCriterion("op_sede_indirizzo not like", value, "opSedeIndirizzo");
            return (Criteria) this;
        }

        public Criteria andOpSedeIndirizzoIn(List<String> values) {
            addCriterion("op_sede_indirizzo in", values, "opSedeIndirizzo");
            return (Criteria) this;
        }

        public Criteria andOpSedeIndirizzoNotIn(List<String> values) {
            addCriterion("op_sede_indirizzo not in", values, "opSedeIndirizzo");
            return (Criteria) this;
        }

        public Criteria andOpSedeIndirizzoBetween(String value1, String value2) {
            addCriterion("op_sede_indirizzo between", value1, value2, "opSedeIndirizzo");
            return (Criteria) this;
        }

        public Criteria andOpSedeIndirizzoNotBetween(String value1, String value2) {
            addCriterion("op_sede_indirizzo not between", value1, value2, "opSedeIndirizzo");
            return (Criteria) this;
        }

        public Criteria andOpSedeCapIsNull() {
            addCriterion("op_sede_cap is null");
            return (Criteria) this;
        }

        public Criteria andOpSedeCapIsNotNull() {
            addCriterion("op_sede_cap is not null");
            return (Criteria) this;
        }

        public Criteria andOpSedeCapEqualTo(String value) {
            addCriterion("op_sede_cap =", value, "opSedeCap");
            return (Criteria) this;
        }

        public Criteria andOpSedeCapNotEqualTo(String value) {
            addCriterion("op_sede_cap <>", value, "opSedeCap");
            return (Criteria) this;
        }

        public Criteria andOpSedeCapGreaterThan(String value) {
            addCriterion("op_sede_cap >", value, "opSedeCap");
            return (Criteria) this;
        }

        public Criteria andOpSedeCapGreaterThanOrEqualTo(String value) {
            addCriterion("op_sede_cap >=", value, "opSedeCap");
            return (Criteria) this;
        }

        public Criteria andOpSedeCapLessThan(String value) {
            addCriterion("op_sede_cap <", value, "opSedeCap");
            return (Criteria) this;
        }

        public Criteria andOpSedeCapLessThanOrEqualTo(String value) {
            addCriterion("op_sede_cap <=", value, "opSedeCap");
            return (Criteria) this;
        }

        public Criteria andOpSedeCapLike(String value) {
            addCriterion("op_sede_cap like", value, "opSedeCap");
            return (Criteria) this;
        }

        public Criteria andOpSedeCapNotLike(String value) {
            addCriterion("op_sede_cap not like", value, "opSedeCap");
            return (Criteria) this;
        }

        public Criteria andOpSedeCapIn(List<String> values) {
            addCriterion("op_sede_cap in", values, "opSedeCap");
            return (Criteria) this;
        }

        public Criteria andOpSedeCapNotIn(List<String> values) {
            addCriterion("op_sede_cap not in", values, "opSedeCap");
            return (Criteria) this;
        }

        public Criteria andOpSedeCapBetween(String value1, String value2) {
            addCriterion("op_sede_cap between", value1, value2, "opSedeCap");
            return (Criteria) this;
        }

        public Criteria andOpSedeCapNotBetween(String value1, String value2) {
            addCriterion("op_sede_cap not between", value1, value2, "opSedeCap");
            return (Criteria) this;
        }

        public Criteria andOpSedeStatoEsteroIsNull() {
            addCriterion("op_sede_stato_estero is null");
            return (Criteria) this;
        }

        public Criteria andOpSedeStatoEsteroIsNotNull() {
            addCriterion("op_sede_stato_estero is not null");
            return (Criteria) this;
        }

        public Criteria andOpSedeStatoEsteroEqualTo(Short value) {
            addCriterion("op_sede_stato_estero =", value, "opSedeStatoEstero");
            return (Criteria) this;
        }

        public Criteria andOpSedeStatoEsteroNotEqualTo(Short value) {
            addCriterion("op_sede_stato_estero <>", value, "opSedeStatoEstero");
            return (Criteria) this;
        }

        public Criteria andOpSedeStatoEsteroGreaterThan(Short value) {
            addCriterion("op_sede_stato_estero >", value, "opSedeStatoEstero");
            return (Criteria) this;
        }

        public Criteria andOpSedeStatoEsteroGreaterThanOrEqualTo(Short value) {
            addCriterion("op_sede_stato_estero >=", value, "opSedeStatoEstero");
            return (Criteria) this;
        }

        public Criteria andOpSedeStatoEsteroLessThan(Short value) {
            addCriterion("op_sede_stato_estero <", value, "opSedeStatoEstero");
            return (Criteria) this;
        }

        public Criteria andOpSedeStatoEsteroLessThanOrEqualTo(Short value) {
            addCriterion("op_sede_stato_estero <=", value, "opSedeStatoEstero");
            return (Criteria) this;
        }

        public Criteria andOpSedeStatoEsteroIn(List<Short> values) {
            addCriterion("op_sede_stato_estero in", values, "opSedeStatoEstero");
            return (Criteria) this;
        }

        public Criteria andOpSedeStatoEsteroNotIn(List<Short> values) {
            addCriterion("op_sede_stato_estero not in", values, "opSedeStatoEstero");
            return (Criteria) this;
        }

        public Criteria andOpSedeStatoEsteroBetween(Short value1, Short value2) {
            addCriterion("op_sede_stato_estero between", value1, value2, "opSedeStatoEstero");
            return (Criteria) this;
        }

        public Criteria andOpSedeStatoEsteroNotBetween(Short value1, Short value2) {
            addCriterion("op_sede_stato_estero not between", value1, value2, "opSedeStatoEstero");
            return (Criteria) this;
        }

        public Criteria andOpSedeLocalitaEsteraIsNull() {
            addCriterion("op_sede_localita_estera is null");
            return (Criteria) this;
        }

        public Criteria andOpSedeLocalitaEsteraIsNotNull() {
            addCriterion("op_sede_localita_estera is not null");
            return (Criteria) this;
        }

        public Criteria andOpSedeLocalitaEsteraEqualTo(String value) {
            addCriterion("op_sede_localita_estera =", value, "opSedeLocalitaEstera");
            return (Criteria) this;
        }

        public Criteria andOpSedeLocalitaEsteraNotEqualTo(String value) {
            addCriterion("op_sede_localita_estera <>", value, "opSedeLocalitaEstera");
            return (Criteria) this;
        }

        public Criteria andOpSedeLocalitaEsteraGreaterThan(String value) {
            addCriterion("op_sede_localita_estera >", value, "opSedeLocalitaEstera");
            return (Criteria) this;
        }

        public Criteria andOpSedeLocalitaEsteraGreaterThanOrEqualTo(String value) {
            addCriterion("op_sede_localita_estera >=", value, "opSedeLocalitaEstera");
            return (Criteria) this;
        }

        public Criteria andOpSedeLocalitaEsteraLessThan(String value) {
            addCriterion("op_sede_localita_estera <", value, "opSedeLocalitaEstera");
            return (Criteria) this;
        }

        public Criteria andOpSedeLocalitaEsteraLessThanOrEqualTo(String value) {
            addCriterion("op_sede_localita_estera <=", value, "opSedeLocalitaEstera");
            return (Criteria) this;
        }

        public Criteria andOpSedeLocalitaEsteraLike(String value) {
            addCriterion("op_sede_localita_estera like", value, "opSedeLocalitaEstera");
            return (Criteria) this;
        }

        public Criteria andOpSedeLocalitaEsteraNotLike(String value) {
            addCriterion("op_sede_localita_estera not like", value, "opSedeLocalitaEstera");
            return (Criteria) this;
        }

        public Criteria andOpSedeLocalitaEsteraIn(List<String> values) {
            addCriterion("op_sede_localita_estera in", values, "opSedeLocalitaEstera");
            return (Criteria) this;
        }

        public Criteria andOpSedeLocalitaEsteraNotIn(List<String> values) {
            addCriterion("op_sede_localita_estera not in", values, "opSedeLocalitaEstera");
            return (Criteria) this;
        }

        public Criteria andOpSedeLocalitaEsteraBetween(String value1, String value2) {
            addCriterion("op_sede_localita_estera between", value1, value2, "opSedeLocalitaEstera");
            return (Criteria) this;
        }

        public Criteria andOpSedeLocalitaEsteraNotBetween(String value1, String value2) {
            addCriterion("op_sede_localita_estera not between", value1, value2, "opSedeLocalitaEstera");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono1IsNull() {
            addCriterion("op_sede_telefono_1 is null");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono1IsNotNull() {
            addCriterion("op_sede_telefono_1 is not null");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono1EqualTo(String value) {
            addCriterion("op_sede_telefono_1 =", value, "opSedeTelefono1");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono1NotEqualTo(String value) {
            addCriterion("op_sede_telefono_1 <>", value, "opSedeTelefono1");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono1GreaterThan(String value) {
            addCriterion("op_sede_telefono_1 >", value, "opSedeTelefono1");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono1GreaterThanOrEqualTo(String value) {
            addCriterion("op_sede_telefono_1 >=", value, "opSedeTelefono1");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono1LessThan(String value) {
            addCriterion("op_sede_telefono_1 <", value, "opSedeTelefono1");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono1LessThanOrEqualTo(String value) {
            addCriterion("op_sede_telefono_1 <=", value, "opSedeTelefono1");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono1Like(String value) {
            addCriterion("op_sede_telefono_1 like", value, "opSedeTelefono1");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono1NotLike(String value) {
            addCriterion("op_sede_telefono_1 not like", value, "opSedeTelefono1");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono1In(List<String> values) {
            addCriterion("op_sede_telefono_1 in", values, "opSedeTelefono1");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono1NotIn(List<String> values) {
            addCriterion("op_sede_telefono_1 not in", values, "opSedeTelefono1");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono1Between(String value1, String value2) {
            addCriterion("op_sede_telefono_1 between", value1, value2, "opSedeTelefono1");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono1NotBetween(String value1, String value2) {
            addCriterion("op_sede_telefono_1 not between", value1, value2, "opSedeTelefono1");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono2IsNull() {
            addCriterion("op_sede_telefono_2 is null");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono2IsNotNull() {
            addCriterion("op_sede_telefono_2 is not null");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono2EqualTo(String value) {
            addCriterion("op_sede_telefono_2 =", value, "opSedeTelefono2");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono2NotEqualTo(String value) {
            addCriterion("op_sede_telefono_2 <>", value, "opSedeTelefono2");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono2GreaterThan(String value) {
            addCriterion("op_sede_telefono_2 >", value, "opSedeTelefono2");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono2GreaterThanOrEqualTo(String value) {
            addCriterion("op_sede_telefono_2 >=", value, "opSedeTelefono2");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono2LessThan(String value) {
            addCriterion("op_sede_telefono_2 <", value, "opSedeTelefono2");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono2LessThanOrEqualTo(String value) {
            addCriterion("op_sede_telefono_2 <=", value, "opSedeTelefono2");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono2Like(String value) {
            addCriterion("op_sede_telefono_2 like", value, "opSedeTelefono2");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono2NotLike(String value) {
            addCriterion("op_sede_telefono_2 not like", value, "opSedeTelefono2");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono2In(List<String> values) {
            addCriterion("op_sede_telefono_2 in", values, "opSedeTelefono2");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono2NotIn(List<String> values) {
            addCriterion("op_sede_telefono_2 not in", values, "opSedeTelefono2");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono2Between(String value1, String value2) {
            addCriterion("op_sede_telefono_2 between", value1, value2, "opSedeTelefono2");
            return (Criteria) this;
        }

        public Criteria andOpSedeTelefono2NotBetween(String value1, String value2) {
            addCriterion("op_sede_telefono_2 not between", value1, value2, "opSedeTelefono2");
            return (Criteria) this;
        }

        public Criteria andOpSedeFaxIsNull() {
            addCriterion("op_sede_fax is null");
            return (Criteria) this;
        }

        public Criteria andOpSedeFaxIsNotNull() {
            addCriterion("op_sede_fax is not null");
            return (Criteria) this;
        }

        public Criteria andOpSedeFaxEqualTo(String value) {
            addCriterion("op_sede_fax =", value, "opSedeFax");
            return (Criteria) this;
        }

        public Criteria andOpSedeFaxNotEqualTo(String value) {
            addCriterion("op_sede_fax <>", value, "opSedeFax");
            return (Criteria) this;
        }

        public Criteria andOpSedeFaxGreaterThan(String value) {
            addCriterion("op_sede_fax >", value, "opSedeFax");
            return (Criteria) this;
        }

        public Criteria andOpSedeFaxGreaterThanOrEqualTo(String value) {
            addCriterion("op_sede_fax >=", value, "opSedeFax");
            return (Criteria) this;
        }

        public Criteria andOpSedeFaxLessThan(String value) {
            addCriterion("op_sede_fax <", value, "opSedeFax");
            return (Criteria) this;
        }

        public Criteria andOpSedeFaxLessThanOrEqualTo(String value) {
            addCriterion("op_sede_fax <=", value, "opSedeFax");
            return (Criteria) this;
        }

        public Criteria andOpSedeFaxLike(String value) {
            addCriterion("op_sede_fax like", value, "opSedeFax");
            return (Criteria) this;
        }

        public Criteria andOpSedeFaxNotLike(String value) {
            addCriterion("op_sede_fax not like", value, "opSedeFax");
            return (Criteria) this;
        }

        public Criteria andOpSedeFaxIn(List<String> values) {
            addCriterion("op_sede_fax in", values, "opSedeFax");
            return (Criteria) this;
        }

        public Criteria andOpSedeFaxNotIn(List<String> values) {
            addCriterion("op_sede_fax not in", values, "opSedeFax");
            return (Criteria) this;
        }

        public Criteria andOpSedeFaxBetween(String value1, String value2) {
            addCriterion("op_sede_fax between", value1, value2, "opSedeFax");
            return (Criteria) this;
        }

        public Criteria andOpSedeFaxNotBetween(String value1, String value2) {
            addCriterion("op_sede_fax not between", value1, value2, "opSedeFax");
            return (Criteria) this;
        }

        public Criteria andOpSedeEmailIsNull() {
            addCriterion("op_sede_email is null");
            return (Criteria) this;
        }

        public Criteria andOpSedeEmailIsNotNull() {
            addCriterion("op_sede_email is not null");
            return (Criteria) this;
        }

        public Criteria andOpSedeEmailEqualTo(String value) {
            addCriterion("op_sede_email =", value, "opSedeEmail");
            return (Criteria) this;
        }

        public Criteria andOpSedeEmailNotEqualTo(String value) {
            addCriterion("op_sede_email <>", value, "opSedeEmail");
            return (Criteria) this;
        }

        public Criteria andOpSedeEmailGreaterThan(String value) {
            addCriterion("op_sede_email >", value, "opSedeEmail");
            return (Criteria) this;
        }

        public Criteria andOpSedeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("op_sede_email >=", value, "opSedeEmail");
            return (Criteria) this;
        }

        public Criteria andOpSedeEmailLessThan(String value) {
            addCriterion("op_sede_email <", value, "opSedeEmail");
            return (Criteria) this;
        }

        public Criteria andOpSedeEmailLessThanOrEqualTo(String value) {
            addCriterion("op_sede_email <=", value, "opSedeEmail");
            return (Criteria) this;
        }

        public Criteria andOpSedeEmailLike(String value) {
            addCriterion("op_sede_email like", value, "opSedeEmail");
            return (Criteria) this;
        }

        public Criteria andOpSedeEmailNotLike(String value) {
            addCriterion("op_sede_email not like", value, "opSedeEmail");
            return (Criteria) this;
        }

        public Criteria andOpSedeEmailIn(List<String> values) {
            addCriterion("op_sede_email in", values, "opSedeEmail");
            return (Criteria) this;
        }

        public Criteria andOpSedeEmailNotIn(List<String> values) {
            addCriterion("op_sede_email not in", values, "opSedeEmail");
            return (Criteria) this;
        }

        public Criteria andOpSedeEmailBetween(String value1, String value2) {
            addCriterion("op_sede_email between", value1, value2, "opSedeEmail");
            return (Criteria) this;
        }

        public Criteria andOpSedeEmailNotBetween(String value1, String value2) {
            addCriterion("op_sede_email not between", value1, value2, "opSedeEmail");
            return (Criteria) this;
        }

        public Criteria andDataModificaStatoIsNull() {
            addCriterion("data_modifica_stato is null");
            return (Criteria) this;
        }

        public Criteria andDataModificaStatoIsNotNull() {
            addCriterion("data_modifica_stato is not null");
            return (Criteria) this;
        }

        public Criteria andDataModificaStatoEqualTo(Date value) {
            addCriterionForJDBCDate("data_modifica_stato =", value, "dataModificaStato");
            return (Criteria) this;
        }

        public Criteria andDataModificaStatoNotEqualTo(Date value) {
            addCriterionForJDBCDate("data_modifica_stato <>", value, "dataModificaStato");
            return (Criteria) this;
        }

        public Criteria andDataModificaStatoGreaterThan(Date value) {
            addCriterionForJDBCDate("data_modifica_stato >", value, "dataModificaStato");
            return (Criteria) this;
        }

        public Criteria andDataModificaStatoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data_modifica_stato >=", value, "dataModificaStato");
            return (Criteria) this;
        }

        public Criteria andDataModificaStatoLessThan(Date value) {
            addCriterionForJDBCDate("data_modifica_stato <", value, "dataModificaStato");
            return (Criteria) this;
        }

        public Criteria andDataModificaStatoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data_modifica_stato <=", value, "dataModificaStato");
            return (Criteria) this;
        }

        public Criteria andDataModificaStatoIn(List<Date> values) {
            addCriterionForJDBCDate("data_modifica_stato in", values, "dataModificaStato");
            return (Criteria) this;
        }

        public Criteria andDataModificaStatoNotIn(List<Date> values) {
            addCriterionForJDBCDate("data_modifica_stato not in", values, "dataModificaStato");
            return (Criteria) this;
        }

        public Criteria andDataModificaStatoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data_modifica_stato between", value1, value2, "dataModificaStato");
            return (Criteria) this;
        }

        public Criteria andDataModificaStatoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data_modifica_stato not between", value1, value2, "dataModificaStato");
            return (Criteria) this;
        }

        public Criteria andMatricolaUtenteRiferimentoIsNull() {
            addCriterion("matricola_utente_riferimento is null");
            return (Criteria) this;
        }

        public Criteria andMatricolaUtenteRiferimentoIsNotNull() {
            addCriterion("matricola_utente_riferimento is not null");
            return (Criteria) this;
        }

        public Criteria andMatricolaUtenteRiferimentoEqualTo(String value) {
            addCriterion("matricola_utente_riferimento =", value, "matricolaUtenteRiferimento");
            return (Criteria) this;
        }

        public Criteria andMatricolaUtenteRiferimentoNotEqualTo(String value) {
            addCriterion("matricola_utente_riferimento <>", value, "matricolaUtenteRiferimento");
            return (Criteria) this;
        }

        public Criteria andMatricolaUtenteRiferimentoGreaterThan(String value) {
            addCriterion("matricola_utente_riferimento >", value, "matricolaUtenteRiferimento");
            return (Criteria) this;
        }

        public Criteria andMatricolaUtenteRiferimentoGreaterThanOrEqualTo(String value) {
            addCriterion("matricola_utente_riferimento >=", value, "matricolaUtenteRiferimento");
            return (Criteria) this;
        }

        public Criteria andMatricolaUtenteRiferimentoLessThan(String value) {
            addCriterion("matricola_utente_riferimento <", value, "matricolaUtenteRiferimento");
            return (Criteria) this;
        }

        public Criteria andMatricolaUtenteRiferimentoLessThanOrEqualTo(String value) {
            addCriterion("matricola_utente_riferimento <=", value, "matricolaUtenteRiferimento");
            return (Criteria) this;
        }

        public Criteria andMatricolaUtenteRiferimentoLike(String value) {
            addCriterion("matricola_utente_riferimento like", value, "matricolaUtenteRiferimento");
            return (Criteria) this;
        }

        public Criteria andMatricolaUtenteRiferimentoNotLike(String value) {
            addCriterion("matricola_utente_riferimento not like", value, "matricolaUtenteRiferimento");
            return (Criteria) this;
        }

        public Criteria andMatricolaUtenteRiferimentoIn(List<String> values) {
            addCriterion("matricola_utente_riferimento in", values, "matricolaUtenteRiferimento");
            return (Criteria) this;
        }

        public Criteria andMatricolaUtenteRiferimentoNotIn(List<String> values) {
            addCriterion("matricola_utente_riferimento not in", values, "matricolaUtenteRiferimento");
            return (Criteria) this;
        }

        public Criteria andMatricolaUtenteRiferimentoBetween(String value1, String value2) {
            addCriterion("matricola_utente_riferimento between", value1, value2, "matricolaUtenteRiferimento");
            return (Criteria) this;
        }

        public Criteria andMatricolaUtenteRiferimentoNotBetween(String value1, String value2) {
            addCriterion("matricola_utente_riferimento not between", value1, value2, "matricolaUtenteRiferimento");
            return (Criteria) this;
        }

        public Criteria andCodiceRichiestaIsNull() {
            addCriterion("codice_richiesta is null");
            return (Criteria) this;
        }

        public Criteria andCodiceRichiestaIsNotNull() {
            addCriterion("codice_richiesta is not null");
            return (Criteria) this;
        }

        public Criteria andCodiceRichiestaEqualTo(String value) {
            addCriterion("codice_richiesta =", value, "codiceRichiesta");
            return (Criteria) this;
        }

        public Criteria andCodiceRichiestaNotEqualTo(String value) {
            addCriterion("codice_richiesta <>", value, "codiceRichiesta");
            return (Criteria) this;
        }

        public Criteria andCodiceRichiestaGreaterThan(String value) {
            addCriterion("codice_richiesta >", value, "codiceRichiesta");
            return (Criteria) this;
        }

        public Criteria andCodiceRichiestaGreaterThanOrEqualTo(String value) {
            addCriterion("codice_richiesta >=", value, "codiceRichiesta");
            return (Criteria) this;
        }

        public Criteria andCodiceRichiestaLessThan(String value) {
            addCriterion("codice_richiesta <", value, "codiceRichiesta");
            return (Criteria) this;
        }

        public Criteria andCodiceRichiestaLessThanOrEqualTo(String value) {
            addCriterion("codice_richiesta <=", value, "codiceRichiesta");
            return (Criteria) this;
        }

        public Criteria andCodiceRichiestaLike(String value) {
            addCriterion("codice_richiesta like", value, "codiceRichiesta");
            return (Criteria) this;
        }

        public Criteria andCodiceRichiestaNotLike(String value) {
            addCriterion("codice_richiesta not like", value, "codiceRichiesta");
            return (Criteria) this;
        }

        public Criteria andCodiceRichiestaIn(List<String> values) {
            addCriterion("codice_richiesta in", values, "codiceRichiesta");
            return (Criteria) this;
        }

        public Criteria andCodiceRichiestaNotIn(List<String> values) {
            addCriterion("codice_richiesta not in", values, "codiceRichiesta");
            return (Criteria) this;
        }

        public Criteria andCodiceRichiestaBetween(String value1, String value2) {
            addCriterion("codice_richiesta between", value1, value2, "codiceRichiesta");
            return (Criteria) this;
        }

        public Criteria andCodiceRichiestaNotBetween(String value1, String value2) {
            addCriterion("codice_richiesta not between", value1, value2, "codiceRichiesta");
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