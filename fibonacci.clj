;; fibonacci

(defn fib [a]
  (if (or (= 1 a) (= 0 a))
    a
    (+ (fib (- a 1)) (fib (- a 2)))))

(fib 10)
(fib 12)
