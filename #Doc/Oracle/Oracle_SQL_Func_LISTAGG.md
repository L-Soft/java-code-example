### LISTAGG 함수

## 특징

* 여러개의 ROW를 하나의 컬럼에 보여줘야 할 경우에 사용할 수 있는 함수이다.
* LIST를 구분자로 AGGREGATE 해주는 함수이며, 행 데이터를 특정 구분자를 가지는 열로 쉽게 표현할 수 있다.("세로" 값을 "가로"로 바꿀 수 있다.)
* 구분자를 입력하는 부분이 따로 있으며, WITHIN GROUP의 ODRER BY 절을 통해 데이터를 정렬해서 한문장으로 만들 수 있다.
* 기존 버전의 경우 하나로 묶을 ROW의 개수를 알아야만 하나의 컬럼으로 만들 수 있는 반면, 이 함수를 사용할 경우에는 그룹핑 할 최대의 ROW 수를 알지 못하여도 사용할 수 있다.

문법
~~~ sql
LISTAGG(컬럼, 구분값) WITHIN GROUP(ORDER BY 절)
~~~

예제
~~~ sql
SELECT DEPTNO
     , SUBSTR(XMLAgg(XMLELEMENT(x, ',', empno) ORDER BY empno).Extract('//text()'), 2) "9i"
     , WM_CONCAT(empno) "10g"
     , LISTAGG(empno, ',') WITHIN GROUP(ORDER BY empno) "11g"
FROM   EMP
GROUP  BY DEPTNO
ORDER  BY DEPTNO
~~~

