--------------------------------------------------------
--  File created - Monday-December-31-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table KLUBOVI
--------------------------------------------------------

  CREATE TABLE "UKIII"."KLUBOVI" 
   (	"ID_KLUBA" NUMBER(10,0), 
	"IME_KLUBA" VARCHAR2(32 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table KORISNICI
--------------------------------------------------------

  CREATE TABLE "UKIII"."KORISNICI" 
   (	"ID_KORISNIKA" NUMBER(10,0), 
	"KORISNICKO_IME" VARCHAR2(32 CHAR), 
	"LOZINKA" VARCHAR2(32 CHAR), 
	"ADMIN" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table UTAKMICE
--------------------------------------------------------

  CREATE TABLE "UKIII"."UTAKMICE" 
   (	"ID_UTAKMICE" NUMBER(10,0), 
	"DOMACIN_ID" NUMBER(10,0), 
	"GOST_ID" NUMBER(10,0), 
	"DATUM" DATE, 
	"BROJ_ULAZNICA" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into UKIII.KLUBOVI
SET DEFINE OFF;
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (16,'Proleter');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (9,'Macva');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (10,'Dinamo');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (1,'Crvena zvezda');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (2,'Cukaricki');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (3,'Zemun');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (5,'Mladost');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (6,'Napredak');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (7,'OFK Backa');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (8,'Partizan');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (4,'Rad');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (11,'Radnicki N.');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (12,'Radnik');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (13,'Spartak ZK');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (14,'Vojvodina');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (15,'Vozdovac');
REM INSERTING into UKIII.KORISNICI
SET DEFINE OFF;
Insert into UKIII.KORISNICI (ID_KORISNIKA,KORISNICKO_IME,LOZINKA,ADMIN) values (1,'uros.dinic','student123',1);
Insert into UKIII.KORISNICI (ID_KORISNIKA,KORISNICKO_IME,LOZINKA,ADMIN) values (2,'jovan.pavlovic','student123',0);
Insert into UKIII.KORISNICI (ID_KORISNIKA,KORISNICKO_IME,LOZINKA,ADMIN) values (3,'nikola.obradovic','student123',0);
Insert into UKIII.KORISNICI (ID_KORISNIKA,KORISNICKO_IME,LOZINKA,ADMIN) values (4,'sasa.cavic','student123',0);
REM INSERTING into UKIII.UTAKMICE
SET DEFINE OFF;
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,BROJ_ULAZNICA) values (33,3,12,to_date('01-DEC-19','DD-MON-RR'),14999);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,BROJ_ULAZNICA) values (34,5,8,to_date('01-DEC-19','DD-MON-RR'),15000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,BROJ_ULAZNICA) values (25,8,16,to_date('27-AUG-19','DD-MON-RR'),1498);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,BROJ_ULAZNICA) values (23,2,5,to_date('27-AUG-19','DD-MON-RR'),1497);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,BROJ_ULAZNICA) values (26,8,1,to_date('09-FEB-19','DD-MON-RR'),34998);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,BROJ_ULAZNICA) values (24,14,9,to_date('27-AUG-19','DD-MON-RR'),1499);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,BROJ_ULAZNICA) values (27,10,11,to_date('01-DEC-19','DD-MON-RR'),15000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,BROJ_ULAZNICA) values (28,1,15,to_date('01-DEC-19','DD-MON-RR'),14999);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,BROJ_ULAZNICA) values (29,16,13,to_date('01-DEC-19','DD-MON-RR'),15000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,BROJ_ULAZNICA) values (30,7,6,to_date('01-DEC-19','DD-MON-RR'),14999);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,BROJ_ULAZNICA) values (31,9,2,to_date('01-DEC-19','DD-MON-RR'),15000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,BROJ_ULAZNICA) values (32,4,14,to_date('01-DEC-19','DD-MON-RR'),15000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,BROJ_ULAZNICA) values (35,13,2,to_date('22-MAR-19','DD-MON-RR'),5000);
--------------------------------------------------------
--  DDL for Index KLUBOVI_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UKIII"."KLUBOVI_PK" ON "UKIII"."KLUBOVI" ("ID_KLUBA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index KORISNICI_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UKIII"."KORISNICI_PK" ON "UKIII"."KORISNICI" ("ID_KORISNIKA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index UTAKMICE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UKIII"."UTAKMICE_PK" ON "UKIII"."UTAKMICE" ("ID_UTAKMICE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Trigger KLUBOVI_ID_KLUBA_TRIG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UKIII"."KLUBOVI_ID_KLUBA_TRIG" BEFORE INSERT OR UPDATE ON klubovi
FOR EACH ROW
DECLARE 
v_newVal NUMBER(12) := 0;
v_incval NUMBER(12) := 0;
BEGIN
  IF INSERTING AND :new.ID_kluba IS NULL THEN
    SELECT  klubovi_ID_kluba_SEQ.NEXTVAL INTO v_newVal FROM DUAL;
    -- If this is the first time this table have been inserted into (sequence == 1)
    IF v_newVal = 1 THEN 
      --get the max indentity value from the table
      SELECT NVL(max(ID_kluba),0) INTO v_newVal FROM klubovi;
      v_newVal := v_newVal + 1;
      --set the sequence to that value
      LOOP
           EXIT WHEN v_incval>=v_newVal;
           SELECT klubovi_ID_kluba_SEQ.nextval INTO v_incval FROM dual;
      END LOOP;
    END IF;
   -- assign the value from the sequence to emulate the identity column
   :new.ID_kluba := v_newVal;
  END IF;
