# EpamHomework

read: git-bisect

задачи с CodingBat с логикой тоже на гит

поразрядная сортировка (Radix Sort) быстрее чем qSort
написать поразрядную сортировку

"дата и время" и "локализация" на самостоятельное обучение



RuntimeException -> Unchecked


__сортировка выбором (Selection sort) (берем найменьший элемент и вставляем в конец отсортированной части):  N^2/2 сравнений и N обменов (N^2, N^2, N^2 - рост в лучшем, среднем, худшем случае)

__Insertion sort (берем следующий элемент и двигаем его влево, пока он не встанет на нужное место): N-1 сравнений, 0 обменов в лучшем случае (N, N^2, N^2 - рост в лучшем, среднем, худшем случае)
1/2 * N^2 - в худшем (отсортировано в обратном порядке)

__Shellsort (делим на массивы меньшего размера с шагом n и сортируем их. Затем делим всё на массивы с шагом n-1 и т.д. - проблема на больших данных): в лучшем случае: (N*logN, ?, N^(3/2) - рост в лучшем, среднем, худшем случае)

__Mergesort (делим на части и рекурсивно (не обязательно) сортируем (отсортированно может быть чем угодно), затем соединяем всё обратно: поочередно сравниваем левый элемент из каждого массива и в отсортированный вставляем тот, который меньше)


