(defproject dtbrowser "0.1.0-SNAPSHOT"
  :description "Digitrad data browser"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [cljs-ajax "0.2.3"]
                 [om "0.5.0"]]

  :plugins [[lein-cljsbuild "1.0.2"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "dtbrowser"
              :source-paths ["src"]
              :compiler {
                :output-to "dtbrowser.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
