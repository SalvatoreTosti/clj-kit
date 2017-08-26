(ns clj-kit.numeric-kit)

(defn non-zero [coll]
  "Returns original collection with elements equal to 0 removed."
  (cond
   (nil? coll) nil
   (empty? coll) nil
   :else
   (->> coll
        (filter #(not (zero? %))))))

(defn min-non-zero [coll]
  "Returns smallest non-zero element of the given collection."
  (let [results (non-zero coll)]
    (if
      (nil-or-empty? results) nil
      (apply min results))))
