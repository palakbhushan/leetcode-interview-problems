-- Write your PostgreSQL query statement below

select w."id" from "weather" w 
join "weather" w2 on w."recorddate" = w2."recorddate" + INTERVAL '1 day'
where w."temperature" > w2."temperature" 