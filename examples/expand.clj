(ns expand
  (require [clojure.core.async :as a])
  (:import (clojure.lang Var)
           (java.util.concurrent.atomic AtomicReferenceArray)))

(let*
  [c__8787__auto__ (a/chan 1)
   captured-bindings__8788__auto__ (Var/getThreadBindingFrame)]
  (clojure.core.async.impl.dispatch/run
    (fn []
      (let
        [f__8789__auto__ (fn state-machine__8599__auto__
                           ([]
                             (clojure.core.async.impl.ioc-macros/aset-all!
                               (AtomicReferenceArray. 8)
                               0
                               state-machine__8599__auto__
                               1
                               1))
                           ([state_10652]
                             (let
                               [old-frame__8600__auto__ (Var/getThreadBindingFrame)
                                ret-value__8601__auto__ (try
                                                          (Var/resetThreadBindingFrame
                                                            (clojure.core.async.impl.ioc-macros/aget-object
                                                              state_10652
                                                              3))
                                                          (loop
                                                            []
                                                            (let
                                                              [result__8602__auto__
                                                               (case
                                                                 (int
                                                                   (clojure.core.async.impl.ioc-macros/aget-object
                                                                     state_10652
                                                                     1))
                                                                 2
                                                                 (let
                                                                   [inst_10646
                                                                    (clojure.core.async.impl.ioc-macros/aget-object
                                                                      state_10652
                                                                      7)
                                                                    inst_10649
                                                                    (clojure.core.async.impl.ioc-macros/aget-object
                                                                      state_10652
                                                                      2)
                                                                    inst_10650
                                                                    (inst_10646 inst_10649)]
                                                                   (clojure.core.async.impl.ioc-macros/return-chan
                                                                     state_10652
                                                                     inst_10650))
                                                                 1
                                                                 (let
                                                                   [inst_10646
                                                                    println
                                                                    inst_10647
                                                                    (a/chan)
                                                                    state_10652
                                                                    (clojure.core.async.impl.ioc-macros/aset-all!
                                                                      state_10652
                                                                      7
                                                                      inst_10646)]
                                                                   (clojure.core.async.impl.ioc-macros/take!
                                                                     state_10652
                                                                     2
                                                                     inst_10647)))]
                                                              (if
                                                                (identical? result__8602__auto__ :recur)
                                                                (recur)
                                                                result__8602__auto__)))
                                                          (catch
                                                            Throwable
                                                            ex__8603__auto__
                                                            (clojure.core.async.impl.ioc-macros/aset-all!
                                                              state_10652
                                                              clojure.core.async.impl.ioc-macros/CURRENT-EXCEPTION
                                                              ex__8603__auto__)
                                                            (clojure.core.async.impl.ioc-macros/process-exception
                                                              state_10652)
                                                            :recur)
                                                          (finally
                                                            (Var/resetThreadBindingFrame
                                                              old-frame__8600__auto__)))]
                               (if
                                 (identical? ret-value__8601__auto__ :recur)
                                 (recur state_10652)
                                 ret-value__8601__auto__))))
         state__8790__auto__ (->
                               (f__8789__auto__)
                               (clojure.core.async.impl.ioc-macros/aset-all!
                                 clojure.core.async.impl.ioc-macros/USER-START-IDX
                                 c__8787__auto__
                                 clojure.core.async.impl.ioc-macros/BINDINGS-IDX
                                 captured-bindings__8788__auto__))]
        (clojure.core.async.impl.ioc-macros/run-state-machine-wrapped state__8790__auto__))))
  c__8787__auto__)