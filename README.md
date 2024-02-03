DB 설정

CREATE table GOODS (
  ID INT NOT NULL COMMENT 'ID'
, SKU bigint DEFAULT 0 COMMENT 'SKU'
, TITLE VARCHAR(50) COMMENT 'TITLE'
, DESCRIPTION VARCHAR(1000) COMMENT 'DESCRIPTION'
, AVAILABLESIZES VARCHAR(50) COMMENT 'AVAILABLESIZES'
, STYLE VARCHAR(50) COMMENT 'STYLE'
, PRICE INT DEFAULT 0 COMMENT 'PRICE'
, INSTALLMENTS INT DEFAULT 0 COMMENT 'INSTALLMENTS'
, CURRENCYID VARCHAR(50) COMMENT 'CURRENCYID'
, CURRENCYFORMAT VARCHAR(50) COMMENT 'CURRENCYFORMAT'
, PRIMARY KEY(ID)
)
;


INSERT into GOODS values (
'9000001'
,'8552515751438644'
, 'Cropped Stay Groovy off white'
, '14/15 s/n'
, '"X","L","XL","XXL"'
, 'White T-shirt'
, '10.9'
, '9'
, 'USD'
,  '$'
);

INSERT into GOODS values (
'9000002'
,'39876704341265610'
, 'Basic Cactus White T-shirt'
, '14/15 s/n'
, '"X","ML","L"'
, 'Wine'
, '13.25'
, '3'
, 'USD'
,  '$'
);


INSERT into GOODS values (
'9000003'
,'9197907543445676'
, 'Basic Cactus White T-shirt'
, '14/15 s/n-Jogador'
, '"XL"'
, 'Tony Hawk'
, '25.9'
, '5'
, 'USD'
,  '$'
);


INSERT into GOODS values (
'9000004'
,'51498472915966370'
, 'Black Tule Oversized'
, ''
, '"M","ML"'
, 'Tony Hawk'
, '29.45'
, '5'
, 'USD'
,  '$'
);

... 더 많은 데이터는 company-study-react / src/static/json/products.json 참고
