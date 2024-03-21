# TP AntLR

TP AntLR for AI21.

Be careful: **1 clone 📦 = 1 star ✨**

## Windows prerequisite

### Install chocolatey (package manager)

Open an admin shell with `windows + R -> "powershell" -> ctrl + shift + enter` then enter:

```powershell
Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))
```

### Install Java

```powershell
choco install openjdk
```

## Mac prerequisite

### Install Homebrew (package manager)

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
echo "export PATH=/opt/homebrew/bin:$PATH" >> ~/.bash_profile && source ~/.bash_profile
```

### Install Java and Gtk

```bash
brew install java
```

## Linux prerequisite

### Install Update and install Java

```sh
sudo apt -y update && sudo apt -y install default-jdk
```

## Fetch project source

### With git

```sh
git clone https://github.com/Dashstrom/tp-antlr.git
cd tp-antlr
```

### Without git

[Download the ZIP](https://github.com/Dashstrom/tp-antlr/archive/refs/heads/main.zip)

## Fetch sources for dependencies

Install source with java-doc.

```sh
./mvnw dependency:sources
```

## Build standalone jar

### Windows

```powershell
./mvnw.cmd clean package
```

### Mac and Linux

```sh
chmod +x mvnw
.\mvnw clean package
```

## Run program

```sh
java -jar target/ai21-antlr-1.0-jar-with-dependencies.jar
```

The following warning can occur, and you can ignore it [see stackoverflow issue](https://stackoverflow.com/questions/67854139/javafx-warning-unsupported-javafx-configuration-classes-were-loaded-from-unna).

```text
... com.sun.javafx.application.PlatformImpl startup
AVERTISSEMENT: Unsupported JavaFX configuration: classes were loaded from 'unnamed module @...'
```

![GUI](sujets/gui.png)

## Development

Remake Maven wrapper (only if you know what you are doing).

```sh
mvn -N io.takari:maven:wrapper
```
