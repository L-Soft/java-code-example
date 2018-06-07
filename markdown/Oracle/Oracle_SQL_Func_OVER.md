### OVER()함수란?
OVER 함수는 ORDERBY, GROUP BY 서브 쿼리를 개선하기 위해 나온 함수라고 할 수 있습니다.

### 전통 SQL 사용
~~~sql
SELECT YYMM, PRICE
FROM (
    SELECT YYMM, SUM(TOT_PRICE) AS PRICE FROM TABLE 1
    GROUP BY YYMM
    ORDER BY YYMM DESC
)
~~~

### OVER 함수 이용
~~~sql
SELECT YYMM, SUN(TOT_PRICE)OVER(ORDER BY YYMM DESC) AS PRICE
  FROM TABLE 1
~~~

### COUNT(*)OVER() 사용
실제 데이터와 함께 해당 테이블의 전체 로우 컬럼을 쉽고 편리하게 추출할 수 있다.
~~~sql
SELECT MENU_ID, MENU_NAME, COUNT(*) AS TOTALCOUNT
  FROM MENU_MG
-- ORA-00937: not a single-group group function, 위의 쿼리를 실행하면 오류 메시지가 나온다.
~~~

~~~sql
SELECT MENU_ID, MENU_NAME, COUNT(*)OVER() AS TOTALCOUNT
 FROM MENU_MG
~~~

### OVER() 함수
~~~ sql
COUNT(*)OVER() -- 전체행 카운트
COUNT(*)OVER(PARTITION BY 컬럼) -- 그룹 단위로 나누어 카운트

MAX(컬럼)OVER() -- 전체행 중에 최고값
MAX(컬럼)OVER(PARTITION BY 컬럼) -- 그룹내 최고값

MIN(컬럼)OVER() -- 전체행 중에 최소값
MIN(컬럼)OVER(PARTITION BY 컬럼) -- 그룹내 최소값

SUM(컬럼)OVER() -- 전체행 합
SUM(컬럼)OVER(PARTITION BY 컬럼) -- 그룹내 합

AVG(컬럼)OVER() -- 전체행 평균값
AVG(컬럼)OVER(PARTITION BY 컬럼) -- 그룹내 평균

STDDEV(컬럼)OVER() -- 전체행 표준편차
STDDEV(컬럼)OVER(PARTITION BY 컬럼) -- 그룹내 표준편차

RATIO_TO_REPORT(컬럼)OVER() -- 현재 행 값, SUM(전체 행 값) %로 나타낼 경우 100 곱하면 됩니다.
RATIO_TO_REPORT(컬럼)OVER(PARTITION BY 컬럼) -- 현재 행 값, SUM(전체 행 값) %로 나타낼 경우 100 곱하면 됩니다.
~~~