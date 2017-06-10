(ns clj-kit.coll-kit-test
  (:require [clojure.test :refer :all]
            [clj-kit.coll-kit :refer :all]))

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
