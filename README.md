# TP AntLR

TP AntLR for AI21.

## Windows prerequisite

Install java +11.

Open an admin shell with `windows + R -> "powershell" -> ctrl + shift + enter` then enter:

```powershell
winget install ojdkbuild.openjdk.11.jdk
setx JAVA_HOME "$(Split-Path (Split-Path (Get-command java).Path -Parent) -Parent)"
```

## Mac prerequisite

Install java +11.

## Linux prerequisite

Install java +11.

## Fetch sources for dependencies

Install source with java-doc.

```sh
./mvnw dependency:sources
```

## Fetch project source

### Without git

```sh
curl -g https://codeload.github.com/Dashstrom/tp-antlr/zip/refs/heads/master --output tp-antlr.zip
tar xf tp-antlr-archive.zip
cd tp-antlr-main
```

### With git

```sh
git clone https://github.com/Dashstrom/tp-antlr.git
cd tp-antlr
```

## Build standalone jar

```sh
.\mvnw clean package
```

## Run program

```sh
java -jar target/ai21-antlr-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## Development

Remake Maven wrapper

```sh
mvn -N io.takari:maven:wrapper
```
