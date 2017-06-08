(ns clj-kit.string-kit)

(defn is-lower?
  [st]
  (->> (map #(Character/isLowerCase %) st)
       (every? true?)))

(defn is-upper?
  [st]
  (->> (map #(Character/isUpperCase %) st)
       (every? true?)))

(defn is-integer?
  [arg]
  (try
    (when (Integer/parseInt arg) true)
    (catch NumberFormatException e false)))

(defn is-double?
  [arg]
  (try
    (when (Double/parseDouble arg) true)
     (catch NumberFormatException e false)))

