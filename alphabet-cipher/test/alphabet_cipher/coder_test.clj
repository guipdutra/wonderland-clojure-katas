(ns alphabet-cipher.coder-test
  (:require [clojure.test :refer :all]
            [alphabet-cipher.coder :refer :all]))

(deftest test-encode
  (testing "can encode given a secret keyword"
    (is (= "hmkbxebpxpmyllyrxiiqtoltfgzzv"
           (encode "vigilance" "meetmeontuesdayeveningatseven")))
    (is (= "egsgqwtahuiljgs"
           (encode "scones" "meetmebythetree")))))

;(deftest test-decode
;  (testing "can decode an cyrpted message given a secret keyword"
;   (is (= "meetmeontuesdayeveningatseven"
;          (decode "vigilance" "hmkbxebpxpmyllyrxiiqtoltfgzzv")))
;   (is (= "meetmebythetree"
;          (decode "scones" "egsgqwtahuiljgs")))))
