(ns clj-kit.string-kit-test
  (:require [clojure.test :refer :all]
            [clj-kit.string-kit :refer :all]))

(deftest is-only-alpha?-test
  (testing "is-only-alpha?"
    (are [x y] (= x (is-only-alpha? y))
      true "a"
      false "ab1"
      true "test"
      false ""
      false nil)))

(deftest contains-alpha?-test
  (testing "contains-alpha?"
    (are [x y] (= x (contains-alpha? y))
      true "a"
      true "ab1"
      true "test"
      false "1"
      false ""
      false nil)))

(deftest is-lower?-test
  (testing "is-lower?"
    (are [x y] (= x (is-lower? y))
         true "a"
         false "A"
         true "abcd"
         false "abCd"
         false "ABCD"
         false ""
         false nil)))

(deftest is-upper?-test
  (testing "is-upper?"
    (are [x y] (= x (is-upper? y))
         false "a"
         true "A"
         false "abcd"
         false "abCd"
         true "ABCD"
         false ""
         false nil)))

(deftest is-integer?-test
  (testing "is-integer?"
    (are [x y] (= x (is-integer? y))
         false "a"
         true "0"
         true "1"
         true "-1"
         false "1.0"
         false ""
         false nil)))

(deftest is-double?-test
  (testing "is-double?"
    (are [x y] (= x (is-double? y))
         false "a"
         true "0"
         true "1"
         true "-1"
         true "1.0"
         false ""
         false nil)))

