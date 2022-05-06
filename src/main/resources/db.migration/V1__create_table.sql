CREATE TABLE IF NOT EXISTS tariff
(
    device_id bigserial PRIMARY KEY,
    cnum      varchar   NOT NULL,
    tariff_key varchar  NOT NULL,
    tariff_type int2 NOT NULL,
    tariff_fix varchar NOT NULL,
    tariff_percent float8 NOT NULL,
    tariff_min varchar NOT NULL
);