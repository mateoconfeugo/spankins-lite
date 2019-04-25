(ns spankins-lite.core-test
    (:require
    [pjstadig.humane-test-output]
    [cljs.test :refer-macros [is are deftest testing use-fixtures]]
    [spankins-lite.core]))

(deftest test-core
  (is (= true true)))


