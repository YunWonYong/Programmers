module SumTwo where

solution :: Int -> Int -> Int
solution a b = sum [x..y]
  where x = min a b
        y = max a b

main :: IO ()
main = do
  print $ solution 3 5
  print $ solution 3 3
  print $ solution 5 3
