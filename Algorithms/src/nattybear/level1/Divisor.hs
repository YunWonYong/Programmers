module Divisor where

import Data.Bool
import Data.List

solution :: [Int] -> Int -> [Int]
solution xs d = bool xs [(-1)] $ solution' xs d == []

solution' :: [Int] -> Int -> [Int]
solution' xs d = sort $ filter (\x -> x `mod` d == 0) xs

main :: IO ()
main = do
  print $ solution [5, 9, 7, 10] 5
  print $ solution [2, 36, 1, 3] 1
  print $ solution [3, 2, 6] 10
