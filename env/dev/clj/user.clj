(ns ^:no-doc user
  (:require [clojure.tools.namespace.repl :as tn]))

(defn refresh []
  (tn/refresh))
