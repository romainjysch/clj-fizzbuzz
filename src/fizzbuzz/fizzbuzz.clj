(ns fizzbuzz.fizzbuzz)

(defn fizz? [x]
  (zero? (rem x 5)))

(defn buzz? [x]
  (zero? (rem x 7)))

(defn fizzbuzz? [x]
  (and (fizz? x) (buzz? x)))

(defn process
  [x]
  (cond
    (fizzbuzz? x) "FizzBuzz"
    (buzz? x) "Buzz"
    (fizz? x) "Fizz"
    :else x))