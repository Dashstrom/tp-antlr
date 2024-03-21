# TP AntLR

TP AntLR for AI21.

## Windows prerequisite

```powershell
windows + R + "powershell"
ctrl + shift + enter
winget install ojdkbuild.openjdk.11.jdk
setx JAVA_HOME "$(Split-Path (Split-Path (Get-command java).Path -Parent) -Parent)"
```

## Development

Make Maven wrapper

```sh
mvn -N io.takari:maven:wrapper
```

Install source with java-doc.

```sh
./mvnw dependency:sources
```

Install [Tiled](https://www.mapeditor.org/) for edit zones

## Source

### Without git

```sh
curl -g https://codeload.github.com/Dashstrom/The-Legend-of-Link/zip/refs/heads/master --output The-Legend-of-Link.zip
tar xf The-Legend-of-Link-archive.zip
cd The-Legend-of-Link-master
```

### With git

```sh
git clone https://github.com/Dashstrom/The-Legend-of-Link.git
cd The-Legend-of-Link
```

## Build standalone jar

```sh
.\mvnw clean package
```

## Run program

```sh
java -jar target/ai21-antlr-1.0-SNAPSHOT-jar-with-dependencies.jar
```
