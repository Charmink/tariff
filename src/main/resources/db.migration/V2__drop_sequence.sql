ALTER TABLE tariff ALTER COLUMN device_id TYPE bigint;
DROP  SEQUENCE IF EXISTS tariff_device_id_seq CASCADE;