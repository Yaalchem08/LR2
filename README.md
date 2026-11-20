# Лабораторная работа № 2

Лабораторная работа по программированию на Java, вариант 444. Программа моделирует сражение двух команд покемонов с помощью библиотеки `Pokemon.jar`.

## Состав команд

Команда полосатых:

- Pinsir — Stone Edge, X-Scissor, Double Hit, Vice Grip;
- Phanpy — Rock Tomb, Double Team, Slam;
- Donphan — Rock Tomb, Double Team, Slam, Magnitude.

Команда синих:

- NidoranF — Venoshock, Poison Jab;
- Nidorina — Venoshock, Poison Jab, Crunch;
- Nidoqueen — Venoshock, Poison Jab, Crunch, Fire Blast.

## Структура проекта

- `LR2.java` — главный класс, в котором создаются команды и запускается бой;
- `Pokemon/` — классы покемонов;
- `Move/` — классы атак;
- `Pokemon.jar` — библиотека для симуляции боя;
- `manifest.txt` — настройки исполняемого JAR-архива.

## Требования

Для сборки нужен JDK 17 или более новой версии.

## Сборка в PowerShell

Команды выполняются из папки проекта:

```powershell
New-Item -ItemType Directory -Force build
$sources = Get-ChildItem Move,Pokemon -Filter *.java | ForEach-Object FullName
javac --release 17 -encoding UTF-8 -cp Pokemon.jar -d build LR2.java $sources
jar --create --file lab2.jar --manifest manifest.txt -C build .
```

## Запуск

Файлы `lab2.jar` и `Pokemon.jar` должны находиться в одной папке.

```powershell
java -jar lab2.jar
```

## Запуск на helios

Проект можно передать на сервер через WinSCP. После подключения к helios нужно перейти в папку с файлами и запустить архив:

```bash
cd ~/lab2
java -jar lab2.jar
```

Во время выполнения программа выводит в терминал ход боя и его победителя.
