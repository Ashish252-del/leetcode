# Write your MySQL query statement below
select B.id from Weather A, Weather B where B.temperature > A.temperature &&  DATEDIFF(B.recordDate , A.recordDate) = 1
;