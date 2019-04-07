Select sc.Score,
       (Select Count(1) + 1 From (Select Distinct Score from Scores) as uniqeScores where Score > sc.Score) as rank 
From Scores sc 
Order by sc.Score Desc;

-- count(1) is equal to count(*)

SELECT s.Score, count(distinct t.score) Rank
FROM Scores s JOIN Scores t ON s.Score <= t.score
GROUP BY s.Id
ORDER BY s.Score desc;


-- this still look weird
SELECT
  Score,
  @rank := @rank + (@prev <> (@prev := Score)) Rank
FROM
  Scores,
  (SELECT @rank := 0, @prev := -1) init
ORDER BY Score desc