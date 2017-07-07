(ns clj-kit.string-kit)

(defn is-only-alpha?
  [st]
  (cond
   (nil? st) false
   (empty? st) false
   :else
   (->> (map #(Character/isLetter %) st)
        (every? true?))))

(defn is-lower?
  [st]
  (->> (map #(Character/isLowerCase %) st)
       (every? true?)))

(defn is-upper?
  [st]
  (->> (map #(if (Character/isLetter %) (Character/isUpperCase %) true) st)
       (every? true?)))

(defn is-integer?
  [st]
  (try
    (when (Integer/parseInt st) true)
    (catch NumberFormatException e false)))

(defn is-double?
  [st]
  (try
    (when (Double/parseDouble st) true)
    (catch NumberFormatException e false)))

(defn contains-alpha?
  [st]
  (->> (map #(Character/isLetter %) st)
       (some true?)))

