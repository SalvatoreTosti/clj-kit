(ns clj-kit.string-kit-test
  (:require [clojure.test :refer :all]
            [clj-kit.string-kit :refer :all]))

(deftest is-only-alpha?-test
  (testing "is-alpha?"
    (are [x y] (= x (is-only-alpha? y))
      true "a"
      false "ab1"
      true "test"
      false ""
      false nil)))

;; (defn is-non-alpha?
;;   [st]
;;   (not (is-alpha? st)))

;; (defn is-lower?
;;   [st]
;;   (->> (map #(Character/isLowerCase %) st)
;;        (every? true?)))

;; (defn is-upper?
;;   [st]
;;   (->> (map #(if (Character/isLetter %) (Character/isUpperCase %) true) st)
;;        (every? true?)))

;; (defn is-integer?
;;   [st]
;;   (try
;;     (when (Integer/parseInt st) true)
;;     (catch NumberFormatException e false)))

;; (defn is-double?
;;   [st]
;;   (try
;;     (when (Double/parseDouble st) true)
;;      (catch NumberFormatException e false)))

;; (defn contains-alpha?
;;   [st]
;;   (->> (map #(Character/isLetter %) st)
;;        (some true?)))

