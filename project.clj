(defproject org.clojars.salvatore-tosti/clj-kit "0.1.0-SNAPSHOT"
  :description "A library which extends the standard Clojure functions."
  :url "https://github.com/SalvatoreTosti/clj-kit"
  :license {:name "MIT License"
            :url "https://github.com/SalvatoreTosti/clj-kit/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot clj-kit.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
