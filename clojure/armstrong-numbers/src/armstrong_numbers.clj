(ns armstrong-numbers)

(defn exp
  "Calculate exponentiation."
  [x n]
  (reduce * (repeat n x)))

(defn digits
  "seq the number to char digit, ex: 10 -> [1 0]."
  [n]
  (map #(-> % str read-string)
       (-> n str seq)))

(defn armstrong? [n]
  (let [n-array (digits n)
        len (count n-array)
        e-array (take len (repeat len))
        armstrong-n (reduce +  (map exp n-array e-array))]

    (= n armstrong-n)))
