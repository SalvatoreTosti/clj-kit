(ns clj-kit.coll-kit)

(defn remove-nth
  [coll index]
  (cond
   (nil? coll) nil
   (empty? coll) nil
   (< index 0)
   (remove-nth coll 0)
   (>= index (count coll) )
   (remove-nth coll (dec (count coll)))
   :else
   (let [target (nth coll index)
         head (take index coll)
         tail (drop (inc index) coll)]
     {:target target :new-coll (concat head tail)})))

(defn remove-random
  [coll]
  (remove-nth coll (rand-int (count coll))))

(defn select-random-rec
  [coll selected number]
  (if (or (not (pos? number))
          (empty? coll))
    selected
    (let [removal (remove-random coll)]
      (select-random-rec (:new-coll removal) (conj selected (:target removal)) (dec number)))))

(defn select-random
  [coll number]
  (select-random-rec coll '() number))

(defn split-nth
  [coll index]
  (cond
   (nil? coll) nil
   (empty? coll) nil
   (< index 0) (split-nth coll 0)
   (>= index (count coll) ) (split-nth coll (dec (count coll)))
   :else
   (let [target (nth coll index)
         head (take index coll)
         tail (drop (inc index) coll)]
     {:target target :head head :tail tail})))

(defn remove-random
  [vect]
  (remove-nth vect (rand-int (count vect))))

(defn select-random-rec
  [coll selected number]
  (if (or (not (pos? number))
          (empty? coll))
    selected
  (let [removal (remove-random coll)]
    (select-random-rec (:new-coll removal) (conj selected (:target removal)) (dec number)))))

(defn select-random
  [coll number]
  (select-random-rec coll '() number))
