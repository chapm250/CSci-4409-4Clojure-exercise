;;; Put your solutions to the assigned 4Clojure exercises here and commit
;;; back up to your fork on Github.

;;; What you enter is what whatever you'd put in the "Code which fills in the blank"
;;; box in 4Clojure. You're welcome to include other things here (helper definitions,
;;; scratch computations you found helpful, etc.), SO MAKE SURE YOU LABEL YOUR
;;; "ANSWERS" clearly.

;;; I've included a few examples below just to give you a sense of what I'm looking
;;; for.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;Problem 10 - Intro to Maps
20

;Problem 16 - Hello World
#(str "Hello, " % "!")

;Problem 17 - Sequences: map
'(6 7 8)

;Problem 18 - Sequences: filter
'(6 7)

;Problem 20 - Penultimate Element
#(nth % (- (count %) 2))

;Problem 21 - Nth Element
(fn [seq n]
  (first (nthnext seq n)))

;Problem 23 - Reverse a Sequence
(fn [sequence] (into () sequence))

;Problem 25 - Find the odd numbers
(fn [n]
   (filter odd? n))

;Problem 37 - Regular Expressions
(apply str (re-seq #"[A-Z]+" "bA1B3Ce "))

;Problem 40 - Interpose a Seq
(fn [a b] (drop-last(interleave b (repeat a))))

;Problem 43 - Reverse Interleave
(fn [coll n]
  (apply map list (partition n coll)))

;Problem 44 - Rotate Sequence
(fn [n s]
   (loop [i 0 se s]
     (when (< i n)
       (recur (inc i) (drop 1 (conj se (first se)) )))))
;Problem 46 - Flipping out
#(fn [a b] (% b a))

;Problem 47 - Contain yourself
4
