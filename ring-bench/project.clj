(defproject AlexsandroRyan/ring-bench "1.0.0-1.12.1"
  :description "Ring core libraries."
  :url "https://github.com/AlexsandroRyan/ring"
  :scm {:dir ".."}
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [jmh-clojure "0.4.0"]
                 [AlexsandroRyan/ring-jetty-adapter "1.0.0-1.12.1"]
                 [AlexsandroRyan/ring-servlet "1.0.0-1.12.1"]]
  :jvm-opts {}
  :main ring.bench.servlet)
