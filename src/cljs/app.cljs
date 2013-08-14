(ns app
  (:require [nsfw.dom :as $]
            [nsfw.util :as util]))

(defn rand-color []
  (get [:red :green :blue] (rand 3)))

(defn ^:export entry []
  (let [$el ($/query :#dots)]
    (util/interval
     #(-> ($/node [:span "* "])
          ($/style {:color (rand-color)})
          ($/append-to $el))
     100)))