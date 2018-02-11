(ns bob
  (:require [clojure.string :as str]))

(defn all-uppercase?
  "Detect if char in S is uppercase."
  [s]
  (= s (str/upper-case s)))

(defn all-lowercase?
  "Detect if char in S is lowercase."
  [s]
  (= s (str/lower-case s)))

(defn say-nothing?
  "Say nothing mens all blank in S"
  [s]
  (str/blank? s))

(defn yell?
  "Yell means in S, all char is uppercase and not all char in S is equal
  it's lowe-case.
  ex:
    IT IS TIME => true
    1, 2, 3    => false
  "
  [s]
  (and (all-uppercase? s)
       (not (all-lowercase? s))))

(defn ask?
  "Ask means there's a char \? in strin S."
  [s]
  (str/ends-with? s "?"))

(defn response-for [s]
  (cond
    ;; He says 'Fine. Be that way!' if you address him without
    ;; actually saying anything.
    (say-nothing? s)         "Fine. Be that way!"
    ;; He answers 'Whoa, chill out!' if you yell at him.
    (yell? s)     "Whoa, chill out!"
    ;; He answers 'Sure.' if you ask him a question.
    (ask? s) "Sure."
    ;; He answers 'Whatever.' to anything else.
    :else "Whatever."))
