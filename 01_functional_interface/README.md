# ■Supplier
- 引数なし
- 戻り値1つ

# ■Consumer

forEach で使われている。

## Consumer<T>

- 引数あり
- 戻り値なし

## BiConsumer<T, U>

- 引数2つ
- 戻り値なし

# ■Predicate
filter で使われている。

## Predicate<T>
- 引数あり
- 戻り値はboolean

## BiPredicate<T, U>
- 引数2つ
- 戻り値はboolean

# ■Function
## Function<T, R>
- 引数1つ
- 戻り値1つ

## BiFunction<T, U, R>
- 引数2つ
- 戻り値1つ

## UnaryOperator<T>
UnaryOperatorはFunctionを継承していて、引数と戻り値の型が同じ場合に使う。

- 引数1つ
- 戻り値1つ

## BinaryOperator<T>
BinaryOperatorはFunctionを継承していて、引数2つと戻り値の型が同じ場合に使う。

- 引数2つ
- 戻り値1つ