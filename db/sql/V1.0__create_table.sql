-- 自動販売機管理テーブル作成
CREATE TABLE IF NOT EXISTS vending_machine_column(
column_number INT NOT NULL PRIMARY KEY,
juice_name VARCHAR(50) NOT NULL,
juice_image BYTEA NOT NULL,
price MONEY NOT NULL,
temperature_display VARCHAR(50) NOT NULL,
stock INT NOT NULL
);

