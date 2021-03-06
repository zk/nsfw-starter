(ns app
  (:require [nsfw]
            [nsfw.env :as env]
            [nsfw.html :as html]))

(nsfw/defcomp markdown [opts body]
  [:div.markdown
   (-> opts :src slurp html/markdown)])

(nsfw/defroute "/"
  home [r]
  (nsfw/render-html
   [:head
    [:link {:rel "stylesheet" :href "/css/app.css"}]
    [:title "NSFW Starter!"]]
   [:body
    [:markdown {:src "src/md/intro.md"}]
    [:script {:type "text/javascript" :src "/js/app.js"}]
    [:script {:type "text/javascript"} "app.entry()"]]))

(defn -main []
  (nsfw/app :repl-port 7888
            :server-port (env/int :port 8080)
            :autoload "src/clj"))