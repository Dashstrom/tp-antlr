# TP AntLR

Basic project to carry out UV AI21 practical of [UTC](https://www.utc.fr/) work using [Maven](https://maven.apache.org/), [AntLR](https://www.antlr.org/) and [JavaFX](https://openjfx.io/) (with [Visual Studio Code](https://code.visualstudio.com/)).

Be careful: **1 clone 📦 = 1 star ✨**

## Windows : Install chocolatey and Java

Open an admin shell with `windows + R -> "powershell" -> ctrl + shift + enter` then enter:

```powershell
Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))
choco install openjdk
```

## Mac : Install Homebrew and Java

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
echo "export PATH=/opt/homebrew/bin:$PATH" >> ~/.bash_profile && source ~/.bash_profile
brew install java
```

## Ubuntu : Update and Install Java

```sh
sudo apt -y update && sudo apt -y install default-jdk
```

## Get project

<details>
  <summary>With git</summary>
  ```sh
  git clone https://github.com/Dashstrom/tp-antlr.git
  cd tp-antlr
  ```
</details>

<details>
    <summary>Without git</summary>
    [Download the ZIP](https://github.com/Dashstrom/tp-antlr/archive/refs/heads/main.zip)
</details>

## Retrieve sources for java-docs

```sh
./mvnw dependency:sources
```

## Build standalone JAR

### Windows

```powershell
./mvnw.cmd clean package
```

### Linux (Mac, Ubuntu, ...)

```sh
chmod +x mvnw
.\mvnw clean package
```

## Run standalone JAR

```sh
java -jar target/ai21-antlr-1.0-jar-with-dependencies.jar
```

The following warning can occur, and you can ignore it [see stackoverflow issue](https://stackoverflow.com/questions/67854139/javafx-warning-unsupported-javafx-configuration-classes-were-loaded-from-unna).

```text
... com.sun.javafx.application.PlatformImpl startup
AVERTISSEMENT: Unsupported JavaFX configuration: classes were loaded from 'unnamed module @...'
```

![GUI](sujets/gui.png)

## Fast run on Windows

```powershell
./mvnw.cmd clean compile exec:java
```

## Fast run on Linux (Mac, Ubuntu, ...)

```sh
.\mvnw clean compile exec:java
```

## Development

Remake Maven wrapper (only if you know what you are doing).

```sh
mvn -N io.takari:maven:wrapper
```
