package it.csi.fpabil.fpabilbl.integration.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DbIrideRichiestaUtenteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbIrideRichiestaUtenteExample() {
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

        public Criteria andCodFiscaleIsNull() {
            addCriterion("cod_fiscale is null");
            return (Criteria) this;
        }

        public Criteria andCodFiscaleIsNotNull() {
            addCriterion("cod_fiscale is not null");
            return (Criteria) this;
        }

        public Criteria andCodFiscaleEqualTo(String value) {
            addCriterion("cod_fiscale =", value, "codFiscale");
            return (Criteria) this;
        }

        public Criteria andCodFiscaleNotEqualTo(String value) {
            addCriterion("cod_fiscale <>", value, "codFiscale");
            return (Criteria) this;
        }

        public Criteria andCodFiscaleGreaterThan(String value) {
            addCriterion("cod_fiscale >", value, "codFiscale");
            return (Criteria) this;
        }

        public Criteria andCodFiscaleGreaterThanOrEqualTo(String value) {
            addCriterion("cod_fiscale >=", value, "codFiscale");
            return (Criteria) this;
        }

        public Criteria andCodFiscaleLessThan(String value) {
            addCriterion("cod_fiscale <", value, "codFiscale");
            return (Criteria) this;
        }

        public Criteria andCodFiscaleLessThanOrEqualTo(String value) {
            addCriterion("cod_fiscale <=", value, "codFiscale");
            return (Criteria) this;
        }

        public Criteria andCodFiscaleLike(String value) {
            addCriterion("cod_fiscale like", value, "codFiscale");
            return (Criteria) this;
        }

        public Criteria andCodFiscaleNotLike(String value) {
            addCriterion("cod_fiscale not like", value, "codFiscale");
            return (Criteria) this;
        }

        public Criteria andCodFiscaleIn(List<String> values) {
            addCriterion("cod_fiscale in", values, "codFiscale");
            return (Criteria) this;
        }

        public Criteria andCodFiscaleNotIn(List<String> values) {
            addCriterion("cod_fiscale not in", values, "codFiscale");
            return (Criteria) this;
        }

        public Criteria andCodFiscaleBetween(String value1, String value2) {
            addCriterion("cod_fiscale between", value1, value2, "codFiscale");
            return (Criteria) this;
        }

        public Criteria andCodFiscaleNotBetween(String value1, String value2) {
            addCriterion("cod_fiscale not between", value1, value2, "codFiscale");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreIsNull() {
            addCriterion("id_richiesta_operatore is null");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreIsNotNull() {
            addCriterion("id_richiesta_operatore is not null");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreEqualTo(BigDecimal value) {
            addCriterion("id_richiesta_operatore =", value, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreNotEqualTo(BigDecimal value) {
            addCriterion("id_richiesta_operatore <>", value, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreGreaterThan(BigDecimal value) {
            addCriterion("id_richiesta_operatore >", value, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("id_richiesta_operatore >=", value, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreLessThan(BigDecimal value) {
            addCriterion("id_richiesta_operatore <", value, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("id_richiesta_operatore <=", value, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreIn(List<BigDecimal> values) {
            addCriterion("id_richiesta_operatore in", values, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreNotIn(List<BigDecimal> values) {
            addCriterion("id_richiesta_operatore not in", values, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("id_richiesta_operatore between", value1, value2, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andIdRichiestaOperatoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("id_richiesta_operatore not between", value1, value2, "idRichiestaOperatore");
            return (Criteria) this;
        }

        public Criteria andCognomeIsNull() {
            addCriterion("cognome is null");
            return (Criteria) this;
        }

        public Criteria andCognomeIsNotNull() {
            addCriterion("cognome is not null");
            return (Criteria) this;
        }

        public Criteria andCognomeEqualTo(String value) {
            addCriterion("cognome =", value, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeNotEqualTo(String value) {
            addCriterion("cognome <>", value, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeGreaterThan(String value) {
            addCriterion("cognome >", value, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeGreaterThanOrEqualTo(String value) {
            addCriterion("cognome >=", value, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeLessThan(String value) {
            addCriterion("cognome <", value, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeLessThanOrEqualTo(String value) {
            addCriterion("cognome <=", value, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeLike(String value) {
            addCriterion("cognome like", value, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeNotLike(String value) {
            addCriterion("cognome not like", value, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeIn(List<String> values) {
            addCriterion("cognome in", values, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeNotIn(List<String> values) {
            addCriterion("cognome not in", values, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeBetween(String value1, String value2) {
            addCriterion("cognome between", value1, value2, "cognome");
            return (Criteria) this;
        }

        public Criteria andCognomeNotBetween(String value1, String value2) {
            addCriterion("cognome not between", value1, value2, "cognome");
            return (Criteria) this;
        }

        public Criteria andNomeIsNull() {
            addCriterion("nome is null");
            return (Criteria) this;
        }

        public Criteria andNomeIsNotNull() {
            addCriterion("nome is not null");
            return (Criteria) this;
        }

        public Criteria andNomeEqualTo(String value) {
            addCriterion("nome =", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeNotEqualTo(String value) {
            addCriterion("nome <>", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeGreaterThan(String value) {
            addCriterion("nome >", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeGreaterThanOrEqualTo(String value) {
            addCriterion("nome >=", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeLessThan(String value) {
            addCriterion("nome <", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeLessThanOrEqualTo(String value) {
            addCriterion("nome <=", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeLike(String value) {
            addCriterion("nome like", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeNotLike(String value) {
            addCriterion("nome not like", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeIn(List<String> values) {
            addCriterion("nome in", values, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeNotIn(List<String> values) {
            addCriterion("nome not in", values, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeBetween(String value1, String value2) {
            addCriterion("nome between", value1, value2, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeNotBetween(String value1, String value2) {
            addCriterion("nome not between", value1, value2, "nome");
            return (Criteria) this;
        }

        public Criteria andDataNascitaIsNull() {
            addCriterion("data_nascita is null");
            return (Criteria) this;
        }

        public Criteria andDataNascitaIsNotNull() {
            addCriterion("data_nascita is not null");
            return (Criteria) this;
        }

        public Criteria andDataNascitaEqualTo(Date value) {
            addCriterionForJDBCDate("data_nascita =", value, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaNotEqualTo(Date value) {
            addCriterionForJDBCDate("data_nascita <>", value, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaGreaterThan(Date value) {
            addCriterionForJDBCDate("data_nascita >", value, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data_nascita >=", value, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaLessThan(Date value) {
            addCriterionForJDBCDate("data_nascita <", value, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data_nascita <=", value, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaIn(List<Date> values) {
            addCriterionForJDBCDate("data_nascita in", values, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaNotIn(List<Date> values) {
            addCriterionForJDBCDate("data_nascita not in", values, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data_nascita between", value1, value2, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andDataNascitaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data_nascita not between", value1, value2, "dataNascita");
            return (Criteria) this;
        }

        public Criteria andNumeroDocumentoIsNull() {
            addCriterion("numero_documento is null");
            return (Criteria) this;
        }

        public Criteria andNumeroDocumentoIsNotNull() {
            addCriterion("numero_documento is not null");
            return (Criteria) this;
        }

        public Criteria andNumeroDocumentoEqualTo(String value) {
            addCriterion("numero_documento =", value, "numeroDocumento");
            return (Criteria) this;
        }

        public Criteria andNumeroDocumentoNotEqualTo(String value) {
            addCriterion("numero_documento <>", value, "numeroDocumento");
            return (Criteria) this;
        }

        public Criteria andNumeroDocumentoGreaterThan(String value) {
            addCriterion("numero_documento >", value, "numeroDocumento");
            return (Criteria) this;
        }

        public Criteria andNumeroDocumentoGreaterThanOrEqualTo(String value) {
            addCriterion("numero_documento >=", value, "numeroDocumento");
            return (Criteria) this;
        }

        public Criteria andNumeroDocumentoLessThan(String value) {
            addCriterion("numero_documento <", value, "numeroDocumento");
            return (Criteria) this;
        }

        public Criteria andNumeroDocumentoLessThanOrEqualTo(String value) {
            addCriterion("numero_documento <=", value, "numeroDocumento");
            return (Criteria) this;
        }

        public Criteria andNumeroDocumentoLike(String value) {
            addCriterion("numero_documento like", value, "numeroDocumento");
            return (Criteria) this;
        }

        public Criteria andNumeroDocumentoNotLike(String value) {
            addCriterion("numero_documento not like", value, "numeroDocumento");
            return (Criteria) this;
        }

        public Criteria andNumeroDocumentoIn(List<String> values) {
            addCriterion("numero_documento in", values, "numeroDocumento");
            return (Criteria) this;
        }

        public Criteria andNumeroDocumentoNotIn(List<String> values) {
            addCriterion("numero_documento not in", values, "numeroDocumento");
            return (Criteria) this;
        }

        public Criteria andNumeroDocumentoBetween(String value1, String value2) {
            addCriterion("numero_documento between", value1, value2, "numeroDocumento");
            return (Criteria) this;
        }

        public Criteria andNumeroDocumentoNotBetween(String value1, String value2) {
            addCriterion("numero_documento not between", value1, value2, "numeroDocumento");
            return (Criteria) this;
        }

        public Criteria andDataRilascioDocumentoIsNull() {
            addCriterion("data_rilascio_documento is null");
            return (Criteria) this;
        }

        public Criteria andDataRilascioDocumentoIsNotNull() {
            addCriterion("data_rilascio_documento is not null");
            return (Criteria) this;
        }

        public Criteria andDataRilascioDocumentoEqualTo(Date value) {
            addCriterionForJDBCDate("data_rilascio_documento =", value, "dataRilascioDocumento");
            return (Criteria) this;
        }

        public Criteria andDataRilascioDocumentoNotEqualTo(Date value) {
            addCriterionForJDBCDate("data_rilascio_documento <>", value, "dataRilascioDocumento");
            return (Criteria) this;
        }

        public Criteria andDataRilascioDocumentoGreaterThan(Date value) {
            addCriterionForJDBCDate("data_rilascio_documento >", value, "dataRilascioDocumento");
            return (Criteria) this;
        }

        public Criteria andDataRilascioDocumentoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data_rilascio_documento >=", value, "dataRilascioDocumento");
            return (Criteria) this;
        }

        public Criteria andDataRilascioDocumentoLessThan(Date value) {
            addCriterionForJDBCDate("data_rilascio_documento <", value, "dataRilascioDocumento");
            return (Criteria) this;
        }

        public Criteria andDataRilascioDocumentoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data_rilascio_documento <=", value, "dataRilascioDocumento");
            return (Criteria) this;
        }

        public Criteria andDataRilascioDocumentoIn(List<Date> values) {
            addCriterionForJDBCDate("data_rilascio_documento in", values, "dataRilascioDocumento");
            return (Criteria) this;
        }

        public Criteria andDataRilascioDocumentoNotIn(List<Date> values) {
            addCriterionForJDBCDate("data_rilascio_documento not in", values, "dataRilascioDocumento");
            return (Criteria) this;
        }

        public Criteria andDataRilascioDocumentoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data_rilascio_documento between", value1, value2, "dataRilascioDocumento");
            return (Criteria) this;
        }

        public Criteria andDataRilascioDocumentoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data_rilascio_documento not between", value1, value2, "dataRilascioDocumento");
            return (Criteria) this;
        }

        public Criteria andEMailIsNull() {
            addCriterion("e_mail is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("e_mail is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("e_mail =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("e_mail <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("e_mail >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("e_mail >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("e_mail <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("e_mail <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("e_mail like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("e_mail not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("e_mail in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("e_mail not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("e_mail between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("e_mail not between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andNumTelefonoIsNull() {
            addCriterion("num_telefono is null");
            return (Criteria) this;
        }

        public Criteria andNumTelefonoIsNotNull() {
            addCriterion("num_telefono is not null");
            return (Criteria) this;
        }

        public Criteria andNumTelefonoEqualTo(String value) {
            addCriterion("num_telefono =", value, "numTelefono");
            return (Criteria) this;
        }

        public Criteria andNumTelefonoNotEqualTo(String value) {
            addCriterion("num_telefono <>", value, "numTelefono");
            return (Criteria) this;
        }

        public Criteria andNumTelefonoGreaterThan(String value) {
            addCriterion("num_telefono >", value, "numTelefono");
            return (Criteria) this;
        }

        public Criteria andNumTelefonoGreaterThanOrEqualTo(String value) {
            addCriterion("num_telefono >=", value, "numTelefono");
            return (Criteria) this;
        }

        public Criteria andNumTelefonoLessThan(String value) {
            addCriterion("num_telefono <", value, "numTelefono");
            return (Criteria) this;
        }

        public Criteria andNumTelefonoLessThanOrEqualTo(String value) {
            addCriterion("num_telefono <=", value, "numTelefono");
            return (Criteria) this;
        }

        public Criteria andNumTelefonoLike(String value) {
            addCriterion("num_telefono like", value, "numTelefono");
            return (Criteria) this;
        }

        public Criteria andNumTelefonoNotLike(String value) {
            addCriterion("num_telefono not like", value, "numTelefono");
            return (Criteria) this;
        }

        public Criteria andNumTelefonoIn(List<String> values) {
            addCriterion("num_telefono in", values, "numTelefono");
            return (Criteria) this;
        }

        public Criteria andNumTelefonoNotIn(List<String> values) {
            addCriterion("num_telefono not in", values, "numTelefono");
            return (Criteria) this;
        }

        public Criteria andNumTelefonoBetween(String value1, String value2) {
            addCriterion("num_telefono between", value1, value2, "numTelefono");
            return (Criteria) this;
        }

        public Criteria andNumTelefonoNotBetween(String value1, String value2) {
            addCriterion("num_telefono not between", value1, value2, "numTelefono");
            return (Criteria) this;
        }

        public Criteria andFlagCertificatoIsNull() {
            addCriterion("flag_certificato is null");
            return (Criteria) this;
        }

        public Criteria andFlagCertificatoIsNotNull() {
            addCriterion("flag_certificato is not null");
            return (Criteria) this;
        }

        public Criteria andFlagCertificatoEqualTo(String value) {
            addCriterion("flag_certificato =", value, "flagCertificato");
            return (Criteria) this;
        }

        public Criteria andFlagCertificatoNotEqualTo(String value) {
            addCriterion("flag_certificato <>", value, "flagCertificato");
            return (Criteria) this;
        }

        public Criteria andFlagCertificatoGreaterThan(String value) {
            addCriterion("flag_certificato >", value, "flagCertificato");
            return (Criteria) this;
        }

        public Criteria andFlagCertificatoGreaterThanOrEqualTo(String value) {
            addCriterion("flag_certificato >=", value, "flagCertificato");
            return (Criteria) this;
        }

        public Criteria andFlagCertificatoLessThan(String value) {
            addCriterion("flag_certificato <", value, "flagCertificato");
            return (Criteria) this;
        }

        public Criteria andFlagCertificatoLessThanOrEqualTo(String value) {
            addCriterion("flag_certificato <=", value, "flagCertificato");
            return (Criteria) this;
        }

        public Criteria andFlagCertificatoLike(String value) {
            addCriterion("flag_certificato like", value, "flagCertificato");
            return (Criteria) this;
        }

        public Criteria andFlagCertificatoNotLike(String value) {
            addCriterion("flag_certificato not like", value, "flagCertificato");
            return (Criteria) this;
        }

        public Criteria andFlagCertificatoIn(List<String> values) {
            addCriterion("flag_certificato in", values, "flagCertificato");
            return (Criteria) this;
        }

        public Criteria andFlagCertificatoNotIn(List<String> values) {
            addCriterion("flag_certificato not in", values, "flagCertificato");
            return (Criteria) this;
        }

        public Criteria andFlagCertificatoBetween(String value1, String value2) {
            addCriterion("flag_certificato between", value1, value2, "flagCertificato");
            return (Criteria) this;
        }

        public Criteria andFlagCertificatoNotBetween(String value1, String value2) {
            addCriterion("flag_certificato not between", value1, value2, "flagCertificato");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoIsNull() {
            addCriterion("tipo_documento is null");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoIsNotNull() {
            addCriterion("tipo_documento is not null");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoEqualTo(String value) {
            addCriterion("tipo_documento =", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoNotEqualTo(String value) {
            addCriterion("tipo_documento <>", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoGreaterThan(String value) {
            addCriterion("tipo_documento >", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoGreaterThanOrEqualTo(String value) {
            addCriterion("tipo_documento >=", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoLessThan(String value) {
            addCriterion("tipo_documento <", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoLessThanOrEqualTo(String value) {
            addCriterion("tipo_documento <=", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoLike(String value) {
            addCriterion("tipo_documento like", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoNotLike(String value) {
            addCriterion("tipo_documento not like", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoIn(List<String> values) {
            addCriterion("tipo_documento in", values, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoNotIn(List<String> values) {
            addCriterion("tipo_documento not in", values, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoBetween(String value1, String value2) {
            addCriterion("tipo_documento between", value1, value2, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoNotBetween(String value1, String value2) {
            addCriterion("tipo_documento not between", value1, value2, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andFlagAbilitazioneIsNull() {
            addCriterion("flag_abilitazione is null");
            return (Criteria) this;
        }

        public Criteria andFlagAbilitazioneIsNotNull() {
            addCriterion("flag_abilitazione is not null");
            return (Criteria) this;
        }

        public Criteria andFlagAbilitazioneEqualTo(String value) {
            addCriterion("flag_abilitazione =", value, "flagAbilitazione");
            return (Criteria) this;
        }

        public Criteria andFlagAbilitazioneNotEqualTo(String value) {
            addCriterion("flag_abilitazione <>", value, "flagAbilitazione");
            return (Criteria) this;
        }

        public Criteria andFlagAbilitazioneGreaterThan(String value) {
            addCriterion("flag_abilitazione >", value, "flagAbilitazione");
            return (Criteria) this;
        }

        public Criteria andFlagAbilitazioneGreaterThanOrEqualTo(String value) {
            addCriterion("flag_abilitazione >=", value, "flagAbilitazione");
            return (Criteria) this;
        }

        public Criteria andFlagAbilitazioneLessThan(String value) {
            addCriterion("flag_abilitazione <", value, "flagAbilitazione");
            return (Criteria) this;
        }

        public Criteria andFlagAbilitazioneLessThanOrEqualTo(String value) {
            addCriterion("flag_abilitazione <=", value, "flagAbilitazione");
            return (Criteria) this;
        }

        public Criteria andFlagAbilitazioneLike(String value) {
            addCriterion("flag_abilitazione like", value, "flagAbilitazione");
            return (Criteria) this;
        }

        public Criteria andFlagAbilitazioneNotLike(String value) {
            addCriterion("flag_abilitazione not like", value, "flagAbilitazione");
            return (Criteria) this;
        }

        public Criteria andFlagAbilitazioneIn(List<String> values) {
            addCriterion("flag_abilitazione in", values, "flagAbilitazione");
            return (Criteria) this;
        }

        public Criteria andFlagAbilitazioneNotIn(List<String> values) {
            addCriterion("flag_abilitazione not in", values, "flagAbilitazione");
            return (Criteria) this;
        }

        public Criteria andFlagAbilitazioneBetween(String value1, String value2) {
            addCriterion("flag_abilitazione between", value1, value2, "flagAbilitazione");
            return (Criteria) this;
        }

        public Criteria andFlagAbilitazioneNotBetween(String value1, String value2) {
            addCriterion("flag_abilitazione not between", value1, value2, "flagAbilitazione");
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