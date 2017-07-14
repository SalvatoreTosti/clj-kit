(ns clj-kit.string-kit)

(defn is-only-alpha?
  [st]
  (cond
   (nil? st) false
   (empty? st) false
   :else
   (->> (map #(Character/isLetter %) st)
        (every? true?))))

(defn contains-alpha?
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
  [st]
  (cond
   (nil? st) false
   (empty? st) false
   :else
   (->> (map #(Character/isLowerCase %) st)
        (every? true?))))

(defn is-upper?
  [st]
  (cond
   (nil? st) false
   (empty? st) false
   :else
   (->> (map #(if (Character/isLetter %) (Character/isUpperCase %) true) st)
        (every? true?))))

(defn is-integer?
  [st]
  (try
    (when (Integer/parseInt st) true)
    (catch Exception e false)))

(defn is-double?
  [st]
  (try
    (when (Double/parseDouble st) true)
    (catch Exception e false)))


