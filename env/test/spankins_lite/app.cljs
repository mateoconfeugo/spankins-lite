(ns spankins-lite.app
  (:require
    [doo.runner :refer-macros [doo-tests]]
    [spankins-lite.core-test]))

(doo-tests 'spankins-lite.core-test)


