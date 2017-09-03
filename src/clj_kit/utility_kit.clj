(ns clj-kit.utility-kit)

(defn coalesce [& args]
    "Returns the first non-nil argument supplied."
  (-> (filter #(not (nil? %)) args)
      (first)))
