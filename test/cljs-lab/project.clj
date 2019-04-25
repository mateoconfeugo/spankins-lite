(defproject lein-main "0.1.0-SNAPSHOT"

  :plugins [[lein-tools-deps "0.4.5"]
            [refactor-nrepl "2.4.0"]
            [cider/cider-nrepl "0.18.0"]
            ]
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]
  :profiles {:dev {:dependencies
                   [[com.bhauman/figwheel-main "0.1.7"]
                    [com.bhauman/rebel-readline-cljs "0.1.4"]]}}
  :aliases {"fig" ["trampoline" "run" "-m" "figwheel.main"]}
  :lein-tools-deps/config {:config-files [:install :user :project]}
:repl-options {:nrepl-middleware
                 [cider.nrepl/wrap-apropos
                  cider.nrepl/wrap-classpath
                  cider.nrepl/wrap-complete
                  cider.nrepl/wrap-debug
                  cider.nrepl/wrap-format
                  cider.nrepl/wrap-info
                  cider.nrepl/wrap-inspect
                  cider.nrepl/wrap-macroexpand
                  cider.nrepl/wrap-ns
                  cider.nrepl/wrap-spec
                  cider.nrepl/wrap-profile
                  cider.nrepl/wrap-refresh
                  cider.nrepl/wrap-resource
                  cider.nrepl/wrap-stacktrace
                  cider.nrepl/wrap-test
                  cider.nrepl/wrap-trace
                  cider.nrepl/wrap-out
                  cider.nrepl/wrap-undef
                  cider.nrepl/wrap-version]}
  )
