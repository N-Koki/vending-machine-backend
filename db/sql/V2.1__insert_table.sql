-- 販売データ初期データ投入
-- sales_idカラムはオートインクリメントなので不要
INSERT INTO sales_data(
    column_number,
    sales_juice_name,
    sales_price,
    sales_datetime
)
VALUES(
    1,
    'コーラ',
    100,
    current_timestamp
);