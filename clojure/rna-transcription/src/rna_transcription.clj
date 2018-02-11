(ns rna-transcription)

(defn- to-rna-1 [c]
  (case (str c)
    "C" "G"
    "G" "C"
    "A" "U"
    "T" "A"
    (throw (AssertionError. (str "Wrong rna code: " c)))))

(defn to-rna [s]
  (reduce str
          (map to-rna-1 (seq s))))
