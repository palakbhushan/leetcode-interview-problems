-- Write your PostgreSQL query statement below
select tweet_id from "tweets" t where Length(t."content") > 15