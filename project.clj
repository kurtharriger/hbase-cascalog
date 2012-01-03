(defproject hbase.cascalog "0.1-SNAPSHOT"
  :source-path "src/clj"
  :java-fork "true"
  :java-debug "true"
  :description "simple cascalog wrapper for cascading.hbase"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojars.kurtharriger/cascading.hbase "1.2.8-SNAPSHOT"]
                 [cascalog "1.8.2"]
                 [log4j/log4j "1.2.15" :exclusions [javax.mail/mail
                                                    javax.jms/jms
                                                    com.sun.jdmk/jmxtools
                                                    com.sun.jmx/jmxri]]
                 [commons-logging/commons-logging "1.0.4"]]
  :dev-dependencies [[lein-hadoop "1.0.0"]]
  :jvm-opts ["-Xmx1024m" "-server"]
  :main hbase.cascalog.sample
  :aot :all)
