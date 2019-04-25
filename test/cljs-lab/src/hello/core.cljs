(ns hello.core
  ;;  (:require [blessed :as blessed])
  (:require [cljs.nodejs :as nodejs])
  )

(nodejs/enable-util-print!)

(defn hello []
  (println "hello There") )

(defn -main []
  ;; (println "Hello world, the time is" (time-str (t/now)))
  (hello)
  )



;; uncomment this to alter the provided "app" DOM element
;; (set! (.-innerHTML (js/document.getElementById "app")) (hello))
