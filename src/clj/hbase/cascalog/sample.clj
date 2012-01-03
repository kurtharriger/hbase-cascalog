(ns hbase.cascalog.sample
  (:use [cascalog api playground])
  (:use [hbase.cascalog core ops]))

(defn -main []
  (?<- (hbase-tap "age-table" "?person" "cf" "?age") [?person ?age] (age ?person ?age))

  (let [age-table (hbase-tap "age-table" "?person" "cf" "?age")]
    (?<- (stdout) [?p ?a] (age-table ?p ?age) (as-string ?age :> ?a))))

;; (-main)
