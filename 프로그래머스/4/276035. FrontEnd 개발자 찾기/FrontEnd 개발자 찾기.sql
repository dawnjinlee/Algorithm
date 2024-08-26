SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
  FROM DEVELOPERS DEV, SKILLCODES SKILL
WHERE SKILL_CODE & SKILL.CODE
 AND SKILL_CODE >= SKILL.CODE
 AND CATEGORY = 'Front End'
GROUP BY ID, EMAIL, FIRST_NAME, LAST_NAME
ORDER BY ID;