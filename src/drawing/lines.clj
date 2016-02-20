(ns drawing.lines
  (:require [quil.core :as q]))

(defn setup []
  (q/frame-rate 30)
  (q/color-mode :rgb))

(defn draw []
  (q/stroke 0 0 255)
  (q/line 300 0 (q/mouse-x) (q/mouse-y))

  ;; (q/line 300 6 (q/mouse-x) (q/mouse-y))

  ;; (q/line 6 500 (q/mouse-x) (q/mouse-y))

  (q/stroke 0 255 0)
  (q/line 300 500 (q/mouse-x) (q/mouse-y)))


(q/defsketch hello-lines

  :title "You can see lines"

  :size [500 500]

  :setup setup

  :draw draw

  :features [:keep-on-top])
