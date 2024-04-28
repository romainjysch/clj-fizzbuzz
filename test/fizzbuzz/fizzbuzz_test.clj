(ns fizzbuzz.fizzbuzz_test
  (:require [clojure.test      :refer :all]
            [fizzbuzz.fizzbuzz :refer :all]))

(deftest process_given-2_should-be-2
  (testing "(process 2) should be 2"
    (is (= (process 2) 2))))

(deftest process_given-5_should-be-fizz
  (testing "(process 5) should be Fizz"
    (is (= (process 5) "Fizz"))))

(deftest process_given-7_should-be-buzz
  (testing "(process 7) should be Buzz"
    (let [result (process 7)]
      (is (= result "Buzz")))))

(deftest process_given-35_should-be-fizzbuzz
  (testing "(process 35) should be FizzBuzz"
    (let [result (process 35)]
      (is (= result "FizzBuzz")))))

(deftest process_given-99_should-be-99
  (testing "(process 99) should be 99"
    (is (= (process 99) 99))))