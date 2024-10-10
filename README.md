## Отчет по лабораторной работе № 1

#### № группы: `ПМ-2402`

#### Выполнила: `Белова Полина Сергеевна`

#### Вариант: `3`

### Cодержание:

- [Постановка задачи](#1-постановка-задачи)
- [Входные и выходные данные](#2-входные-и-выходные-данные)
- [Выбор структуры данных](#3-выбор-структуры-данных)
- [Алгоритм](#4-алгоритм)
- [Программа](#5-программа)
- [Анализ правильности решения](#6-анализ-правильности-решения)

### 1. Постановка задачи

#### Условие задачи 

> На вход подаётся 5 натуральных чисел X, A, B, C, D. Шарик диаметром X пытаются протащить через последовательность отверстий диаметрами A, B, C, D. Необходимо определить, через какое количество отверстий удастся протащить шарик.

#### Уточнение:

- Необходимо последовательно сравнить диаметр шара X с диаметрами отверстий. Сначала с A, затем с B, после с C и в конце концов с D. Если диаметр шара слишком большой для отверстия диаметром A и не может через него пройти, то шар не сможет пройти и через остальные отверстия диаметрами B, C и D, успев пройти 0 отверстий. Аналогичные ситуации стоит рассмотреть с отверстиями B, C и D.

### 2. Входные и выходные данные

#### Данные на вход

На вход программа должна получать 5 чисел, принадлежащих множеству натуральных чисел N. Так как верхняя и нижняя границы вводимых чисел в условии не даны, мы установим их сами. Так, нижняя граница будет равна 1, так как 0 и числа меньше него - не натуральные (в условии требуется ввод натуральных чисел); а верхняя граница будет равна 10<sup>9</sup>, так как вместительность типа данных int, выбранного мной, составляет 2<sup>32</sup> чисел (2<sup>30</sup>-1 положительных чисел).

|             | Тип                | min значение    | max значение   |
|-------------|--------------------|-----------------|----------------|
| X (Число 1) | Целое число        | 1               | 10<sup>9</sup> |
| A (Число 2) | Целое число        | 1               | 10<sup>9</sup> |
| B (Число 3) | Целое число        | 1               | 10<sup>9</sup> |
| C (Число 4) | Целое число        | 1               | 10<sup>9</sup> |
| D (Число 5) | Целое число        | 1               | 10<sup>9</sup> |


#### Данные на выход

Так как программа должна вывести количество отверстий, через которые пройдет шар, то на выход мы получим единственное неотрицательное целое число, не превышающее 4 (число равно 4, потому что всего отверстий было подано 4, значит, больше пройти мы не сможем).

|         | Тип                                | min значение | max значение   |
|---------|------------------------------------|--------------|----------------|
| Число   | Целое неотрицательное число        | 0            | 4              |

### 3. Выбор структуры данных

Программа получает 5 целых неотрицательных чисел, не превышающих 10<sup>9</sup> < 2<sup>32</sup>. Поэтому для их хранения
можно выделить 5 переменных (`x`, `a`, `b`, `c`, `d`) типа `int`.

|             | название переменной | Тип (в Java) | 
|-------------|---------------------|--------------|
| X (Число 1) | `x`                 | `int`        |
| A (Число 2) | `a`                 | `int`        | 
| B (Число 3) | `b`                 | `int`        |
| C (Число 4) | `c`                 | `int`        |
| D (Число 5) | `d`                 | `int`        |

### 4. Алгоритм

#### Алгоритм выполнения программы:

1. **Ввод данных:**  
   Программа считывает 5 целых чисел, обозначенные как `x`, `a`, `b`, `c`, `d`.
   
2. **Проверка чисел:**
   После ввода числа `x` сразу же происходит его проверка. Если в ходе проверки выяснилось, что x не входит в диапазон допустимых значений, пользователю необходимо будет ввести новое число `x`, удовлетворяющее условие.
   Аналогичная проверка происходит и для последовательности чисел `a`, `b`, `c`, `d`. Только после того, как все числа пройдут проверку, компьютер сможет перейти к следующему этапу.
 
 3. **Сравнение чисел:**  
    i. Программа сравнивает значения `x` и `a`. Если `x` меньше или равно `a`, программа переходит к следующему шагу для работы с `x`. Если `x` больше, программа выполняет действия вывода ответа на экран.
    
    ii. Программа сравнивает значения `x` и `b`. Если `x` меньше или равно `b`, программа переходит к следующему шагу для работы с `x`. Если `x` больше, программа выполняет действия вывода ответа на экран.
    
    iii. Программа сравнивает значения `x` и `c`. Если `x` меньше или равно `c`, программа переходит к следующему шагу для работы с `x`. Если `x` больше, программа выполняет действия вывода ответа на экран.
    
    iv. Программа сравнивает значения `x` и `d`. Если `x` меньше или равно `d`, программа переходит к выводу окончательного ответа на экран, выводя максимальное значение. Если `x` больше, программа выполняет действия вывода ответа на экран.

5. **Вывод результата:**  
   Вывод происходит в процессе выполнения программы

#### Блок-схема

```mermaid
graph TD
    A([Начало]) --> B[/Ввести: x/]
    B --> L{0 < x < 10^9}
    L -- Нет --> B
    L -- Да --> N[/Ввести: a, b, c, d/]
    N --> O{a <= 0 или a >= 10^9 или b <= 0 или b >= 10^9 или c <= 0 или c >= 10^9 или d <= 0 или d >= 10^9}
    O -- Нет --> C
    O -- Да --> N
    N --> C{x <= a}
    C -- Нет --> D[/Вывод: 0/]
    D --> Z([Конец])
    C -- Да --> E{x <= b}
    E -- Нет --> F[/Вывод: 1/]
    F --> Z([Конец])
    E -- Да --> G{x <= c}
    G -- Нет --> H[/Вывод: 2/]
    H --> Z([Конец])
    G -- Да --> I{x <= d}
    I -- Нет --> J[/Вывод: 3/]
    J --> Z([Конец])
    I -- Да --> K[/Вывод: 4/]
    K --> Z([Конец])

```

### 5. Программа

```java
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        // Считывание пяти целых чисел x, a, b, c, d из консоли
        out.println("Введите диаметр шарика: ");
        int x = in.nextInt();
        // Объявили минимум и максимум области значений
        int min = 0;
        int max = (int)Math.pow(10, 9);
        // Проверка, входит ли число в диапазон
        while (x <= min || x >= max ) {
            out.println("Число не входит в диапазон допустимых значений `0 < x < 10^9`, введите новое число:");
            x = in.nextInt();
        }
        out.println("Введите диаметры отверстий: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        // Проверка, входит ли последовательность в диапазон
        while (a <= min || a >= max || b <= min || b >= max || c <= min || c >= max || d <= min || d >= max) {
            out.println("В последовательности присутствует число, которое не входит в диапазон `0 < ваше число < 10^9`. " +
                    "Введите последовательность, в которой каждое число в ходит в диапазон допустимых значений:");
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();
            }
        // определение через сколько отверстий пройдет шар
        // если диаметр шара меньше или равен диаметру отверстия, мы переходим к следующему отверстию
        // если диаметр шара больше диаметра отверстия, мы выводим, через сколько отверстий успел пройти шар
        if (x <= a) {
            if (x <= b) {
                if (x <= c) {
                    if (x <= d)
                        out.print(4);
                    else
                        out.print(3);
                }
                else
                    out.print(2);
            }
            else
                out.print(1);
        }
        else out.print(0);
    }
}```

### 6. Анализ правильности решения

Программа работает корректно на всем множестве решений с учетом ограничений.

1. Тест на `x <= a <= b <= c <= d`:

    - **Input**:
        ```
        10
        20 20 40 50
        ```

    - **Output**:
        ```
         4
        ```

2. Тест на `x > a`:

    - **Input**:
        ```
        10
        5 10 20 30
        ```

    - **Output**:
        ```
        0
        ```

3. Тест на `x > b`:

    - **Input**:
        ```
        10
        10 5 20 30
        ```

    - **Output**:
        ```
        1
        ```

4. Тест на `x > c `:

    - **Input**:
        ```
        10
        20 30 9 5
        ```

    - **Output**:
        ```
        2
        ```
        
5. Тест на `x > d `:

    - **Input**:
        ```
        10
        20 30 10 5
        ```

    - **Output**:
        ```
        3
        ```

6. Тест на ограничение задачи:

    - **Input**:
        ```
        1000000000
        ```

    - **Output**:
        ```
        Число не входит в диапазон допустимых значений `0 < x < 10^9`, введите новое число:
        ```

    - **Input**:
        ```
        -500
        ```

    - **Output**:
        ```
        Число не входит в диапазон допустимых значений `0 < x < 10^9`, введите новое число:
        ```
 7. Тест на ограничение задачи:

    - **Input**:
        ```
        4
        1 -2 3 0
        ```

    - **Output**:
        ```
      В последовательности присутствует число, которое не входит в диапазон 0 < ваше число < 10^9. Введите последовательность, в которой каждое число в ходит в диапазон допустимых значений:
        ```
8. Тест на ограничение задачи:

    - **Input**:
        ```
        4
        1 -2 3 0
        ```

    - **Output**:
        ```
         В последовательности присутствует число, которое не входит в диапазон 0 < ваше число < 10^9. Введите последовательность, в которой каждое число в ходит в диапазон допустимых значений:
        ```
    - **Input**:
        ```
        1 2 3 4
        ```
    - **Output**:
        ```
        4
        ```
    

