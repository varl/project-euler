(def integers (range))

(defn multiple-of
  [x]
    (or
     (zero? (mod x 5))
     (zero? (mod x 3))))

(defn sum-of-natural-numbers
  [list-numbers]
  (reduce + (filter multiple-of list-numbers)))

(sum-of-natural-numbers
 (take 1000 integers))

