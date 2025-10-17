-- 코드를 작성해주세요
SELECT
    DISTINCT(d.ID),
    d.EMAIL,
    d.FIRST_NAME,
    d.LAST_NAME
FROM SKILLCODES s
JOIN DEVELOPERS d
ON s.CODE & d.SKILL_CODE = s.CODE
WHERE s.NAME = 'Python' OR s.NAME = 'C#'
ORDER BY d.ID;

# SELECT distinct(id), email, first_name, last_name
# FROM developers as A JOIN skillcodes as B ON A.skill_code & B.code = B.code
# where name in ('Python', 'C#')
# order by id;