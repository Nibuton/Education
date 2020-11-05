/*
Теоретическая задача для самостоятельной проверки:
 сдача минимальным числом монет
Приведите алгоритм, который по данному натуральному числу n и набору
натуральных чисел C={c1=1,c2,…,ck} находит минимальное число p, такое что n можно
представить как сумму p чисел из набора C, за время O(kn)O
(числа в представлении могут повторяться; хотя бы одно представление всегда есть, поскольку c1=1).
 */
public class Teory {
    /*
    Посмотрим на какой-то оптимальный набор чисел для какого-то числа n. Выкинем из него некое cl -
    в таком случае оставшийся набор будет оптимальным для числа n - cl; Будем считать минимальный
    набор для всех чисел от 0 до n. Псевдокод:
    curr[n+1];
    curr[i] <- i оражает тот факт, что число может быть представлена едницами;
    для всех i от 1 до n:
        для всех j от 0 до k не включительно:
            если сj <= i:
                curr[i] = min(curr[i], curr[i - cj] + 1); - минимум из минимума, найденного на данный
                момент и оптимального значения при включении этого элемента
     */
}