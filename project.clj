(defproject datomic-schema "1.3.0"
  :description "Schema generator for Datomic that won't set your boots alight"
  :url "http://www.github.com/Yuppiechef/datomic-schema"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.12.0"]]
  :profiles
  {:dev
   {:dependencies
    [[com.datomic/peer "1.0.7277"]
     [org.slf4j/slf4j-api "2.0.16"]
     [org.slf4j/slf4j-nop "2.0.16"]]}})
