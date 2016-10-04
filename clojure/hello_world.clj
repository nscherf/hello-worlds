(ns hello)
(defn greet [whom]
  (println (str "Hello," whom "!"))
  )
(hello/greet "world")
