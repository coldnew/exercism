(ns reverse-string)

(defn reverse-string [s]
  (reduce str
          (-> s str seq reverse)))
