(ns Performance.Minibench._foreign)

(defn hrTime [^double t]
  (- (System/nanoTime) t))

(defn gc [& _]
  (System/gc))

(defn toFixed [n]
  (format "%.2f" n))
