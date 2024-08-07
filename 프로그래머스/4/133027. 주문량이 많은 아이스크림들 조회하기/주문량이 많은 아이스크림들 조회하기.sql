SELECT H.FLAVOR
 FROM 
  (SELECT FLAVOR, SUM(TOTAL_ORDER) AS SUM
     FROM FIRST_HALF
   GROUP BY FLAVOR
   ORDER BY FLAVOR) H,
  (SELECT FLAVOR, SUM(TOTAL_ORDER) AS SUM
     FROM JULY
   GROUP BY FLAVOR
   ORDER BY FLAVOR) J
WHERE H.FLAVOR = J.FLAVOR
ORDER BY H.SUM + J.SUM DESC
FETCH FIRST 3 ROWS ONLY;