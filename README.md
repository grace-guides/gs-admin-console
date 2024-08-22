# Grace Admin Console

How to use Grade Admin Plugin to quickly build your powerful Admin Console.

## Grace Version

- Grace **2022.2.8**
- Grace Admin **0.2.0**
- Groovy **3.0.22**

## Usage

### Add `admin` plugin

Add `admin` plugin to your `build.gradle`,

```gradle

apply plugin: "org.graceframework.grace-gsp"

repositories {
    mavenCentral()
    maven {
        url "https://s01.oss.sonatype.org/content/repositories/snapshots/"
        mavenContent {
            snapshotsOnly()
        }
    }
}

dependencies {
    implementation "org.graceframework:grace-plugin-dynamic-modules"
    implementation "org.graceframework.plugins:admin:$adminVersion"
}

```

## Links

- [Grace Framework](https://github.com/graceframework/grace-framework)
- [Grace Admin Plugin](https://github.com/grace-plugins/grace-admin)
- [Grace Admin Console Guide](https://github.com/grace-guides/gs-admin-console)
