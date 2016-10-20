; f = f-1 + f-2
(defn fib
  [a b]
  (cons a
        (lazy-seq
         (fib b (+ b a)))))

(defn calc-fib-under
  [amount]
  (take-while #(< % amount) (fib 1 1)))

(reduce + (filter even? (calc-fib-under 4000000)))