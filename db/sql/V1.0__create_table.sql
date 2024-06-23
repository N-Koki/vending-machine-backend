-- 自動販売機コラムテーブル作成（画像は一旦Base64エンコードした文字列を格納）
CREATE TABLE IF NOT EXISTS vending_machine_column(
    column_number SERIAL NOT NULL PRIMARY KEY,
    juice_name VARCHAR(50) NOT NULL,
    juice_image TEXT NOT NULL,
    price INT NOT NULL,
    temperature_display VARCHAR(50) NOT NULL,
    stock INT NOT NULL
);

