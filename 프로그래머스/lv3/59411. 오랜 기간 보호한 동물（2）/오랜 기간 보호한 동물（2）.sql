-- 코드를 입력하세요
SELECT
    AI.ANIMAL_ID,
    AI.NAME
FROM
    ANIMAL_INS AI
    LEFT OUTER JOIN ANIMAL_OUTS AO
    ON AI.ANIMAL_ID = AO.ANIMAL_ID
WHERE
    AO.DATETIME IS NOT NULL
ORDER BY DATEDIFF(AO.DATETIME,AI.DATETIME)+1 DESC
LIMIT 2