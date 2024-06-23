-- 販売データテーブル作成
CREATE TABLE IF NOT EXISTS sales_data(
    sales_id SERIAL NOT NULL PRIMARY KEY,
    column_number INT NOT NULL,
    sales_juice_name VARCHAR(50) NOT NULL,
    sales_price INT NOT NULL,
    sales_datetime TIMESTAMP,
    FOREIGN KEY(column_number) REFERENCES vending_machine_column(column_number)
);

