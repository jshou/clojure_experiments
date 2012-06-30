(ns birthday.core)

(def month-day [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31])

(defn date-int [month day]
  (let [previous-month-days (reduce + (map month-day (range (- month 1))))]
    (+ previous-month-days day)))

(defn -main [& args]
  (let [int-args (map #(Integer/parseInt %) args)
        current-date (new java.util.Date)
        current-date-int (date-int (inc (.getMonth current-date)) (.getDate current-date))
        birthday-date-int (date-int (first int-args) (last int-args))]
    (if (= current-date-int birthday-date-int)
      (println "Happy birthday!")
      (let [number-left (mod (- birthday-date-int current-date-int) 365)
            sing-pl-days (if (= number-left 1) "day" "days")]
        (println number-left sing-pl-days "to go!")))))
