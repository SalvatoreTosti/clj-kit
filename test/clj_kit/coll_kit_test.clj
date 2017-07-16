(ns clj-kit.coll-kit-test
  (:require [clojure.test :refer :all]
            [clj-kit.coll-kit :refer :all]))

(deftest coll-contains?-map-test
  (testing "coll-contains? function map inputs"
    (let [coll-map {:a 1 :b 2 :c 3}
          coll-list '(:a :b :c)
          coll-vec [:a :b :c]]
      (are [x y] (= x (coll-contains? coll-map y))
           true :a
           true :b
           true :c
           false :d
           false 0
           false "a"
           false nil))))

(deftest coll-contains?-list-test
  (testing "coll-contains? function list inputs"
    (let [coll-map {:a 1 :b 2 :c 3}
          coll-list '(:a :b :c)
          coll-vec [:a :b :c]]
      (are [x y] (= x (coll-contains? coll-list y))
           true :a
           true :b
           true :c
           false :d
           false 0
           false "a"
           false nil))))

(deftest coll-contains?-vec-test
  (testing "coll-contains? function vec inputs"
    (let [coll-map {:a 1 :b 2 :c 3}
          coll-list '(:a :b :c)
          coll-vec [:a :b :c]]
      (are [x y] (= x (coll-contains? coll-vec y))
           true :a
           true :b
           true :c
           false :d
           false 0
           false "a"
           false nil))))

(deftest remove-nth-target-vector-test
  (testing "remove-nth function target vector"
    (let [coll ["a" "b" "c"]]
      (are [x y] (=  x (:target (remove-nth coll y)))
           "a" -1
           "a" 0
           "b" 1
           "c" 2
           "c" 3
           ))))

(deftest remove-nth-new-coll-vector-test
  (testing "remove-nth function new-coll vector"
    (let [coll ["a" "b" "c"]]
      (are [x y] (=  x (:new-coll (remove-nth coll y)))
           '("b","c") -1
           '("b","c") 0
           '("a","c") 1
           '("a","b") 2
           '("a","b") 3
           ))))

(deftest remove-nth-target-list-test
  (testing "remove-nth function target vector"
    (let [coll '("a" "b" "c")]
      (are [x y] (=  x (:target (remove-nth coll y)))
           "a" -1
           "a" 0
           "b" 1
           "c" 2
           "c" 3
           ))))

(deftest remove-nth-new-coll-list-test
  (testing "remove-nth function new-coll"
    (let [coll '("a" "b" "c")]
      (are [x y] (=  x (:new-coll (remove-nth coll y)))
           '("b","c") -1
           '("b","c") 0
           '("a","c") 1
           '("a","b") 2
           '("a","b") 3
           ))))

(deftest remove-nth-target-list-test
  (testing "remove-nth function target vector"
    (let [coll '("a" "b" "c")]
      (are [x y] (=  x (:target (remove-nth coll y)))
           "a" -1
           "a" 0
           "b" 1
           "c" 2
           "c" 3
           ))))

;; (deftest select-random-test
;;   (testing "select-random function"
;;     (let [coll '("a" "b" "c")]
;;       (is (not (neg? (.indexOf coll x)))
;;                       ;(.indexOf '("a" :b "c") "b")

;;       (are [x y] ((select-random coll y))
;;            "a" 1
;;            "a" 0
;;            "b" 1
;;            "c" 2
;;            "c" 3
;;            )))))

(deftest rand-nth-keys-test
  (testing "rand-nth-keys, repeats function 100 times and returns true if all results are within original map."
    (let [coll {:a "a" :b "b" :c "c"}]
      (is (= true
             (->> (take 100 (repeatedly #(rand-nth-keys coll)))
                  (map #(contains? coll %))
                  (every? true?)))))))

