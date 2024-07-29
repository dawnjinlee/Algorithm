-- 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값
-- 큰 순서대로 상위 3개의 맛


-- SELECT FLAVOR, SUM(TOTAL_ORDER)
--   FROM JULY
-- GROUP BY FLAVOR;

-- SELECT FLAVOR, SUM(TOTAL_ORDER)
--   FROM FIRST_HALF
-- GROUP BY FLAVOR;

 SELECT FLAVOR
 FROM (
SELECT FLAVOR, SUM(TOT_PRICE)
, RANK() OVER (ORDER BY SUM(TOT_PRICE) DESC) AS RESULT
  FROM (
      SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOT_PRICE
  FROM JULY
GROUP BY FLAVOR
      UNION ALL
SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOT_PRICE
  FROM FIRST_HALF
GROUP BY FLAVOR
  )
 GROUP BY FLAVOR
)
WHERE RESULT <= 3;

