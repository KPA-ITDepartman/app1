--------------------------------------------------------
--  File created - Friday-December-21-2018   
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
	"VREME" DATE, 
	"BROJ_KARATA" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into UKIII.KLUBOVI
SET DEFINE OFF;
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (1,'Crvena zvezda');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (2,'Cukaricki');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (3,'Dinamo');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (4,'Macva');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (5,'Mladost');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (6,'Napredak');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (7,'OFK Backa');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (8,'Partizan');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (9,'Proleter');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (10,'Rad');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (11,'Radnicki N.');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (12,'Radnik');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (13,'Spartak Žk');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (14,'Vojvodina');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (15,'Voždovac');
Insert into UKIII.KLUBOVI (ID_KLUBA,IME_KLUBA) values (16,'Zemun');
REM INSERTING into UKIII.KORISNICI
SET DEFINE OFF;
Insert into UKIII.KORISNICI (ID_KORISNIKA,KORISNICKO_IME,LOZINKA,ADMIN) values (1,'uros.dinic','student123',1);
Insert into UKIII.KORISNICI (ID_KORISNIKA,KORISNICKO_IME,LOZINKA,ADMIN) values (2,'jovan.pavlovic','student123',0);
Insert into UKIII.KORISNICI (ID_KORISNIKA,KORISNICKO_IME,LOZINKA,ADMIN) values (3,'nikola.obradovic','student123',0);
Insert into UKIII.KORISNICI (ID_KORISNIKA,KORISNICKO_IME,LOZINKA,ADMIN) values (4,'sasa.cavic','student123',0);
REM INSERTING into UKIII.UTAKMICE
SET DEFINE OFF;
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,VREME,BROJ_KARATA) values (1,3,13,to_date('16-FEB-19','DD-MON-RR'),to_date('01-JAN-70','DD-MON-RR'),5000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,VREME,BROJ_KARATA) values (2,15,6,to_date('16-FEB-19','DD-MON-RR'),to_date('01-JAN-70','DD-MON-RR'),5000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,VREME,BROJ_KARATA) values (3,11,2,to_date('16-FEB-19','DD-MON-RR'),to_date('01-JAN-70','DD-MON-RR'),5000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,VREME,BROJ_KARATA) values (4,1,14,to_date('16-FEB-19','DD-MON-RR'),to_date('01-JAN-70','DD-MON-RR'),5000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,VREME,BROJ_KARATA) values (5,9,12,to_date('16-FEB-19','DD-MON-RR'),to_date('01-JAN-70','DD-MON-RR'),5000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,VREME,BROJ_KARATA) values (6,7,8,to_date('16-FEB-19','DD-MON-RR'),to_date('01-JAN-70','DD-MON-RR'),5000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,VREME,BROJ_KARATA) values (7,4,5,to_date('16-FEB-19','DD-MON-RR'),to_date('01-JAN-70','DD-MON-RR'),5000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,VREME,BROJ_KARATA) values (8,10,16,to_date('16-FEB-19','DD-MON-RR'),to_date('01-JAN-70','DD-MON-RR'),5000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,VREME,BROJ_KARATA) values (9,10,3,to_date('23-FEB-19','DD-MON-RR'),to_date('01-JAN-70','DD-MON-RR'),5000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,VREME,BROJ_KARATA) values (10,16,4,to_date('23-FEB-19','DD-MON-RR'),to_date('01-JAN-70','DD-MON-RR'),5000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,VREME,BROJ_KARATA) values (11,5,7,to_date('23-FEB-19','DD-MON-RR'),to_date('01-JAN-70','DD-MON-RR'),5000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,VREME,BROJ_KARATA) values (12,8,9,to_date('23-FEB-19','DD-MON-RR'),to_date('01-JAN-70','DD-MON-RR'),5000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,VREME,BROJ_KARATA) values (13,12,1,to_date('23-FEB-19','DD-MON-RR'),to_date('01-JAN-70','DD-MON-RR'),5000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,VREME,BROJ_KARATA) values (14,14,11,to_date('23-FEB-19','DD-MON-RR'),to_date('01-JAN-70','DD-MON-RR'),5000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,VREME,BROJ_KARATA) values (15,2,15,to_date('23-FEB-19','DD-MON-RR'),to_date('01-JAN-70','DD-MON-RR'),5000);
Insert into UKIII.UTAKMICE (ID_UTAKMICE,DOMACIN_ID,GOST_ID,DATUM,VREME,BROJ_KARATA) values (16,6,13,to_date('23-FEB-19','DD-MON-RR'),to_date('01-JAN-70','DD-MON-RR'),5000);
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

  ALTER TABLE "UKIII"."KLUBOVI" MODIFY ("ID_KLUBA" NOT NULL ENABLE);
 
  ALTER TABLE "UKIII"."KLUBOVI" MODIFY ("IME_KLUBA" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table KORISNICI
--------------------------------------------------------

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
 
  ALTER TABLE "UKIII"."UTAKMICE" MODIFY ("VREME" NOT NULL ENABLE);
 
  ALTER TABLE "UKIII"."UTAKMICE" MODIFY ("BROJ_KARATA" NOT NULL ENABLE);
