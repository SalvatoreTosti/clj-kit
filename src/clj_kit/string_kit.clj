(ns clj-kit.string-kit)

(defn is-only-alpha?
  "Determines if a string only contains letters."
  [st]
  (cond
   (nil? st) false
   (empty? st) false
   :else
   (->> (map #(Character/isLetter %) st)
        (every? true?))))

(defn contains-alpha?
  "Determines if a string contains at least 1 letter."
  [st]
  (cond
   (nil? st) false
   (empty? st) false
   :else
   (->> (map #(Character/isLetter %) st)
        (some true?)
        (nil?)
        (not))))

(defn is-lower?
  "Determines if all characters in a string are lowercase."
  [st]
  (cond
   (nil? st) false
   (empty? st) false
   :else
   (->> (map #(Character/isLowerCase %) st)
        (every? true?))))

(defn is-upper?
  "Determines if all characters in a string are uppercase."
  [st]
  (cond
   (nil? st) false
   (empty? st) false
   :else
   (->> (map #(if (Character/isLetter %) (Character/isUpperCase %) true) st)
        (every? true?))))

(defn is-integer?
  "Determines if a given string is an integer."
  [st]
  (try
    (when (Integer/parseInt st) true)
    (catch Exception e false)))

(defn is-double?
  "Determines if a given string is a double."
  [st]
  (try
    (when (Double/parseDouble st) true)
    (catch Exception e false)))


