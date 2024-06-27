### DBコンテナ立ち上げ
````
docker-compose up -d  
````

### flywayでテーブル作成、データ投入
````
 docker-compose run --rm flyway-migrate
````

### flywayの実行状況確認
````
 docker-compose run --rm flyway-info
````

### flywayで作成したテーブル初期化
````
 docker-compose run --rm flyway-clean
````