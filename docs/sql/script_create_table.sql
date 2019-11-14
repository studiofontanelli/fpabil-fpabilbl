DROP TABLE db_iride_richiesta_utente;
DROP TABLE db_iride_richiesta_operatore;
DROP TABLE db_iride_stato_richiesta;
DROP TABLE tab_doc_identita;

-- DROP TABLE tab_doc_identita;

CREATE TABLE tab_doc_identita
(
  cod_tipo_doc_identita character varying(2) NOT NULL,
  descrizione character varying(20) NOT NULL,
  CONSTRAINT tab_doc_identita_pkey PRIMARY KEY (cod_tipo_doc_identita)
)
WITH (
  OIDS=FALSE
);


-- DROP TABLE db_iride_stato_richiesta;

CREATE TABLE db_iride_stato_richiesta
(
  id_stato_richiesta_operatore integer NOT NULL,
  descrizione character varying(50) NOT NULL,
  CONSTRAINT db_iride_stato_richiesta_pkey PRIMARY KEY (id_stato_richiesta_operatore)
)
WITH (
  OIDS=FALSE
);


-- DROP TABLE db_iride_richiesta_operatore;

CREATE TABLE db_iride_richiesta_operatore
(
  id_richiesta_operatore serial,
  id_stato_richiesta_operatore integer NOT NULL,
  data_richiesta date NOT NULL,
  data_invio_richiesta date,
  lr_cognome character varying(40) NOT NULL,
  lr_nome character varying(40) NOT NULL,
  lr_prov_nascita character(3),
  lr_comune_nascita character(6),
  lr_stato_estero_nascita numeric(3,0),
  lr_citta_estera_nascita character varying(50),
  lr_data_nascita date NOT NULL,
  lr_num_telefono character varying(20) NOT NULL,
  lr_email character varying(80) NOT NULL,
  op_ip_address character varying(20),
  op_codice numeric(6,0),
  op_denominazione character varying(250) NOT NULL,
  op_cod_fiscale character varying(16),
  op_partita_iva character varying(11),
  op_sede_provincia character(3),
  op_sede_comune character(6),
  op_sede_indirizzo character varying(80),
  op_sede_cap character varying(5),
  op_sede_stato_estero numeric(3,0),
  op_sede_localita_estera character varying(50),
  op_sede_telefono_1 character varying(20) NOT NULL,
  op_sede_telefono_2 character varying(20),
  op_sede_fax character varying(20),
  op_sede_email character varying(80),
  data_modifica_stato date,
  matricola_utente_riferimento character varying(10),
  CONSTRAINT db_iride_richiesta_operatore_pkey PRIMARY KEY (id_richiesta_operatore),
  CONSTRAINT db_iride_richiesta_operatore_id_stato_richiesta_operatore_fkey FOREIGN KEY (id_stato_richiesta_operatore)
      REFERENCES public.db_iride_stato_richiesta (id_stato_richiesta_operatore) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);


ALTER TABLE db_iride_richiesta_operatore
  ADD COLUMN codice_richiesta character varying;



-- DROP TABLE db_iride_richiesta_utente;

CREATE TABLE db_iride_richiesta_utente
(
  cod_fiscale character varying(16) NOT NULL,
  id_richiesta_operatore numeric(22,0) NOT NULL,
  cognome character varying(40) NOT NULL,
  nome character varying(40) NOT NULL,
  data_nascita date NOT NULL,
  numero_documento character varying(20),
  data_rilascio_documento date,
  e_mail character varying(80) NOT NULL,
  num_telefono character varying(20),
  flag_certificato character varying(1) NOT NULL,
  tipo_documento character varying(2),
  flag_abilitazione character varying(1) NOT NULL,
  CONSTRAINT pkdb_iride_richiesta_utente PRIMARY KEY (cod_fiscale, id_richiesta_operatore),
  CONSTRAINT db_iride_richiesta_utente_tipo_documento_fkey FOREIGN KEY (tipo_documento)
      REFERENCES public.tab_doc_identita (cod_tipo_doc_identita) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);





-- DROP TABLE db_iride_richiesta_utente;

CREATE TABLE db_iride_richiesta_utente
(
  cod_fiscale character varying(16) NOT NULL,
  id_richiesta_operatore integer NOT NULL,
  cognome character varying(40) NOT NULL,
  nome character varying(40) NOT NULL,
  data_nascita date NOT NULL,
  numero_documento character varying(20),
  data_rilascio_documento date,
  e_mail character varying(80) NOT NULL,
  num_telefono character varying(20),
  flag_certificato character varying(1) NOT NULL,
  tipo_documento character varying(2),
  flag_abilitazione character varying(1) NOT NULL,
  CONSTRAINT pkdb_iride_richiesta_utente PRIMARY KEY (cod_fiscale, id_richiesta_operatore),
  CONSTRAINT db_iride_richiesta_utente_id_richiesta_operatore_fkey FOREIGN KEY (id_richiesta_operatore)
      REFERENCES public.db_iride_richiesta_operatore (id_richiesta_operatore) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT db_iride_richiesta_utente_id_richiesta_operatore_fkey1 FOREIGN KEY (id_richiesta_operatore)
      REFERENCES public.db_iride_richiesta_operatore (id_richiesta_operatore) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT db_iride_richiesta_utente_tipo_documento_fkey FOREIGN KEY (tipo_documento)
      REFERENCES public.tab_doc_identita (cod_tipo_doc_identita) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);




INSERT INTO DB_IRIDE_STATO_RICHIESTA (ID_STATO_RICHIESTA_OPERATORE,DESCRIZIONE) VALUES (1,'RICHIESTA DA ESAMINARE');
INSERT INTO DB_IRIDE_STATO_RICHIESTA (ID_STATO_RICHIESTA_OPERATORE,DESCRIZIONE) VALUES (2,'RICHIESTA PRESA IN CARICO DAL GESTORE');
INSERT INTO DB_IRIDE_STATO_RICHIESTA (ID_STATO_RICHIESTA_OPERATORE,DESCRIZIONE) VALUES (3,'RICHIESTA ACCETTATA DAL GESTORE');
INSERT INTO DB_IRIDE_STATO_RICHIESTA (ID_STATO_RICHIESTA_OPERATORE,DESCRIZIONE) VALUES (4,'RICHIESTA RIFIUTATA DAL GESTORE');
INSERT INTO DB_IRIDE_STATO_RICHIESTA (ID_STATO_RICHIESTA_OPERATORE,DESCRIZIONE) VALUES (5,'RICHIESTA INVIATA DAL GESTORE');
INSERT INTO DB_IRIDE_STATO_RICHIESTA (ID_STATO_RICHIESTA_OPERATORE,DESCRIZIONE) VALUES (6,'RICHIESTA SOLO DISABILITAZIONE INVIATA');


INSERT INTO TAB_DOC_IDENTITA (COD_TIPO_DOC_IDENTITA,DESCRIZIONE) VALUES ('CI','CARTA IDENTITA');
INSERT INTO TAB_DOC_IDENTITA (COD_TIPO_DOC_IDENTITA,DESCRIZIONE) VALUES ('PA','PATENTE');
INSERT INTO TAB_DOC_IDENTITA (COD_TIPO_DOC_IDENTITA,DESCRIZIONE) VALUES ('PP','PASSAPORTO');



