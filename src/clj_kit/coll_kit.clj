(ns clj-kit.coll-kit)

(defn coll-contains?
  "Returns true if element is present in given collection, acts like 'contains?' for list and vector."
  [coll item]
  (cond
   (list? coll) (not (neg? (.indexOf coll item)))
   (vector? coll) (not (neg? (.indexOf coll item)))
  :else
  (contains? coll item)))

(defn remove-nth
  "Removes nth element from a collection, returns a map with keys :target and :new-coll."
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
  "Removes a random element from a given collection."
  [coll]
  (remove-nth coll (rand-int (count coll))))

(defn- select-random-rec
  "Helper function used to recursively select a random number of items from a given collection."
  [coll selected number]
  (if (or (not (pos? number))
          (empty? coll))
    selected
    (let [removal (remove-random coll)]
      (select-random-rec (:new-coll removal) (conj selected (:target removal)) (dec number)))))

(defn select-random
  "Selects a random number of items from a given collection."
  [coll number]
  (select-random-rec coll '() number))

(defn split-nth
  "Splits collections at the nth element, returns a map with keys :target, :head, and :tail."
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
  "Removes a random item from a given list, returns a map with keys :target and :new-coll."
  [coll]
  (remove-nth coll (rand-int (count coll))))

(defn rand-nth-keys
  "Returns a random key from a given map."
  [coll]
  (rand-nth (keys coll)))

(defn rand-nth-values
  "Returns a random value from a given map."
  [coll]
  (coll (rand-nth-keys coll)))
