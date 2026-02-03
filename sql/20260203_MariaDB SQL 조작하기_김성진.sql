
#1
CREATE TABLE BOOK_INFO (
	도서번호 INT PRIMARY KEY,
	도서명 VARCHAR(50) NOT NULL,
	저자 VARCHAR(50) NOT NULL,
	도서가격 INT,
	출판사 VARCHAR(50) DEFAULT '미지정',
	발행일 DATE 
);

SELECT * FROM BOOK_INFO;

#2
INSERT INTO BOOK_INFO (도서번호, 도서명, 저자, 도서가격, 출판사, 발행일)
VALUES (101, '자바 기초', '홍길동', 30000, 'A출판', '2025-02-15');

INSERT INTO BOOK_INFO (도서번호, 도서명, 저자, 도서가격, 출판사, 발행일)
VALUES (102, '리액트 기초', '이순신', 20000, 'B출판', '2025-01-22');

#3
UPDATE BOOK_INFO 
SET 
도서명 = '자바_고급',
도서가격 = 25000,
출판사 = 'IT출판'
WHERE 도서번호 = 101;

#4
SELECT EMPNO, ENAME, SAL, COMM AS '인센티브'
FROM EMP 
WHERE SAL BETWEEN 500 AND 3000 AND COMM IS NULL;

SELECT * FROM EMP;
SELECT * FROM DEPT;

#5
SELECT EMPNO, ENAME, JOB, HIREDATE
FROM EMP 
WHERE ENAME LIKE '%병%' OR ENAME LIKE '%김%'
ORDER BY JOB ASC, EMPNO DESC;

#6
SELECT EMPNO, ENAME, DEPTNO, 
	CASE
		WHEN DEPTNO = 10 THEN '인사부'
		WHEN DEPTNO = 20 THEN '영업부'
		WHEN DEPTNO = 30 THEN '개발부'
		ELSE '생산부'
	END AS 부서명
FROM EMP;

#7
SELECT EMPNO, E.DEPTNO, DNAME, SUBSTR(ENAME, 2, 2) AS '이름'
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
AND HIREDATE BETWEEN '03-01-01' AND '06-12-31';

#8
#사번, 사원명, 급여, 커미션, 총 급여를 조회하여라. 총 급여는 다음과 같이 계산한다. 
#총 급여 : 급여 * 12 + 커미션
#데이터 조회 시 커미션이 null이라면 0으로 치환하여 계산하고, 총 급여는 TOTAL_SALARY라는 별칭으로 조회하여라. 
#단, 조회 데이터는 총 급여 기준 내림차순으로 정렬하시오. 
SELECT EMPNO, ENAME, IFNULL(COMM, 0), (SAL * 12 + IFNULL(COMM, 0)) AS TOTAL_SALARY
FROM EMP
ORDER BY TOTAL_SALARY DESC;

#9
#조인을 사용하여 부서명이 ‘인사부’가 아니고 급여가 500이상인 사원의 사번, 이름, 입사일, 급여, 부서번호, 부서명을
#조회하는 쿼리문을 작성해보자. 단, 정렬은 사번 기준 내림차순으로 정렬 후 사원 이름 기준 오름차순으로 정렬한다.
SELECT EMPNO, ENAME, HIREDATE, SAL, E.DEPTNO, DNAME
FROM EMP E, DEPT D 
WHERE E.DEPTNO = D.DEPTNO
AND DNAME != '인사부' AND SAL >= 500
ORDER BY EMPNO DESC, ENAME ASC;

#10
#정답 : 2개
#이유 : DISTINCT는 나열된 모든 컬럼의 중복을 제외하기때문에 모든컬럼에서 중복이없는 행만 조회될것 같습니다.
#		청바지 3 USER1 , 셔츠 6 USER2 
