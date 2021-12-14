module Unique where

solution :: [Int] -> [Int]
solution = foldr go [] 

go :: Int -> [Int] -> [Int]
go x []      = [x]
go x (x':xs) = if x == x'
               then x : xs
               else x : x' : xs

main :: IO ()
main = do
  print $ solution [1, 1, 3, 3, 0, 1]
  print $ solution [4, 4, 4, 3, 3]
