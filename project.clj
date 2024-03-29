(defproject com.cgore/evolve "0.1.0-SNAPSHOT"
  :description "A Clojure/ClojureScript library for Evolutionary Algorithms."
  :url "https://github.com/cgore/clojure-evolve"
  :scm {:name "git"
        :url "https://github.com/cgore/clojure-evolve"}
  :license {:name "Apache License Version 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0.txt"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [com.cgore/rosenbrock "0.1.0"]
                 [com.cgore/mersenne-twister "1.0.0"]]
  :repl-options {:init-ns evolve.core})
