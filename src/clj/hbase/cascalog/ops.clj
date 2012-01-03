(ns hbase.cascalog.ops
  (:use cascalog.api))

(def as-string identity)

(defn as-int [^String x]
  (Integer/parseInt x)
  )
