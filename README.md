# Требования к проекту
---

# Содержание
1. [Введение](#intro)  
1.1 [Назначение](#appointment)  
1.2 [Бизнес-требования](#business_requirements)  
1.2.1 [Исходные данные](#initial_data)  
1.2.2 [Возможности бизнеса](#business_opportunities)  
1.2.3 [Границы проекта](#project_boundary)  
2. [Требования пользователя](#user_requirements)  
2.1 [Программные интерфейсы](#software_interfaces)  
2.2 [Интерфейс пользователя](#user_interface)  
2.3 [Характеристики пользователей](#user_specifications)  
2.3.1 [Классы пользователей](#user_classes)  
2.3.2 [Аудитория приложения](#application_audience)  
2.3.2.1 [Целевая аудитория](#target_audience)  
2.3.2.1 [Побочная аудитория](#collateral_audience)  
2.4 [Предположения и зависимости](#assumptions_and_dependencies)  
3. [Системные требования](#system_requirements)  
3.1 [Функциональные требования](#functional_requirements)  
3.1.1 [Основные функции](#main_functions)  
3.1.1.1 [Вход пользователя в приложение](#user_login_to_the_application)  
3.1.1.2 [Настройка профиля активного пользователя](#setting_up_the_profile_of_the_active_user)  
3.1.1.3 [Добавление записей](#add_notation)  
3.1.1.4 [Выход пользователя из учётной записи](#active_user_change)   
3.1.2 [Ограничения и исключения](#restrictions_and_exclusions)  
3.2 [Нефункциональные требования](#non-functional_requirements)  
3.2.1 [Атрибуты качества](#quality_attributes)  
3.2.1.1 [Требования к удобству использования](#requirements_for_ease_of_use)  
3.2.1.2 [Требования к безопасности](#security_requirements)  
3.2.1.3 [Требования к производительности](#performance_requirements)  
3.2.2 [Внешние интерфейсы](#external_interfaces)  
3.2.3 [Ограничения](#restrictions)  

<a name="intro"/>

# 1 Введение

<a name="appointment"/>

## 1.1 Назначение
Десктопное приложение "Учет арендного транспорта" предназначено для упрощения ведения арифметических вычислений. Приложение создано для пользователей ОС Windows 10.

<a name="business_requirements"/>

## 1.2 Бизнес-требования

<a name="initial_data"/>

### 1.2.1 Исходные данные
Сегодня, весь мир пользуется транспортом: личным, общественными и арендным. В отличии от личного транспортного средства, арендуя автомобиль, человек не задумывается о его обслуживании, ремонте, еще каких-то трат. Из-за этого многие люди выбирают арендный транспорт: начиная арендой каршеринга для ежедневных поездок по городу, заканчивая арендой автомобиля для автопутешествий или далеких поездок. В данное время, существует много компаний по аренде авто. Именно для этих компаний и предназначено данное приложение.


<a name="business_opportunities"/>

### 1.2.2 Возможности бизнеса
Данное приложение будет пользоваться популярностью у разных компаний по предоставлению аренды авто. Имея данное приложение, менеджерам будет удобнее вести учет транспорта, их состояния, занятости и тд.

<a name="project_boundary"/>

### 1.2.3 Границы проекта
Приложение позволит выполнять разные операции с учетом автомобилей: добавление и удаление транспорта, изменение его состояния. Данное приложение можно применять как в крупных компаниях, так и в маленьких.

<a name="user_requirements"/>

# 2 Требования пользователя

<a name="software_interfaces"/>

## 2.1 Программные интерфейсы
В основе приложения - стандартные библиотеки C#. Сразу же в приложении будет видно окно со списком всего транспорта и их состояниях.  

<a name="user_interface"/>

## 2.2 Интерфейс пользователя
<a name="user_specifications"/>

## 2.3 Характеристики пользователей

<a name="user_classes"/>

### 2.3.1 Аудитория приложения

<a name="target_audience"/>

#### 2.3.1.1 Целевая аудитория
Люди, часто встречющиеся с необходимостью конвертации одной валюты в другую: экономисты, бухгалтеры, индивидуальные предприниматели, люди, имеющие валютные счета в банках

<a name="collateral_audience"/>

#### 2.3.1.2 Побочная аудитория
Любая группа лиц, работающая с различными валютами: покупка товаров на зарубежных площадках

<a name="assumptions_and_dependencies"/>

## 2.4 Предположения и зависимости
1. Приложение предпологает наличие подключения к сети для получения актуальных курсов валют

<a name="system_requirements"/>

# 3 Системные требования

<a name="functional_requirements"/>

## 3.1 Функциональные требования

<a name="main_functions"/>

### 3.1.1 Основные функции

<a name="user_login_to_the_application"/>

#### 3.1.1.1 Вход пользователя в приложение
**Описание.** Пользователь не имеет возможность использовать приложение без создания собственного профиля либо вхождения в свою учётную запись.

| Функция | Требования | 
|:---|:---|
| Регистрация нового пользователя | Приложение должно запросить у пользователя ввести имя и пароль для создания учётной записи. Пользователь должен либо ввести имя и пароль, либо отменить действие |
| Вход зарегистрированного пользователя в приложение | Приложение должно предоставить пользователю список имён (псевдонимов) зарегестрированных пользователей. Пользователь должен либо выбрать из списка своё имя (псевдоним), либо отменить действие |

<a name="setting_up_the_profile_of_the_active_user"/>

#### 3.1.1.2 Настройка профиля активного пользователя
**Описание.** Зарегистрированный пользователь имеет возможность редактировать своё имя и пароль.
 
| Функция | Требования | 
|:---|:---|
| Изменение имени пользователя | Приложение должно запросить ввести новое имя а также пароль для подтверждения действия. Если выбранное имя уже существует, приложение предоставит возможность повторного ввода |
| Изменение пароля | Зарегистрированный пользователь имеет возможножность изменить пароль, при этом приложение запрашивает ввести старый пароль для подтверждения личности |
| Удаление учётной записи пользователя | Зарегистрированный пользователь имеет возможность удалить созданную учётную запись, для чего приложение запрашивает пароль |

<a name="add_notation"/>

#### 3.1.1.3 Добавление записей
**Описание.** После входа пользователя в приложение или после завершения радактирования профиля зарегистрированным пользователем возможно создание записей.

| Функция | Требования | 
|:---|:---|
| Создание записи | Приложение должно создать событие, предоставив пользователю бланк заполнения события, в котором указана дата события и описание |
| Редактирование записи | Приложение должно предоставить доступ к уже созданной записи, для её дополнения/изменения |
| Поиск записей | Приложение должно найти созданную запись по введённой ключевой фразе |
| Форматированный поиск | Приложение должно найти созданные записи по введённой ключевой фразе или дате (общей для нескольких записей) |

<a name="active_user_change"/>

#### 3.1.1.4 Выход зарегистрированного пользователя из учётной записи
**Описание.** Зарегистрированный пользователь имеет возможность выйти из учётной записи.

**Требование.** Приложение должно предоставить зарегистрированному пользователю возможность выйти из учётной записи с возвратом к окну входа в приложение.

<a name="restrictions_and_exclusions"/>

### 3.1.2 Ограничения и исключения
1. Приложение работает корректно только при точно установленной дате на ПК;
2. Отсутствует возможность пользоваться приложением, не имея учётной записи. 

<a name="non-functional_requirements"/>

## 3.2 Нефункциональные требования

<a name="quality_attributes"/>

### 3.2.1 Атрибуты качества

<a name="requirements_for_ease_of_use"/>

#### 3.2.1.1 Требования к удобству использования
1. Доступ к основным функциям приложения не более чем за две операции;
2. Все функциональные элементы пользовательского интерфейса имеют названия, описывающие действие, которое произойдет при выборе элемента;
3. Пошаговая инструкция использования основных функций приложения отображена в справке;
4. Неактуальные записи сохраняются в памяти приложения, что позволяет получить прямой доступ к ним.

<a name="security_requirements"/>

#### 3.2.1.2 Требования к безопасности
Приложение предоставляет возможность просмотра и редактирования профиля только авторизированному пользователю.

<a name="#performance_requirements"/>

### 3.2.1.3 Требования к производительности
При наличии процессора Intel Core i5 шестого поколения, видеокарты GTX GeForce 950M и 8GB оперативной памяти DDR4, скорость обновления окон приложения будет - 0,05 сек.


<a name="external_interfaces"/>

### 3.2.2 Внешние интерфейсы
Окна приложения удобны для использования пользователями с плохим зрением:
  * размер шрифта не менее 14пт;
  * функциональные элементы контрастны фону окна.

<a name="restrictions"/>

### 3.2.3 Ограничения
1. Приложение реализовано на платформе .NET Framework 4.6.1;
2. Все записи хранятся в базе данных MySQL.
