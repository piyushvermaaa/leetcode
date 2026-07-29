# Write your MySQL query statement below
SELECT email as Email FROM Person GROUP BY Email having count(*) > 1;