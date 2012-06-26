;; fizbuzz
(defn fizzbuzz [a]
  (if (= (mod a 5) 0)
    (if (= (mod a 3) 0)
      "fizzbuzz"
      "buzz")
    (if (= (mod a 3) 0)
      "fizz"
      a)))

(map fizzbuzz (range 1 10))
