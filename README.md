1. DBコンテナ立ち上げ
````
docker-compose up -d  
````

2. flywayでテーブル作成、データ投入
````
 docker-compose run --rm flyway-migrate
````