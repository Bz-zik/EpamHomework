# EpamHomework

read: git-bisect

задачи с CodingBat с логикой тоже на гит

поразрядная сортировка (Radix Sort) быстрее чем quickSort
написать поразрядную сортировку

"дата и время" и "локализация" на самостоятельное обучение



RuntimeException -> Unchecked


__Selection sort (сортировка выбором) (берем найменьший элемент и вставляем в конец отсортированной части):  N^2/2 сравнений и N обменов (N^2, N^2, N^2 - рост в лучшем, среднем, худшем случае)

__Insertion sort (берем следующий элемент и двигаем его влево, пока он не встанет на нужное место): N-1 сравнений, 0 обменов в лучшем случае (N, N^2, N^2 - рост в лучшем, среднем, худшем случае)
1/2 * N^2 - в худшем (отсортировано в обратном порядке)

__Shellsort (делим на массивы меньшего размера с шагом n и сортируем их. Затем делим всё на массивы с шагом n-1 и т.д. - проблема на больших данных): в лучшем случае: (N*logN, ?, N^(3/2) - рост в лучшем, среднем, худшем случае)

__Mergesort (делим на части и рекурсивно (не обязательно) сортируем (отсортированно может быть чем угодно), затем соединяем всё обратно: поочередно сравниваем левый элемент из каждого массива и в отсортированный вставляем тот, который меньше)

__Quicksort (in-place - не требуется промежут. пространства & no stable) (берем очередной элемент и сразу ставим его туда, где он будет в конечном отсортированном массиве) в лучшем случае n*lg(n) сравнений, в худшем 1/2*n^2

__Radix sort



/* 21.08.17
Functional Descriptors
Predicate<T>            test        T       ->  boolean
BiPredicate<T, V>       test        (T, V)  -> boolean
Consumer<T>             accept      T       -> void
Suplier<T>              get         ()      -> T
Function<T, R>          apply       T       -> R
UnaryOperator<T>        apply       T       -> T
BiFunction<T, U, R>     apply       (T, U)  -> R
BinaryOperator<T>       apply       (T, T)  -> T
Runnable                run         ()      -> void
Callable<V>             call        ()      -> void

 */



 /*
 MethodReferences

 (args) -> ClassName.staticMethod(args);
 == (то же самое, что)
 ClassName::staticMethod;


 (arg, rest...) -> arg.instanceMethod(rest);  // arg - то, к чему применяется; rest - параметры
 ==
 ClassName::instanceMethod;

 (args) -> expr.instanceMethod(args);
 ==
 expr::instanceMethod;
 */
 
 
 Виртуальная машина работает до тех пор, пока рабоатет хотя бы один поток НЕ демон.
 Volatile - записывает значения в RAM, откуда оно видно для всех потоков сразу (когда один поток делает изменения, другой это сразу видит)

в synchronized должно быть только чтение данных или изменение, а выполнение задачи в другом месте