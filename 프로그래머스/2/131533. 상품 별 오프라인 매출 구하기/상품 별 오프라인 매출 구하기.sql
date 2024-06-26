-- 코드를 입력하세요
-- 상품코드 별 매출액(판매가 * 판매량) 합계

SELECT PRODUCT.PRODUCT_CODE, PRODUCT.PRICE * SUM(OFFLINE_SALE.SALES_AMOUNT) SALES
  FROM OFFLINE_SALE 
     , PRODUCT 
 WHERE OFFLINE_SALE.PRODUCT_ID = PRODUCT.PRODUCT_ID (+)
GROUP BY PRODUCT.PRODUCT_CODE, PRODUCT.PRICE
ORDER BY SALES DESC, PRODUCT_CODE ASC;


SELECT P.PRODUCT_CODE, P.PRICE * SUM(S.SALES_AMOUNT) SALES
  FROM OFFLINE_SALE S
     , PRODUCT      P
 WHERE S.PRODUCT_ID = P.PRODUCT_ID (+)
GROUP BY P.PRODUCT_CODE, P.PRICE
ORDER BY SALES DESC, PRODUCT_CODE ASC;
