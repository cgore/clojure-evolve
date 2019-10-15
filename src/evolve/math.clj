(ns evolve.math
  (:require [clojure.math.numeric-tower :refer [expt]]))

(defn **2
  "Uses the numeric tower expt to square a number"
  [x]
  (expt x 2))