END;
/
ALTER TRIGGER "UKIII"."KLUBOVI_ID_KLUBA_TRIG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger KORISNICI_ID_KORISNIKA_TRIG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UKIII"."KORISNICI_ID_KORISNIKA_TRIG" BEFORE INSERT OR UPDATE ON korisnici
FOR EACH ROW
DECLARE 
v_newVal NUMBER(12) := 0;
v_incval NUMBER(12) := 0;
BEGIN
  IF INSERTING AND :new.ID_korisnika IS NULL THEN
    SELECT  korisnici_ID_korisnika_SEQ.NEXTVAL INTO v_newVal FROM DUAL;
    -- If this is the first time this table have been inserted into (sequence == 1)
    IF v_newVal = 1 THEN 
      --get the max indentity value from the table
      SELECT NVL(max(ID_korisnika),0) INTO v_newVal FROM korisnici;
      v_newVal := v_newVal + 1;
      --set the sequence to that value
      LOOP
           EXIT WHEN v_incval>=v_newVal;
           SELECT korisnici_ID_korisnika_SEQ.nextval INTO v_incval FROM dual;
      END LOOP;
    END IF;
   -- assign the value from the sequence to emulate the identity column
   :new.ID_korisnika := v_newVal;
  END IF;
END;
/
ALTER TRIGGER "UKIII"."KORISNICI_ID_KORISNIKA_TRIG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UTAKMICE_ID_UTAKMICE_TRIG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UKIII"."UTAKMICE_ID_UTAKMICE_TRIG" BEFORE INSERT OR UPDATE ON utakmice
FOR EACH ROW
DECLARE 
v_newVal NUMBER(12) := 0;
v_incval NUMBER(12) := 0;
BEGIN
  IF INSERTING AND :new.ID_utakmice IS NULL THEN
    SELECT  utakmice_ID_utakmice_SEQ.NEXTVAL INTO v_newVal FROM DUAL;
    -- If this is the first time this table have been inserted into (sequence == 1)
    IF v_newVal = 1 THEN 
      --get the max indentity value from the table
      SELECT NVL(max(ID_utakmice),0) INTO v_newVal FROM utakmice;
      v_newVal := v_newVal + 1;
      --set the sequence to that value
      LOOP
           EXIT WHEN v_incval>=v_newVal;
           SELECT utakmice_ID_utakmice_SEQ.nextval INTO v_incval FROM dual;
      END LOOP;
    END IF;
   -- assign the value from the sequence to emulate the identity column
   :new.ID_utakmice := v_newVal;
  END IF;
END;
/
ALTER TRIGGER "UKIII"."UTAKMICE_ID_UTAKMICE_TRIG" ENABLE;
--------------------------------------------------------
--  Constraints for Table KLUBOVI
--------------------------------------------------------

  ALTER TABLE "UKIII"."KLUBOVI" ADD CONSTRAINT "KLUBOVI_PK" PRIMARY KEY ("ID_KLUBA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "UKIII"."KLUBOVI" MODIFY ("ID_KLUBA" NOT NULL ENABLE);
 
  ALTER TABLE "UKIII"."KLUBOVI" MODIFY ("IME_KLUBA" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table KORISNICI
--------------------------------------------------------

  ALTER TABLE "UKIII"."KORISNICI" ADD CONSTRAINT "KORISNICI_PK" PRIMARY KEY ("ID_KORISNIKA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "UKIII"."KORISNICI" MODIFY ("ID_KORISNIKA" NOT NULL ENABLE);
 
  ALTER TABLE "UKIII"."KORISNICI" MODIFY ("KORISNICKO_IME" NOT NULL ENABLE);
 
  ALTER TABLE "UKIII"."KORISNICI" MODIFY ("LOZINKA" NOT NULL ENABLE);
 
  ALTER TABLE "UKIII"."KORISNICI" MODIFY ("ADMIN" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table UTAKMICE
--------------------------------------------------------

  ALTER TABLE "UKIII"."UTAKMICE" MODIFY ("ID_UTAKMICE" NOT NULL ENABLE);
 
  ALTER TABLE "UKIII"."UTAKMICE" MODIFY ("DOMACIN_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UKIII"."UTAKMICE" MODIFY ("GOST_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UKIII"."UTAKMICE" MODIFY ("DATUM" NOT NULL ENABLE);
 
  ALTER TABLE "UKIII"."UTAKMICE" MODIFY ("BROJ_ULAZNICA" NOT NULL ENABLE);
 
  ALTER TABLE "UKIII"."UTAKMICE" ADD CONSTRAINT "UTAKMICE_PK" PRIMARY KEY ("ID_UTAKMICE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
